/**
* a. Cael Formanek
* b. 2416167
* c. cformanek@chapman.edu
* d. CPSC 231 - 03
* e. MP4: Music App
*/

/**
* The source file being submitted is called UserExperience.java. The purpose of this file is to detail a user experience
*/

/** Creating a class called UserExperience which stores information about an user
* @author Cael Formanek
* @version 1.0
*/

import java.util.*;
import java.io.*;

public class UserExperience {
    
    /** Private member variables */
    private int instance;
    private Artist arty;
    private Artist arty1;
    private Song song;
    private Song song1;
    private Podcast pod;
    private Podcast pod1;
    private Playlist play;
    private Album alb;
    public Listener account;


    /** Default constructor */
    public UserExperience() {
        this.instance = 1;
        arty = new Artist("Drake", 982671);
        arty1 = new Artist("Jimmy's Podcasts", 123091);
        song = new Song("Legend", arty, 0, true);
        song1 = new Song("No Tellin'", arty, 0, true);
        pod = new Podcast("The art of brewing wine: Part 1", arty1, 0, 1, true);
        pod1 = new Podcast("The art of brewing wine: Part 2", arty1, 0, 2, true);
        alb = new Album("If You're Reading This It's Too Late");
        alb.addContent(song);
        alb.addContent(song1);
        play = new Playlist("My personalized songs and podcasts");
        play.addContent(pod);
        play.addContent(pod1);
        play.addContent(song);
        play.addContent(song1);
        // aRef = new AccountStorage();

    }
    
