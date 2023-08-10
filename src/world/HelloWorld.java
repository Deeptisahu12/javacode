package world;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String []args){
        objectslo.object1 obj=new objectslo.object1();
        obj.driver();
    }
    public static void f1(){
        int  i,j;
        for(i=1;i<=5;i++) {
            for (j = 1; j <= 5; j++) {
                if (j <= i)
                    System.out.print("*");
                else
                    System.out.println(" ");
            }
            System.out.println();
        }
    }
}
