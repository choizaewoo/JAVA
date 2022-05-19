package JAVA6;

public class InputData {

   public int[] num;
   public String[] name;
   public int[] kor;
   public int[] eng;
   public int[] mat;
   public int[] sum;
   public int [] avg;

   public InputData(int a) {
      num = new int[a];
      name = new String[a];
      kor = new int[a];
      eng = new int[a];
      mat = new int[a];
      sum = new int[a];
      avg = new int[a];
   }

   public void setData(int i, String name1, int kor1, int eng1, int mat1) {
      num[i] = i + 1;
      name[i] = name1;
      kor[i] = kor1;
      eng[i] = eng1;
      mat[i] = mat1;
      sum[i] = kor1 + eng1 + mat1;
      avg[i] = (int) (sum[i] / 3.0);
   }
   
   // 1 ~30 �հ�
   public int korSum() { // ��������
      int kSum = 0;
      
      for (int i = 0; i <= 30; i++) {
         kSum += kor[i];
      }
      return kSum;
   }

   public int engSum() { //��������
      int eSum = 0;
      for (int i = 0; i <= 30; i++) {
         eSum += eng[i];
      }
      return eSum;
   }
   
   public int matSum() { //��������
      int mSum = 0;
      for (int i = 0; i <= 30; i++) {
         mSum += mat[i];
      }
      return mSum;
   }

   public int totalSum() { //������ ����
      int totalSum = 0; 
      totalSum = matSum() + engSum() + korSum();
      return totalSum;
   }
   
   public int totalAvg() { //������ ������ ���
      int totalAvg = 0;
       totalAvg = totalSum() / 3;
      return totalAvg ;
   }
   
 //1~30 ���
   
   public int korAvg() {
      int kAvg = 0;
      return kAvg = korSum() /30 ;
      
   }
   public int engAvg() {
      int eAvg = 0;
      return eAvg = engSum() /30 ;
      
   }
   public int matAvg() {
      int mAvg = matSum() / 30;
      return mAvg;
   }
   public int avgSum() {
      int aSum = korAvg() + engAvg() + matAvg();
      return aSum;
   }
   public int avgAvg() { //����������� ���
      int aAvg = avgSum() / 3;
      return aAvg;
   }
   
   // 30~60 �հ�
   
   public int korSum1() { // ��������
      int kSum = 0;
      
      for (int i = 31; i <= 60; i++) {
         kSum += kor[i];
      }
      return kSum;
   }
   
   public int engSum1() { //��������
      int eSum = 0;
      for (int i = 31; i <= 60; i++) {
         eSum += eng[i];
      }
      return eSum;
   }
   public int matSum1() { //��������
      int mSum = 0;
      for (int i = 31; i <= 60; i++) {
         mSum += mat[i];
      }
      return mSum;
   }
   
   public int totalSum1() { //������ ����
      int totalSum = 0; 
      for (int i = 31; i <= 60; i++) {
         totalSum += sum[i];
      }
      return totalSum;
   }
   
   public int totalAvg1() { //������ ������ ���
      int totalAvg = 0;
      for (int i = 31; i <= 60; i++) {
       totalAvg += avg[i]; 
      }
      return totalAvg;
   }
   
   //31~60 ���
   
   public int korAvg1() {
      int kAvg = 0;
      for (int i = 31; i <= 60; i++) {
         kAvg += kor[i] / 30;
      }
      return kAvg;
      
   }
   public int engAvg1() {
      int eAvg = 0;
      for (int i = 31; i <= 60; i++) {
         eAvg += eng[i] / 30;
      }
      return eAvg;
      
   }
   public int matAvg1() {
      int mAvg = 0;
      for (int i = 31; i <= 60; i++) {
         mAvg += mat[i] / 30;
      }
      return mAvg;
   }
   public int avgSum1() { //
      int aSum = 0;
      for (int i = 31; i <= 60; i++) {
         aSum += kor[i] / 30 + eng[i] / 30 + mat[i] / 30;
      }
      return aSum;
   }
   
   public int avgAvg1() { //����������� ���
      int aAvg = 0;
      for (int i = 31; i <= 60; i++) {
         aAvg = avgSum1() / 3;
      }
      return aAvg;
   }
   
   // 61~90 �հ�
   
   public int korSum2() { // ��������
      int kSum = 0;
      
      for (int i = 61; i <= 90; i++) {
         kSum += kor[i];
      }
      return kSum;
   }
   
   public int engSum2() { //��������
      int eSum = 0;
      for (int i = 61; i <= 90; i++) {
         eSum += eng[i];
      }
      return eSum;
   }
   public int matSum2() { //��������
      int mSum = 0;
      for (int i = 61; i <= 90; i++) {
         mSum += mat[i];
      }
      return mSum;
   }
   
