package start;
import java.util.*;

public class Class2{
	int sid;
	String sname;
	Class2(int sid,String sname)
	{
		this.sid=sid;
		this.sname=sname;
		
	}
	public static void main(String Args[]){
		Class2 s1=new Class2(101,"first student");
		Class2 s2=new Class2(102,"second student");
		System.out.println(s1.sid);
		System.out.println(s2.sid);
	}
	
}