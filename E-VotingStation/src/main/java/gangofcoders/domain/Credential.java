package gangofcoders.domain;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * 
 */
@Entity(name = "credentials")
@Table(name = "credentials")
public class Credential {

	/**
	 * Default constructor
	 */
	public Credential() {
	}

	/**
	 * 
	 */
	@Id
	@Column(nullable = false, unique = true)
	private String SSN;

	/**
	 * 
	 */
	@Column(name = "password", nullable = false)
	@NotEmpty
	private String password;

	/**
	 * 
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "creation_date")
	private Calendar date;

	/**
	 * 
	 */
	@Column(name = "activation_code")
	private String activationCode;

	/**
	 * 
	 */
	@Column(name = "varify_password")
	private String varifyPassword;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((SSN == null) ? 0 : SSN.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Credential other = (Credential) obj;
		if (SSN == null) {
			if (other.SSN != null)
				return false;
		} else if (!SSN.equals(other.SSN))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Credential [SSN=" + SSN + ", password=" + password + ", date=" + date + ", activationCode="
				+ activationCode + ", varifyPassword=" + varifyPassword + "]";
	}

}