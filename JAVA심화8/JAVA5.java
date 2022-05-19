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
		//DocumentBuilder�� ��ü�� �����Ѵ�.
		DocumentBuilder k42_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		//DocumentBuilder�� xml������ �ҷ��´�.
		Document k42_doc = k42_docBuilder.parse(new File("C:\\Users\\kopo\\folder\\ddd.xml"));
		//��ü�� �����Ѵ�.
		Element k42_root =  k42_doc.getDocumentElement();
		//nodeList �������̽��� �ڽĸ�ϵ��� �� ��ü�� ���� �� �ִ�.
		NodeList tag_name = k42_doc.getElementsByTagName("name");
		NodeList tag_studentid = k42_doc.getElementsByTagName("studentid");
		NodeList tag_kor = k42_doc.getElementsByTagName("kor");
		NodeList tag_eng = k42_doc.getElementsByTagName("eng");
		NodeList tag_mat = k42_doc.getElementsByTagName("mat");
		
		System.out.printf("**************************************\n");
		//for���� ���ؼ� i�� tag_name���� ������.
		for (int i = 0; i < tag_name.getLength(); i++) {
			//getfirstchild �޼ҵ�� ����� �ҷ��´�.
			System.out.printf("�̸� : %s\n", tag_name.item(i).getFirstChild().getNodeValue());
			System.out.printf("�й� : %s\n", tag_studentid.item(i).getFirstChild().getNodeValue());
			System.out.printf("���� : %s\n", tag_kor.item(i).getFirstChild().getNodeValue());
			System.out.printf("���� : %s\n", tag_eng.item(i).getFirstChild().getNodeValue());
			System.out.printf("���� : %s\n", tag_mat.item(i).getFirstChild().getNodeValue());
			System.out.printf("**********************************************\n");
		}
		
	}

}
