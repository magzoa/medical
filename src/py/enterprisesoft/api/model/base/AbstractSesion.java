package py.enterprisesoft.api.model.base;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

@SuppressWarnings({ "rawtypes", "unchecked" })
public abstract class AbstractSesion<T> {
    private Class<T> entityClass;    
    private EntityManager em;
    
    

    public AbstractSesion(Class<T> entityClass) {
        this.entityClass = entityClass;
        this.em = JPAResourceBean.getEMF().createEntityManager();
    }
    
    protected EntityManager getEM() {    	
    	return this.em;
    }

    public void actualizar(T entity) throws Exception{
    	Object id = getEM().getEntityManagerFactory().getPersistenceUnitUtil().getIdentifier(entity);    	
    	if(obtener(id)==null){
        	getEM().getTransaction().begin();  
        	
        	
        	getEM().persist(entity);
        	getEM().getTransaction().commit();
    	}else{
        	getEM().getTransaction().begin();    	   	
        	getEM().merge(entity);
        	getEM().getTransaction().commit();
    	}
    }
   
    public void eliminar(T entity)throws Exception{
    	Object id = getEM().getEntityManagerFactory().getPersistenceUnitUtil().getIdentifier(entity);    	
    	try {
    		entity = getEM().getReference(entityClass, id);
    	} catch (EntityNotFoundException e) {
    		throw new Exception("Error: no existe registro con la pk " + id);
    	}
    	getEM().getTransaction().begin();
    	getEM().remove(entity);
    	getEM().getTransaction().commit();
    }

    public T obtener(Object id) {    	
        return getEM().find(entityClass, id);
    }
		
	public List<T> buscarTodos() {
        CriteriaQuery cq = getEM().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        return getEM().createQuery(cq).getResultList();
    }
	
	public List<T> buscar(String queryString, List<Object> params) {
    	Query query = getEM().createQuery(queryString);
		if (params != null && params.size() > 0) {
			int i = 1;
			for (Object param : params) {
				query.setParameter(i, param);
				i++;
			}
		}		
		return query.getResultList();	
	}
	
	public List ejecutaSQLNativo(String queryString, List<Object> params) {
    	Query query = getEM().createNativeQuery(queryString);
    	
		if (params != null && params.size() > 0) {
			int i = 1;
			for (Object param : params) {
				query.setParameter(i, param);
				i++;
			}
		}
		return query.getResultList();	
	}
}