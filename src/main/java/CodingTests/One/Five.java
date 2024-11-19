package CodingTests.One;

public class Five {

    public static void main(String[] args) {
        System.out.println(oneEditAway("test", "testt")); // true
        System.out.println(oneEditAway("test", "sest")); // true
        System.out.println(oneEditAway("test", "est")); // true
        System.out.println(oneEditAway("test", "tester")); // false
        System.out.println(oneEditAway("test", "Not")); // false
        System.out.println(oneEditAway("test", "t")); // false
        System.out.println(oneEditAway("test", "test")); // false
    }

    private static boolean oneEditAway(String first, String second) {
        if(first.equals(second) || first.length() < second.length() - 1 || first.length() > second.length() + 1){
            return false;
        }

        char[] firstCharArray = first.toCharArray();
        char[] secondCharArray = second.toCharArray();
        if(first.length() < second.length()){
            return checkIfLetterAdded(firstCharArray, secondCharArray);
        }
        else if(first.length() > second.length()){
            return checkIfLetterAdded(secondCharArray, firstCharArray);
        }
        return checkIfLetterChanged(firstCharArray, secondCharArray);
    }

    private static boolean checkIfLetterChanged(char[] first, char[] second) {
        boolean letterChanged = false;
        int j = 0;
        for (char c : first) {
            if (c != second[j] && letterChanged) {
                return false;
            } else if (c != second[j]) {
                letterChanged = true;
            }
            j++;
        }
        return true;
    }

    private static boolean checkIfLetterAdded(char[] first, char[] second) {
        boolean letterAdded = false;
        int j = 0;
        for (char c : first) {
            if (c != second[j] && letterAdded) {
                return false;
            } else if (c != second[j]) {
                letterAdded = true;
                j++;
            }
            j++;
        }
        return true;
    }
}
