package home.poychenko;

import java.util.Scanner;

public class NumberToString {
    void count(){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Введите число");
        String numberString = Sc.next();
        try{
        int number= Integer.parseInt(numberString);
            for (int i=0;i<numberString.length();i++){
                System.out.println(number%10);
                //System.out.println(number/10);
                number/=10;}
        }
        catch ( NumberFormatException e){
            System.out.println("Введенное значение не является числом");
        }
    }
}

