package com.alex.messagingstompwebsocket;

public class HelloMessage {
	
// ========== Member Variables ===========
	  private String name;
	
// ========== Constructors ===========
	  public HelloMessage() {}
	
	  public HelloMessage(String name) {
	    this.name = name;
	  }
	
// ========== getters & setters =======
	  public String getName() {
	    return name;
	  }
	
	  public void setName(String name) {
	    this.name = name;
	  }
}