package basicprograme;

import java.util.Scanner;

public class TestHuiWenShu {

	public static void main(String[] args) {
		long m = input("请输入一个整数:");
		System.out.println(m+(isHuiWen(m)?"是回文数":"不是回文数"));
	}
	
	 static long input(String msg) {
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		long m = sc.nextLong();
		
		return m;
	}

	/**
	 * 
	 * @param m 需要判断的数值
	 * @return  是否是回文数的boolean类型值，true为是，false为不是，默认是不是
	 */
	public static boolean isHuiWen(long m){
		boolean b = false;
		String n = "";
		long a = 0;
		long mb = m ;
		while(true){
			if(m==0){
				break;
			}
			a=m%10;
			m/=10;
			n+=a;
		}
		if(Integer.valueOf(n)==mb){
			b=true;
		}
		return b;
	}
	
	
}
