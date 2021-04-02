package com.example.demo.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	  
	@Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	   private long id;
	   
	   @Column(name="userEmail")
	   private String userEmail;
	   
	   @Column(name="password")
	   private String password;
	   
	   @Column(name="userName")
	   private String userName;
	   
	   @Column(name="mobileNumber")
	   private String mobileNumber;
	   
	
	   public User()
	   {
		   
	   }
	   
	   
	   public User(String userEmail, String password, String userName, String mobileNumber/*,String qualification,*/
				/*boolean active, String role*/) {
			super();
			this.userEmail = userEmail;
			this.password = password;
			this.userName = userName;
			this.mobileNumber = mobileNumber;
		//	this.qualification = qualification;
			//this.active = active;
			//this.role = role;
		}

	   
	   
	   
	   
	  
	  public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getUserEmail() {
		return userEmail;
	}



	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getMobileNumber() {
		return mobileNumber;
	}



	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


   
      
}
