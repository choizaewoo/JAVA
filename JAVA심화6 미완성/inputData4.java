package JAVA6;

public class inputData4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iPerson = 200;

		InputData inData = new InputData(iPerson);
				
		for (int i = 0; i < iPerson; i++) {
			String name = String.format("È«±æ%02d", i);
			int kor = (int) (Math.random() * 100);
			int eng = (int) (Math.random() * 100);
			int mat = (int) (Math.random() * 100);
			inData.setData(i, name, kor, eng, mat);
		
		}

//				for (int i = 0; i < iPerson; i++) {
//					if (5 <= i && i <= 100) {
//						int kor = (int) (Math.random() * 100);
//						int eng = (int) (Math.random() * 100);
//						int mat = (int) (Math.random() * 100);
//						inData.setData2(kor, eng, mat);
//
//					}
//
//				}
		for (int i = 0; i < iPerson; i++) {

		if(i % 30 == 0) {
		System.out.printf("=======================================================================\n");
		System.out.printf("%s%5s%5s%5s%5s%5s%5s", "¹øÈ£", "ÀÌ¸§", "±¹¾î", "¿µ¾î", "¼öÇÐ", "ÃÑÁ¡", "Æò±Õ\n");
		System.out.printf("=======================================================================\n");
		
			System.out.printf("%3d%8s%4d%7d%6d%8d%6d\n", i, inData.name[i], 
					inData.kor[i], inData.eng[i], inData.mat[i],
					inData.sum[i], inData.avg[i]);
		}
		System.out.printf("=======================================================================\n");
		System.out.printf("%s%14d%7d%6d%7d%7d\n", "ÇÕ°è", inData.korSum(),
				inData.engSum(),inData.matSum(), inData.totalSum(),
				inData.totalAvg());
		
		System.out.printf("%s%13d%7d%6d%7d%7d\n", "Æò±Õ", inData.korAvg(),
				inData.engAvg(),inData.matAvg(), inData.avgSum(),
				inData.avgAvg());
		}
		
		
		for (int i = 0; i < iPerson; i++) {
			String name = String.format("È«±æ%02d", i);
			int kor = (int) (Math.random() * 100);
			int eng = (int) (Math.random() * 100);
			int mat = (int) (Math.random() * 100);
			inData.setData(i, name, kor, eng, mat);
		
		}
		for (int i = 0; i < iPerson; i++) {

		
			System.out.printf("%3d%8s%4d%7d%6d%8d%6d\n", i, inData.name[i], 
					inData.kor[i], inData.eng[i], inData.mat[i],
					inData.sum[i], inData.avg[i]);
		}
		System.out.printf("=======================================================================\n");
		System.out.printf("%s%14d%7d%6d%7d%7d\n", "ÇÕ°è", inData.korSum2(),
				inData.engSum2(),inData.matSum2(), inData.totalSum2(),
				inData.totalAvg2());
		
		System.out.printf("%s%13d%7d%6d%7d%7d\n", "Æò±Õ", inData.korAvg2(),
				inData.engAvg2(),inData.matAvg2(), inData.avgSum2(),
				inData.avgAvg2());
		}
	}
