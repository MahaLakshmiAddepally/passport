package com.capg.Model;


import java.math.BigInteger;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.format.annotation.DateTimeFormat;






@Entity
@Table(name="User_Registration")
public class  UserRegistration {
	

	@Id
	@Column(name="USERID")
	private String User_id;
	
    @Column(name="Name")
  @NotNull(message = "601 : user name can't be blank")
	private String Name;
    
	@Column(name="Password")
  @NotNull(message = "602 : password can't be blank")
	private String Password;
	
	@Column(name="Qualification")
	 @NotNull(message = "603 : Qualification should have default value of select")
	private String Qualification;
	
	@Column(name="EmailId") 
   @NotNull(message = "604 : Email Id can't be blank")
	private String EmailId;
	
	@Column(name="Contact")
	 @NotNull(message = "605 : contact number can't be blank")
	private BigInteger Contact;
	@DateTimeFormat(pattern="DD-MM-YYYY")
	private LocalDate Date_of_birth;
	@Column(name="Apply_type")
	private String Apply_type;
	@Column(name="Citizenship")
	private String Citizenship;
	@Column(name="Gender")
	 @NotNull(message = "608 : Gender  can't be blank")
	private String Gender;
	@Column(name="Hint_question")
	 @NotNull(message = "606 : Hint question can't be blank")
	private String Hint_question;
	@Column(name="Hint_answer")
	 @NotNull(message = "607 : Hint answer can't be blank")
	private String Hint_answer;
	public String getUser_id() {
		return User_id;
	}
	public void setUser_id(String user_id) {
		this.User_id = user_id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		this.Password = password;
	}
	public String getQualification() {
		return Qualification;
	}
	public void setQualification(String qualification) {
		this.Qualification = qualification;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		this.EmailId = emailId;
	}
	
	
	
	public BigInteger getContact() {
		return Contact;
	}
	public void setContact(BigInteger contact) {
		this.Contact = contact;
	}
	public LocalDate getDate_of_birth() {
		return Date_of_birth;
	}
	public void setDate_of_birth(LocalDate date_of_birth) {
		this.Date_of_birth = date_of_birth;
	}
	public String getApply_type() {
		return Apply_type;
	}
	public void setApply_type(String apply_type) {
		this.Apply_type = apply_type;
	}
	public String getCitizenship() {
		return Citizenship;
	}
	public void setCitizenship(String citizenship) {
		this.Citizenship = citizenship;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		this.Gender = gender;
	}
	public String getHint_question() {
		return Hint_question;
	}
	public void setHint_question(String hint_question) {
		this.Hint_question = hint_question;
	}
	public String getHint_answer() {
		return Hint_answer;
	}
	public void setHint_answer(String hint_answer) {
		this.Hint_answer = hint_answer;
	}
	
	
	
}