public static void sort012(int arr[]) {
	int z=0;
	int o=0;
	int t=0;
	
	while(t<arr.length) {
		if(arr[t]==2) {
			
			t++;
		}
		else {
			if(arr[t]==1) {
			swap(arr, o, t);
				o++;
				t++;
			}
		
		else
		{
			if(arr[t]==0) {
				swap(arr, t, o);
				t++;
				swap(arr,o,z );
				o++;
				z++;
			}
		}
	}
	
}}}