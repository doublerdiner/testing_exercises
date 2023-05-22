

public class Chars {

    public static String charTest(String sentence){
        StringBuilder answer = new StringBuilder();

        for(int i=0; i<sentence.length(); i++){
            char letter = sentence.charAt(i);
            if(Character.isSpaceChar(letter)){
                answer.append('_');
                continue;
            }
            if(Character.isISOControl(letter)){
                answer.append("CTRL");
                continue;
            }
            if(letter == '-'){
                i++;
                char nextLetter = sentence.charAt(i);
                answer.append(Character.toUpperCase(nextLetter));
                continue;
            }
            if(!Character.isLetter(letter)){
                continue;
            }
            if(Character.isLowerCase(letter))
            answer.append(letter);
        }
        return answer.toString();
    }
    public static void main(String[] args) {
        String test = "This\0 52\' is 57a-test-sentence";
        System.out.println(charTest(test));

    }

}
