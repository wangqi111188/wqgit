package basicprograme;


public class TestNumberSum {

	public static void main(String[] args) {
		/**
		 * �и�20Ԫ�ص����飬�����ֵΪ1��20����������1��20ÿ�����ֳ��ֵĴ���
		 */
		int[] arr = new int[20];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=(int) (Math.random()*20+1);
		}
		int[] res = new int[21];
		for (int i = 0; i < arr.length; i++) {
			res[arr[i]] += 1;
		}
		for (int i = 0; i < res.length; i++) {
			if(i>0&&res[i]!=0){
				System.out.print(i+"������"+res[i]+"�� ");
			}
		}
	}

}
