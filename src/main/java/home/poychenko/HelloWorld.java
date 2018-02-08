package home.poychenko;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        float a=1000f;
        float b=1000f;
        boolean d= a==b;

        final float epsilon=0.00001f;
        System.out.println(d);
        Scanner sc= new Scanner(System.in);
        int i=sc.nextInt();
        System.out.println(i);

    }
}

