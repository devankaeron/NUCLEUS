1.Take an input N, the size of array.
2.Take N more inputs and store that in an array.

Write a Recursive function which Bubble Sort the Array but don't allow to use
any kind Iterative.

print the Sorted array.

Example(To be used only for expected output):
Input:
4
1 2 3 0
Output:
0 1 2 3

---------------------------------------------------------------------------

  Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int []arr=new int[n];
for(int i=0;i<n;i++) {
    arr[i]=scn.nextInt();
}
bubbleSort(arr, n);
printArray(arr);

    }


public static void bubbleSort(int arr[], int n)
{
    // Base case
    if (n == 1)
        return;
  
    // One pass of bubble sort. After
    // this pass, the largest element
    // is moved (or bubbled) to end.
    for (int i=0; i<n-1; i++)
        if (arr[i] > arr[i+1])
        {
            // swap arr[i], arr[i+1]
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
  
    // Largest element is fixed,
    // recur for remaining array
    bubbleSort(arr, n-1);
}
public static void printArray(int arr[])
{
    int n = arr.length;
    for (int i=0; i<n; ++i)
        System.out.print(arr[i] + " ");
    System.out.println();
}}