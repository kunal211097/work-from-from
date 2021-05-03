package com.company;
import java.util.*;

public class alternate_positive_negative {
    /*    public static void main(String[] args) {
            int temp=0;
            int []arr={-5,-2,5,2,4,7,1,8,0,-8};
            for(int i=0;i<9;i++){
                if(i%2==0 && arr[i]>0){
                   int j=i+1;
                   while(j<10){
                       if(arr[j]<0){
                           temp=arr[i];
                           arr[i]=arr[j];
                           arr[j]=temp;
                           break;
                       }
                       j++;
                   }
                    }
                else if(i%2!=0 && arr[i]<0){
                    int j=i+1;
                    while(j<10){
                        if(arr[j]>0){
                            temp=arr[i];
                            arr[i]=arr[j];
                            arr[j]=temp;
                            break;
                        }
                        j++;
                    }

                }

            }
            for(int i=0;i<10;i++)
            System.out.println(arr[i]);
        }
    }
     */
    public static void main(String[] args) {
        int[] arr = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        int i = 0, j = 0;
        while (i < 10 && j<10) {
            if (i % 2 == 0 && arr[i] < 0) {
                i++;
                j = i + 1;
            } else if (i % 2 != 0 && arr[i] > 0) {
                i++;
                j = i + 1;
            } else {
                if (arr[i] < 0 && arr[j] > 0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j = i + 1;
                } else if (arr[i] > 0 && arr[j] < 0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j = i + 1;
                }
                j++;


            }

        }
        for(int k=0;k<10;k++){
            System.out.println(arr[k]);
        }
    }
}