   public int totalSum2() { //������ ����
      int totalSum = 0; 
      for (int i = 61; i <= 90; i++) {
         totalSum += sum[i];
      }
      return totalSum;
   }
   
   public int totalAvg2() { //������ ������ ���
      int totalAvg = 0;
      for (int i = 61; i <= 90; i++) {
       totalAvg += avg[i]; 
      }
      return totalAvg ;
   }
   
   
   //61~ 90 ���
   
   public int korAvg2() {
      int kAvg = 0;
      for (int i = 61; i <= 90; i++) {
    	  kAvg += kor[i] / 30;
      }
      return kAvg;
      
   }
   public int engAvg2() {
      int eAvg = 0; 
      for (int i = 61; i <= 90; i++) {
    	  eAvg += eng[i] / 30;
      }
      return eAvg;
      
   }
   public int matAvg2() {
      int mAvg = 0;
      for (int i = 61; i <= 90; i++) {
    	  mAvg += mat[i] / 30;
      }
      return mAvg;
   }
   public int avgSum2() {
      int aSum = 0;
      for (int i = 61; i <= 90; i++) {
          aSum += kor[i] / 30 + eng[i] / 30 + mat[i] / 30;
      }
      return aSum;
   }
   public int avgAvg2() { //����������� ���
      int aAvg = 0;
      for (int i = 31; i <= 90; i++) {
          aAvg = avgSum2() / 3;
       }
      return aAvg;
   }
   
   // 91~120 �հ�
   
   public int korSum3() { // ��������
      int kSum = 0;
      
      for (int i = 91; i <= 120; i++) {
         kSum += kor[i];
      }
      return kSum;
   }
   
   public int engSum3() { //��������
      int eSum = 0;
      for (int i = 91; i <= 120; i++) {
         eSum += eng[i];
      }
      return eSum;
   }
   public int matSum3() { //��������
      int mSum = 0;
      for (int i = 91; i <= 120; i++) {
         mSum += mat[i];
      }
      return mSum;
   }
   
   public int totalSum3() { //������ ����
      int totalSum = 0; 
      for (int i = 91; i <= 120; i++) {
         totalSum += sum[i];
      }
      return totalSum;
   }
   
   public int totalAvg3() { //������ ������ ���
      int totalAvg = 0;
      for (int i = 91; i <= 120; i++) {
       totalAvg += avg[i]; 
      }
      return totalAvg ;
   }
   
   
   //91~ 120 ���
   
   public int korAvg3() {
      int kAvg = 0;
      for (int i = 91; i <= 120; i++) {
    	  kAvg += kor[i] / 30;
      }
      return kAvg;
      
   }
   public int engAvg3() {
      int eAvg = 0; 
      for (int i = 91; i <= 120; i++) {
    	  eAvg += eng[i] / 30;
      }
      return eAvg;
      
   }
   public int matAvg3() {
      int mAvg = 0;
      for (int i = 91; i <= 120; i++) {
    	  mAvg += mat[i] / 30;
      }
      return mAvg;
   }
   public int avgSum3() {
      int aSum = 0;
      for (int i = 91; i <= 120; i++) {
          aSum += kor[i] / 30 + eng[i] / 30 + mat[i] / 30;
      }
      return aSum;
   }
   public int avgAvg3() { //����������� ���
      int aAvg = 0;
      for (int i = 91; i <= 120; i++) {
          aAvg = avgSum3() / 3;
       }
      return aAvg;
   }
   
   // 121~150 �հ�
   
   public int korSum4() { // ��������
      int kSum = 0;
      
      for (int i = 121; i <= 150; i++) {
         kSum += kor[i];
      }
      return kSum;
   }
   
   public int engSum4() { //��������
      int eSum = 0;
      for (int i = 121; i <= 150; i++) {
         eSum += eng[i];
      }
      return eSum;
   }
   public int matSum4() { //��������
      int mSum = 0;
      for (int i = 121; i <= 150; i++) {
         mSum += mat[i];
      }
      return mSum;
   }
   
   public int totalSum4() { //������ ����
      int totalSum = 0; 
      for (int i = 121; i <= 150; i++) {
         totalSum += sum[i];
      }
      return totalSum;
   }
   
   public int totalAvg4() { //������ ������ ���
      int totalAvg = 0;
      for (int i = 121; i <= 150; i++) {
       totalAvg += avg[i]; 
      }
      return totalAvg ;
   }
   
   
   //121~ 150 ���
   
