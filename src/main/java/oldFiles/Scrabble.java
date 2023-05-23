package oldFiles;

public class Scrabble {

    private String word;

    public Scrabble(String word) {
        this.word = word;
    }

    public static int parseLetter(char letter){
        int points = 0;
        char upper = Character.toUpperCase(letter);
        switch(upper){
            case 'A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T': points = 1;
            break;
            case 'D', 'G': points = 2;
            break;
            case 'B', 'C', 'M', 'P': points = 3;
            break;
            case 'F', 'H', 'V', 'W', 'Y': points = 4;
            break;
            case 'K': points = 5;
            break;
            case 'J', 'X': points = 8;
            break;
            case 'Q', 'Z': points = 10;
            break;
        }
        return points;
    }

    public int scoreCalculator(){
        int total = 0;
        if(this.word.length()==0){
            return total;
        }
        for(int i=0; i<this.word.length(); i++){
            char currentLetter = this.word.charAt(i);
            total += parseLetter(currentLetter);
        }
            return total;
    }

    public static void main(String[] args) {
        Scrabble scrabble = new Scrabble("Apple");
        System.out.println(scrabble.scoreCalculator());

    }
}
