1) The following identifying information:

a. Cael Formanek
b. 2416167
c. cformanek@chapman.edu
d. CPSC 231 - 03
e. MP4: Music App

2) Accounts.java, AccountStorage.java, Album.java, Artist.java, Content.java, ContentCollections.java, Listener.java, Driver.java, Playlist.java, Podcast.java, Song.java, UserExperience.java

3) A description of any known compile or runtime errors, code limitations, or deviations
from the assignment specification (if applicable)

  There are no known compile or runtime errors, code limitations, or deviations from the assignment specification

4) A list of all references used to complete the assignment, including peers (if applicable)

 @link https://stackoverflow.com/questions/3993982/how-to-check-type-of-variable-in-java
 @link https://www.javatpoint.com/how-to-sort-arraylist-in-java
 @link https://www.freecodecamp.org/news/java-string-to-int-how-to-convert-a-string-to-an-integer/
 @link https://www.tutorialspoint.com/swap-elements-of-arraylist-with-java-collections#:~:text=In%20order%20to%20swap%20elements,specified%20positions%20in%20the%20list.
 @link https://stackoverflow.com/questions/8104692/how-to-avoid-java-util-concurrentmodificationexception-when-iterating-through-an
 @link https://stackoverflow.com/questions/1066589/iterate-through-a-hashmap
 @link https://javarevisited.blogspot.com/2012/09/how-to-determine-type-of-object-runtime-identification.html#axzz7lnAnqfTr
 @link  https://stackoverflow.com/questions/9620683/java-fileoutputstream-create-file-if-not-exists


5) Instructions for running the assignment. (Typically applicable in advanced courses using
build systems or third party libraries)

  Open the files Accounts.java, AccountStorage.java, Album.java, Artist.java, Content.java, ContentCollections.java, Listener.java, Driver.java, Playlist.java, Podcast.java, Song.java, UserExperience.java. Compile and run Driver.java. To run javadoc comments, type javadoc then the name of the file.

  
6) MP4 Write Up

My name is Cael Formanek, and I have completed the MP4: Music App project. My project consists of 12 files that are as follows: Accounts.java, AccountStorage.java, Album.java, Artist.java, Content.java, ContentCollections.java, Listener.java, Driver.java, Playlist.java, Podcast.java, Song.java, UserExperience.java. Accounts.java is a parent class that I created. I made this a parent class because there are two types of accounts that users should be able to create, which are listener accounts and artist accounts (child classes). I also made a parent class Content.java which is the parent to the child classes Song.java and Podcast.java. This is done for the sake of minimizing code duplication and giving users the choice between more than one type of content. ContentCollections.java is the parent to Playlist.java and Album.java. Playlists can be manipulated by the user. UserExperience.java is an application user. In order for the program to run, a UserExperience object must be created and a “user” will be prompted for their input with a .checkInput() method. Lastly, I created a class called AccountStorage.java to simulate how a real mobile application may work. This is useful because one user may want to create multiple accounts, so having a place to store them organizes everything. One of the first things I thought of for this project was the structure. I knew that I wanted to simulate a user using the app, and I knew (based off of project specifications) that I had to keep prompting a user for their input until they wanted to exit. Recursion was a big factor in allowing me to do this. After the user enters their preferred action, the app should be able to give them their options again. Calling .checkInput() at the end of each .checkInput() option makes it so that the user is prompted for their input until the enter the number 7.

I’ve chosen this particular architecture for a project because it is the closest idea I could imagine to a real application. While the solution is meant to be a proof of concept, I knew that having a user would simplify the process of “running” the application. An alternative method could just be running recursive methods in the Driver, but I wanted to separate the Driver from everything going on behind the scenes.

I faced multiple challenges while working on this project, the biggest being exception handling. It seemed like every time I handled one exception, a new one would appear. I also generated interesting behavior from some of my exceptions. For example, one of them caused infinite recursion even though I prompted for more user input when an exception was caught. I had to dig deep into my knowledge of loops to make sure that all exceptions were appropriately handled.

There are multiple ways in which developers can expand upon my project. In most of the places where my exceptions were handled, the program quits and tells the user that they cannot enter a specific input. However, there are a few places where I prompt the user to keep trying to enter the correct input if an exception occurs, and I think this would be beneficial to use everywhere throughout the rest of the code. I also believe that it would be really cool to actually play music out loud and implement a real playlist within this application. It could definitely be expanded in terms of how realistic it is and its functionality.



