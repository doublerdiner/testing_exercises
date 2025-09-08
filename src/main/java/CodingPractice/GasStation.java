package CodingPractice;

public class GasStation {
    public static void main(String[] args) {
        int[] gasTest = {1,2,3,4,5};
        int[] costTest = {3,4,5,1,2};
        System.out.println(canCompleteCircuit(gasTest, costTest));
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int currentGas = 0;
        int startingStation = 0;

        for (int i=0; i<gas.length; i++){
            totalGas += gas[i] - cost[i];
            currentGas += gas[i] - cost[i];

            if(currentGas < 0){
                startingStation = i+1;
                currentGas = 0;
            }
        }
        return totalGas >= 0 ? startingStation : -1;
    }
}
