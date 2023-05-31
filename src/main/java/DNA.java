import java.util.List;

public class DNA {

    private static char switchLetter(char letter){
        char answer = ' ';
        switch(letter){
            case 'A': answer = 'T';
            break;
            case 'T': answer = 'A';
            break;
            case 'C': answer = 'G';
            break;
            case 'G': answer = 'C';
            break;
        }
        return answer;
    }

    public String makeComplement(String dna){
        StringBuilder stringBuilder = new StringBuilder();
        char[] arrayOfLetters = dna.toUpperCase().toCharArray();
        for(int i=0; i<arrayOfLetters.length; i++){
            stringBuilder.append(switchLetter(arrayOfLetters[i]));
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        DNA dna = new DNA();
        System.out.println(dna.makeComplement("tgcaa"));

    }
}
