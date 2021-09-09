package com.nitincodes;

public class Main {

    public static void main(String[] args) {
        // searching algorythm question:
        // searching an element in an array:
        int[] nums = {12, 4, 6, 8, 2, 89, 82};
        int target = 88;
        int ans = linersearch(nums, target);
        System.out.println(ans);
    }
    static int linersearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index=0;index< arr.length;index++) {
            int element = arr[index];
            if(element == target) ;
            {
                return index;
            }
        }
        return -1;

    }
}

