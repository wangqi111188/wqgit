package basicprograme;

import java.util.Scanner;

public class TestHuiWenShu {

	public static void main(String[] args) {
		long m = input("������һ������:");
		System.out.println(m+(isHuiWen(m)?"�ǻ�����":"���ǻ�����"));
	}
	
	 static long input(String msg) {
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		long m = sc.nextLong();
		
		return m;
	}

	/**
	 * 
	 * @param m ��Ҫ�жϵ���ֵ
	 * @return  �Ƿ��ǻ�������boolean����ֵ��trueΪ�ǣ�falseΪ���ǣ�Ĭ���ǲ���
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
