public class Find_Numbers_With_Even_Digits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums) {
        int ans=0;
        for(int i =0;i<nums.length;i++){
            int digits = 0;
            int element = nums[i];
            //brute force approach
            // while(element > 0){
            //     element = element/10;
            //     digits++;
            // }

            // optimized solution
            digits = (int)(Math.log10(element)) + 1;

            if(digits % 2 == 0){
                ans++;
            }
        }
        return ans;
    }
}
