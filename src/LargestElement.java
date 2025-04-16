import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        int [][]arr={{10,4},{3,4},{7,9},{5,6}};
        Scanner sc= new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j]+ " ");
            }
        }
        // initialisation for 2d array
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                max=Math.max(max,arr[i][j]);
            }
        }
        System.out.println();
        System.out.println("Maximum Elements in the above array :"+max);
    }
}
