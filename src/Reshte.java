import java.util.Scanner;

public class Reshte {
    public  static  void main(String [] a){
        Scanner scanner =new Scanner(System.in);
        String input= scanner.nextLine();

    ////// delet  A O U E  I
        int i=0;
        input=input.toLowerCase();
        String ans="";
        while (i < input.length()){
            if(input.charAt(i) == 'a'  || input.charAt(i)=='o'  || input.charAt(i)=='i' || input.charAt(i)=='u' || input.charAt(i)=='e' ){

            } else {
                ans = ans +input.charAt(i);
            }
            i++;
        }
//         System.out.println(ans);


//        String x= "AbcdFG";

//        int j=0;
//        String ans1="";
//        while (j<ans.length()){
//            char y= ans.charAt(i);
//            if( y >= 97){
//                y -= 'a'-'A';
//            }
//            ans1= ans1+y;
//
//        }
    int j=0;
            while (j<ans.length()){
                System.out.print("."+ans.charAt(j));
                j++;
            }









    }
}
