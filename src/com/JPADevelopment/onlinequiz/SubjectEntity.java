package com.JPADevelopment.onlinequiz;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: SubjectEntity
 *
 */
@Entity
@Table(name="Subject")
public class SubjectEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long subjectId;
	private String subjectName;
	private String subjectDescription;
	
	@OneToMany(mappedBy = "subject")
	private List<QuizzesEntity> quizzes; 

	/******* Constructor ******/
	
	public SubjectEntity() {
		super();
	}   
	
	/****** Getters and Setters ******/
	
	public long getSubjectId() {
		return this.subjectId;
	}

	public void setSubjectId(long subjectId) {
		this.subjectId = subjectId;
	}   
	public String getSubjectName() {
		return this.subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}   
	public String getSubjectDescription() {
		return this.subjectDescription;
	}

	public void setSubjectDescription(String subjectDescription) {
		this.subjectDescription = subjectDescription;
	}
	public List<QuizzesEntity> getQuizzes() {
		return quizzes;
	}
	public QuizzesEntity getQuiz(int index) {
		return quizzes.get(index);
	}
	public void setQuizzes(List<QuizzesEntity> quizzes) {
		this.quizzes = quizzes;
	}
   
}
