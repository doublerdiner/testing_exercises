package CodingPractice;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<Integer>> wordMap = new HashMap<>();
        for(int i=0; i<strs.length; i++){
            String word = strs[i];
            char[] sorted = word.toCharArray();
            Arrays.sort(sorted);
            String sortedString = new String(sorted);
            if(wordMap.containsKey(sortedString)){
                List<Integer> value = wordMap.get(sortedString);
                value.add(i);
                wordMap.put(sortedString, value);
            }
            else{
                List<Integer> value = new ArrayList<>();
                value.add(i);
                wordMap.put(sortedString, value);
            }
        }

        List<List<String>> response = new ArrayList<>();
        for(String uniqueKey : wordMap.keySet()){
            List<String> subList = new ArrayList<>();
            for(Integer index : wordMap.get(uniqueKey)){
                subList.add(strs[index]);
            }
            response.add(subList);
        }
        return response;
    }
}
