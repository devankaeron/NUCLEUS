1.Take as input String.
2.Take a input Integer div;

Write a recursive Function to convert string into Integer say "res" and Print
the Output by dividing res with div.


Example(To be used only for expected output):

Input:
23456789 10
output
2345678
Input Format

String representing S.

Constraints

Size of String may be large.

Output Format

print Output.

Sample Input 0

23456789 10
Sample Output 0

2345678
---------------------------------------------------------------------

Scanner scn =new Scanner(System.in);
        String s=scn.nextLine();
        String index = s.split(" ")[1];
        String s2 = s.split(" ")[0];
        int div = Integer.parseInt(index); 
        convert(s2, 0, 0,div);
        
            }
            
            public static void convert(String s,int index,long val,int div) {
        if(s.length()==0) {
            System.out.println(val/div);
            return;
        }

        char ch=s.charAt(index);
        String res=s.substring(index+1);
        val=val*10+((int)ch-48);
        convert(res, index, val,div);

        }}

