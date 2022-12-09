/**
* a. Cael Formanek
* b. 2416167
* c. cformanek@chapman.edu
* d. CPSC 231 - 03
* e. MP4: Music App
*/

/** The source file being submitted is called Playlist.java. The purpose of this file is to detail a 
 * class for playlists
 */

/** Creating a class called Playlist which stores information about a playlist
* @author Cael Formanek
* @version 1.0
*/

import java.util.*;

public class Playlist extends ContentCollections {

    /** Default constructor */
    public Playlist() {
        super();
    }

    /** Overloaded constructor */
    public Playlist(String collectionTitle) {
        super(collectionTitle);
    }

    /** Shuffles the content collection */
    public void shuffle() {
        super.shuffle();
    }

    /** Adds content to the playlist */
    public void addContent(Content cont) {
        super.getContentStore().add(cont);
    }

    /** Removes content from the playlist */
    public void removeContent(Content cont) {
        super.getContentStore().remove(cont);
    }

    // /** toString */
    // public String toString() {
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
