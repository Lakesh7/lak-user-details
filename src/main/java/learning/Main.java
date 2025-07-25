package learning;

import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the word which you want to reverse");
//        String word = sc.next();
//        char[] cha = word.toCharArray();
//        int count=0;
//        for (int i=0;i<=cha.length-1;i++)
//        {
//            for(int j=0;j<=cha.length-1;j++)
//            {
//               if(cha[i]==cha[j])
//                {
//                  count++;
//                }
//            }
//            if(count<=2)
//            {
//                System.out.print(cha[i]);
//            }
//        }
//    }
//}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word:");
        String word = sc.next();
        char[] cha = word.toCharArray();

        for (int i = 0; i < cha.length; i++) {
            int count = 0;
            for (int j = 0; j < cha.length; j++) {
                if (cha[i] == cha[j]) {
                    count++;
                }
            }
            if (count >= 2) {
                System.out.print("");
            }
            else System.out.println(cha[i]);
        }
    }
}
