package start;

import java.util.Random;

public class RandomNumber {
	public static void main(String Args[]){
		Random R=new Random();
		int n1,n2,n3;
		n1=R.nextInt(661)+343;
		n2=R.nextInt(800)+111;
		n3=R.nextInt(7999)+1111;
		System.out.println(n1+"-"+n2+"-"+n3);
	}

}
