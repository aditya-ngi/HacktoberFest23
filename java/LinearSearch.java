public class LinearSearch {
        public static void main(String args[]){
                int[] nums = {24,45,23,12,34,53,11};
                int target = 24;
                int ans = linearSearch(nums,target);
                System.out.println(ans);
        }

        static int linearSearch(int[] arr, int target){
                if(arr.length == 0) {
                        return  -1;
                }

//                for(int i =0;i<arr.length;i++){
//                        int element = arr[i];
//                        if(element == target){
//                                return i;
//                        }
//                }

                for (int element : arr){
                        if(element == target){
                                return element;
                        }
                }

                return  -1;
        }
}
