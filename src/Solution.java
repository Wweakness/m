/*
给定一个整数数组，你需要寻找一个连续的子数组，如果对这个子数组进行升序排序，那么整个数组都会变为升序排序。
你找到的子数组应是最短的，请输出它的长度。
输入: [2, 6, 4, 8, 10, 9, 15]
输出: 5
解释: 你只需要对 [6, 4, 8, 10, 9] 进行升序排序，那么整个表都会变为升序排序。

 */
import java.util.Arrays;

class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] n=new int[nums.length];
        int left=0;
        int right=0;
        for(int i=0;i<nums.length;i++){
            n[i]=nums[i];
        }
        Arrays.sort(n);
        for(int i=0;i<n.length;i++){
            if(n[i]!=nums[i]){
                left=i;
                break;
            }
        }
        for(int i=0;i<n.length;i++){
            if(n[i]!=nums[i]){
                right=i;
            }
        }
        if(left==0&&right==0){
            return 0;
        }

        return right-left+1;
    }
}