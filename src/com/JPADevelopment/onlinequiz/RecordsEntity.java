package com.JPADevelopment.onlinequiz;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: RecordsEntity
 *
 */
@Entity
@Table(name = "Records")
public class RecordsEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long recordId;
	
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "userId", referencedColumnName="userId")
	private UsersEntity user;
	
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "quizId", referencedColumnName="quizId")
	private QuizzesEntity quiz;
	
	@OneToMany(mappedBy = "record")
	private List<CommentsEntity> comments;
	
	private int score;
	
	@Temporal(TemporalType.DATE)
	private Calendar dateOfQuiz;
	
	/****** Constructor ******/
	public RecordsEntity() {
		super();
	}

	/****** Getters and Setters ******/
	public long getRecordId() {
		return recordId;
	}

	public void setRecordId(long recordId) {
		this.recordId = recordId;
	}

	public UsersEntity getUser() {
		return user;
	}

	public void setUser(UsersEntity user) {
		this.user = user;
	}

	public QuizzesEntity getQuiz() {
		return quiz;
	}

	public void setQuiz(QuizzesEntity quiz) {
		this.quiz = quiz;
	}

	public List<CommentsEntity> getComments() {
		return comments;
	}

	public void setComments(List<CommentsEntity> comments) {
		this.comments = comments;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Calendar getDateOfQuiz() {
		return dateOfQuiz;
	}

	public void setDateOfQuiz(Calendar dateOfQuiz) {
		this.dateOfQuiz = dateOfQuiz;
	}
   
}
