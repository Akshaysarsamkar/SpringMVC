package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.apache.tomcat.jni.Address;

@Entity
public class Student1 {

	private String name;
	private Long id;
	private Date dob;
	private String type;
	private String gender;

	private model.Address address;

	public model.Address getAddress() {
		return address;
	}

	public void setAddress(model.Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student1 [name=" + name + ", id=" + id + ", dob=" + dob + ", type=" + type + ", gender=" + gender + "]";
	}

}
