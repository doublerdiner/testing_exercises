package oldFiles;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SongRepeat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isOnRepeat = true;

        while (isOnRepeat){
            System.out.println("Playing current song");
            System.out.println("Would you like to take the song off of repeat? If so answer yes");
            String input = scanner.next();

            if("yes".equals(input)){
                isOnRepeat = false;
            }
        }
        System.out.println("Song taken off repeat");
    }
}
