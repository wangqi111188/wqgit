package basicprograme;

import java.math.BigInteger;

/**
 * 精确求出9的99次方的值
 * @author Administrator
 *
 */
public class Test99 {

	public static void main(String[] args) {
		System.out.println(get99(9,99));
	}
	/**
	 * 大数据的精确计算
	 * @param n 
	 * @param m
	 * @return n的m次方的精确值
	 */
	public static BigInteger get99(int n,int m) {
		BigInteger n1 = new BigInteger(""+n);
		
		BigInteger b = n1.pow(m);
		return b;
		
		
	}
}
