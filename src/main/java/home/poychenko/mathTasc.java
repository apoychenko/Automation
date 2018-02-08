package home.poychenko;

import java.util.InputMismatchException;
import java.util.Scanner;

public class mathTasc {
    public void Math(){
        //Получение значений пользователя
        Scanner Sc= new Scanner(System.in);
        System.out.println("Введите четыре числа через знак enter");
        try{
        double x=Sc.nextDouble();
        double y=Sc.nextDouble();
        double z=Sc.nextDouble();
        double n=Sc.nextDouble();
            //Первое уравнение расчет в float
            long fLong=((long)x-(50+(long)y*(long)z)*(long)n)+(long)x;
            System.out.println("Расчет произведен с потерей точности до целых : (x-(50+y*z)*n)+x= "+fLong);
            //Второе уравнение расчет в int
            try {
                int fInt=(int)x+((int)y-100)*(int)z/(int)n;
                System.out.println("Расчет произведен с потерей точности до целых : x+(y-100)*z/n= "+fInt);
            }
            catch (ArithmeticException e){
                System.out.println("Это уравнение нельзя вычислить по заданным параметрам, причина: \"Деление на ноль\"");
            }
            //Третье уравнение расчет в float
            try {
                if (z==1){ throw new ArithmeticException();}
                float fFloat=(float)x*((float)y/((float)z-1)+555)-(float)n;
                System.out.println("Расчет произведен с потерей точности: x*(y/(z-1)+555)-n= "+fFloat);
            }
            catch (ArithmeticException e){
                System.out.println("Это уравнение нельзя вычислить по заданным параметрам, причина: \"Деление на ноль\"");
            }
            //Четвертое уравнение расчет в double
            try {
                if (y==0){ throw new ArithmeticException();}
                double fDouble=-x/y+z*(n+1);
                System.out.println("-x/y+z*(n+1)= "+fDouble);
            }
            catch (ArithmeticException e){
                System.out.println("Это уравнение нельзя вычислить по заданным параметрам, причина: \"Деление на ноль\"");
            }
        }
        catch (InputMismatchException e){
            System.out.println("извините введенные значения не являются числами");
        }

    }
}
