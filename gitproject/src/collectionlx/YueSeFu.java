package collectionlx;

import java.util.ArrayList;
import java.util.List;

/**
 * Լɪ���㷨
 *    m���ˣ�����n���У����¿�ʼ������ֱ��ʣ��a���ˣ���ʣ�µ�a���˵ĳ�ʼλ��
 * @author Administrator
 *
 */
public class YueSeFu {

	public static void main(String[] args) {
		List res = getYsf(41,3,2);
	}
	public static List getYsf(int m,int n,int a){
		
	    List<Integer>  list = new ArrayList<Integer>();
	    for(int i=1;i<=m;i++){
	    	list.add(i);
	    }
	    int index=0;
	    while(list.size()>a){
	    	index=(index + n-1)%list.size();
	    	list.remove(index);
	    	for (Integer i : list) {
				System.out.print(i+" ");
			}
	    	System.out.println();
	    }
	     return list;
	}
	
	
	
	

}
