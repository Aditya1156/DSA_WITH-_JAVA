import java.util.Scanner;

public class SumOf2Darrya {
    public static void main(String[] args) {
        int [][]arr=new int[5][2];
        Scanner sc= new Scanner(System.in);
        int mx=Integer.MIN_VALUE;
        int m= arr.length;
        int n=arr[0].length;
        int sum=0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j]= sc.nextInt();
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                sum +=arr[i][j];
            }

        }
        System.out.println(sum);
    }
}
