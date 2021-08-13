package ValidYear;

import java.util.Scanner;

public class CheckDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату в формате дд мм гг");
        int den = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        scanner.close();
        if ((den<0||den>32)||((month<0)||(month>13))||(year<0)){
            System.out.println("false");
            return;
        }
           if (year%4!=0||(year%100==0&&year%400!=0)){
            NormYear normYear = new NormYear();
            normYear.checkNorm(den,month);
           } else{
               VisokosYear visokosYear = new VisokosYear();
               visokosYear.checkVisokos(den,month);

           }


    }
}
