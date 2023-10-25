Recently Played Songs Store

*Project Description*
This Java program implements a recently played songs store that can accommodate N songs per user. It uses a LinkedHashMap to store song-user pairs, ensuring efficient retrieval of recently played songs while eliminating the least recently played songs when the store becomes full.

**Table of Contents**
- [How to Install and Run the Project](#how-to-install-and-run-the-project)
- [How to Use the Project](#how-to-use-the-project)
- [Credits](#credits)
- [License](#license)

 **How to Install and Run the Project**
1. Clone the repository to your local machine:
2. Open the project in your preferred Java IDE.
3. Run the `Main.java` file to execute the program.

**How to Use the Project**
1. Create a `LinkedHashMapRecentlyPlayedStore` object with the desired initial capacity.
2. Use the `addSong(user, song)` method to add recently played songs for a user.
3. Use the `getRecentlyPlayedSongs(user)` method to fetch recently played songs for a specific user.

Example usage:
```java
RecentlyPlayedStore store = new LinkedHashMapRecentlyPlayedStore(3);

store.addSong("user1", "S1");
store.addSong("user1", "S2");
store.addSong("user1", "S3");

store.addSong("user1", "S4");
store.addSong("user1", "S2");
store.addSong("user1", "S1");

List<String> recentlyPlayedSongs = store.getRecentlyPlayedSongs("user1");
System.out.println("Recently played songs for user1: " + recentlyPlayedSongs);

**Credits**
This project was created by Arunkumar Sekar.

## License
This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.

