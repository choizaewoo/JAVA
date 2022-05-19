package JAVA8; //날씨

import java.io.File;

import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class JAVA18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String k42_seq =""; //48시간중 몇번째 인지 가르킴
		String k42_hour =""; //동네예보 3시간 단위
		String k42_day =""; //1번째날 (0: 오늘 1: 내일 2: 모레)
		String k42_temp =""; //현재시간온도
		String k42_tmx =""; //최고 온도
		String k42_tmn =""; //최저온도
		String k42_sky =""; //하늘 상태코드 (1: 맑음 2: 구름조금 3: 구름 많음 4: 흐림)
		String k42_pty =""; //강수상태코드 (1: 맑음 2: 비 3: 눈 4: 흐림)
		String k42_wfkor =""; //날씨 한구겅
		String k42_wfEn =""; //날씨 영어
		String k42_pop =""; // 강수 확률
		String k42_r12 =""; //12시간 예상 강수량
		String k42_s12 =""; //12시간 예상 적설량
		String k42_ws =""; //풍속 m/s
		String k42_wd =""; //풍향 (0~7) 북 북동 동 남동 남 남서 서 북서 
		String k42_wdKor =""; //풍향 한국어
		String k42_wdEn=""; // 풍향 영엉
		String k42_reh=""; //습도 
		String k42_r06=""; //6시간 예쌍 강수량
		String k42_s06=""; //6시간 예상 적설량 

		// 파씽을 위한 준비, DocumentBuilder선언
		DocumentBuilder k42_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		Document k42_doc = (Document) k42_docBuilder.parse(new File("C:\\Users\\kopo\\folder\\queryDFS.xml"));
		Element k42root = doc.getDocumentElement ();
		// xml 파일을 처리, PC안에 있어서 전체경로를 지정, xml 파싱처리 
		NodeList k42tag_001 = doc.getElementsByTagName("data");
		// root테그를 가지고 오기도 하지만 지금 코드에선 쓰지 않는다.
		// NodeList 선언, data 태그를 가져온다.
		//for문을 tag_001까지 반복수행한다.
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
