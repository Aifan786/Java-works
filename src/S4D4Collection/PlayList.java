package S4D4Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class PlayList {

	 List<Song> songs = new ArrayList<>();
	 HashSet<Song> uniqSongs=new HashSet<>();
	 
	 public void addSong(Song song) {
		 if(uniqSongs.add(song)) {
			 songs.add(song);
			 System.out.println("Songs added suscessfully");
		 }else {
			 System.out.println("Songs is already in the playlist");
		 }
	 }

}
