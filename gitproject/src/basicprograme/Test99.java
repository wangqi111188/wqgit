package basicprograme;

import java.math.BigInteger;

/**
 * ��ȷ���9��99�η���ֵ
 * @author Administrator
 * 
 *
 */
public class Test99 {

	public static void main(String[] args) {
		System.out.println(get99(9,99));
	}
	/**
	 * �����ݵľ�ȷ����
	 * @param n 
	 * @param m
	 * @return n��m�η��ľ�ȷֵ
	 *  1-->    1*1.0
	 *  2951266543065275214875348022619773
	 *  6314359272517043832886063884637676
	 *  943433478020332709411004889

	 */
	public static BigInteger get99(int n,int m) {
		BigInteger n1 = new BigInteger(""+n);
		BigInteger b = n1.pow(m);
		return b;
	}
}
