     Scanner in = new Scanner(System.in);
	        int t=in.nextInt();
	        for(int i=0;i<t;i++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	            int res=a;
	            for(int j=1;j<n;j++){
	                
	                  a+=b;
	            System.out.print(a+" ");    
	             b*=2;
	}
	            System.out.println();
	        }
	}

}
