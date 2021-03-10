
import java.util.Scanner;
public class moghayese {

        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            String a = sc.nextLine();
            String b = sc.nextLine();
            String dict = sc.nextLine();
            int i = 0;
            int j = 0;
            int k = 0;
            int z = 0;


            String A = a.toLowerCase();
            String B = b.toLowerCase();
            String Dict = dict.toLowerCase();
            String Max="";
            int d= Math.min(A.length(),B.length());

//        if (A.charAt(0) != B.charAt(0)) {
//         }
            for(i=1;A.charAt(i-1)==B.charAt(i-1);i++){

                k=i;

            }
            if (k==d){
                if (A.length()<B.length()){
                    Max=A;
                }
                else{
                    Max=B;
                }

            }
            else {
                for(j=0;A.charAt(i)!=Dict.charAt(j)&&B.charAt(i)!=Dict.charAt(j);j++){

                    z=j;

                }
                if (A.charAt(i)==Dict.charAt(z)){
                    Max=A;

                }
                else {
                    Max=B;
                }

            }

            //System.out.println(Max);


            StringBuilder sb = new StringBuilder();
            sb.append(Max.substring(0, 1).

                    toUpperCase());
            sb.append(Max.substring(1));
            String Max1 = sb.toString();
            //System.out.println(Max1);
            StringBuilder sb1 = new StringBuilder();
            sb1.append(Max1);
            sb1.reverse();
            String Max2 = sb1.toString();
            // System.out.println(Max2);
            String Max3 = Max1 + Max2;
            System.out.println(Max3);

        }

}
