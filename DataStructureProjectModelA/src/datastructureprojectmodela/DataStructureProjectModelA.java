/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructureprojectmodela;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author xtcPanda
 */
public class DataStructureProjectModelA {
    
    //tree implementation
    class TREE{
        public Node root; 
  
        // Tree Node 
        public class Node { 
            int data; 
            Node left, right; 
            Node(int data) 
            { 
                this.data = data; 
                this.left = null; 
                this.right = null; 
            }
        }
        
        // Function to insert nodes in level order 
        public Node insertLevelOrder(int[] arr, Node root, 
                                                int i) 
        { 
            // Base case for recursion 
            if (i < arr.length) { 
                Node temp = new Node(arr[i]); 
                root = temp; 

                // insert left child 
                root.left = insertLevelOrder(arr, root.left, 
                                                 2 * i + 1); 

                // insert right child 
                root.right = insertLevelOrder(arr, root.right, 
                                                   2 * i + 2); 
            } 
            return root; 
        } 
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //reading inputs
        Scanner sc = new Scanner (System.in);
        String msg;
        do{
            msg = sc.nextLine();
        }while(!(msg != null && msg.length() <= 50));
        //though I can count them with a simple function called .length lol but ok
        int count = 0;
        for(char c:msg.toCharArray())
            count++;
        
        //there is other ways to count the string like
        /*
         *  int i;
         *  for (i = 0; msg.charAt(i) != '\0'; ++i);
         *  System.out.println(i);
        */
        System.out.println(count);
        
        //creating the 2 Arrays
        char[] A1 = new char[count]; // you still can use .length()
        int[] A2 = new int[count];
        for(int i = 0; i < msg.length() ; i++){
            A1[i] = msg.charAt(i);
            A2[i] = (int)msg.charAt(i);
        }
        System.out.println(A1[0] + "" + A2[0]);
        //Done with problem 1.
        
        //problem 2 
        //sorting the array with a func
        sort(A2, 0, A2.length -1);
        //removing duplicates
        int s = distinctSort(A2,A2.length);
        int[] A3 = new int [s];
        for(int i = 0 ; i < s ; i++){
            A3[i] = A2[i];
            System.out.println(A3[i]);
        }
        
        //searching for some key
        int key = binarySearch(A3, A1[0]);
        if(key == -1){
            System.out.println("something went wrong");
        }else{
            System.out.println("the 1st char is now at index " + key);
        }
        
        
        
        
        
        
    }
    
    //FUNCTIONS !!
    
    // Distinct Sort Logic
    static int distinctSort(int arr[], int n){ 
        // Return, if array is empty 
        // or contains a single element 
        if (n==0 || n==1) 
            return n; 
       
        int[] temp = new int[n]; 
          
        // Start traversing elements 
        int j = 0; 
        for (int i=0; i<n-1; i++) 
            // If current element is not equal 
            // to next element then store that 
            // current element 
            if (arr[i] != arr[i+1]) 
                temp[j++] = arr[i]; 
          
        // Store the last element as whether 
        // it is unique or repeated, it hasn't 
        // stored previously 
        temp[j++] = arr[n-1];    
          
        // Modify original array 
        for (int i=0; i<j; i++) 
            arr[i] = temp[i]; 
       
        return j; 
    }
    
    //Quick Sort Logic
    /* This function takes last element as pivot, 
       places the pivot element at its correct 
       position in sorted array, and places all 
       smaller (smaller than pivot) to left of 
       pivot and all greater elements to right 
       of pivot */
    public static int partition(int arr[], int low, int high){ 
        int pivot = arr[high];  
        int i = (low-1); // index of smaller element 
        for (int j=low; j<high; j++) 
        { 
            // If current element is smaller than the pivot 
            if (arr[j] < pivot) 
            { 
                i++; 

                // swap arr[i] and arr[j] 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 

        // swap arr[i+1] and arr[high] (or pivot) 
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 

        return i+1; 
    } 


    /* The main function that implements QuickSort() 
      arr[] --> Array to be sorted, 
      low  --> Starting index, 
      high  --> Ending index */
    public static void sort(int arr[], int low, int high){ 
        if (low < high) 
        { 
            /* pi is partitioning index, arr[pi] is  
              now at right place */
            int pi = partition(arr, low, high); 

            // Recursively sort elements before 
            // partition and after partition 
            sort(arr, low, pi-1); 
            sort(arr, pi+1, high); 
        } 
    }
    
    //Binary Search Logic
    // Returns index of x if it is present in arr[], 
    // else return -1 
    public static int binarySearch(int arr[], int x) 
    { 
        int l = 0, r = arr.length - 1; 
        while (l <= r) { 
            int m = l + (r - l) / 2; 
  
            // Check if x is present at mid 
            if (arr[m] == x) 
                return m; 
  
            // If x greater, ignore left half 
            if (arr[m] < x) 
                l = m + 1; 
  
            // If x is smaller, ignore right half 
            else
                r = m - 1; 
        } 
  
        // if we reach here, then element was 
        // not present 
        return -1; 
    } 
}