package com.alex.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="projects")
public class Project {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
    @NotEmpty(message="Title must not be empty!")
    @Size(min=2, max=255, message="Title must be between 2-255 characters")
    private String title;

    @NotEmpty(message="Project needs a description yo!")
    @Size(min=3, message="Description must be at least 3 characters")
    @NotNull
    private String description;
	
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @NotEmpty(message="Must have date!")
    @FutureOrPresent(message="Date cannot be in past.")
    private String dueDate;

// ======== created_at & updated_at =========
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt;
	
// ========= relationships ===========
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_id")
	private User user;
	
}
