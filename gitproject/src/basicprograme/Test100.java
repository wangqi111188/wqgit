package basicprograme;
/**
 * ����ÿֻ3Ԫ��ĸ��ÿֻ5Ԫ,С��3ֻһԪ�������ʹ��100Ԫ��100ֻ�����ж�������
 * ���ʵ��
 * @author Administrator
 */
public class Test100 {
	public static void main(String[] args) {
		int count=0;//���м�����
		for(int x=0;x<=100*3;x+=3){//���С��ֻ����ֻ����3�ı���
			for(int g=0;g<=100/3;g++){//��Ĺ���ֻ��
				for(int  m=0;m<=100/5;m++){//���ĸ����ֻ��
					if((g*3+m*5+x/3==100)&&(g+m+x==100)){//100Ԫ��100ֻ��
						count++;
						System.out.println("������"+g+"ĸ��:"
						+m+"С��:"+x+"==="+count);
					}
				}
			}
		}
	}

}
