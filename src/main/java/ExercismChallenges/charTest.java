package ExercismChallenges;

public class charTest {
    public static void main(String[] args) {
        String testWord = "t4ryi53nΓg-tβιεγτh\u001Fi_s";
        String regex = "[ά-ώ]";
        testWord = testWord.replaceAll(regex, "");
        StringBuilder response = new StringBuilder();
        char[] array = testWord.toCharArray();
        for(int i=0; i<array.length; i++){
            char currentLetter = array[i];
            if(Character.isISOControl(currentLetter)){
                System.out.println("is ISOControl");
                response.append(new char[]{'C', 'T', 'R', 'L'});
                continue;
            }
            else if(currentLetter == '-'){
                i++;
                currentLetter = Character.toUpperCase(array[i]);
            }
            else if(!Character.isLetter(currentLetter)){
                continue;
            }


            response.append(currentLetter);
        }
        System.out.println(response);
    }
}
