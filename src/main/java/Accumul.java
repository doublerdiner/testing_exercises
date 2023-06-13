public class Accumul {
    public String accum(String s){
        String formatted = s.toLowerCase();
        int loops = 1;
        StringBuilder answer = new StringBuilder();
        for(int i=0; i<formatted.length(); i++){
            if(loops > 1) answer.append('-');
            char firstLetter = formatted.charAt(i);
            String capitalised = String.valueOf(firstLetter).toUpperCase();
            answer.append(capitalised);
            int extraLetters = loops-1;
            while(extraLetters > 0){
                answer.append(firstLetter);
                extraLetters--;
            }
            loops++;
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Accumul accumul = new Accumul();
        System.out.println(accumul.accum("Tested"));
    }
}
