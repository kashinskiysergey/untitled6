package com.company;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        int maxValue=0;
        int max=0;
        int arr[] = new int [9];
        for(int i =0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*10);
            if(max<arr[i]){
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(max==arr[i]){
                maxValue++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(maxValue);

        int[] arrey = new int[arr.length];
            for (int i = 0; i < arr.length / 2; i++){
                int som = arr[(arr.length - 1) - i];
                arr[arr.length - 1 - i] = arr[i];
                arr[i] = som;


            }
        System.out.println(Arrays.toString(arr));


    }
}
