package com.JPADevelopment.onlinequiz;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: UserResponsesEntity
 *
 */
@Entity
@Table(name = "UserResponses")
public class UserResponsesEntity implements Serializable {
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long responseId;
	
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "recordId", referencedColumnName="recordId")
	private RecordsEntity record;
	

	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "quesId", referencedColumnName="quesId")
	private QuestionsEntity question;
	

	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "ansId", referencedColumnName="ansId")
	private AnswerChoicesEntity answerChoice;
	
	/****** Constructor ******/
	public UserResponsesEntity() {
		super();
	}

	/****** Getters and Setters ******/
	public long getResponseId() {
		return responseId;
	}

	public void setResponseId(long responseId) {
		this.responseId = responseId;
	}

	public RecordsEntity getRecord() {
		return record;
	}

	public void setRecord(RecordsEntity record) {
		this.record = record;
	}

	public QuestionsEntity getQuestion() {
		return question;
	}

	public void setQuestion(QuestionsEntity question) {
		this.question = question;
	}

	public AnswerChoicesEntity getAnswerChoice() {
		return answerChoice;
	}

	public void setAnswerChoice(AnswerChoicesEntity answerChoice) {
		this.answerChoice = answerChoice;
	}
   
}
