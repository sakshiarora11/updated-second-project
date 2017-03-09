package com.friends.blog;
import java.util.List;

import com.friends.blog.BlogData;

public interface BlogDataDAO {

	public void addBlogData(BlogData blogdata);
	
	public BlogData getBlogDataById(int blogdataid);
	
	public List<BlogData> listBlogData();
	
	public void deleteBlogData(BlogData blogdata);

}