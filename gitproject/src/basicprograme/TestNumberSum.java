package basicprograme;


public class TestNumberSum {

	public static void main(String[] args) {
		/**
		 * 有个20元素的数组，随机赋值为1到20的整数，求1到20每个数字出现的次数
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
				System.out.print(i+"出现了"+res[i]+"次 ");
			}
		}
	}

}
