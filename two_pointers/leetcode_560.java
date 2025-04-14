package two_pointers;

public class leetcode_560 {
    public static void main(String[] args) {
        int[] array = {1,2,3,3};
        int k = 3;

        int arrayLenght = array.length;
        int[] prefixArray = new int[arrayLenght];
        int count = 0;
        prefixArray[0] = array[0];

        for(int i = 1;i<arrayLenght;i++){
            prefixArray[i] = prefixArray[i-1]+array[i];
        }

        for(int i = 0;i<arrayLenght;i++){
            for(int j = i;j<arrayLenght;j++){
                int sum = 0;

                if(i == 0){
                    sum = prefixArray[j];
                } else {
                    sum = prefixArray[j]-prefixArray[i-1];
                }

                if(sum ==k){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
