import java.lang.reflect.Array;

public class SearchIn2dArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4,5},
                {8,0,-4,7,33},
                {19,18,77,23}
        };
        System.out.println(searchMin(arr));
    }

    static int searchMin(int[][] arr){
        int min = arr[0][0];
        for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(min>arr[i][j]){
                    min = arr[i][j];
                }
            }
        }
        return min;
    }


}
