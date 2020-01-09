package basicprograme;
/* 有1020个西瓜，第一天卖出全部西瓜的一般零两个，第二天卖掉剩下的一半零两个，
 * 以后每天都卖出剩下的一半零两个，问多少天可以卖完西瓜。
 * 
 * @author Administrator
 *
 */
public class TestXiGua {

	public static void main(String[] args) {
		int days=1;
		int num=1020;
		for(;num>0;){
			num = num/2-2;
			System.out.println("第"+days+"天剩下"+num);
			if(num<=0){
				break;
			}
			days++;
		}
		/*for(;;days++){
			num =num/2-2;
			System.out.println("第"+days+"天剩下"+num);
			if(num<=0){
				break;
			}
		}*/
		System.out.println(days);
	}

}
