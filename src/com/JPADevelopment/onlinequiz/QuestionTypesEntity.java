package com.JPADevelopment.onlinequiz;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: QuestionTypesEntity
 *
 */
@Entity
@Table(name = "QuestionTypes")
public class QuestionTypesEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long typeId;
	
	private String typeName;
	private String typeDescrip;
	
	@OneToMany(mappedBy = "questionType")
	private List<QuestionsEntity> questions;
	
	/****** Constructor ******/
	public QuestionTypesEntity() {
		super();
	}

	/****** Getters and Setters ******/
	public long getTypeId() {
		return typeId;
	}

	public void setTypeId(long typeId) {
		this.typeId = typeId;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getTypeDescrip() {
		return typeDescrip;
	}

	public void setTypeDescrip(String typeDescrip) {
		this.typeDescrip = typeDescrip;
	}

	public List<QuestionsEntity> getQuestions() {
		return questions;
	}

	public void setQuestions(List<QuestionsEntity> questions) {
		this.questions = questions;
	}
   
}
