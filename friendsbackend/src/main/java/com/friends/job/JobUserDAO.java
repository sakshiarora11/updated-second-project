package com.friends.job;

import java.util.List;



public interface JobUserDAO {
	
	public List<JobUser> getall();
	public void addJobApplied(JobUser jobUser);

}
