/**
* a. Cael Formanek
* b. 2416167
* c. cformanek@chapman.edu
* d. CPSC 231 - 03
* e. MP4: Music App
*/

/**
* The source file being submitted is called Accounts.java. The purpose of this file is to detail a parent class
* that allows artist and listener accounts to be made
*/

/** Creating a class called Accounts which stores information about an Account
* @author Cael Formanek
* @version 1.0
*/

import java.util.*;

// possibly implement interface here
public class Accounts {

  /** Declaring private member variables */
  private String name;
  private int userID;
  private ArrayList<Content> favoritedContent;


  /** Default constructor */
  public Accounts() {
    this.name = "";
    this.userID = 0;
    this.favoritedContent = new ArrayList<Content>();
  }

  /** Overloaded constructor */
  public Accounts(String name, int userID) {
    this.name = name;
    this.userID = userID;
    this.favoritedContent = new ArrayList<Content>();
  }

  /** Favorite takes in a piece of content and adds it to the user's favorites */
  public void favorite(Content cont) {
    this.favoritedContent.add(cont);
}

  /** Getters and setters for name */
  public String getName() {
    return this.name;
  }

  public void setName(String newName) {
    this.name = newName;
  }

  /** Getters and setters for userID */
  public int getUserID() {
    return this.userID;
  }

  /** Mutator for userID */
  public void setUserID(int newUserID) {
    this.userID = newUserID;
  }

  /** Get favorited content 
  * @link https://www.javatpoint.com/how-to-sort-arraylist-in-java
  */

  public ArrayList<Content> getFavoritedContent() {
    // Collections.sort(favoritedContent);
    return this.favoritedContent;
  }


}
