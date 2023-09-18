package com.naveen;

public class TwoSums {

    public static int[]  twoSum(int[] nums, int target) {

        for (int a=0;a<nums.length;a++)
        {
            for (int b=a+1;b<nums.length;b++)
            {

                int h = nums[a] + nums[b];
                if(h == target)
                {
                    int result[] = {a,b};
                    return result;
                }

            }
        }
            return null;
        }


    public static void main(String[] args) {

        int nums[] = {2,7,11,15};
        int target = 9;
        TwoSums.twoSum(nums, target);
    }
}
