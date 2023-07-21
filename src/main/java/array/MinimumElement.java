package array;

import java.util.*;
public class MinimumElement {
    // write code here
    private static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        int siz = scanner.nextInt();
        return siz;
    }
    private static int[] readElements(int siz){
        int[] array=new int[siz];
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<siz;i++){
            int num = scanner.nextInt();
            array[i]=num;
        }
        System.out.print("[");
        for(int i=0;i<siz;i++){
            System.out.print(array[i]+",");
            if(i!=siz-1) System.out.print(" ");
        }
        System.out.print("]");
        return array;
    }
    private static int findMin(int[] array){
        int ans=array[0];
        for(int i=0;i<array.length;i++){
            if(ans>array[i]) ans=array[i];
        }
        return ans;
    }
}