package gangofcoders.main;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class TestDAOImpl implements TestDAO {

    @PersistenceContext
    protected EntityManager entityManager;

    public void something() {

        entityManager.flush();

    }

}
