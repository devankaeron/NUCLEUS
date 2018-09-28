
// Java program to find 
// XOR without using ^ 
import java.io.*; 
  
class GFG  
{ 
  
// Returns XOR of x and y 
static int myXOR(int x, int y) 
{ 
    return (x | y) &  
           (~x | ~y); 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
    int x = 3, y = 5; 
    System.out.println("XOR is "+  
                      (myXOR(x, y))); 
} 
} 
  --------------------------------------------------------------
XOR is 6