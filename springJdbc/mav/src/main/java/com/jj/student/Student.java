package com.jj.student;

public class Student {
	private int id;
	private String Student_name;
	private String city;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudent_name() {
		return Student_name;
	}
	public void setStudent_name(String student_name) {
		Student_name = student_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Student() {
		
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", Student_name=" + Student_name + ", city=" + city + "]";
	}
	public Student(int id, String student_name, String city) {
		super();
		this.id = id;
		Student_name = student_name;
		this.city = city;
	}
	

}
