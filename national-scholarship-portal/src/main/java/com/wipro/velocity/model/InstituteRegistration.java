package com.wipro.velocity.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@SuppressWarnings("unused")
@Document(collection="institution-registration")
public class InstituteRegistration 
{
	@Id
	private int id;
	
	private String institutename;
	private String instituteid;
	private String instituteemail;
	private String password; 
	private long telephone_number;
	
	public InstituteRegistration() {
		
	}

	public InstituteRegistration(int id, String institutename, String instituteid, String instituteemail, String password,
			long telephone_number) {
		
		this.id = id;
		this.institutename = institutename;
		this.instituteid = instituteid;
		this.instituteemail = instituteemail;
		this.password = password;
		this.telephone_number = telephone_number;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInstitutename() {
		return institutename;
	}

	public void setInstitutename(String institutename) {
		this.institutename = institutename;
	}

	public String getInstituteid() {
		return instituteid;
	}

	public void setInstituteid(String instituteid) {
		this.instituteid = instituteid;
	}

	public String getInstituteemail() {
		return instituteemail;
	}

	public void setInstituteemail(String instituteemail) {
		this.instituteemail = instituteemail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getTelephone_number() {
		return telephone_number;
	}

	public void setTelephone_number(long telephone_number) {
		this.telephone_number = telephone_number;
	}
	 
	
}
