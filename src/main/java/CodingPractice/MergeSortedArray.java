package CodingPractice;

import java.util.*;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int pointer1 = m-1;
        int pointer2 = n-1;
        int nums1Pointer = m+n-1;
        while(pointer1 >= 0 && pointer2 >= 0){
            if(nums1[pointer1] > nums2[pointer2]){
                nums1[nums1Pointer] = nums1[pointer1];
                pointer1--;
            }
            else{
                nums1[nums1Pointer] = nums2[pointer2];
                pointer2--;
            }
            nums1Pointer--;
        }

        while(pointer2 >= 0){
            nums1[nums1Pointer] = nums2[pointer2];
            pointer2--;
            nums1Pointer--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,3,5,0,0,0};
        int[] nums2 = {2,4,5};
        merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));

        nums1 = new int[]{1};
        nums2 = new int[]{0};
        merge(nums1, 1, nums2, 0);
        System.out.println(Arrays.toString(nums1));

        nums1 = new int[]{0};
        nums2 = new int[]{1};
        merge(nums1, 0, nums2, 1);
        System.out.println(Arrays.toString(nums1));
    }
}
