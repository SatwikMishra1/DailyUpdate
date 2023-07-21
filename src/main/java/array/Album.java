package array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;

public class Album {
    // write code here
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name,String artist){
        this.name=name;
        this.artist=artist;
        this.songs=new ArrayList<Song>();
    }

    public boolean addSong(String title,double duration){
        for(Song song:songs){
            if(Objects.equals(song.getTitle(), title)) return false;
        }
        songs.add(new Song(title,duration));
        return true;
    }

    private Song findSong(String title){
        for(Song song:songs){
            if(Objects.equals(song.getTitle(), title)) return song;
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber,LinkedList<Song> playList){
        if(trackNumber>0 && trackNumber<songs.size()){
            for(Song song:playList){
                if(Objects.equals(songs.get(trackNumber).getTitle(), song.getTitle())) return true;
            }
            playList.add(songs.get(trackNumber));
            return false;
        }
        return false;
    }

    public boolean addToPlayList(String songTitle,LinkedList<Song> playList){
        for(Song song:songs){
            if(Objects.equals(song.getTitle(), songTitle)){
                //if(playList.contains(song)) return false;
                playList.add(song);
                return true;
            }
        }
        return false;
    }

}
