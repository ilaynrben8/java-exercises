public class DoublyLinkedPlaylist {
    Song song;
    private Song head;
    private Song tail;
    private Song current;
    DoublyLinkedPlaylist(Song song){
       this.head = song;
       this.tail = song;
       this.current = song;}
       public void addSong(Song song) {
           Song newSong = new Song("");
           if (head == null) {
               head = newSong;
               tail = newSong;

           } else {
               tail.next = newSong;
               newSong.prev = tail;
               tail = newSong;

           }
       }
       public void nextSong() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Current song is " + current + " next song is " + current.next);
        }else{
            if(current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Current song is " + current + " prev song is " + current.prev);
        }}





    }
}
