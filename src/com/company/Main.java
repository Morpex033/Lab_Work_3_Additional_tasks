package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(57 + (23 + (1 - 1) * 23)%13 + (211%3));
        task68();
    }

    /*
    Дана строка, содержащая цифры и строчные латинские буквы.
    Если буквы в строке упорядочены по алфавиту, то вывести 0;
    в противном случае вывести номер первого символа строки, нарушающего алфавитный порядок.
     */
    public static void task68(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = scanner.nextLine();
        str = str.toUpperCase();
        char[] chars = str.toCharArray();
        Boolean flag = true;
        for (int i = 0; i < chars.length - 1; i++) {
            if((int)chars[i] > (int)chars[i+1]){
                flag = false;
                System.out.println("Символ №" + (i+2) + " нарушает порядок" + "\nПорядковый номер символа в строке: " + (i + 2) + "\nНомер символа: " + (int)chars[i + 1]);
            }
            if (!flag) {
                break;
            }
        }
        if (flag) {
            System.out.println("Строка упорядочена по алфавиту, выводим 0");
        }
    }
}
