package home.poychenko;

import java.util.InputMismatchException;
import java.util.Scanner;

public class vectorLengs {
    void count (){
        try {
            Scanner Sc=new Scanner(System.in);
            System.out.println("Для расчета длинны вектора ведите три числа (x,y,z) через знак enter");
            double x=Sc.nextDouble();
            double y=Sc.nextDouble();
            double z=Sc.nextDouble();
            double lengs=Math.sqrt((x*x+y*y+z*z));
            System.out.printf("Длинна вектора (%f,%f,%f) = %f", x,y,z,lengs);
        }
        catch (InputMismatchException e){
            System.out.println("Одно или несколько значений не являются числдами");
        }
    }
}
