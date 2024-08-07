package Bank;

import java.util.ArrayList;
import java.util.Scanner;

public class ATM {
    private ArrayList<Account> accounts = new ArrayList<Account>();
    Scanner sc= new Scanner(System.in);

    public ATM() {

    }
    public void start(){
        System.out.println("welelcome to ATM System");
        System.out.println("1.user login");
        System.out.println("2.user register");
        System.out.println("please choose");
        int commond = sc.nextInt();
        while (true) {
            switch (commond){
                case 1:
                    //
                    break;
                    case 2:
                        //
                        break;
                default:
                    System.out.println("no operation");

            }
        }


    }
}
