package basicprograme;
/* ��1020�����ϣ���һ������ȫ�����ϵ�һ�����������ڶ�������ʣ�µ�һ����������
 * �Ժ�ÿ�춼����ʣ�µ�һ�����������ʶ���������������ϡ�
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
			System.out.println("��"+days+"��ʣ��"+num);
			if(num<=0){
				break;
			}
			days++;
		}
		/*for(;;days++){
			num =num/2-2;
			System.out.println("��"+days+"��ʣ��"+num);
			if(num<=0){
				break;
			}
		}*/
		System.out.println(days);
	}

}
