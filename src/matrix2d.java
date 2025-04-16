import java.util.Scanner;

public class matrix2d {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int p,q,m,n;
        System.out.println("Enter the size of array of first matrix");
        m= sc.nextInt();
        n= sc.nextInt();
        System.out.println("Enter the elements of matrix");
        int [][]a=new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter the size of Second Matrix");
        p= sc.nextInt();
        q=sc.nextInt();
        System.out.println("Enter the elements of second matrix");
        int [][]b=new int[p][q];
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                b[i][j]= sc.nextInt();
            }
        }

        if(m==p && n==q){
            int [][]c=new int[p][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < q; j++) {
                    c[i][j]=a[i][j]+b[i][j];
                }
            }
            System.out.println("Final result after matrix addition is:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < q; j++) {
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }

        }

    }
}
