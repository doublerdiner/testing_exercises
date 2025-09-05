package CodingPractice;

import java.util.*;

class RandomisedSet {

    public static void main(String[] args) {
        RandomisedSet set = new RandomisedSet();
        System.out.println(set.insert(1));
        System.out.println(set.remove(2));
        System.out.println(set.insert(2));
        System.out.println(set.getRandom());
        System.out.println(set.remove(1));
        System.out.println(set.insert(2));
        System.out.println(set.getRandom());
    }

    List<Integer> setArray;
    Map<Integer, Integer> setMap;
    Random rand;

    public RandomisedSet() {
        this.setArray = new ArrayList<>();
        this.setMap = new HashMap<>();
        this.rand = new Random();
    }

    public boolean insert(int val) {
        if(!this.setMap.containsKey(val)){
            int nextIndex = this.setArray.size();
            this.setArray.add(val);
            this.setMap.put(val, nextIndex);
            return true;
        }
        return false;
    }

    public boolean remove(int val) {
        if(!this.setMap.containsKey(val)){
            return false;
        }
        int indexToRemove = this.setMap.get(val);
        int lastIndex = this.setArray.size()-1;
        int lastVal = this.setArray.get(lastIndex);

        this.setArray.set(indexToRemove, lastVal);
        this.setMap.put(lastVal, indexToRemove);
        this.setArray.remove(lastIndex);
        this.setMap.remove(val);
        return true;
    }

    public int getRandom() {
        int random = this.rand.nextInt(this.setArray.size());
        return this.setArray.get(random);
    }
}
