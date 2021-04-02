package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="courses")
public class Courses {

	public Courses(String courseName, String courseType, String courseVideourl, String courseYear, String coursePdfurl,
			String courseImg) {
		super();
		this.courseName = courseName;
		this.courseType = courseType;
		this.courseVideourl = courseVideourl;
		this.courseYear = courseYear;
		this.coursePdfurl = coursePdfurl;
		this.courseImg = courseImg;
	}
	@Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	   private long id;
	@Column(name="courseName")
	private String courseName;
	@Column(name="courseType")
	private String  courseType;
	@Column(name="corseVideourl")
	private String  courseVideourl;
	@Column(name="courseYear")
	private String  courseYear;
	@Column(name="coursePdfurl")
	private String  coursePdfurl;
	@Column(name="courseImg")
	private String  courseImg;
	public Courses()
	{
		
	}

	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseType() {
		return courseType;
	}
	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}
	public String getCourseVideourl() {
		return courseVideourl;
	}
	public void setCourseVideourl(String courseVideourl) {
		this.courseVideourl = courseVideourl;
	}
	public String getCourseYear() {
		return courseYear;
	}
	public void setCourseYear(String courseYear) {
		this.courseYear = courseYear;
	}
	public String getCoursePdfurl() {
		return coursePdfurl;
	}
	public void setCoursePdfurl(String coursePdfurl) {
		this.coursePdfurl = coursePdfurl;
	}
	public String getCourseImg() {
		return courseImg;
	}
	public void setCourseImg(String courseImg) {
		this.courseImg = courseImg;
	}

}
