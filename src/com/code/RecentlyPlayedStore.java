package com.code;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


interface RecentlyPlayedStore {
    void addSong(String user, String song);
    List<String> getRecentlyPlayedSongs(String user);
}
class LinkedHashMapRecentlyPlayedStore implements RecentlyPlayedStore {
    private final int capacity; 
    private final Map<String, LinkedList<String>> store; 
    LinkedHashMapRecentlyPlayedStore(int capacity) {
        this.capacity = capacity;
        this.store = new LinkedHashMap<>(capacity);
    }
    @Override
    public void addSong(String user, String song) {
        store.computeIfAbsent(user, k -> new LinkedList<>());
        LinkedList<String> songs = store.get(user);

        if (songs.contains(song)) {
            songs.remove(song); 
        } else if (songs.size() >= capacity) {
            songs.removeLast(); 
        }
        songs.addFirst(song); 
    }

    @Override
    public List<String> getRecentlyPlayedSongs(String user) {
        return store.getOrDefault(user, new LinkedList<>());
    }
}