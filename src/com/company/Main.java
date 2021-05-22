package com.company;

public class Main {

    public static void main(String[] args) {
        //комбинацию простого присваивания с другими операциями:
        int a = 5;
        a += 10;
        a -= 3;
        a -= 2;
        a /= 6;
        a <<= 4;
        a >>= 2;
        System.out.println(a);

        int num1 = 6;
        int num2 = 5;
        if (num1 > num2) ;
        System.out.println("Первое число больше второго ");
       // Здесь есть  состояния
        int num3 = 8;
        int num4 = 5;
        if (num3 > num4) {
            System.out.println("Первое число больше второго");

        } else if (num3 < num4) {
            System.out.println("Первое число меньше второго");

        }else {
            System.out.println("Числа равны");
        }
        //Также мы можем соединить сразу несколько условий используя логические операторы
        int btn =52;
        int num = 10;
        int num5 = 15;
        if (num < num5 && btn>num5){
            System.out.println("Первое число меньше второго и второе число больше 15");
        }



    }

}
