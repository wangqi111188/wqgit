package collectionlx;

import java.util.ArrayList;
import java.util.List;

/**
 * 约瑟夫环算法
 *    m个人，数到n出列，重新开始计数，直到剩下a个人，问剩下的a个人的初始位置
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
