package gesha;

public class CD extends AudioVideo {
	String artist;
	int numberOfTracks;

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getNumberOfTracks() {
		return numberOfTracks;
	}

	public void setNumberOfTracks(int numberOfTracks) {
		this.numberOfTracks = numberOfTracks;
	}
	
	public void print(){
		System.out.println(artist);
		System.out.println(numberOfTracks);
	}
}
