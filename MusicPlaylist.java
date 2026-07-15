import java.util.ArrayList;
import java.util.Scanner;

class Song {
    String title;
    String artist;

    Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }
}

public class MusicPlaylist {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Song> playlist = new ArrayList<>();

        while (true) {

            System.out.println("\n===== MUSIC PLAYLIST =====");
            System.out.println("1. Add Song");
            System.out.println("2. View Playlist");
            System.out.println("3. Search Song");
            System.out.println("4. Remove Song");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Song Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Artist Name: ");
                    String artist = sc.nextLine();

                    playlist.add(new Song(title, artist));

                    System.out.println("Song Added!");
                    break;

                case 2:

                    if (playlist.isEmpty()) {
                        System.out.println("Playlist is empty.");
                    } else {

                        System.out.println("\nPlaylist:");

                        for (Song s : playlist) {
                            System.out.println("----------------------");
                            System.out.println("Title : " + s.title);
                            System.out.println("Artist: " + s.artist);
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Song Title: ");
                    String search = sc.nextLine();

                    boolean found = false;

                    for (Song s : playlist) {

                        if (s.title.equalsIgnoreCase(search)) {

                            System.out.println("\nSong Found!");
                            System.out.println("Title : " + s.title);
                            System.out.println("Artist: " + s.artist);

                            found = true;
                        }
                    }

                    if (!found)
                        System.out.println("Song not found.");

                    break;

                case 4:

                    System.out.print("Enter Song Title: ");
                    String remove = sc.nextLine();

                    boolean deleted = playlist.removeIf(
                            s -> s.title.equalsIgnoreCase(remove));

                    if (deleted)
                        System.out.println("Song Removed!");
                    else
                        System.out.println("Song not found.");

                    break;

                case 5:

                    System.out.println("Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}