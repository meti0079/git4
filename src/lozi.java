
import java.util.Scanner;
import java.math.*;


public class lozi {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int index=n/2+1;
            for (int i = 0; i < index-1; i++) {
                int j=1;
                while (j<n+1){
                    if(j==index+i || j== index-i){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                  j++;
                }
                System.out.println();
            }
            for (int i = index-1 ; i >=0; i--) {
                int j=1;
                while (j<n+1){
                    if(j==index+i || j== index-i){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                    j++;
                }
                System.out.println();
            }







        }
    }

