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
	 * ð�������ʵ�ַ���
	 * @param arr ��������
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
	 * ѡ������
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
	 * @param low  �������Ǹ�λ�ÿ�ʼ
	 * @param high ��������Ǹ�λ�ý���
	 */
    public static void quickSort(int[] arr,int low,int high){
        int i,j,temp,t;
        if(low>high){
            return;
        }
        i=low;//i ������±�
        j=high;//j ���ұ��±�
        //temp���ǻ�׼λ
        temp = arr[low];
 
        while (true) {
            //�ȿ��ұߣ���������ݼ�
            while (temp<=arr[j]&&i<j) {
            	//����׼λ��ֵС�ڵ�ǰ�±�����ֵ����i<j
                j--;//��������Ѱ��
            }
            //�ٿ���ߣ��������ҵ���
            while (temp>=arr[i]&&i<j) {
            	//����׼λ��ֵ���ڵ�ǰ�±�����ֵ����i<j
                i++;
            }
            //������������򽻻�
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
        //��󽫻�׼Ϊ��i��j���λ�õ����ֽ���
         arr[low] = arr[i];
         arr[i] = temp;
        //�ݹ�����������
        quickSort(arr, low, j-1);
        //�ݹ�����Ұ�����
        quickSort(arr, j+1, high);
        
    }
	
	
	
	/**
	 * 
	 * @param m ����Ԫ�ظ���
	 * @return ����m�������������
	 */
	public static int[] generate(int m){
		int[] arr =  new int[m];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=(int) (Math.random()*100+1);
		}
		return arr;
	}
	
}
