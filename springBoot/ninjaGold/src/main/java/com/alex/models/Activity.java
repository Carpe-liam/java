package com.alex.models;

public class Activity {
// member variables
	public String name;


// constructor
	public Activity(String actParam) {
		this.name = actParam;
	}
// Getters
	public String getActivity() {
		 return name;
	}
	
// Setters
	public void setActivity(String actParam) {
		this.name = actParam;
	}
}


