public static void queencombinations(boolean []boxes,int tnq,int qno,String asf, int lastusedbox) {
if(qno>tnq) {
	counter++;
	System.out.println(asf+"."+counter);
	return;
}


for(int i=lastusedbox+1;i<boxes.length;i++) {
	if(boxes[i]==false) {
	boxes[i]=true;
nqueen_permutation(boxes,tnq,qno+1,asf+"b"+qno+"q"+i,  i);
boxes[i]=false;
}}}