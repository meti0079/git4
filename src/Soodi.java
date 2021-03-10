import java.util.Scanner;

public class Soodi {
    public static void  main(String[] a){
        Scanner scanner = new Scanner(System.in);

        int n= scanner.nextInt();
        int [] integ= new int[n];
        int i=0;
        while (i<n){
            integ[i]=scanner.nextInt();
            i++;
        }
        int max=1;
        int help =1;
        i=0;
        while (i<n-1){
            if (integ[i]<integ[i+1]){
                help++;
            }
            else {
                if (help >max){
                    max =help;
                }
                 help=1;
            }
            i++;
        }

        System.out.println(max);







    }


}
