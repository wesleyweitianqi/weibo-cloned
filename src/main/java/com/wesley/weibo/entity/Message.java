package com.wesley.weibo.entity;


import lombok.Data;

@Data
public class Message {

	private long id;
	private long userAId;
	private long userBId;
	private String messageDate;
	private String message;
	private int state;

	private User userA;
	private User userB;

	public Message() {
	}
}
