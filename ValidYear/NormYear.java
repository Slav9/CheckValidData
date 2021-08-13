package ValidYear;

public class NormYear {
    public  void checkNorm(int day,int month){
        if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
            System.out.println("true");
        }else if((month==4||month==6||month==9||month==11)&&day<31){
            System.out.println("true");
        }else if(month==2&&day<29){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}
