package gesha;

public class DVD extends AudioVideo {
	String director;

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	
	public void print() {
		System.out.print(director);
	}
}
