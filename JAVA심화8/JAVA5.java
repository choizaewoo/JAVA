package JAVA8;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class JAVA5 {

	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
		//DocumentBuilder로 객체를 생성한다.
		DocumentBuilder k42_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		//DocumentBuilder로 xml파일을 불러온다.
		Document k42_doc = k42_docBuilder.parse(new File("C:\\Users\\kopo\\folder\\ddd.xml"));
		//객체를 생성한다.
		Element k42_root =  k42_doc.getDocumentElement();
		//nodeList 인터페이스로 자식목록들을 이 객체로 얻을 수 있다.
		NodeList tag_name = k42_doc.getElementsByTagName("name");
		NodeList tag_studentid = k42_doc.getElementsByTagName("studentid");
		NodeList tag_kor = k42_doc.getElementsByTagName("kor");
		NodeList tag_eng = k42_doc.getElementsByTagName("eng");
		NodeList tag_mat = k42_doc.getElementsByTagName("mat");
		
		System.out.printf("**************************************\n");
		//for문을 통해서 i를 tag_name까지 돌린다.
		for (int i = 0; i < tag_name.getLength(); i++) {
			//getfirstchild 메소드로 목록을 불러온다.
			System.out.printf("이름 : %s\n", tag_name.item(i).getFirstChild().getNodeValue());
			System.out.printf("학번 : %s\n", tag_studentid.item(i).getFirstChild().getNodeValue());
			System.out.printf("국어 : %s\n", tag_kor.item(i).getFirstChild().getNodeValue());
			System.out.printf("영어 : %s\n", tag_eng.item(i).getFirstChild().getNodeValue());
			System.out.printf("수학 : %s\n", tag_mat.item(i).getFirstChild().getNodeValue());
			System.out.printf("**********************************************\n");
		}
		
	}

}
