package com.JPADevelopment.onlinequiz;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: AnswerChoicesEntity
 *
 */
@Entity
@Table(name="AnswerChoices")
public class AnswerChoicesEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ansId;
	
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "quesId", referencedColumnName="quesId")
	private QuestionsEntity question;
	
	@OneToMany(mappedBy = "answerChoice")
	private List<UserResponsesEntity> userResponses;
	
	private String answer;
	private int correct;         		// 1 correct, else not correct
	private int numOfTimesSelected;		// Number of times this answer was selected for statistics
	
	
	/****** Constructor ******/
	public AnswerChoicesEntity() {
		super();
	}

	/****** Getters and Setters ******/
	public long getAnsId() {
		return ansId;
	}

	public void setAnsId(long ansId) {
		this.ansId = ansId;
	}

	public QuestionsEntity getQuestion() {
		return question;
	}

	public void setQuestion(QuestionsEntity question) {
		this.question = question;
	}

	public List<UserResponsesEntity> getUserResponses() {
		return userResponses;
	}

	public void setUserResponses(List<UserResponsesEntity> userResponses) {
		this.userResponses = userResponses;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public int getCorrect() {
		return correct;
	}

	public void setCorrect(int correct) {
		this.correct = correct;
	}

	public int getNumOfTimesSelected() {
		return numOfTimesSelected;
	}

	public void setNumOfTimesSelected(int numOfTimesSelected) {
		this.numOfTimesSelected = numOfTimesSelected;
	}
   
}
