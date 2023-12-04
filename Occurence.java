/**
 * Code Explanation:
 * Medium 2- find all elements that appear more than ⌊ n/3 ⌋ times.
 
 * Time Complexity=O(nlogk)
 * 
 * To find the elements that appear more than ⌊ n/3 ⌋ times, I have used HashMap Data Structure
 * 
 * step-1: Store the value of array as key of HashMap and Number of Occurences as value of HashMap
 * step-2: Display the key that more than ⌊ n/3 ⌋ times.
 */

import java.util.HashMap;
import java.util.Scanner;

public class Occurence {
    public static void appearMoreThanNby3(int arr[],int n){
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        System.out.print("Elements that appear more than n/3 times are: ");
        for(Integer k:hm.keySet()){
            if(hm.get(k)>(int)n/3){
                System.out.print(k+" ");
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of elements");
        int n=sc.nextInt();

        int arr[]=new int[n];

        System.out.println("Enter the "+n+" elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        appearMoreThanNby3(arr,n);
    }   
}
