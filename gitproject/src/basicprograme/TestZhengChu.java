package basicprograme;

public class TestZhengChu {

	public static void main(String[] args) {
		long m = TestHuiWenShu.input("请输入一个整数");
		long n = TestHuiWenShu.input("请输入一个整数");
		System.out.println(m+","+n+(isZhCh(m,n)?"可以整除":"不能整除"));
	}
	
	public static boolean isZhCh(long m,long n) {
		return (m>=n?m:n)%(m<n?m:n)==0;
	}
}
