/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rimpal
 */
public class HelloWorld {
    public static void main(String args[]){
        System.out.println("Hello Java");
        int n1 =10;
        float f1 = 10.5f;
        double d1 = 12.345456677;
        short s1 = 12;
        char c1 = 'a';
        String str1 = "Java";
        boolean b1 = true;
        System.out.println("value of n1 is " + n1);
        System.out.println("value of f1 is "+ f1);
       System.out.println("value of d1 is " + d1); 
       System.out.println("value of s1 is " + s1);
       System.out.println("value of c1 is " + c1);
       System.out.println("value of str1 is " + str1);
       System.out.println("value of b1 is " + b1);
       n1 *= 20;//n1 = n1 * 20;
       System.out.println("value of n1 is " + n1);
       n1++;//n1 = n1 = 1;
       System.out.println("value of n1 is " + n1);
       ++n1;//n1 = 200;
       System.out.println("value of n1 is " + n1);
       n1--;//n1 - 1 n1 = 201;
       System.out.println("value of n1 is " + n1);//n1 = 201
       int n2 = n1++;
       System.out.println("value of n2 is " + n2);//201;
       System.out.println("value of n2 is " + n2);//201;
       n2 = ++n1;
       System.out.println("value of n2 is " + n2 + 10);
       System.out.println("value of n2 is " + (n2 + 10));
       c1 = 'K';//A-Z 65-97
       System.out.println("value of c1 is " + c1);
       System.out.println("value of c1 is " + (char)(c1 + 10));
       System.out.println("value of C1 is " + (char)(c1 - 2));
       n1 /=2;
       System.out.println("value of n1 is " + n1);//202/2 =101;
       c1 = 'C';
       System.out.println("value of c1 is " + (char)(c1 + 8));
    } 
}
