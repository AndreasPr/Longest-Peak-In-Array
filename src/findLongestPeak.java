
/**
 * Created on 10/Jan/2021 to Find-Longest-Peak
 */
public class findLongestPeak {

    private static void findPeak(int[] matrix){

        if(matrix.length == 1){
            System.out.println(matrix[0]);
        }
        if(matrix[0] > matrix[1]){
            System.out.println(matrix[0]);
        }
        if(matrix[matrix.length-1] > matrix[matrix.length - 2]){
            System.out.println(matrix[matrix.length - 1]);
        }

        for(int i = 0; i < matrix.length - 1; i++){

            if(matrix[i] >= matrix[i + 1] && matrix[i] >= matrix[i - 1]) {
                System.out.println(matrix[i]);
            }
        }
    }

    public static void main(String args[]){

        int[] matrix = {10, 20, 15, 2, 23, 67, 90};
        findPeak(matrix);

    }

}
