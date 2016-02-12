package com.JPADevelopment.onlinequiz;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: QuestionsEntity
 *
 */
@Entity
@Table(name="Questions")
public class QuestionsEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long quesId;
	
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "quizId", referencedColumnName="quizId")
	private QuizzesEntity quiz;
	
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "questionTypeId", referencedColumnName="typeId")
	private QuestionTypesEntity questionType;			// 1 input text, 2 check box, 3 MCQ, 4 drop down answers
	
	@OneToMany(mappedBy = "question")
	private List<AnswerChoicesEntity> answerChoices; 
	
	@OneToMany(mappedBy = "question")
	private List<UserResponsesEntity> userResponses; 
	
	private String question;
	private String hint;
	private String AnswerExplained;
	private int difficultyLevel;          // 1 easy, 2 medium, 3 difficult
	private int numOfTimesAsked;          //  count of question asked for stats
	

	/****** Constructor ******/
	public QuestionsEntity() {
		super();
	}


	public long getQuesId() {
		return quesId;
	}


	public void setQuesId(long quesId) {
		this.quesId = quesId;
	}


	public QuizzesEntity getQuiz() {
		return quiz;
	}


	public void setQuiz(QuizzesEntity quiz) {
		this.quiz = quiz;
	}


	public QuestionTypesEntity getQuestionType() {
		return questionType;
	}


	public void setQuestionType(QuestionTypesEntity questionType) {
		this.questionType = questionType;
	}


	public List<AnswerChoicesEntity> getAnswerChoices() {
		return answerChoices;
	}


	public void setAnswerChoices(List<AnswerChoicesEntity> answerChoices) {
		this.answerChoices = answerChoices;
	}


	public List<UserResponsesEntity> getUserResponses() {
		return userResponses;
	}


	public void setUserResponses(List<UserResponsesEntity> userResponses) {
		this.userResponses = userResponses;
	}


	public String getQuestion() {
		return question;
	}


	public void setQuestion(String question) {
		this.question = question;
	}


	public String getHint() {
		return hint;
	}


	public void setHint(String hint) {
		this.hint = hint;
	}


	public String getAnswerExplained() {
		return AnswerExplained;
	}


	public void setAnswerExplained(String answerExplained) {
		AnswerExplained = answerExplained;
	}


	public int getDifficultyLevel() {
		return difficultyLevel;
	}


	public void setDifficultyLevel(int difficultyLevel) {
		this.difficultyLevel = difficultyLevel;
	}


	public int getNumOfTimesAsked() {
		return numOfTimesAsked;
	}


	public void setNumOfTimesAsked(int numOfTimesAsked) {
		this.numOfTimesAsked = numOfTimesAsked;
	}   
	
	/****** Getters and Setters ******/
	

   
}
