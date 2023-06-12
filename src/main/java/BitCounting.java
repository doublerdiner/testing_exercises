public class BitCounting {

    public int countBits(int num){
        String bitNumber = Integer.toBinaryString(num);
        System.out.println(bitNumber);
        int answer = 0;
        for(int i=0; i<bitNumber.length(); i++){
            answer += Integer.parseInt(String.valueOf(bitNumber.charAt(i)));
        }
        return answer;
    }

    public static void main(String[] args) {
        BitCounting count = new BitCounting();
        System.out.println(count.countBits(7));
    }
}
