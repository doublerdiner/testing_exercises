package CodingTests.One;

public class Six {

    public static void main(String[] args) {
        System.out.println(stringCompression("aaabbbccca"));
        System.out.println(stringCompression("eeeeee"));
        System.out.println(stringCompression("abccccccbbaa"));
        System.out.println(stringCompression("CCCCCCCCABABAa"));
    }

    private static String stringCompression(String original) {
        char[] originalArray = original.strip().toCharArray();
        StringBuilder response = new StringBuilder();
        int count = 1;
        for(int i=0; i<originalArray.length; i++){
            if(i == originalArray.length-1 || original.charAt(i) != original.charAt(i+1)){
                response.append(originalArray[i]);
                response.append(count);
                count=1;
            }
            else{
                count++;
            }
        }
        return checkResponseIsShorter(response.toString(), original);
    }

    private static String checkResponseIsShorter(String toString, String original) {
        return original.length() < toString.length()? original : toString;
    }
}
