
import java.util.Scanner;
public class Mabna2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String st = sc.nextLine();
            int a = sc.nextInt();
            int n = st.length();
            int c = 0;
            int i = n-1;
            int k = 0;
            while(i >= 0){
                c =(int) ((st.charAt(i)- '0' )* Math.pow(a ,k ) + c );
                k++;
                i--;

            }
            System.out.println(c);
        }

}
