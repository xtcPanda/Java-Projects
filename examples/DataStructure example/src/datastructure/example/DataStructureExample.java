/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure.example;
import java.nio.charset.StandardCharsets;
import java.util.*;
/**
 *
 * @author xtcPanda
 */
public class DataStructureExample {
    public class node
    {
         int data; 
	node right ,left; 
	public node(int data)
	{
	 this.data=data;
	 right=left=null;
        }
    
    }
      node root;
 public class BinarySearchTree
 {
    public BinarySearchTree() {
        root = null;
    }

    node findNode(int val) {
        node t = root;

        while (t != null && t.data != val) {
            if (val < t.data) 
            {
                t = t.left;
            } 
            else 
            {
                t = t.right;
            }
        }

        return t;
    }

    boolean find(int val) {
        return findNode(val) != null;
    }

    node findParent(int val) {
        node c = root;
        node parent = null;

        while (c != null && c.data != val) {
            parent = c;

            if (val < c.data) {
                c = c.left;
            } else {
                c = c.right;
            }
        }

        return parent;
    }

    void insert(int val) {
        node cur = findNode(val);
        if (cur != null) {
            return;
        }

        node inserted = new node(val);
        node parent = findParent(val);

        if (parent == null) {
            root = inserted;
            return;
        }

        if (val < parent.data) {
            parent.left = inserted;
        } else if (val > parent.data) {
            parent.right = inserted;
        }
    }

    boolean isLeaf(node n) {
        return n.left == null && n.right == null;
    }

    boolean isParentWithOneChild(node p) {
        return (p.left == null && p.right != null) || (p.left != null && p.right == null);
    }

    node getRightMostNode(node node) {
        node rmn = node;
        while (rmn.right != null) {
            rmn = rmn.right;
        }

        return rmn;
    }

    int remove(int val) {
        int v;
        node del = findNode(val);
        node parent = findParent(val);

        if (del == null) {
            System.out.println(" Node not found ");
            System.exit(1);
        }

        if (isLeaf(del)) {
            if (del == root) {
                root = null;
            } else {
                if (parent.left == del) {
                    parent.left = null;
                } else {
                    parent.right = null;
                }
            }

            v = del.data;

        } else if (isParentWithOneChild(del)) {
            if (parent.right == del) {
                if (del.right != null) {
                    parent.right = del.right;
                } else {
                    parent.right = del.left;
                }
            } else {
                if (del.right != null) {
                    parent.left = del.right;
                } else {
                    parent.left = del.left;
                }
            }

            v = del.data;

        } else {
            node highstLeftNode = getRightMostNode(del.left);
            v = remove(highstLeftNode.data);
            del.data = v;
        }

        return val;
    }
 

    void print(int order) {
        switch (order) {
            case 1:
                System.out.println("Printing tree INORDER ");
                printInOrder(root);
                break;
            case 2:
                System.out.println("Printing tree PREORDER ");
                printPreOrder(root);
                break;
            case 3:
                System.out.println("Printing tree POSTORDER ");
                printPostOrder(root);
                break;
            default:
                break;
        }

    }

    void printInOrder(node cur) {
        if (cur == null) {
            return;
        }

        printInOrder(cur.left);
        System.out.println(cur.data);
        printInOrder(cur.right);
    }

    void printPreOrder(node cur) {
        if (cur == null) {
            return;
        }

        System.out.println(cur.data);
        printPreOrder(cur.left);
        printPreOrder(cur.right);
    }

    void printPostOrder(node cur) {
        if (cur == null) {
            return;
        }

        printPostOrder(cur.left);
        printPostOrder(cur.right);
        System.out.println(cur.data);
    }
 }
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     String name;
     System.out.println("Please enter the value of name");
     name=sc.nextLine();
     int n;
    char[] A1=new char[50];
    int[] A2= new int [50];
    int[] A3 = new int[50];
    
     A1 = name.toCharArray();
     for(int i=0;i<name.length();i++)
     {
         char character = A1[i];
         A2[i]=character;
         A3[i] = A2[i];
     }
        int[] temp = sort(A3, 0, name.length()-1);
  int x = removingRepetedvalues(A3,name.length());
        System.out.println("enter target: ");
        for(int i = 0; i < x; i++)
        {
            A3[i] = temp[i];
            System.out.println(A3[i]);
        }
        int target;
        target = sc.nextInt();

        System.out.println(binarySearch(0, name.length()-1, A3, target));
       
        DataStructureExample b = new DataStructureExample();
        
        for(int i = 0; i < A3.length; i++)
        {
            b.insert(A3[i]);
        }
}
    
 public static int countText(String s){
       
        return s.length();
}
    public static char[] toArray(String text){
         char[] A1=new char[text.length()];
        for (int i=0;i<text.length();i++){
            A1[i]=text.charAt(i);
        }
        
        return A1;
    }
 
    
     public static int[] sort(int arr[], int low, int high) 
    { 
        if (low < high) 
        {
            int pi = quicksort(arr, low, high);
            sort(arr, low, pi-1); 
            sort(arr, pi+1, high); 
        } 
        return arr;
    } 
    
     public static int quicksort(int array[], int low, int high) 
    { 
        int val = array[high];  
        int i = (low-1); 
        for (int j=low; j<high; j++) 
        { 
            if (array[j] < val) 
            { 
                i++; 
                int temp = array[i]; 
                array[i] = array[j]; 
                array[j] = temp; 
            } 
        }
        int temp = array[i+1]; 
        array[i+1] = array[high]; 
        array[high] = temp; 
  
        return i+1; 
    } 
     
      public static int removingRepetedvalues(int[] A2, int n){
      
        int[] temp=new int[n];
        int j=0; 
        for (int i=0; i<n-1; i++) {
            
            if (A2[i]!=A2[i+1]) 
                temp[j++]=A2[i]; 
            
         }
        
        temp[j++]=A2[n-1];
        
        for (int i=0; i<j; i++) 
            A2[i] = temp[i]; 
       
        return j; 
    }
     
     
        public static int binarySearch(int low, int high, int arr[], int target) {
        
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] < target) {
                low = mid + 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
