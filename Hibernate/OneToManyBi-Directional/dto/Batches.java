package edu.jspiders.onetomanybidirectional.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="batches")
public class Batches 
{
	@Id
	@Column(name="batch_code")
	private String batchCode;
	@Column(name="subject_name")
	private String subjectName;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="trainer_emp_id")
	private TrainerProfessional trainer;
	
	public Batches() 
	{
		System.out.println(this.getClass().getSimpleName()+ " Object Created");
	}

	public Batches(String batchCode, String subjectName)
	{
		System.out.println(this.getClass().getSimpleName()+ " Object Created using no-arg constructor");
		
		this.batchCode = batchCode;
		this.subjectName = subjectName;
	}

	public String getBatchCode() {
		return batchCode;
	}

	public void setBatchCode(String batchCode) {
		this.batchCode = batchCode;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public TrainerProfessional getTrainer() {
		return trainer;
	}

	public void setTrainer(TrainerProfessional trainer) {
		this.trainer = trainer;
	}

	@Override
	public String toString() {
		return "Batches [batchCode=" + batchCode + ", subjectName=" + subjectName + "]";
	}
	
}