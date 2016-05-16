package gangofcoders.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 
 */
@Entity
@DiscriminatorValue("E")
@Table(name = "election_authority")
public class ElectionAuthority extends Person {

	/**
	 * Default constructor
	 */
	public ElectionAuthority() {
	}

}