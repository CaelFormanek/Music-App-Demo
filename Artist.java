/**
* a. Cael Formanek
* b. 2416167
* c. cformanek@chapman.edu
* d. CPSC 231 - 03
* e. MP4: Music App
*/

/**
* The source file being submitted is called Artists.java. The purpose of this file is to detail a child class
* that is an artist
*/

/** Creating a class called Artists which stores information about an artist
* @author Cael Formanek
* @version 1.0
*/

import java.util.*;

public class Artist extends Accounts {

    /** Default constructor */
    public Artist() {
      super();
    }

    /** Overloaded constructor */
    public Artist(String name, int userID) {
      super(name, userID);

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
