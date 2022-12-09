/**
* a. Cael Formanek
* b. 2416167
* c. cformanek@chapman.edu
* d. CPSC 231 - 03
* e. MP4: Music App
*/

/**
* The source file being submitted is called Listeners.java. The purpose of this file is to detail a child class
* that is a listener
*/

/** Creating a class called Listeners which stores information about an artist
* @author Cael Formanek
* @version 1.0
*/

import java.util.*;

public class Listener extends Accounts {


  /** Default constructor */
  public Listener() {
    super();
  }

  /** Overloaded constructor */
  public Listener(String name, int userID) {
    super(name, userID);
  }

  // /** Favorite takes in a piece of content and adds it to the user's favorites */
  // public void favorite(Content cont) {
  //     this.favoritedContent.add(cont);
  // }
  /** Favorite takes in a piece of content and adds it to the user's favorites */
  public void favorite(Content cont) {
    super.favorite(cont);
}

/** get favorited */
public ArrayList<Content> getFavoritedContent() {
  return super.getFavoritedContent();
}

  /** toString */
  public String toString() {
    return getName() + "\nUserID: " + getUserID();
  }

  /** Accessor for name */
  public String getName() {
      return super.getName();
    }

  /** Accessor for userId */
  public int getUserID() {
    return super.getUserID();
  }

  /** Mutator for name */
  public void setName(String newName) {
    super.setName(newName);
  }

  /** Mutator for userID */
  public void setUserID(int newUserID) {
    super.setUserID(newUserID);
  }


}
