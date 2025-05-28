package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StudentEnqEntity {

	  @Id
		private int id;
	  
	  private String user;
}
