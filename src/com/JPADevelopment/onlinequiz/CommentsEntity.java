package com.JPADevelopment.onlinequiz;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: CommentsEntity
 *
 */
@Entity
@Table(name = "Comments")
public class CommentsEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long commentId;
	
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "recordId", referencedColumnName="recordId")
	private RecordsEntity record;
	
	private String text;
	
	public CommentsEntity() {
		super();
	}

	public long getCommentId() {
		return commentId;
	}

	public void setCommentId(long commentId) {
		this.commentId = commentId;
	}

	public RecordsEntity getRecord() {
		return record;
	}

	public void setRecord(RecordsEntity record) {
		this.record = record;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
   
}
