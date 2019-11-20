package edu.jspiders.onetoonemapping.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="trainer_professional")
public class TrainerProfessional 
{
	@Id
	@Column(name="emp_id")
	private String empId;
	@Column(name="name")
	private String name;
	@Column(name="gender")
	private String gender;
	@Column(name="salary")
	private double salary;
	@Column(name="experience")
	private double experience;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="trainer_personal_id")
	private TrainerPersonal personal;
	
	
	public TrainerProfessional() 
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}

	public TrainerProfessional(String empId, String name, String gender, double salary, double experience)
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created Using arg-constructor");
		
		this.empId = empId;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		this.experience = experience;
	}
	
	public TrainerPersonal getPersonal() {
		return personal;
	}

	public void setPersonal(TrainerPersonal personal) {
		this.personal = personal;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getExperience() {
		return experience;
	}

	public void setExperience(double experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "TrainerProfessional [empId=" + empId + ", name=" + name + ", gender=" + gender + ", salary=" + salary
				+ ", experience=" + experience + "]";
	}
}
