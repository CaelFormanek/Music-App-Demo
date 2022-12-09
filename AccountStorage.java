/**
* a. Cael Formanek
* b. 2416167
* c. cformanek@chapman.edu
* d. CPSC 231 - 03
* e. MP4: Music App
*/

/**
* The source file being submitted is called AccountStorange.java. The purpose of this file is to detail storage for each account made
*/

/** Creating a class called Listeners which stores information about an artist
* @author Cael Formanek
* @version 1.0
*/

import java.util.*;

public class AccountStorage {
    
    /** Private member variables */
    private ArrayList<Listener> storage;

    /** Default constructor */
    public AccountStorage() {
        this.storage = new ArrayList<Listener>();
    }

    /** Get storage */
    public ArrayList<Listener> getStorage() {
        return this.storage;
    }

    /** Add an account */
    public void addAccount(Listener a) {
        this.storage.add(a);
    }
}
