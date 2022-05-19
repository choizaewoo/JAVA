package JAVA_20220406;

import java.util.ArrayList;
import java.util.Collections;
import java.util.jar.Attributes.Name;

public class JAVA009_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> name = new ArrayList<String>();
		
		name.add("kim");
		name.add("lee");
		name.add("john");
		
		System.out.println(name);
		System.out.println(name.size());
		System.out.println(name.get(2));
		
		name.remove(1);//1번째 name을 삭제
		System.out.println(name); //name 출력
		System.out.println(name.size()); //name길이 
		
		name.add("lee");//lee 추가
		System.out.println(name); //name 출력
		
		Collections.sort(name); //name sort 
		System.out.println(name); //sort된 name출력 
		
		Collections.reverse(name); //reverse name
		System.out.println(name); // reverse name 출력
	}	

}
