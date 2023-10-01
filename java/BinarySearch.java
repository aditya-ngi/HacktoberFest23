public class BinarySearch {
    public static void main(String[] args) {
        int[] arr= {-99,-88,-45,-18,0,1,4,66,99,123};
        int target = -88;
        System.out.println(binarySearch(arr,target));
    }
    static int binarySearch(int[] arr,int target){

        int start = 0;
        int end = arr.length -1;

        while (start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid]>target){
                end = mid -1;
            }else if (arr[mid]<target){
                start = mid + 1;
            }else {
                return mid;
            }
        }

        return -1;
    }
}
