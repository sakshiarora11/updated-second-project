package com.friends.job;

import java.util.List;


public interface JobCommentDAO {

	public void addJobComment(JobComment jobComment);
	
	public List<JobComment> listJobComment();
	
}
