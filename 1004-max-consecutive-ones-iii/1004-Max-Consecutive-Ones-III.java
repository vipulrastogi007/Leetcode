class Solution {
    public int longestOnes(int[] nums, int k) {
        int left =0,right=0,count=0,len=0;
for(right=0;right<nums.length; right++){
if(nums[right]==0)
count++;
while(count>k){
if(nums[left]==0){
count--;
}
left++;
}
len=Math.max(len,right-left+1);
}
return len;
    }
}