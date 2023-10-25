package com.code;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        RecentlyPlayedStore store = new LinkedHashMapRecentlyPlayedStore(3);

        store.addSong("user1", "S1");
        store.addSong("user1", "S2");
        store.addSong("user1", "S3");

        store.addSong("user1", "S4");
        store.addSong("user1", "S2");
        store.addSong("user1", "S1");
        
        List<String> recentlyPlayedSongs = store.getRecentlyPlayedSongs("user1");
       
        assert recentlyPlayedSongs.size() == 3;
        assert recentlyPlayedSongs.get(0).equals("S1");
        assert recentlyPlayedSongs.get(1).equals("S2");
        assert recentlyPlayedSongs.get(2).equals("S4");

        System.out.println("Recently played songs for user1: " + recentlyPlayedSongs);
    }
}
