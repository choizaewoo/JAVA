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
		
		name.remove(1);//1��° name�� ����
		System.out.println(name); //name ���
		System.out.println(name.size()); //name���� 
		
		name.add("lee");//lee �߰�
		System.out.println(name); //name ���
		
		Collections.sort(name); //name sort 
		System.out.println(name); //sort�� name��� 
		
		Collections.reverse(name); //reverse name
		System.out.println(name); // reverse name ���
	}	

}
