package collectionlx;

import java.util.ArrayList;
import java.util.List;

/**
 * Լɪ���㷨
 *    m���ˣ�����n���У����¿�ʼ������ֱ��ʣ��a���ˣ���ʣ�µ�a���˵ĳ�ʼλ��
 *    m=41  n=3  2 
 *    1,2,3,4,5,6,7,8,9...
 *    1,2,3��ȥ
 *    ���¼��� 
 *    1,2,3��ȥ
 *    4,5,6
 *    ...
 *    1,2,3
 *    1+2
 *    index=(index+n-1)%m  list.remove(index)
 * @author Administrator
 *
 */
public class YueSeFu {

	public static void main(String[] args) {
		List<Integer> res = getYsf(41,3,2);
		for (Object o : res) {
			System.out.print(o+" ");
		}
		res.clear();
	}
	public static List<Integer> getYsf(int m,int n,int a){
		
	    List<Integer>  list = new ArrayList<Integer>();
	    for(int i=1;i<=m;i++){
	    	list.add(i);
	    }
	    int index=0;// 0,1,2   1,2,3
	    while(list.size()>a){
	    	index=(index + n-1)%list.size();
	    	System.out.println(index);
	    	list.remove(index);
	    	for (Integer i : list) {
				System.out.print(i+" ");
			}
	    	System.out.println();
	    }
	     return list;
	}
}
