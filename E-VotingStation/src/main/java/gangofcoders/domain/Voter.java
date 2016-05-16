package gangofcoders.domain;

import java.util.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 
 */

@Entity
@DiscriminatorValue("v")
@Table(name = "voter")
public class Voter extends Person {

	/**
	 * Default constructor
	 */
	public Voter() {
	}

}