import java.util.Arrays;

public class prefix_sum {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int arrSize  = arr.length;
        int[] prefeixSum = new int[arrSize];
        // System.out.println(arrSize);
        // int previousSum = arr[0];
        // prefeixSum[0] = previousSum;
        // for(int i = 1; i<arrSize; i++){
        //     previousSum = previousSum + arr[i];
        //     prefeixSum[i] = previousSum;
        // }

        // System.out.println(Arrays.toString(prefeixSum));

        prefeixSum[0] = arr[0];
        for(int i = 1; i<arrSize;i++){
            prefeixSum[i] = prefeixSum[i-1] + arr[i];
        }
        System.out.println(Arrays.toString(prefeixSum));
    }
}
