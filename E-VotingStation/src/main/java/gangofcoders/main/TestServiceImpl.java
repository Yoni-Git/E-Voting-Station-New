package gangofcoders.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gangofcoders.dao.AddressDao;
import gangofcoders.domain.Address;

@Transactional
@Service
public class TestServiceImpl implements TestService{

	@Autowired
	AddressDao addressDao;
	public void save(Address address) {
		addressDao.save(address);
		
	}

}
