package edu.jspiders.onetoonemapping.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="trainer_personal")
public class TrainerPersonal 
{
	@Id
	@Column(name="personal_id")
	private int personalId;
	@Column(name="mother_tongue")
	private String motherTongue;
	@Column(name="hometown")
	private String hometown;
	@Column(name="status")
	private String status;
	
	public TrainerPersonal() 
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}

	public TrainerPersonal(int personalId, String motherTongue, String hometown, String status) 
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created Using arg-constructor");
		
		this.personalId = personalId;
		this.motherTongue = motherTongue;
		this.hometown = hometown;
		this.status = status;
	}

	public int getPersonalId() {
		return personalId;
	}

	public void setPersonalId(int personalId) {
		this.personalId = personalId;
	}

	public String getMotherTongue() {
		return motherTongue;
	}

	public void setMotherTongue(String motherTongue) {
		this.motherTongue = motherTongue;
	}

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "TrainerPersonal [personalId=" + personalId + ", motherTongue=" + motherTongue + ", hometown=" + hometown
				+ ", status=" + status + "]";
	}
}