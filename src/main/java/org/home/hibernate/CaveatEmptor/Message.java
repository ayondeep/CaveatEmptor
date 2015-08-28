package org.home.hibernate.CaveatEmptor;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "MESSAGES")
public class Message {

	private Long Id;
	
	@Column(name = "MESSAGE_TEXT")
	private String text;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "NEXT_MESSAGE_ID")
	private Message nextMessage;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		this.Id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Message getNextMessage() {
		return nextMessage;
	}
	public void setNextMessage(Message nextMessage) {
		this.nextMessage = nextMessage;
	}
	
	
}
