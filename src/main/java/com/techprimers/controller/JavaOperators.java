package com.techprimers.controller;

public class JavaOperators {
    public static void main (String[] args) {
        int num1 = 10;
        int num2 = 20;

        System.out.println(num1+num2);
        System.out.println(num1-num2);
        System.out.println(num1*num2);
        System.out.println(num1/num2);
        System.out.println(num1%num2);



        num2 = num1;
        /* num2=10 */
        System.out.println(+num2);

        num2 += num1;
        /* num2=10 + num1=10   10+10=20*/
        System.out.println(num2);

        num2 -= num1;
        /* num2=20 - num1=10   20-10=10*/
        System.out.println(num2);

        num2 *=num1;
        /* num2=10 * num1=10   10*10=100*/
        System.out.println(num2);

        num2 /=num1;
        /* num2=100 * num1=10   100/10=*/
        System.out.println(num2);

        num2 %=num1;
        /* num2=10 % num1=10*/
        System.out.println(num2);

        int num3=100;
        int num4=200;

        System.out.println(++num3);
        System.out.println(--num4);

        boolean b1 = true;
        boolean b2 = false;

        System.out.println(b1&&b2);
        System.out.println(b1||b2);
        System.out.println(!(b1&&b2));


        int num5 =10;
        int num6 =50;
        if(num1==num2) {
            System.out.println("num5and num6 are equal");
        }
        else{
            System.out.println("num5 and num6 are not equal");

        }
       if (num5 !=num6){
           System.out.println("num5 and num6 are not equal ");
       }
       else{
           System.out.println("num5 and num6 are equal");
       }
       if (num5<num6){
           System.out.println("num5 is less than num6");
       }
       else{
           System.out.println("num5 is not less thran num6");
       }
    }

}
