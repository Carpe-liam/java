package museum;

public class Sculpture extends Art {
	private String material;
	
	public Sculpture(String title, String authorParam, String descriptionParam, String materialParam) {
		super(title, authorParam, descriptionParam);
		material = materialParam;
	}
	
	public void viewArt() {
		String displayArt = "";
		displayArt += "Title: " + getTitle() + "\n";
		displayArt += "Author: " + getAuthor() + "\n";
		displayArt += "Description: " + getDescription() + "\n";
		displayArt += "Material: " + material + "\n";
		System.out.println(displayArt);
	}

//getters and setters
	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
}
