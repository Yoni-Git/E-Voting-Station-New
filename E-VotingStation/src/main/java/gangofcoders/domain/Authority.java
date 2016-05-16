package gangofcoders.domain;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * 
 */
@Entity(name="authority")
@Table(name="authority")
public class Authority {

	/**
	 * Default constructor
	 */
	public Authority() {
	}
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	/**
	 * 
	 */
	
	private String ssn;

	/**
	 * 
	 */
	@NotEmpty
	private String authority;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String sSN) {
		ssn = sSN;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}


}