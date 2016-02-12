package com.JPADevelopment.onlinequiz;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Quizzes")
public class QuizzesEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long quizId;
	private String quizName;
	private String quizDescription;
	private int difficultQs;
	private int mediumQs;
	private int easyQs;
	
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "subjectId", referencedColumnName="subjectId")
	private SubjectEntity subject;
	
	@OneToMany(mappedBy = "quiz")
	private List<QuestionsEntity> questions;

	@OneToMany(mappedBy = "quiz")
	private List<RecordsEntity> records;
	
	/****** Constructor ******/
	public QuizzesEntity() {
		super();
	}
	
	/****** Getters and Setters ******/

	public long getQuizId() {
		return quizId;
	}

	public void setQuizId(long quizId) {
		this.quizId = quizId;
	}

	public String getQuizName() {
		return quizName;
	}

	public void setQuizName(String quizName) {
		this.quizName = quizName;
	}

	public String getQuizDescription() {
		return quizDescription;
	}

	public void setQuizDescription(String quizDescription) {
		this.quizDescription = quizDescription;
	}

	public int getDifficultQs() {
		return difficultQs;
	}

	public void setDifficultQs(int difficultQs) {
		this.difficultQs = difficultQs;
	}

	public int getMediumQs() {
		return mediumQs;
	}

	public void setMediumQs(int mediumQs) {
		this.mediumQs = mediumQs;
	}

	public int getEasyQs() {
		return easyQs;
	}

	public void setEasyQs(int easyQs) {
		this.easyQs = easyQs;
	}

	public SubjectEntity getSubject() {
		return subject;
	}

	public void setSubject(SubjectEntity subject) {
		this.subject = subject;
	}

	public List<QuestionsEntity> getQuestions() {
		return questions;
	}

	public void setQuestions(List<QuestionsEntity> questions) {
		this.questions = questions;
	}

	public List<RecordsEntity> getRecords() {
		return records;
	}

	public void setRecords(List<RecordsEntity> records) {
		this.records = records;
	}
}
