package mar12;

public class DiverseArray {

    public static int arraySum(int[] arr) {
        int sum = 0;
        for (int x = 0; x < arr.length; x++) {
            sum += arr[x];
        }
        return sum;
    }

    public static int[] rowSums(int[][] arr2D) {
        int[] sums = new int[arr2D.length];
        for (int i = 0; i < sums.length; i++) {
            sums[i] = arraySum(arr2D[i]);

        }
        return sums;
    }

    public static boolean isDiverse(int[][] arr2D) {
        int[] sums = rowSums(arr2D);
        for(int i = 0; i < sums.length; i++){
            for(int j = 0; j < sums.length; j++){
                if(i!=j && sums[i] == sums[j])return false;
            }
        }
        return true;
    }




}
