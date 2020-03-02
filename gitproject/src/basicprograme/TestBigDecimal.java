package basicprograme;

import java.math.BigDecimal;
/**
 * BigDecimal的使用
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
	 * 加法
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
	 * 除法
	 * @param a
	 * @param b
	 * @return
	 */
	public static BigDecimal divide(double a,double b) {

		BigDecimal a1 = new BigDecimal(a);
		BigDecimal b1 = new BigDecimal(b);
		//保留三位，四舍五入向上取整
		BigDecimal s = a1.divide(b1,7,BigDecimal.ROUND_HALF_UP);
		return s;


	}
	/**
	 * 减法
	 * @param a
	 * @param b
	 * @return
	 */
	public static BigDecimal subtract(double a,double b) {

		BigDecimal a1 = new BigDecimal(a);
		BigDecimal b1 = new BigDecimal(b);
		//保留三位，四舍五入向上取整
		BigDecimal s = a1.subtract(b1);
		return s;

	}
}

