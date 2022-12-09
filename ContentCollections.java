/**
* a. Cael Formanek
* b. 2416167
* c. cformanek@chapman.edu
* d. CPSC 231 - 03
* e. MP4: Music App
*/

/** The source file being submitted is called ContentCollections.java. The purpose of this file is to detail a parent
 * class for playlists and albums
 */

/** Creating a class called song which stores information about a podcast
* @author Cael Formanek
* @version 1.0
*/

import java.util.*;

public abstract class ContentCollections {

    /** Private member variables */
    private ArrayList<Content> contentStore;
    private String collectionTitle;

    /** Default constructor */
    public ContentCollections() {
        this.contentStore = new ArrayList<Content>();
        this.collectionTitle = "";    
    }

    /** Overloaded constructor */
    public ContentCollections(String collectionTitle) {
        this.contentStore = new ArrayList<Content>();
        this.collectionTitle = collectionTitle;
    }

    /** Shuffles the content collection */

    public void shuffle() {
        HashMap<Content, Boolean> checkPlay = new HashMap<Content, Boolean>();
        for (Content c : this.contentStore) {
            checkPlay.put(c, c.getIsPlayable());
        }
        if (!(checkPlay.size() == 0)) {
            Random rand = new Random();
            int randy = rand.nextInt(getContentStore().size());
            Content shuf = getContentStore().get(randy);
            if (shuf.getIsPlayable()) {
                shuf.stream();
                checkPlay.remove(shuf);
            } else {
                shuffle();
            }
        } else {
            System.out.println("You've already shuffled all of the songs");
        }
       
        
    }

    /** Getters and setter for contentStore */
    public ArrayList<Content> getContentStore() {
        return contentStore;
    }

    public void setContentStore(ArrayList<Content> contentStore) {
        this.contentStore = contentStore;
    }

    /** Getters and setters for collectionTitle */
     public String getCollectionTitle() {
        return collectionTitle;
    }

    public void setCollectionTitle(String collectionTitle) {
        this.collectionTitle = collectionTitle;
    }

    
}
