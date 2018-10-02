1.Take an input N, the size of array.
2.Take N more inputs and store that in an array.
3.Take One More Input I which I'm going to use for verification that you
returned a array or not.

Write a Recursive function which Inverse the array.

print the Inversed array.
print the value of I index of the reversed array.

Example(To be used only for expected output):
Input:
4
1 2 3 0
2
Output:
3 0 1 2
1     
--------------------------------------------------

 Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int[] arr=new int[n];
for(int i=0;i<arr.length;i++) {
    arr[i]=scn.nextInt();
}
        int i=scn.nextInt();
int [] b=new int[arr.length];
inverse(arr, 0,b);
System.out.println(b[i]+" ");
    
        
    }
    public static void inverse(int[] a,int index,int[] inv) {
    
        if(index==a.length) {
            for(int i=0;i<inv.length;i++) {
            System.out.print(inv[i]+" ");
            }
            System.out.println();
            return ;
        }
    
    
        
            int val=a[index];
            inv[val]=index;
        
        
        inverse(a, index+1,inv);

    }
    public static int[] arraysize(int[] a,int[] b) {
        b=new int[a.length];
        return b;
        
    }
}