   public int korAvg4() {
      int kAvg = 0;
      for (int i = 121; i <= 150; i++) {
    	  kAvg += kor[i] / 30;
      }
      return kAvg;
      
   }
   public int engAvg4() {
      int eAvg = 0; 
      for (int i = 121; i <= 150; i++) {
    	  eAvg += eng[i] / 30;
      }
      return eAvg;
      
   }
   public int matAvg4() {
      int mAvg = 0;
      for (int i = 121; i <= 150; i++) {
    	  mAvg += mat[i] / 30;
      }
      return mAvg;
   }
   public int avgSum4() {
      int aSum = 0;
      for (int i = 121; i <= 150; i++) {
          aSum += kor[i] / 30 + eng[i] / 30 + mat[i] / 30;
      }
      return aSum;
   }
   public int avgAvg4() { //����������� ���
      int aAvg = 0;
      for (int i = 121; i <= 150; i++) {
          aAvg = avgSum4() / 3;
       }
      return aAvg;
   }
   
 // 151~180 �հ�
   
   public int korSum5() { // ��������
      int kSum = 0;
      
      for (int i = 151; i <= 180; i++) {
         kSum += kor[i];
      }
      return kSum;
   }
   
   public int engSum5() { //��������
      int eSum = 0;
      for (int i = 151; i <= 180; i++) {
         eSum += eng[i];
      }
      return eSum;
   }
   public int matSum5() { //��������
      int mSum = 0;
      for (int i = 151; i <= 180; i++) {
         mSum += mat[i];
      }
      return mSum;
   }
   
   public int totalSum5() { //������ ����
      int totalSum = 0; 
      for (int i = 151; i <= 180; i++) {
         totalSum += sum[i];
      }
      return totalSum;
   }
   
   public int totalAvg5() { //������ ������ ���
      int totalAvg = 0;
      for (int i = 151; i <= 180; i++) {
       totalAvg += avg[i]; 
      }
      return totalAvg ;
   }
   
   
   //151~ 180 ���
   
   public int korAvg5() {
      int kAvg = 0;
      for (int i = 151; i <= 180; i++) {
    	  kAvg += kor[i] / 30;
      }
      return kAvg;
      
   }
   public int engAvg5() {
      int eAvg = 0; 
      for (int i = 151; i <= 180; i++) {
    	  eAvg += eng[i] / 30;
      }
      return eAvg;
      
   }
   public int matAvg5() {
      int mAvg = 0;
      for (int i = 151; i <= 180; i++) {
    	  mAvg += mat[i] / 30;
      }
      return mAvg;
   }
   public int avgSum5() {
      int aSum = 0;
      for (int i = 151; i <= 180; i++) {
          aSum += kor[i] / 30 + eng[i] / 30 + mat[i] / 30;
      }
      return aSum;
   }
   public int avgAvg5() { //����������� ���
      int aAvg = 0;
      for (int i = 151; i <= 180; i++) {
          aAvg = avgSum5() / 3;
       }
      return aAvg;
   }
   
// 181~200 �հ�
   
   public int korSum6() { // ��������
      int kSum = 0;
      
      for (int i = 181; i <= 200; i++) {
         kSum += kor[i];
      }
      return kSum;
   }
   
   public int engSum6() { //��������
      int eSum = 0;
      for (int i = 181; i <= 200; i++) {
         eSum += eng[i];
      }
      return eSum;
   }
   public int matSum6() { //��������
      int mSum = 0;
      for (int i = 181; i <= 200; i++) {
         mSum += mat[i];
      }
      return mSum;
   }
   
   public int totalSum6() { //������ ����
      int totalSum = 0; 
      for (int i = 181; i <= 200; i++) {
         totalSum += sum[i];
      }
      return totalSum;
   }
   
   public int totalAvg6() { //������ ������ ���
      int totalAvg = 0;
      for (int i = 181; i <= 200; i++) {
       totalAvg += avg[i]; 
      }
      return totalAvg ;
   }
   
   
   //181~ 200 ���
   
   public int korAvg6() {
      int kAvg = 0;
      for (int i = 181; i <= 200; i++) {
    	  kAvg += kor[i] / 20;
      }
      return kAvg;
      
   }
   public int engAvg6() {
      int eAvg = 0; 
      for (int i = 181; i <= 200; i++) {
    	  eAvg += eng[i] / 20;
      }
      return eAvg;
      
   }
   public int matAvg6() {
      int mAvg = 0;
      for (int i = 181; i <= 200; i++) {
    	  mAvg += mat[i] / 20;
      }
      return mAvg;
   }
   public int avgSum6() {
      int aSum = 0;
      for (int i = 181; i <= 200; i++) {
          aSum += kor[i] / 20 + eng[i] / 20 + mat[i] / 20;
      }
      return aSum;
   }
   public int avgAvg6() { //����������� ���
      int aAvg = 0;
      for (int i = 181; i <= 200; i++) {
          aAvg = avgSum6() / 3;
       }
      return aAvg;
   }
   
   
   
   
}