class countStatic{
	//if we dont write static word you get 11111 result and if you write static it gives 12345...result

	static int i=0;

countStatic(){
	i++;
	System.out.println(i);
}
	public static void main (String arg[]){
      
countStatic cS1= new countStatic();
countStatic cS2= new countStatic();
countStatic cS3= new countStatic();
countStatic cS4= new countStatic();
countStatic cS5= new countStatic();
countStatic cS6= new countStatic();
countStatic cS7= new countStatic();
countStatic cS8= new countStatic();
	}
}