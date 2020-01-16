package basicprograme;

public class TestYH {

	public static void main(String[] args) {
		printYH(6);
	}
	
	public static void printYH(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print(num(i,j)+" ");
			}
			System.out.println();
		}
	}

	private static int num(int i, int j) {
		
		if(j==1||j==i){
			return 1;
		}
		int  c = num(i-1,j-1)+num(i-1,j);
		return c;
	}

}
