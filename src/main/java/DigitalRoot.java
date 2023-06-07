public class DigitalRoot {


    public int digitalRoot(int n){
        int numberToReturn = n;
        while(numberToReturn>9){
            String string = String.valueOf(numberToReturn);
            char[] list = string.toCharArray();
            int total = 0;
            for(int i=0; i<list.length; i++){
                char currentNumber = list[i];
                String letter = String.valueOf(currentNumber);
                Integer thisNumber = Integer.parseInt(letter);
                total += thisNumber;
            }
            numberToReturn = total;
        }
        return numberToReturn;
    }

    public static void main(String[] args) {
        DigitalRoot digitalRoot = new DigitalRoot();
        System.out.println(digitalRoot.digitalRoot(123456789));
    }
}
