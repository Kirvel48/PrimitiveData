package com.example.primitivedatatypes;

public class PrimitiveData {

    public static void main(String[] args) {

        byte abyte = 127;      // 1 byte, -128 to 127
        short ashort =32767;    // 2 bytes, from  -32768 to 32767
        int aint = 2147483647;      // 4 bytes, from -2147483648 to 2147483647
        long along = 9223372036854775807L;  //  8 bytes,  from -9223372036854775808 to 9223372036854775807


//  математические операторы
       int aresult= abyte + ashort;
       int bresult = aint - ashort;
       long  cresult = along / abyte;
       int dresult = abyte * ashort;
//  логическими операторы
        System.out.println(ashort>aint);
      if (ashort > abyte) {
          System.out.println("Типы данных соответсвуют");}
else {System.out.println("Ошибка в типах данных");}
//  посмотреть результаты
 System.out.println("Результат сложения"+aresult);
        System.out.println("Результат вычитания " +bresult);
        System.out.println("Результат деления " +cresult);
        System.out.println("Результат умножения " +dresult);
//  вычисления комбинаций типов данных (int и double)
        int firstvar = 5;
        double secondvar = 1.00;

        System.out.println(firstvar * secondvar);
        System.out.println(firstvar / secondvar);
        System.out.println(firstvar + secondvar);
        System.out.println(firstvar - secondvar);


        //переполнение данных

        byte b =abyte +1;
        System.out.println("byte b = " +b);

    }
}