    public void checkInput(int input) throws IOException {
        /** Option 1 
        * @link https://www.freecodecamp.org/news/java-string-to-int-how-to-convert-a-string-to-an-integer/
        */
        if (input == 1) {
          String st = "";
          System.out.println("You will now create a listener account. Please enter your name: ");
          Scanner scnr1 = new Scanner(System.in);
          String username = scnr1.nextLine();
          System.out.println("Generating userID....");
          for (int i = 0; i < 6; ++i) {
            Random rand = new Random();
            int randy = rand.nextInt(10);
            st += randy;
          }
          int num = Integer.parseInt(st);
          System.out.println("UserID: " + num + "\n");
          account = new Listener(username + "'s account", num);
          System.out.println(account);
          Driver.aCheck.getStorage().add(account);
          // Give options again
          String options = "Press 1 and enter: Create a listener account\nPress 2 and enter: List all Playlists and Albums and their contents\nPress 3 and enter: Add songs to an existing playlist\nPress 4 and enter: Shuffle an existing Playlist or listen to an Album\nPress 5 and enter: Add a song or podcast to favorites\nPress 6 and enter: Export all of a listener’s favorites out to a file in ascending order by times streamed\nPress 7 and enter: Exit\n";
          System.out.println(options);
          Scanner scnrOpt1 = new Scanner(System.in);
          int Opt1 = scnrOpt1.nextInt();
          checkInput(Opt1);
          /** Option 2 */ 
        } else if (input == 2) {
            System.out.println("Here are all playlists and albums and their contents:");
            System.out.println(play.getCollectionTitle());
            String b = "";
            for (Content c : play.getContentStore()) {
                b += c.getTitle() + " by " + c.getArtist().getName() + " \n";
            }
            System.out.println(b);

            System.out.println(alb.getCollectionTitle());
            String f = "";
            for (Content d : alb.getContentStore()) {
                f += d.getTitle() + " by " + d.getArtist().getName() + " \n";
            }
            System.out.println(f);
            String options2 = "Press 1 and enter: Create a listener account\nPress 2 and enter: List all Playlists and Albums and their contents\nPress 3 and enter: Add songs to an existing playlist\nPress 4 and enter: Shuffle an existing Playlist or listen to an Album\nPress 5 and enter: Add a song or podcast to favorites\nPress 6 and enter: Export all of a listener’s favorites out to a file in ascending order by times streamed\nPress 7 and enter: Exit\n";
            System.out.println(options2);
            Scanner scnrOpt2 = new Scanner(System.in);
            int Opt2 = scnrOpt2.nextInt();
            checkInput(Opt2); 
            /** Option 3 */ 
        } else if (input == 3) {
            System.out.println("You can now add songs to an existing playlist. Which playlist would you like to add to?");
            System.out.println("Press 1 and enter: " + play.getCollectionTitle());
            Scanner s = new Scanner(System.in);
            int bCheck = 0;
            String sc;
            while (bCheck != -1) {
                sc = s.nextLine();
                ArrayList<String> allNums = new ArrayList<String>();
                Collections.addAll(allNums, "1", "2", "3", "4", "5", "6", "7", "8", "9", "0");
                for (String c : allNums) {
                  if (sc.contains(c)) {
                    if (Integer.parseInt(sc) == 1) {
                      System.out.println("You will add to " + play.getCollectionTitle());
                      System.out.println("Which song would you like to add?");
                      Scanner s1 = new Scanner(System.in);
                      String sc1 = s1.nextLine();
                      System.out.println("Who made the song?");
                      Scanner s2 = new Scanner(System.in);
                      String sc2 = s2.nextLine();
                      String st1 = "";
                      for (int i = 0; i < 6; ++i) {
                        Random rand = new Random();
                        int randy = rand.nextInt(10);
                        st1 += randy;
                      }
                      int num1 = Integer.parseInt(st1);
                      Artist a = new Artist(sc2, num1);
                      Song s0 = new Song(sc1, a, 0, true);
                      play.addContent(s0);
                      System.out.println(s0.getTitle() + " was added to " + play.getCollectionTitle());
                      bCheck = -1;
                      break;
                    } else if (sc instanceof String) {
                      System.out.println();
                      break;
                      
                    } else {
                      // System.out.println("Invalid input. Try again: ");
                      break;
                    }
                  } else {
                    System.out.println("Invalid input. Try again: ");
                    break;
                  }
                }
                
                
            }
            // sorting content collections
            ArrayList<Content> removal = new ArrayList<Content>();
            for (Content c : play.getContentStore()) {
              if (c.getNumTimesStreamed() > 0) {
                removal.add(c);
              }
            }
            /** @link https://www.tutorialspoint.com/swap-elements-of-arraylist-with-java-collections#:~:text=In%20order%20to%20swap%20elements,specified%20positions%20in%20the%20list.
             * @link https://stackoverflow.com/questions/8104692/how-to-avoid-java-util-concurrentmodificationexception-when-iterating-through-an
             * @link https://stackoverflow.com/questions/1066589/iterate-through-a-hashmap
             */
            play.getContentStore().removeAll(removal);
            for (int i = 0; i < removal.size(); ++i) {
              for (int j = 1; j < removal.size(); ++i) {
                if (removal.get(i).getNumTimesStreamed() == removal.get(i).getNumTimesStreamed() || removal.get(i).getNumTimesStreamed() < removal.get(i).getNumTimesStreamed()) {
                  i = i;
                } else {
                  Collections.swap(removal, i, j);
                }
              }
            }
            play.getContentStore().addAll(removal);
            // Done sorting
            
            String options3 = "Press 1 and enter: Create a listener account\nPress 2 and enter: List all Playlists and Albums and their contents\nPress 3 and enter: Add songs to an existing playlist\nPress 4 and enter: Shuffle an existing Playlist or listen to an Album\nPress 5 and enter: Add a song or podcast to favorites\nPress 6 and enter: Export all of a listener’s favorites out to a file in ascending order by times streamed\nPress 7 and enter: Exit\n";
            System.out.println(options3);
            Scanner scnrOpt3 = new Scanner(System.in);
            int Opt3 = scnrOpt3.nextInt();
            checkInput(Opt3); 
            
        /** Option 4 
        * @link https://stackoverflow.com/questions/1066589/iterate-through-a-hashmap 
        */ 
        } else if (input == 4) {
            System.out.println("Press 1 and enter: Shuffle an existing playlist");
            System.out.println("Press 2 and enter: Listen to an album");
            Scanner sp = new Scanner(System.in);
            int spp = sp.nextInt();

            if (spp == 1) {
              System.out.println("Which playlist would you like to shuffle?");
              System.out.println("Press 1 and enter: " + play.getCollectionTitle());
              Scanner sh = new Scanner(System.in);
              int shh = sh.nextInt();
              if (shh == 1) {
                System.out.println("Now shuffling: ");
                for (int i = 0; i < play.getContentStore().size(); ++i) {
                  play.shuffle();
                }
                for (int a = 0; a < play.getContentStore().size(); ++a) {
                  play.getContentStore().get(a).setIsPlayable(true);
                }
              } else {
                int i = 0;
              }
            } else if (spp == 2) {
              System.out.println("Which album would you like to listen to?");
              System.out.println("Press 1 and enter: " + alb.getCollectionTitle());
              Scanner al = new Scanner(System.in);
              int albu = al.nextInt();

              if (albu == 1) {
                for (Content c : this.alb.getContentStore()) {
                  c.stream();
                }
              } else {
                System.out.println("Not a valid option");
              }
              
            } else {
                System.out.println("Not a valid option");
            }

            String options4 = "Press 1 and enter: Create a listener account\nPress 2 and enter: List all Playlists and Albums and their contents\nPress 3 and enter: Add songs to an existing playlist\nPress 4 and enter: Shuffle an existing Playlist or listen to an Album\nPress 5 and enter: Add a song or podcast to favorites\nPress 6 and enter: Export all of a listener’s favorites out to a file in ascending order by times streamed\nPress 7 and enter: Exit\n";
            System.out.println(options4);
            Scanner scnrOpt4 = new Scanner(System.in);
            int Opt4 = scnrOpt4.nextInt();
            checkInput(Opt4); 

        /** Option 5 */
        } else if (input == 5) {
            System.out.println("You will now add a song or podcast to favorites, if you have a listener account.");
            
            if (Driver.aCheck.getStorage().size() != 0) {
              System.out.println("Which account are you trying to access? Enter a number to indicate the order in which it was created. For example, if\ntwo accounts were created and you are trying to access the first, enter 1: ");
              Scanner storageCheck = new Scanner(System.in);
              int storageNum = storageCheck.nextInt();
              try {
                Listener l = Driver.aCheck.getStorage().get(storageNum - 1);
                System.out.println("Which song/ podcast would you like to add? You can type a new title, or type the title\nof content that already exists in a playlist or album: ");
                Scanner sf = new Scanner(System.in);
                String sff = sf.nextLine();
                System.out.println("Who made the content?");
                Scanner sf2 = new Scanner(System.in);
                String sff2 = sf2.nextLine();
                String sf1 = "";
                for (int j = 0; j < 6; ++j) {
                  Random rand = new Random();
                  int randy = rand.nextInt(10);
                  sf1 += randy;
                }
                int numf = Integer.parseInt(sf1);
                Artist f = new Artist(sff2, numf);
                int streams = 0;
                int loop = 1;

                /** @link https://javarevisited.blogspot.com/2012/09/how-to-determine-type-of-object-runtime-identification.html#axzz7lnAnqfTr */
                for (Content c : alb.getContentStore()) {
                  // System.out.println("Song you want to favorite: " + sff + "\nSong being compared to: " + c.getTitle());
                  if (sff.equals(c.getTitle())) {
                    loop = 0;
                    streams = c.getNumTimesStreamed();
                    System.out.println("Content from " + alb.getCollectionTitle() + " was favorited.");
                    break;
                  } else {
                    // System.out.println("Song did not exist in playlist or album.");
                    loop = 1;
                    streams = 0;
                  }
                }

                if (loop != 0) {
                  for (Content c : play.getContentStore()) {
                    // System.out.println("Song you want to favorite: " + sff + "\nSong being compared to: " + c.getTitle());
                    if (sff.equals(c.getTitle())) {
                      streams = c.getNumTimesStreamed();
                      System.out.println("Content from " + play.getCollectionTitle() + " was favorited.");
                      break;
                    } else {
                      // System.out.println("Song did not exist in playlist or album.");
                      streams = 0;
                    }
                  }
                } else {
                  int h = 0;
                }
                
                System.out.println("It is a song or a podcast?");
                System.out.println("Press 1 and enter: Song");
                System.out.println("Press 2 and enter: Podcast");

                Scanner scansongpod = new Scanner(System.in);
                int scansongorpod = scansongpod.nextInt();
                
               
                if (scansongorpod == 1) {
                  Song sfSong = new Song(sff, f, streams, true);
                  l.favorite(sfSong);
                  System.out.println(sfSong.getTitle() + " was added to " + l.getName() + "'s favorites");
                } else if (scansongorpod == 2) {
                  System.out.println("What episode is the podcast?");
                  Scanner beeeee = new Scanner(System.in);
                  int beeeee4eeeee = beeeee.nextInt();
                  Podcast sfPodcast = new Podcast(sff, f, streams, beeeee4eeeee, true);
                  l.favorite(sfPodcast);
                  System.out.println(sfPodcast.getTitle() + " was added to " + l.getName() + "'s favorites");
                } else {
                  System.out.println("Invalid");
                }

                

                // sorting favorites
                ArrayList<Content> removal = new ArrayList<Content>();
                for (Content c : l.getFavoritedContent()) {
                  if (c.getNumTimesStreamed() > 0) {
                    removal.add(c);
                  }
                }
                /** @link https://www.tutorialspoint.com/swap-elements-of-arraylist-with-java-collections#:~:text=In%20order%20to%20swap%20elements,specified%20positions%20in%20the%20list.
                 * @link https://stackoverflow.com/questions/8104692/how-to-avoid-java-util-concurrentmodificationexception-when-iterating-through-an
                 * @link https://stackoverflow.com/questions/1066589/iterate-through-a-hashmap
                 */
                l.getFavoritedContent().removeAll(removal);
                for (int i = 0; i < removal.size(); ++i) {
                  for (int j = 1; j < removal.size(); ++i) {
                    if (removal.get(i).getNumTimesStreamed() == removal.get(i).getNumTimesStreamed() || removal.get(i).getNumTimesStreamed() < removal.get(i).getNumTimesStreamed()) {
                      i = i;
                    } else {
                      Collections.swap(removal, i, j);
                    }
                  }
                }
                l.getFavoritedContent().addAll(removal);
                // Done sorting



                
              } catch (IndexOutOfBoundsException IO) {
                  System.out.println("This is not a valid number. No account was created in this order.");
              }
              
            } else {
                System.out.println("You have't made an account yet.");
            }
            String options5 = "Press 1 and enter: Create a listener account\nPress 2 and enter: List all Playlists and Albums and their contents\nPress 3 and enter: Add songs to an existing playlist\nPress 4 and enter: Shuffle an existing Playlist or listen to an Album\nPress 5 and enter: Add a song or podcast to favorites\nPress 6 and enter: Export all of a listener’s favorites out to a file in ascending order by times streamed\nPress 7 and enter: Exit\n";
            System.out.println(options5);
            Scanner scnrOpt5 = new Scanner(System.in);
            int Opt5 = scnrOpt5.nextInt();
            checkInput(Opt5);    

        /** Option 6 */    
        } else if (input == 6) {
            try {
              if (Driver.aCheck.getStorage().get(0).getFavoritedContent().size() != 0) {
                System.out.println("All of your favorites will now be exported out to a file in ascending order by times streamed.");
                System.out.println("Which account are you trying to access? Enter a number to indicate the order in which it was created. For example,\nif two accounts were created and you are trying to access the first, enter 1: ");
                Scanner storageCheck1 = new Scanner(System.in);
                int storageNum1 = storageCheck1.nextInt();

                System.out.println("Here are your favorited contents: ");
                for (Content c : Driver.aCheck.getStorage().get(storageNum1 - 1).getFavoritedContent()) {
                  System.out.println(c.getTitle());
                }
  
                System.out.println("Opening a file for you to export these contents....\nFavorites.txt was opened.");
                
                /** @link https://stackoverflow.com/questions/9620683/java-fileoutputstream-create-file-if-not-exists */
                File file = new File("Favorites.txt");
                
                if(!file.exists()){
                  file.createNewFile();
                }else{
                  int b = 0;
                }
  
                // System.out.println(file.exists());
                // Opening Favorites.txt
                FileOutputStream fileStream = new FileOutputStream(file);
                // fbs is connected to favorites. Anything made with fbs will directly add to favorites
                PrintWriter fbs = new PrintWriter(fileStream);
                // Add the favorites to the file
                for (Content c : Driver.aCheck.getStorage().get(storageNum1 - 1).getFavoritedContent()) {
                  fbs.println("Content: "); 
                  fbs.print(c);
                  fbs.println();
                  fbs.println("Title and Artist: " + c.getTitle() + " by " + c.getArtist().getName());
                  fbs.println("Times Streamed: " + c.getNumTimesStreamed() + "\n");
                  System.out.println(c.getTitle() + " by " + c.getArtist().getName() + " was exported.");
                }
                // Close it up!
                System.out.println();
                System.out.println("Closing the file... Thanks for exporting your favorites!\n");
                fbs.close();
  
              } 
              else {
                  System.out.println("No favorited content");
              }
            } catch (IndexOutOfBoundsException I) {
                // System.out.println("You have no favorited content.");
                System.out.println("You either tried to access an account that doesn't exist, haven't made an account yet, or have no favorited content.");
            }
            
            String options6 = "Press 1 and enter: Create a listener account\nPress 2 and enter: List all Playlists and Albums and their contents\nPress 3 and enter: Add songs to an existing playlist\nPress 4 and enter: Shuffle an existing Playlist or listen to an Album\nPress 5 and enter: Add a song or podcast to favorites\nPress 6 and enter: Export all of a listener’s favorites out to a file in ascending order by times streamed\nPress 7 and enter: Exit\n";
            System.out.println(options6);
            Scanner scnrOpt6 = new Scanner(System.in);
            int Opt6 = scnrOpt6.nextInt();
            checkInput(Opt6); 

        /** Option 7 */ 
        } else if (input == 7) {
            System.out.println("Program exited.");
        } 
        /** Option 8 */ 
        else {
            System.out.println("Please enter a valid number 1 through 7. Try again: ");
            String options8 = "Press 1 and enter: Create a listener account\nPress 2 and enter: List all Playlists and Albums and their contents\nPress 3 and enter: Add songs to an existing playlist\nPress 4 and enter: Shuffle an existing Playlist or listen to an Album\nPress 5 and enter: Add a song or podcast to favorites\nPress 6 and enter: Export all of a listener’s favorites out to a file in ascending order by times streamed\nPress 7 and enter: Exit\n";
            System.out.println(options8);
            Scanner scnrOpt8 = new Scanner(System.in);
            int Opt8 = scnrOpt8.nextInt();
            checkInput(Opt8); 
        }


      }
}
