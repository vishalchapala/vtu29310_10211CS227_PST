class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans=new int[nums.length];
        int j=0;

        for(int i=0;i<n;i++){
            ans[j++]=nums[i];
            ans[j++]=nums[i+n];
        }
        return ans;
    }
}

OUTPUT

nums =[2,5,1,3,4,7]
n =3
Output
[2,3,5,4,1,7]
