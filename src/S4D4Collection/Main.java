package S4D4Collection;

public class Main {

    public static void main(String[] args) {
    	
    	Song song1 = new Song("DDLJ","Ho gya hai tujko to pyar sajna");
    	Song song2 = new Song("Sholay","Ye dosti hum nahi todenge");
    	Song song3 = new Song("3 Idiot","All iz well");
    	Song song4 = new Song("DDLJ","Ho gya hai tujko to pyar sajna");
    	
    	PlayList playList = new PlayList();
    	playList.addSong(song1);
    	playList.addSong(song2);
    	playList.addSong(song3);
    	playList.addSong(song4);
    	
    	System.out.println("============================");
         try {
        	 playList.songs.get(0).play();
         	playList.songs.get(1).play();
         	playList.songs.get(2).play();
         	playList.songs.get(3).play();
		}
         catch (Exception e) 
         {
			System.out.println("Song not selected..");
		}
    }
    
}

