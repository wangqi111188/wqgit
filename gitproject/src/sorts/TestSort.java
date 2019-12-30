package sorts;

import java.util.Arrays;

/**
 * @author wq
 * 
 */
public class TestSort {

	public static void main(String[] args) {
		int[] arr = generate(10);
		maoPaoSort(arr);
		System.out.println(Arrays.toString(arr));
		arr=generate(8);
		selectSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	/**
	 * 冒泡排序的实现方法
	 * @param arr 排序数组
	 */
	public static void maoPaoSort(int[] arr){
		int temp=0;
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	/**
	 * 选择排序
	 * @param arr
	 */
	public static void selectSort(int[] arr){
		int temp=0;
		int k=-1;
		for(int i=0;i<arr.length;i++){
			temp=arr[i];
			for(int j=i;j<arr.length;j++){
				
				if(temp>arr[j]){
					temp=arr[j];
					k=j;
				}
			}
			if(k!=-1){
				arr[k]=arr[i];
				arr[i]=temp;
			}
		}
		
		
		
		
	}
	
	
	
	/**
	 * 
	 * @param m 数组元素个数
	 * @return 生成m个随机整型数组
	 */
	public static int[] generate(int m){
		int[] arr =  new int[m];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=(int) (Math.random()*100+1);
		}
		return arr;
	}
	
}
