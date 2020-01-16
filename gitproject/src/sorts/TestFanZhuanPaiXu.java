package sorts;

import java.util.Arrays;

public class TestFanZhuanPaiXu {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(
				fanZhuan(new int[]{1,2,3,4,5,6,7})));
	}
	/**
	 * 反转输出数组的值
	 * @param res
	 * @return
	 */
	public static int[] fanZhuan(int[] res) {
		int tmp;
		for(int i=0;i<res.length/2;i++){
			tmp = res[i];
			res[i]=res[res.length-1-i];
			res[res.length-1-i]=tmp;
		}
		
		return res;
	}
}
