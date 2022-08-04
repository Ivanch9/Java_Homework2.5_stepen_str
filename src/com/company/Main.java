package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str, str1, subStr;
        System.out.print("Vvedite stroky: ");
        str = input.next().toLowerCase();
        int stepen;
        System.out.print("Vvedite stepen: ");
        stepen = input.nextInt();

        if (stepen == 0) {
            System.out.println("stepen ravna 0");
            return;
        }

        if (stepen > 0) {
            for (int i = 0; i < stepen; i++)
                System.out.print(str);
            System.out.println();
            return;
        }

        if (stepen == -1) {
            System.out.println(str);
            return;
        }

        for (int i = 1;i*2 <= str.length(); i++) {
            int ii = 1;
            subStr = str.substring(0, i);
            int j = i;
            while(ii > 0 && j + i <= str.length()) {
                str1 =  str.substring(j, j+i);
                if(subStr.equals(str1) ) {
                    j += i;
                }
                else {
                    ii = -1;
                }
            }
            if(ii > 0) {
                //    System.out.println(subStr);
                int m = str.length() / subStr.length();
                if (Math.abs(stepen) <= m) {
                    for (int k = 1; k <= m + stepen + 1; k++)
                        System.out.print(subStr);
                    System.out.println();
                }
                else
                    System.out.println("Not solution");
                break;
            }
        }

    }
}