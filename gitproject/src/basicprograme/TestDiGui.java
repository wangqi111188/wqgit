package basicprograme;

/**
 * ��쳲��������еĵ�n���ֵ
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
	 * ʹ�õݹ����쳲��������еĵ�i���ֵ
	 * @param i
	 * @return  ��i���ֵ
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
	 * ��ʹ�õݹ飬ʹ���������쳲��������еĵ�n���ֵ
	 * @param n
	 * @return 쳲��������еĵ�n���ֵ
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
				a=b;//Ϊ������һ���ֵ��׼��  ���磺 ��һ�μ��㣺�������ֵΪm,aΪ��һ���ֵ
				b=m;//bΪ�ڶ���´�����ʱ:�������ǰ������ֱ�Ϊ��������͵ڶ��
				//���ʱ��a��Ҫ����ڶ����ֵ��bҪ����������ֵ����������
			}
		}
		return m;
		
	}
	
	
}
