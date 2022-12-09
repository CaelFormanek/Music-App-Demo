/**
* a. Cael Formanek
* b. 2416167
* c. cformanek@chapman.edu
* d. CPSC 231 - 03
* e. MP4: Music App
*/

/**
* The source file being submitted is called Content.java. The purpose of this file is to detail a parent class
* that allows songs and podcasts to be made
*/

/** Creating a class called Content which stores information about content
* @author Cael Formanek
* @version 1.0
*/

import java.util.*;

public class Content {

  /** Private member variables */
  private String title;
  private Artist artist;
  private int numTimesStreamed;
  private boolean isPlayable;

  /** Default constructor */
  public Content() {
    this.title = "";
    this.artist = new Artist();
    this.numTimesStreamed = 0;
    this.isPlayable = true;
  }

  /** Overloaded constructor */
  public Content(String title, Artist artist, int numTimesStreamed, boolean isPlayable) {
    this.title = title;
    this.artist = artist;
    this.numTimesStreamed = numTimesStreamed;
    this.isPlayable = isPlayable;
  }

  /** Copy constructor */
  public Content(Content c) {
    this.title = c.title;
    this.artist = c.artist;
    this.numTimesStreamed = c.numTimesStreamed;
    this.isPlayable = c.isPlayable;
  }

  /** Streaming a song increases the number of times it is streamed */
  public void stream() {
    this.numTimesStreamed += 1;
    if (getIsPlayable()) {
      setIsPlayable(false);
    }
    System.out.println("Now streaming " + getTitle());
  }

  /** Getters and setters for title */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /** Getters and setters for artist */
  public Artist getArtist() {
    return artist;
  }

  public void setArtist(Artist artist) {
    this.artist = artist;
  }

  /** Getters and setters for numtimes streamed */
  public int getNumTimesStreamed() {
    return this.numTimesStreamed;
  }

  public void setNumTimesStreamed(int numTimesStreamed) {
    this.numTimesStreamed = numTimesStreamed;
  }

  /** Getters and setters for isPLayable */
  public boolean getIsPlayable() {
    return isPlayable;
  }

  public void setIsPlayable(boolean isPlayable) {
    this.isPlayable = isPlayable;
  }
  

  

}
