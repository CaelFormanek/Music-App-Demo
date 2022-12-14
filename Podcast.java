/**
* a. Cael Formanek
* b. 2416167
* c. cformanek@chapman.edu
* d. CPSC 231 - 03
* e. MP4: Music App
*/

/** The source file being submitted is called Song.java. The purpose of this file is to detail a podcast */

/** Creating a class called song which stores information about a podcast
* @author Cael Formanek
* @version 1.0
*/
import java.util.*;

public class Podcast extends Content {
    
    /** Private member variables */
    private int episodeNum;

    /** Default constructor */
    public Podcast() {
        super();
        this.episodeNum = 0;
    }

    /** Overloaded constructor */
    public Podcast(String title, Artist artist, int numTimesStreamed, int episodeNum, boolean isPlayable) {
        super(title, artist, numTimesStreamed, isPlayable);
        this.episodeNum = episodeNum;
        
    }

     /** Stream the song */
  public void streamSong() {
    super.stream();
  }

  /** Implement comparable */
  public int compareTo(Podcast compare) {
    System.out.println("Positive if the first podcast is greater, zero if they are the same, and negative if the second song is greater:");
    return getTitle().compareTo(compare.getTitle());
  }

    /** Getters and setters for title */
    public String getTitle() {
      return super.getTitle();
    }
  
    public void setTitle(String title) {
      super.setTitle(title);
    }
  
    /** Getters and setters for artist */
    public Artist getArtist() {
     return super.getArtist();
    }
  
    public void setArtist(Artist artist) {
      super.setArtist(artist);
    }
  
    /** Getters and setters for numtimes streamed */
    public int getNumTimesStreamed() {
      return super.getNumTimesStreamed();
    }
  
    public void setNumTimesStreamed(int numTimesStreamed) {
      super.setNumTimesStreamed(numTimesStreamed);
    }

    /** Getters and setters for isPLayable */
    public boolean getIsPlayable() {
      return super.getIsPlayable();
    }

    public void setIsPlayable(boolean isPlayable) {
      super.setIsPlayable(isPlayable);
    }


}
