package gangofcoders.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import gangofcoders.dao.GenericDao;




public abstract  class GenericDaoImpl<T> implements GenericDao<T> {

	@PersistenceContext
    protected EntityManager entityManager;

    protected Class<T> daoType;

	public void setDaoType(Class<T> type) {
			daoType = type;
	}
   
	
    public void save(T entity){
        entityManager.persist( entity );
     }
    
 
    public void delete( T entity ){
        entityManager.remove( entity );
     }

	
	public void delete(Long id) {
        T entity = findOne( id );
        delete( entity );  
    }

	
	public T findOne( Long id ){
	    return (T) entityManager.find( daoType, id );
	 }
	
	@SuppressWarnings("unchecked")
	
	public List<T> findAll(){
		      return entityManager.createQuery( "from " + daoType.getName() )
		       .getResultList();
		   }
	
	
	public T update( T entity ){
	      return entityManager.merge( entity );
	   }

 	
//	public List<T> findAll(String s,Object  hint ){
// 	    return (List<T>)  entityManager.createQuery("SELECT m FROM Member AS m") 
// 	    		.setHint(s,hint).getResultList();
//  	}
//	

 }