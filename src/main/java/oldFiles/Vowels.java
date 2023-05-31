package oldFiles;

public class Vowels {

    public static int parseChar(char letter){
        int value = 0;
        switch(letter){
            case 'a', 'e', 'i', 'o', 'u': value = 1;
            break;
        }
        return value;
    }

    public static int getCount(String str){
        int total = 0;
        for(int i=0; i<str.length(); i++){
            char currentLetter = str.charAt(i);
            total += parseChar(currentLetter);
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(getCount("letter"));
    }
}
