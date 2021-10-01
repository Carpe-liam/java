package museum;

public abstract class Art {
//member variables
	private String title;
	private String author;
	private String description;
	
//constructor
	public Art(String titleParam, String authorParam, String descriptionParam) {
		title = titleParam;
		author = authorParam;
		description = descriptionParam;
	}
	
	
// abstract method
	public abstract void viewArt();

// getters and setters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
