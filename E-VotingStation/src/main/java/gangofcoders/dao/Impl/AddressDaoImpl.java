package gangofcoders.dao.Impl;

 

import org.springframework.stereotype.Repository;

import gangofcoders.dao.AddressDao;
import gangofcoders.domain.Address;




@SuppressWarnings("unchecked")
@Repository
public class AddressDaoImpl extends GenericDaoImpl<Address> implements AddressDao {

	public AddressDaoImpl() {
		super.setDaoType(Address.class );
		}

 
 }