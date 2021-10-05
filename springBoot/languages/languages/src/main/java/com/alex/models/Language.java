package com.alex.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.NonNull;

@Entity
@Table(name="langauges")
public class Language {
// attributes
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	@NonNull
	@Size(min=3, max=20)
	private String name;
	@NonNull
	@Size(min=3, max=20)
	private String creator;
	@NonNull
	private double version;
	
// non-updatable column
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt;
	
	
// constructor
	public Language() {}
	
	public Language(String name, String creator, Integer version) {
		this.name = name;
		this.creator = creator;
		this.version = version;
	}
	
// methods
	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}
	@PreUpdate void onUpdate() {
		this.updatedAt = new Date();
	}

// getters and setters
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
	
}
