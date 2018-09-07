	// TODO Auto-generated method stub
		// getPolynomialvalue(2, 3);
		// System.out.println(highestfreqchar("abbbbbbbccaacddaacd"));
		// int[] arr = { 0, 2, 3, 0, 7, 0, 6, 0, 0, 9, 0 };

		// preorder(arr);
		//int[] arr = { 5, 18, 3, 2, 2, 18, 5, 7 };
		// duplicate(arr);
		//evenxor(arr);
		soe(30);
	}

	public static void getPolynomialvalue(int x, int n) {
		int sum = 0;
		int p = x;
		for (int i = n; i > 0; i--) {
			sum = sum + i * (p);
			p = p * x;
		}
		System.out.println(sum);
	}

	public static char highestfreqchar(String s) {
		int[] arr = new int[26];

		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);
			arr[ch - 'a']++;
		}

		int max = 0;
		char maxc = 'a';
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[max]) {
				max = i;
				maxc = (char) ('a' + i);
			}
		}

		return maxc;

	}

	public static void preorder(int[] arr) {
		int nz = 0;
		int i = 0;
		while (i < arr.length) {
			if (arr[i] == 0) {
				i++;
			} else {
				swap(arr, i, nz);
				i++;
				nz++;
			}
		}
		for (int val : arr) {
			System.out.print(val + " ");
		}
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void duplicate(int arr[]) {
		int unique = 0;
		for (int val : arr) {
			unique ^= val;
		}
		System.out.println(unique);
	}

	public static void evenxor(int arr[]) {
		int unique = 0;

		for (int val : arr) {
			unique ^= val;
		}

		int rsbit = unique & -unique;
		int x = unique;
		int y = unique;
		for (int val : arr) {
			if ((val & rsbit) == 0) {
				x ^= val;
			}

			else {
				y ^= val;
			}
		}
		System.out.println(x + " " + y);
	}

	public static void soe(int n) {

		boolean[] primens = new boolean[n + 1];
		Arrays.fill(primens, true);
		primens[0] = false;
		primens[1] = false;
		for (int i = 2; i * i <= n; i++) {
			if (primens[i] == true) {
				for (int j = i; i * j <= n; j++) {
					primens[i*j]=false;
				}
			}
		}
			for( int i=0;i<primens.length;i++) {
				if(primens[i]==true) {
					System.out.println(i);
				}
			}
		}
	}

