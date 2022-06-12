package S4D4Collection;

import java.util.Objects;

public class Song {

	private String movieName;
	private String songName;
	
	public Song() {}
	
	@Override
	public int hashCode() {
		return Objects.hash(movieName, songName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Song other = (Song) obj;
		return Objects.equals(movieName, other.movieName) && Objects.equals(songName, other.songName);
	}
	
	public Song(String movieName, String songName) {
		
		this.movieName = movieName;
		this.songName = songName;
	}

	@Override
	public String toString() {
		return "Song [movieName=" + movieName + ", songName=" + songName + "]";
	}
	
	public void play() {
		System.out.println(this.songName+" of "+this.movieName+" is playing...!");
	}

	
	
}



