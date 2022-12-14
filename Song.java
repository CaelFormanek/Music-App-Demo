/**
* a. Cael Formanek
* b. 2416167
* c. cformanek@chapman.edu
* d. CPSC 231 - 03
* e. MP4: Music App
*/

/** The source file being submitted is called Song.java. The purpose of this file is to detail a song */

/** Creating a class called song which stores information about a song
* @author Cael Formanek
* @version 1.0
*/

import java.util.*;

public class Song extends Content {

  /** Default constructor */
  public Song() {
    super();
  }

  /** Overloaded constructor */
  public Song(String title, Artist artist, int numTimesStreamed, boolean isPlayable) {
    super(title, artist, numTimesStreamed, isPlayable);
  }
  
  /** Stream the song */
  public void stream() {
    super.stream();
  }

  /** Implement comparable */
  public int compareTo(Song compare) {
    System.out.println("Positive if the first song is greater, zero if they are the same, and negative if the second song is greater:");
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
