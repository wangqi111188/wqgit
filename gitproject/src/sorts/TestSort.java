package sorts;

import java.util.Arrays;

/**
 * @author wq
 * 
 */
public class TestSort {

	public static void main(String[] args) {
		int[] arr = generate(10);
		System.out.println(Arrays.toString(arr));
		/*maoPaoSort(arr);
		System.out.println(Arrays.toString(arr));
		arr=generate(8);
		selectSort(arr);
		System.out.println(Arrays.toString(arr));
		arr=generate(11);
		System.out.println(Arrays.toString(arr));*/
		quickSort(arr,0,arr.length-1);
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
	 *  6,5,4,1,2,3
	 *  1,5,4,6,2,3
	 *    2,4,6,5,3
	 *      3,6,5,4
	 *        4,5,6
	 *          5,6
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
	 *  l                h
	 *   6  4   3  1  2  5 
	 *    l<h,arr[h]>b-->h--
	 *    l<h,arr[l]<b-->l++
	 *   b = 6 
	 *   l            h
	 *   5  4   3  1  2  6
	 *    l<h,arr[h]>b-->h--
	 *    l<h,arr[l]<b-->l++
	 *   b=5
	 *   l         h
	 *   2  4   3  1  5 
	 *   l<h,arr[h]>b-->h--
	 *   l<h,arr[l]<b-->l++
	 *   l     h
	 *   2 1 3 4 
	 *   l<h,arr[h]>b-->h--
	 *   l<h,arr[l]<b-->l++
	 *   
	 *   b
	 *   
	 *   
	 *   
	 * @param arr
	 * @param low  从数组那个位置开始
	 * @param high 到数组的那个位置结束
	 */
    public static void quickSort(int[] arr,int low,int high){
        int i,j,temp,t;
        if(low>high){
            return;
        }
        i=low;//i 最左边下标
        j=high;//j 最右边下标
        //temp就是基准位
        temp = arr[low];
 
        while (true) {
            //先看右边，依次往左递减
            while (temp<=arr[j]&&i<j) {
            	//当基准位的值小于当前下标所在值并且i<j
                j--;//继续向下寻找
            }
            //再看左边，依次往右递增
            while (temp>=arr[i]&&i<j) {
            	//当基准位的值大于当前下标所在值并且i<j
                i++;
            }
            //如果满足条件则交换
            if (i<j) {
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }
            System.out.println(Arrays.toString(arr));  
            if(i==j){
            	break;
            }
           
        }
        //最后将基准为与i和j相等位置的数字交换
         arr[low] = arr[i];
         arr[i] = temp;
        //递归调用左半数组
        quickSort(arr, low, j-1);
        //递归调用右半数组
        quickSort(arr, j+1, high);
        
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
