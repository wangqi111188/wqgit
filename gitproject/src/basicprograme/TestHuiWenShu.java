package basicprograme;

import java.util.Scanner;

/**
 * 
 * @author Administrator
 *     a= 12321-->����Ľ�����Եõ�  b=12321    a==b  ��һ��������
 *     ��
 *     long b=0;
 *     ��ȡ���һλ�� m����ÿһλ�ϵ�����
 *        m=a%10     b=b*10+m     b=1  a=a/10  a=1232
 *     ��ȡ������λ
 *        m=a%10     b=b*10+m     b=12  a=a/10  a=123
 *        m=a%10     b=b*10+m     b=123  a=a/10  a=12
 *        m=a%10     b=b*10+m     b=1232  a=a/10  a=1
 *        m=a%10     b=b*10+m     b=12321  a=a/10  a=0  ...ѭ������
 *      123321
 */
public class TestHuiWenShu {

	public static void main(String[] args) {
		long m = input("������һ������:");
		System.out.println(m+(isHuiWen(m)?"�ǻ�����":"���ǻ�����"));
	}
	
	 static long input(String msg) {
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		long m = sc.nextLong();
		sc.close();
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
			n+=a;// n=1 n=12 n=123  n���ַ���
		}
		if(Integer.valueOf(n)==mb){
			b=true;
		}
		return b;
	}
	
	
}
