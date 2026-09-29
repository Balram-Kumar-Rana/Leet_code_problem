class Solution {
    public void swap(int[] arr , int i , int j){
        int temp = arr[i] ;
        arr[i] = arr[j];
        arr[j] = temp ;
    }
    public void sortColors(int[] nums) {
        int i = 0 ;
        int j = 0 ;
        int k = nums.length-1;
        while(j <= k){
            if(nums[i] == 0 ){
                i++;
                j++;
            }
            else if(nums[j]== 1){
                j++;
            }
            else if(nums[k]==2){
                k--;
            }
            else if(nums[j]==0){
                swap(nums , i , j);
                i++;
                
            }
            else if(nums[j]==2){
                swap(nums , j , k);
                k--;
            }
        }
        
    }
}