/**
* a. Cael Formanek
* b. 2416167
* c. cformanek@chapman.edu
* d. CPSC 231 - 03
* e. MP4: Music App
*/

/** The source file being submitted is called Playlist.java. The purpose of this file is to detail a 
 * class for albums
 */

/** Creating a class called Album which stores information about an album
* @author Cael Formanek
* @version 1.0
*/

import java.util.*;

public class Album extends ContentCollections {

    /** Default constructor */
    public Album() {
        super();
    }

    /** Overloaded constructor */
    public Album(String collectionTitle) {
        super(collectionTitle);
    }

    /** Shuffles the content collection */
    public void shuffle() {
        super.shuffle();
    }

    /** Adds content to the playlist
    * @link https://stackoverflow.com/questions/3993982/how-to-check-type-of-variable-in-java
    */
    public void addContent(Content cont) {
        if (cont instanceof Song) {
            super.getContentStore().add(cont);
        } else {
            System.out.println("Album's can only contain songs.");
        }
        
    }

    /** Removes content from the playlist */
    public void removeContent(Content cont) {
        super.getContentStore().remove(cont);
    }

    //  /** toString */
    //  public String toString() {
    //     String b = "";
    //     for (Content c : getContentStore()) {
    //         b += c.getTitle() + " by " + c.getArtist().getName() + " \n";
    //     }
    //     return getCollectionTitle() + "\n" + b;
    // }

     /** Getters and setter for contentStore */
     public ArrayList<Content> getContentStore() {
        return super.getContentStore();
    }

    public void setContentStore(ArrayList<Content> contentStore) {
        super.setContentStore(contentStore);
    }

    /** Getters and setters for collectionTitle */
     public String getCollectionTitle() {
        return super.getCollectionTitle();
    }

    public void setCollectionTitle(String collectionTitle) {
        super.setCollectionTitle(collectionTitle);
    }
}
