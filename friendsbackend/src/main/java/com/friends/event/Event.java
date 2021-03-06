package com.friends.event;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import org.hibernate.annotations.Type;

@Entity

public final class Event {
	
	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE)
	private long eventId;
	private String title;
	
	@Type(type="text")
	private String description;	
	
	private Date postdate;
	
	private boolean posted=true;
	
	private String eventFrom;
	private String eventTo;
	
	//getters and setters

	
	public String getTitle() {
		return title;
	}

	public long getEventId() {
		return eventId;
	}

	public void setJobId(long eventId) {
		this.eventId = eventId;
	}

	public Date getPostdate() {
		return postdate;
	}

	public void setPostdate(Date postdate) {
		this.postdate = postdate;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isPosted() {
		return posted;
	}

	public void setPosted(boolean posted) {
		this.posted = posted;
	}

	public void setEventId(long eventId) {
		this.eventId = eventId;
	}

	public String getEventFrom() {
		return eventFrom;
	}

	public void setEventFrom(String eventFrom) {
		this.eventFrom = eventFrom;
	}

	public String getEventTo() {
		return eventTo;
	}

	public void setEventTo(String eventTo) {
		this.eventTo = eventTo;
	}

		
}
