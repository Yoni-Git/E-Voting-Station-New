package gangofcoders.domain;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 
 */
@Entity
@DiscriminatorValue("c")
@Table(name = "candidate")
public class Candidate extends Person {

	/**
	 * Default constructor
	 */
	public Candidate() {
	}

	/**
	 * 
	 */
	@Column(name = "slogan")
	private String slogan;

	/**
	 * 
	 */
	@Column(name = "party")
	private String party;

	public String getSlogan() {
		return slogan;
	}

	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

}