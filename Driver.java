/**
* a. Cael Formanek
* b. 2416167
* c. cformanek@chapman.edu
* d. CPSC 231 - 03
* e. MP4: Music App
*/

/**
* The source file being submitted is called MusicDriver.java. The purpose of this file is to
* drive the music program
*/

/** Creating main method
* @author Cael Formanek
* @version 1.0
*/

import java.util.*;
import java.io.*;

public class Driver {

  /** Member variables */
  static AccountStorage aCheck = new AccountStorage(); 

  public static void main (String[] args) throws IOException {

    /** Person using the app */
    UserExperience user1 = new UserExperience();

    /** List out all of the options to the user */
    String options = "Press 1 and enter: Create a listener account\nPress 2 and enter: List all Playlists and Albums and their contents\nPress 3 and enter: Add songs to an existing playlist\nPress 4 and enter: Shuffle an existing Playlist or listen to an Album\nPress 5 and enter: Add a song or podcast to favorites\nPress 6 and enter: Export all of a listener’s favorites out to a file in ascending order by times streamed\nPress 7 and enter: Exit\n";
    System.out.println(options);
    Scanner scnr = new Scanner(System.in);

    /** Catches an input mismatch exception */
    int userInp = 0;
    int cCheck = 0;
    while (!(cCheck == -1)) {
      try {
        
        userInp = scnr.nextInt();
        user1.checkInput(userInp);
        cCheck = -1;
      } catch (InputMismatchException e) {
          System.out.println("You must enter a number. Try again");
          break;
      } catch (IndexOutOfBoundsException I) {
        System.out.println("You already added song.");
        break;
      }      
    }
    
    
    

    

    

  }
}
