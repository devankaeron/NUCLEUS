	Scanner scn=new Scanner(System.in);
        int r=scn.nextInt();
        int c=scn.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++) {
        	for(int j=0;j<c;j++) {
        		arr[i][j]=scn.nextInt();
        	}
        	
        }
        
reverse(arr);
System.out.println();
anticlockwise(arr);
	}


	public static void reverse(int arr[][]) {
		int rowmax=arr.length-1;
		int colmax=arr[0].length-1;
		int rowmin=0;
		int colmin=0;
		int counter=1;
		int tne=arr.length*arr[0].length;
		
		while(counter <=tne) {
			for(int i=rowmin;counter <=tne&&i<=rowmax;i++) {
			System.out.print(arr[i][colmin]+" ");
			counter++;
			}
			colmin++;
			
			for(int j=colmin;counter <=tne &&j<=colmax;j++)
			{
				System.out.print(arr[rowmax][j]+" ");
				counter++;
			}
			rowmax--;
			for(int i=rowmax;counter <=tne &&i>=rowmin;i--) {
				System.out.print(arr[i][colmax]+" ");
				counter++;
		}
			colmax--;
		for(int i=colmax;counter <=tne &&i>=colmin;i--) {
			System.out.print(arr[rowmin][i]+" ");
			counter++;
		}
		rowmin++;
	}
}
public static void anticlockwise(int arr[][]) {
	int rowmax=arr.length-1;
	int colmax=arr[0].length-1;
	int rowmin=0;
	int colmin=0;
	int counter=1;
	int tne=arr.length*arr[0].length;
	
	while(counter <=tne) {
		for(int i=colmin;counter <=tne&&i<=colmax;i++) {
		System.out.print(arr[rowmin][i]+" ");
		counter++;
		}
		rowmin++;
		
		for(int j=rowmin;counter <=tne &&j<=rowmax;j++)
		{
			System.out.print(arr[j][colmax]+" ");
			counter++;
		}
		colmax--;
		for(int i=colmax;counter <=tne &&i>=colmin;i--) {
			System.out.print(arr[rowmax][i]+" ");
			counter++;
	}
		rowmax--;
	for(int i=rowmax;counter <=tne &&i>=rowmin;i--) {
		System.out.print(arr[i][colmin]+" ");
		counter++;
	}
	colmin++;
}
}
	
}