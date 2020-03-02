package basicprograme;

import java.util.Scanner;

/**
 * 
 * @author Administrator
 *     a= 12321-->倒序的结果可以得到  b=12321    a==b  是一个回文数
 *     ？
 *     long b=0;
 *     获取最后一位： m代表每一位上的数字
 *        m=a%10     b=b*10+m     b=1  a=a/10  a=1232
 *     获取倒数二位
 *        m=a%10     b=b*10+m     b=12  a=a/10  a=123
 *        m=a%10     b=b*10+m     b=123  a=a/10  a=12
 *        m=a%10     b=b*10+m     b=1232  a=a/10  a=1
 *        m=a%10     b=b*10+m     b=12321  a=a/10  a=0  ...循环结束
 *      123321
 */
public class TestHuiWenShu {

	public static void main(String[] args) {
		long m = input("请输入一个整数:");
		System.out.println(m+(isHuiWen(m)?"是回文数":"不是回文数"));
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
			n+=a;// n=1 n=12 n=123  n是字符串
		}
		if(Integer.valueOf(n)==mb){
			b=true;
		}
		return b;
	}
	
	
}
