package museum;

public class Painting extends Art {
	private String paintType;
	
	public Painting (String title, String authorParam, String descriptionParam, String paintTypeParam) {
		super(title, authorParam, descriptionParam);
		paintType = paintTypeParam;
	}
	
	public void viewArt() {
		String displayArt ="";
		displayArt += "Title: " + getTitle() + "\n";
		displayArt += "Author: " + getAuthor() + "\n";
		displayArt += "Description: " + getDescription() + "\n";
		displayArt += "Material: " + paintType +"\n";
		System.out.println(displayArt);
	}
	
//getters and setters
	public String getPaintType() {
		return paintType;
	}

	public void setPaintType(String paintType) {
		this.paintType = paintType;
	}
}
