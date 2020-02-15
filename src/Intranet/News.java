package Intranet;

import java.util.*;
import java.util.Date;

public class News {
	private static Date publishDate;
	private String author;
	private String title;
	private String info;
	
	public News(String author,String title,String info) {
		publishDate = new Date();
		this.author = author;
		this.title = title;
		this.info = info;
	}
	
	public Date getPublishDate(){
		return publishDate;
	}
	public void setAuthor(String author){
		this.author = author;
	}
	public String getAuthor(){
		return author;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public String getTitle(){
		return title;
	}
	public void setInfo(String info){
		this.info = info;
	}
	public String getInfo(){
		return info;
	}
	public boolean equals(Object o){
	  if (this == o) return true;
	  if (!(o instanceof News)) return false;
	  News n = (News) o;
	  return News.publishDate.equals(publishDate) && n.author.equals(author) &&
			  n.info.equals(info) && n.title.equals(title);
	 }
	 
	 public int hashCode(){
		 return Objects.hash(News.publishDate, author, title, info);
	 }
	 
	 public String toString(){
		 return "[News:" + "\n date:" + getPublishDate() + "\n Author:" + getAuthor() + "\n Title:" + getTitle() + "\n " + getInfo() + " ]";
	 }
}
