package august18;

import java.util.Scanner;

public class pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int t=1;
for(int i=1;i<=n;i++) {
	int k=i*(i+1)/2;
	for(int j=0;j<i;j++) {
		int l=k-i+1;
	if(i%2==0) {
	System.out.print(k +"\t");
k--;
	}
	else {{
	System.out.print(l+j+"\t");
	l++;
	}
	}
	}
System.out.println();

}
}}