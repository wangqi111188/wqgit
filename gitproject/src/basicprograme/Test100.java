package basicprograme;
/**
 * 公鸡每只3元，母鸡每只5元,小鸡3只一元，问如何使用100元买到100只鸡，有多少种买法
 * 编程实现
 * @author Administrator
 */
public class Test100 {
	public static void main(String[] args) {
		int count=0;//共有几种买法
		for(int x=0;x<=100*3;x+=3){//买的小鸡只数，只能是3的倍数
			for(int g=0;g<=100/3;g++){//买的公鸡只数
				for(int  m=0;m<=100/5;m++){//买的母鸡的只数
					if((g*3+m*5+x/3==100)&&(g+m+x==100)){//100元买到100只鸡
						count++;
						System.out.println("公鸡："+g+"母鸡:"
						+m+"小鸡:"+x+"==="+count);
					}
				}
			}
		}
	}

}
