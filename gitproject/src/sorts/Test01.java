package sorts;

public class Test01 {
	/**
	 * 一个数组中只有 0，1 两种数字，进行排序，0 全部在前，1 全部在后
	 * @param args
	 */
	public static void main(String[] args) {
		int[] ary = {1,0,1,1,0,0,1,1,1,0,0,1,0,1};
		int index = 0;
		for(int i=0;i<ary.length;i++){
			if(ary[i]==0){
				ary[i] = 1;
				ary[index++] = 0;
			}
		}
		for(int i:ary){
			System.out.print(i+" ");
		}
	}


}
