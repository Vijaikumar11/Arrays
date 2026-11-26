class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length, l=0,r=n-1;
        int[] res=new int[n];
        for(int k=n-1;k>=0;k--){
            if(Math.abs(nums[l])>Math.abs(nums[r])){
                res[k]=nums[l]*nums[l];
                l++;
            }
            else{
                res[k]=nums[r]*nums[r];
                r--;
            }
        }
        return res;
        
    }
}