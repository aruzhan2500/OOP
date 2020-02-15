package Intranet;

import java.util.Date;
import java.util.*;

public class Order implements Comparable<Object>{
	 private Date date;
	 private String detail;
	 public boolean accepted = false;
	 
	 public void setPublishDate(Date Date)
	 {
	  this.date = Date;
	 }
	 
	 public Date getDate()
	 {
	  return date;
	 }
	 
	 public void setDetail(String detail)
	 {
	  this.detail = detail;
	 }
	 
	 public String getDetail()
	 {
	  return detail;
	 }
	 
	 public boolean equals(Object obj)
	 {
	  if (this == obj) return true;
	  if (obj == null || this.getClass()!=obj.getClass()) return false;
	  Order other = (Order) obj;
	  return other.date.equals(date) && other.detail.equals(detail) &&
			  other.accepted == accepted;
	 }
	 
	 public int hashCode()
	 {
	  return Objects.hash(date, detail, accepted);
	 }
	 
	 public String toString()
	 {
	  return "Order [date" + getDate() + "\nDetail" + getDetail() + "\n Date:" +getDate() +
	    "\n accepted:" + accepted;
	 }
	 
	 public int compareTo(Object o) {
		 Order order = (Order)o;
		 return order.detail.compareTo(this.detail);
	 }
}
