package JAVA8; //����

import java.io.File;

import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class JAVA18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String k42_seq =""; //48�ð��� ���° ���� ����Ŵ
		String k42_hour =""; //���׿��� 3�ð� ����
		String k42_day =""; //1��°�� (0: ���� 1: ���� 2: ��)
		String k42_temp =""; //����ð��µ�
		String k42_tmx =""; //�ְ� �µ�
		String k42_tmn =""; //�����µ�
		String k42_sky =""; //�ϴ� �����ڵ� (1: ���� 2: �������� 3: ���� ���� 4: �帲)
		String k42_pty =""; //���������ڵ� (1: ���� 2: �� 3: �� 4: �帲)
		String k42_wfkor =""; //���� �ѱ���
		String k42_wfEn =""; //���� ����
		String k42_pop =""; // ���� Ȯ��
		String k42_r12 =""; //12�ð� ���� ������
		String k42_s12 =""; //12�ð� ���� ������
		String k42_ws =""; //ǳ�� m/s
		String k42_wd =""; //ǳ�� (0~7) �� �ϵ� �� ���� �� ���� �� �ϼ� 
		String k42_wdKor =""; //ǳ�� �ѱ���
		String k42_wdEn=""; // ǳ�� ����
		String k42_reh=""; //���� 
		String k42_r06=""; //6�ð� ���� ������
		String k42_s06=""; //6�ð� ���� ������ 

		// �ľ��� ���� �غ�, DocumentBuilder����
		DocumentBuilder k42_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		Document k42_doc = (Document) k42_docBuilder.parse(new File("C:\\Users\\kopo\\folder\\queryDFS.xml"));
		Element k42root = doc.getDocumentElement ();
		// xml ������ ó��, PC�ȿ� �־ ��ü��θ� ����, xml �Ľ�ó�� 
		NodeList k42tag_001 = doc.getElementsByTagName("data");
		// root�ױ׸� ������ ���⵵ ������ ���� �ڵ忡�� ���� �ʴ´�.
		// NodeList ����, data �±׸� �����´�.
		//for���� tag_001���� �ݺ������Ѵ�.
		for (int i = 0; i < k42tag_001.getLength(); i++) {
			Element k42_elmt = (Element)k42tag_001.item(i);
			k42_seq = k42tag_001.item(i).getAttributes().getNamedItem("seq").getNodeValue();
			hour = k42_elmt.getElementsByTagName("hour").item(0).getFirstChild().getNodeValue();
			k42_day = k42_elmt.getElementsByTagName("day").item(0).getFirstChild().getNodeValue();
			k42_temp = k42_elmt.getElementsByTagName("temp").item(0).getFirstChild().getNodeValue();
			k42_tmx = k42_elmt.getElementsByTagName("tmx").item(0).getFirstChild().getNodeValue();
			k42_tmn = k42_elmt.getElementsByTagName("tmn").item(0).getFirstChild().getNodeValue();
			k42_sky = k42_elmt.getElementsByTagName("sky").item(0).getFirstChild().getNodeValue();
			k42_pty = k42_elmt.getElementsByTagName("pty").item(0).getFirstChild().getNodeValue();
			k42_wfkor = k42_elmt.getElementsByTagName("wfkor").item(0).getFirstChild().getNodeValue();
			k42_wfEn = k42_elmt.getElementsByTagName("wfEn").item(0).getFirstChild().getNodeValue();
			k42_pop = k42_elmt.getElementsByTagName("pop").item(0).getFirstChild().getNodeValue();
			k42_r12 = k42_elmt.getElementsByTagName("r12").item(0).getFirstChild().getNodeValue();
			k42_s12 = k42_elmt.getElementsByTagName("s12").item(0).getFirstChild().getNodeValue();
			k42_ws = k42_elmt.getElementsByTagName("ws").item(0).getFirstChild().getNodeValue();
			k42_wd = k42_elmt.getElementsByTagName("wd").item(0).getFirstChild().getNodeValue();
			k42_wdKor = k42_elmt.getElementsByTagName("wdKor").item(0).getFirstChild().getNodeValue();
			k42_wdEn = k42_elmt.getElementsByTagName("wdEn").item(0).getFirstChild().getNodeValue();
			k42_reh = k42_elmt.getElementsByTagName("reh").item(0).getFirstChild().getNodeValue();
			k42_r06 = k42_elmt.getElementsByTagName("r06").item(0).getFirstChild().getNodeValue();
			k42_s06 = k42_elmt.getElementsByTagName("s06").item(0).getFirstChild().getNodeValue();

		}
		
		
	}

}
