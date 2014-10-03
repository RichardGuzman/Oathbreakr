public class  Time {
	public static void main(String[] args){
	int number = 5000; 
	int hours = number/3600;
	int remainder = number%3600;
	int minutes = remainder/60 ;
	int seconds = remainder%60;
	   

   	    System.out.println("hours:" +hours );
	    System.out.println("minutes:" + minutes);
        System.out.println("seconds:" + seconds);
  }
}