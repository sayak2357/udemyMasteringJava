
import java.util.*;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<Album>();
    public static void main(String[] args) {
        Album album = new Album("StrormBringer","DeepPurple");
        album.addSong("StormBringer",560.773);
        album.addSong("Love is",111.09);
        album.addSong("Holy man",59.2);
        album.addSong("Hold on",60.18);
        album.addSong("Lady double dealer",3.33);
        album.addSong("Yo can't",36.08);
        album.addSong("I won",26.8);
        albums.add(album);

        album = new Album("Ring my bell","Enrque");
        album.addSong("Ring my bell",53.45);
        album.addSong("La la",442.131);
        album.addSong("Can you",33.31);
        album.addSong("I will",412.34);
        album.addSong("Love you",22.55);
        album.addSong("Be my baby",53.4);

        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("Can you", playList);
        albums.get(0).addToPlayList("Be my baby",playList);
        albums.get(0).addToPlayList("Can you",playList);

        albums.get(1).addToPlayList(2,playList);
        albums.get(2).addToPlayList(1,playList);
        albums.get(1).addToPlayList(2,playList);
        albums.get(0).addToPlayList(3,playList);
        play(playList);



    }

    private static void play(LinkedList<Song> playList){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size()==0){
            System.out.println("No songs in playlist");
            return;
        }
        else{
            System.out.println("Now playing "+listIterator.next().toString());
            printMenu();
        }
        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action){

                case 0:
                    System.out.println("Playlist complete.");
                    quit=true;
                    break;
                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward=true;
                    }
                    if(listIterator.hasNext()){
                    System.out.println("Now playing "+ listIterator.next().toString());

                    }
                    else {
                        System.out.println("We have reached the end of the playlist");
                        forward=false;
                    }
                    break;
                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward=false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing "+listIterator.previous().toString());

                    }else{
                        System.out.println("We are at the start of the playlist");
                        forward=true;
                    }
                    break;
                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now replaying "+listIterator.previous().toString());
                            forward = false;
                        }
                        else{
                            System.out.println("We are at the start of the list");
                        }

                    }else{
                        if(listIterator.hasNext()){
                            System.out.println("Now replaying "+listIterator.next().toString());
                            forward=true;
                        }else{
                            System.out.println("We have reached the end of the list.");
                        }
                    }
                    break;
                case 4: printList(playList);break;
                case 5:
                    printMenu();
                    break;
            }
        }
    }
    private static void printMenu(){
        System.out.println("Available actions: \npress");
        System.out.println("0 - to quit\n"+
                "1 - to play next song\n"+
                "2 - to play previous song\n"+
                "3 - replay previous song\n"+
                "4 - list song of the playList\n"+
                "5 - print all available actions.");

    }
    private static void printList(LinkedList<Song> playList){
        Iterator<Song> iterator = playList.iterator();

    }
}
