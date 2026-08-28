import java.util.ArrayList;

public class Playlist {
    private String name;
    private ArrayList <String> songs ;
    Playlist(String name){
        this.name=name;
        this.songs=new ArrayList<>();



    }

    public String getName() {
        return name;
    }
    public void addSong(String songName){
        songs.add(songName);
        return;
    }
    public void removeSong(String songName){
        songs.remove(songName);
        return;
    }
    public void printSongs(){
        System.out.println( "PLAYLIST NAME: "+name);
        if(songs.isEmpty()){
            throw new RuntimeException("playlıst is empty");
        }
        for(int i=0;i<=songs.size();i++){
            System.out.println(songs.get(i+1)+"->"+songs.get(i));
        }

    }
    public int getCount(){
        return songs.size();
    }
}
