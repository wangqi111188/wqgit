package basicprograme;

/**
 * 求斐波拉切数列的第n项的值
 *    1,1,2,3,5,8,13,21,34,55,...
 * @author Administrator
 *
 */
public class TestDiGui {

	public static void main(String[] args) {
		long m = f(10);
		System.out.println(m);
		System.out.println(f1(10));
		System.out.println(f2(10));
	}
	/**
	 * 使用递归求出斐波拉切数列的第i项的值
	 * @param i
	 * @return  第i项的值
	 */
	private static long f(int i) {
		long m = 0;
		if(i==1||i==2){
			m=1;
		}else{
			m=f(i-1)+f(i-2);
		}
		
		return m;
	}
	/**
	 * 不使用递归，使用数组求出斐波拉切数列的第n项的值
	 * @param n
	 * @return 斐波拉切数列的第n项的值
	 */
	private static long f1(int n) {
		long m=0;
		long[] arr=new long[n];
		for(int i=0;i<arr.length;i++){
			if(i==0||i==1){
				arr[i]=1;
			}else{
				arr[i]=arr[i-1]+arr[i-2];
			}
		}
		m = arr[n-1];
		return  m;
	}
	
	public static long  f2(int n) {
		long m=0;
		long a=1;
		long b = 1;
		for(int i=1;i<=n;i++){
			if(i==1||i==2){
				m=1;
			}else{
				m=a+b;
				a=b;//为计算下一项的值做准备  比如： 第一次计算：第三项的值为m,a为第一项的值
				b=m;//b为第二项，下次运算时:第四项的前面两项分别为，第三项和第二项，
				//这个时候a就要保存第二项的值，b要保存第三项的值，依次类推
			}
		}
		return m;
		
	}
	
	
}
