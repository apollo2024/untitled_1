package org.example.hm;

import java.util.Arrays;
import java.util.Scanner;

public class HM_4 {
    public static void main(String[] args) {
        System.out.println("задайте размер");
        Scanner scaner = new Scanner(System.in);
        int size = scaner.nextInt();
        int[] arr = scanner(size);
        int counter = Fuctorial(arr.length);
        int max = arr.length - 1;
        int shift = max;
        for (int i = counter; i > 0; i--) {
            int t = arr[shift];
            arr[shift] = arr[shift - 1];
            arr[shift - 1] = t;
            print(arr);
            if (shift < 2) {
                shift = max;
            } else {
                shift--;
            }
        }
        System.out.println("Вариантов " + counter);
    }

    static void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    static int Fuctorial(int n) {
        return (n > 0) ? n * Fuctorial(n - 1) : 1;
    }
    public static int[] scanner(int size){
        int[] in = new int[size];
        Scanner scaner = new Scanner(System.in);
        for (int i = 0; i < in.length; i++) {
            in[i] = scaner.nextInt();
        }
        return in;
            
        }
}


