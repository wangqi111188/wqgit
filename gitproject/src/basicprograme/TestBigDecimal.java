package basicprograme;

import java.math.BigDecimal;
/**
 * BigDecimal��ʹ��
 * @author Administrator
 *
 */
public class TestBigDecimal {

	public static void main(String[] args) {
		System.out.println(add(3.0,1.0));
		System.out.println(divide(3.0, 1.9));
		System.out.println(subtract(3.0, 1.9));
		System.out.println(3.0-1.9);
	}
	/**
	 * �ӷ�
	 * @param a
	 * @param b
	 * @return
	 */
	public static BigDecimal add(double a,double b) {

		BigDecimal a1 = new BigDecimal(a);
		BigDecimal b1 = new BigDecimal(b);

		BigDecimal s = a1.add(b1);
		return s;

	}
	/**
	 * ����
	 * @param a
	 * @param b
	 * @return
	 */
	public static BigDecimal divide(double a,double b) {

		BigDecimal a1 = new BigDecimal(a);
		BigDecimal b1 = new BigDecimal(b);
		//������λ��������������ȡ��
		BigDecimal s = a1.divide(b1,7,BigDecimal.ROUND_HALF_UP);
		return s;


	}
	/**
	 * ����
	 * @param a
	 * @param b
	 * @return
	 */
	public static BigDecimal subtract(double a,double b) {

		BigDecimal a1 = new BigDecimal(a);
		BigDecimal b1 = new BigDecimal(b);
		//������λ��������������ȡ��
		BigDecimal s = a1.subtract(b1);
		return s;

	}
}

