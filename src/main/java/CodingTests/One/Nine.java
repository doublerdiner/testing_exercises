package CodingTests.One;

public class Nine {

    public static void main(String[] args) {
        System.out.println(isRotation("Waterbottle   ", "Erbottlewat"));
        System.out.println(isRotation("test   ", "stte"));
    }

    private static boolean isRotation(String string1, String string2) {
        String cleanString1 = string1.strip().toLowerCase();
        String cleanString2 = string2.strip().toLowerCase();

        if(cleanString1.length() != cleanString2.length() || cleanString1.length() == 0) return false;
        String doubleString1 = cleanString1 + cleanString1;
        return isSubstring(cleanString2, doubleString1);
    }

    private static boolean isSubstring(String smallString, String longString) {
        return longString.contains(smallString);
    }
}
