package JAVA_20220407;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 CSVReader csvReader = new CSVReader();
	        csvReader.readCSV();
	    }

	    public List<List<String>> readCSV() {
	        List<List<String>> csvList = new ArrayList<List<String>>();
	        File csv = new File("C:\\Users\\kopo\\Desktop\\trafficvolume.csv");
	        BufferedReader br = null;
	        String line = "";

	        try {
	            br = new BufferedReader(new FileReader(csv));
	            while ((line = br.readLine()) != null) { // readLine()�� ���Ͽ��� ����� �� ���� �����͸� �о�´�.
	                List<String> aLine = new ArrayList<String>();
	                String[] lineArr = line.split(","); // ������ �� ���� ,�� ������ �迭�� ���� �� ����Ʈ�� ��ȯ�Ѵ�.
	                aLine = Arrays.asList(lineArr);
	                csvList.add(aLine);
	            }
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                if (br != null) { 
	                    br.close(); // ��� �� BufferedReader�� �ݾ��ش�.
	                }
	            } catch(IOException e) {
	                e.printStackTrace();
	            }
	        }
	        return csvList;
	    }
	}

