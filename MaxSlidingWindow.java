/**
 * Code Explanation:
 * 
 * Hard 1- Maximum Sliding Window
 
 * Time Complexity=O(nlogk)
 
 * To find the Maximum element in each window, i have used Priority queue - Max Heap
 * In the Priority queue a pair of value and index is stored, the priority is set based on value in descending order
 * The result is stored in the array of length n-k+1
 

 * step-1: First Maximum element is the pq.peek() after storing the array elements of 1st window
 * step-2: Loop through rest of Array elements
    Remove the peek elements if they are not the part of current window
    Insert the new pair to pq
 * step-3: Store the Max Element(peek) for the current window in result
 * step-4: Display Result
 * 
 
 */

import java.util.PriorityQueue;
import java.util.Scanner;

public class MaxSlidingWindow {
    
    static class Pair implements Comparable<Pair>{
        int value;
        int index;
        Pair(int value,int index){
            this.value=value;
            this.index=index;
        }

        public int compareTo(Pair p2){
            return p2.value-this.value;
        }
    }

    public static void maxSlidingWindow(int[] arr,int n,int k){
        int[] result=new int[n-k+1];
        PriorityQueue<Pair> pq=new PriorityQueue<>();

        for(int i=0;i<k;i++){
            pq.add(new Pair(arr[i],i));
        }
        result[0]=pq.peek().value;
        
        for(int i=k;i<n;i++){
            while(pq.size()>0 && pq.peek().index<=(i-k)){
                pq.remove();
            }

            pq.add(new Pair(arr[i],i));
            result[i-k+1]=pq.peek().value;
        }
        for(int i=0;i<(n-k+1);i++){
            System.out.print(result[i]+" ");
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
        System.out.println("Enter the window size");
        int k=sc.nextInt();

        maxSlidingWindow(arr,n,k);
    }   
}
