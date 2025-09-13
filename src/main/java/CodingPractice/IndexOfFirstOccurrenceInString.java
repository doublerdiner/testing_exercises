package CodingPractice;

public class IndexOfFirstOccurrenceInString {

    public static void main(String[] args) {
        String testString = "needlehaystackhayhayneedle";
        System.out.println(strStr(testString, "haystack"));
    }
    public static int strStr(String parent, String child) {
        int parentLength = parent.length();
        int childLength = child.length();
        if(childLength == 0 || childLength > parentLength){
            return -1;
        }
        for(int i=0; i<parentLength-childLength+1; i++){
            int j=0;
            while(j < childLength && parent.charAt(i+j) == child.charAt(j)){
                j++;
                if(j == childLength){
                    return i;
                }
            }
        }
        return -1;
    }
}
