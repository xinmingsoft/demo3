package ����;

public class No2 {
	/*
	 * ������һ������ �������ֻ��װһ���������͵�һ��ֵ.
	 * ������һ������ ��һ���������� ֻ�ܷ�һ����������   ÿ����������Ҳֻ��װһ��ֵ
	 */
	
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		System.out.println(a); // ������������ֵ�� ��Ϊ���������ŵ��ǵ�ַ  ����ֵ 
		System.out.println(a[2]); //ͨ���±��������Ԫ��
		a[2] = 20; 
		System.out.println(a[2]);
		
		int[] b = new int[5];
		// ��ҪΪb��������е�ÿһ��Ԫ�ظ�ֵ
		b[0] = 10;
		b[1] = 20;
		b[2] = 30;
		b[3] = 40;
		b[4] = 50;
		
		//��ʾ������ÿһ��Ԫ�ص�ֵ��һ��Ҫ��ѭ��,  һ��Ҫ���±�.
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
		//�����ʹ��
		// �������е����ֵ  ��Сֵ  ��ֵ  ƽ��ֵ   ���������е�ĳһ��Ԫ�ص�ֵ  ����
		
		// ����汾1
		int[] arr = {5,8,3,9,1,7,0,2};
		int max = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		System.out.println(max);
		
		// �汾2 û�еõ����ֵ���±�
		max = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		System.out.println(max);
		
		//�汾3
		max = 0;  //�±�0
		int min = 0;
		int sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > arr[max])
			{
				//��ֵ���±�
				max = i;
			}
			if(arr[i] < arr[max])
			{
				min = i;
			}
			sum += arr[i];
		}
		System.out.println("���ֵ��"+arr[max]+"���ֵ���±���"+max);
		System.out.println("���ֵ��"+arr[min]+"���ֵ���±���"+min);
		System.out.println(sum);
		System.out.println((double)sum/arr.length);
		
		
		//���� 
		int search = -3;
		int flag = 0;
		//�������汻�ҵ�ֵ���±�
		int index = -1;
		for(int i=0;i<arr.length;i++)
		{
			
			//����ҵ���
			if(search == arr[i])
			{
				flag++;
				index = i;
			}
		}
		if(flag != 0)
		{
			System.out.println("�ҵ���,��"+flag+"��,�±���"+index);
		}else{
			System.out.println("û�ҵ�");
		}
		
		// 1, ���ѭ�� ���鳤��-1 
		// 2, �ڲ�ѭ�� ���鳤��-i-1
		// 3, ��j��Ԫ�غ�j+1��Ԫ�رȽϲ�����
		System.out.println("--------------------------------------");
//		for(int i=0;i<arr.length-1;i++)
//		{
//			for(int j=0;j<arr.length-i-1;j++)
//			{
//				if(arr[j] < arr[j+1])
//				{
//					int temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//				}
//			}
//		}

		System.out.println("--------------------------------------");
		
//		for(int t : arr)
//		{
//			System.out.println(t);
//		}
		
		
		//ð��ԭ��
		for(int i=0;i<arr.length;i++)
		{
			for(int t : arr)
			{
				System.out.print(t+"\t");
			}
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			System.out.println();
		}
	}
}
