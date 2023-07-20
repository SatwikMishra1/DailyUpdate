package array;

import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class SortedArray {


    public static int[] getIntegers(int size){
        int[] array=new int[size];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0;i < size; i++){
            array[i]=(scanner.nextInt());
        }
        return array;
    }

    public static void printArray(int[] arrayh){
        for(int i=0;i<arrayh.length;i++){
            System.out.println("Element "+i+" contents "+arrayh[i]);
        }
    }

    public static int[] sortIntegers(int[] arrayh){
        Arrays.sort(arrayh);
        int n=arrayh.length;
        for(int i=0;i<arrayh.length/2;i++){
            int temp=arrayh[i];
            arrayh[i]=arrayh[n-i-1];
            arrayh[n-i-1]=temp;
        }
        return arrayh;
    }

}