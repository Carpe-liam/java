package museum;
import java.util.ArrayList;
import java.util.Collections;

public class Museum {
	public static void main(String[] args) {
		
		ArrayList<Art> museum = new ArrayList<Art>();
	// add paintings
		museum.add(new Painting("Blocks", "Lego Bob", "This is a depiction of the house of Lego Bob", "Oil"));
		museum.add(new Painting("Surly Gentleman", "Sir Doyle", "This painting is a depiction of the PTSD of soldiers", "Acrylic on glass"));
		museum.add(new Painting("Shatter", "Evelyn Birland", "A woman standing on a bridge crying tears which causes rain on the road below", "Watercolor and oils"));
		
	// add sculptures
		museum.add(new Sculpture("David", "Michaelangelo", "This is the epitome of utter masculine beauty", "Marble"));
		museum.add(new Sculpture("Incan Religious Pot", "Unknown", "An ornate pot used in the collection of items for religous use in 1287 BC", "Terracota"));
		
	// display art
		Collections.shuffle(museum);
		
		for(Art artwork : museum) {
			artwork.viewArt();
		}
		
	}	
}
