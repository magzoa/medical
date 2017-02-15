package py.enterprisesoft.api.model.base;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAResourceBean {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("medical");

    private JPAResourceBean(){}
     
	public static EntityManagerFactory getEMF (){        
        return emf;
    }

}
