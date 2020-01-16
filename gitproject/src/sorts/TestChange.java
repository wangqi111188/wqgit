package sorts;

public class TestChange {

	public static void main(String[] args) {
		int a= 3, b=4,c = 5;
		change(a,b,c);
	}
    /**
     * 不使用第四个变量,交换a,b,c的值  a=b,b=c,c=a
     * @param a
     * @param b
     * @param c
     */
	public static void change(int a,int b,int c){
		a = a + b ;
		b = a - b ;//b=a;
		a = a - b ;//a=b
		b = b + c ;
		c = b - c ;//c=b  c = a
		b = b - c ;//b=c
		System.out.println("a="+a+" b="+b+" c="+c);
	}
}
