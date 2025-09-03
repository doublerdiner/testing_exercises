package CodingPractice;

public class HIndex {
    public static void main(String[] args) {
        int[] testArray = {3,0,5,6,1};
        System.out.println(getHIndex(testArray));
    }

    private static int getHIndex(int[] citations) {
        int numOfPapers = citations.length;
        int[] countArray = new int[numOfPapers+1];
        for(int c : citations){
            if(c >= numOfPapers){
                countArray[numOfPapers]++;
            }
            else{
                countArray[c]++;
            }
        }
        int papers = 0;
        for(int i=numOfPapers; i >= 0; i--){
            papers += countArray[i];
            if(papers >= i){
                return i;
            }
        }
        return 0;
    }
}
