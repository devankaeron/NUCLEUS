1.Take as input String s1.
2.Take as input String s1.

Write a Recursive Function to Check whether it String one is reverse of String
two and return Boolean value.


Example(To be used only for expected output):

Input:
abcd
dcba

output
true
Input Format

String representing S.

Constraints

Size of String may be large.

Output Format

print Output.

Sample Input 0

abcd
dcba
Sample Output 0

true
-------------------------------------------------------------------
   Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
        String r=scn.nextLine();
        System.out.println(reverse(s, r, 0, r.length() - 1));
    }

    public static boolean reverse(String s1, String s2, int i, int j) {
        if(j==-1) {
            return true;
        }
        if(s1.charAt(i)!=s2.charAt(j)) {
            return false;
        }
        if(s1.charAt(i)==s2.charAt(j)) {
        return    reverse(s1, s2, i+1, j-1);
        }
        return true;
    }}