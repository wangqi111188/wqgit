package basicprograme;

public class TestZhengChu {

	public static void main(String[] args) {
		long m = TestHuiWenShu.input("������һ������");
		long n = TestHuiWenShu.input("������һ������");
		System.out.println(m+","+n+(isZhCh(m,n)?"��������":"��������"));
	}
	
	public static boolean isZhCh(long m,long n) {
		return (m>=n?m:n)%(m<n?m:n)==0;
	}
}
