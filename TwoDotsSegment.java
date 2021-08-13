package TwoDots;

import java.util.Scanner;
class Segment{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int b2 = scanner.nextInt();
        scanner.close();
        if (a1<=a2){
            if(b1<a2&&b1<b2){
                System.out.println("Пересечения нет");
            }else if(b1==a2){
                System.out.println(b1);
            }else if(b2==b1){
                System.out.println(a2+" "+b1);
            }else if(a1==a2&&b2>b1){
                System.out.println(a2+" "+b1);
            }else if (b2<b1){
                System.out.println(a2+" "+b2);
            }else {
                System.out.println(a2+" "+b1);
            }
        }else {
            if (b2<a1&&b2<b1){
                System.out.println ("Пересечения нет");
            }else if(b2==a1){
                System.out.println(b2);
            }else if(b2==b1){
                System.out.println(a1+" "+b2);
            }else if(b2<b1){
                System.out.println(a2+" "+b2);
            }else if(b1<b2) {
                System.out.println(a1+" "+b1);
            }else {
                System.out.println(a1+" "+b2);
            }
        }
    }
}
