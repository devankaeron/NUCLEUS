		Scanner scn =new Scanner(System.in);
		System.out.println("enter the number" );
		int n=scn.nextInt();
		int tstars=1;
		int tspaces=n/2;
		int row=1;
		while(row<=n) {
			for(int i=1;i<=tspaces;i++) {
				System.out.print(" ");
			}
			for(int i=1;i<=tstars;i++) {
				System.out.print("*");
			}
			if(row<=n/2) {
				tstars+=2;
				tspaces--;
			}
			else {
				tstars-=2;
				tspaces++;
			}
			System.out.println();
			row++;
		}

		}

}
