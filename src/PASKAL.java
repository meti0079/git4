import java.util.Scanner;

public class PASKAL {

    public  static void main (String [] a){
        Scanner scanner =new Scanner(System.in);
        int n=scanner.nextInt();
        int [][] A=new int[n+1][n+1];
        A[1][1]=1;
        for (int i = 2; i < n+1; i++) {
            for (int j = 1; j < i+1; j++) {
                A[j][i]=(A[j][i-1]+A[j-1][i-1])%10;
            }
        }
//
//        for (int i = 0; i < n+1; i++) {
//            for (int j = 0; j < n+1; j++) {
//                System.out.print(A[j][i]+ "  ");
//            }
//            System.out.println();
//        }

    int index=n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j==index-i-1){
                    for (int k = 1; k < i+2; k++) {
                        System.out.print(A[k][i+1]+" ");
                    }
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
//        for (int i = 1; i < n+1; i++) {
//            System.out.print(A[i][n]+" ");
//        }

        
    }
}
