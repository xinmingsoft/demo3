package ����;

public class No1 {
	/*
	 * ���� ? һ����ͬ�������͵����ݵļ���    һ��int  һ��String
	 * 
	 * ����Ķ��� 
	 * ��̬��ʼ��
	 * int[] arr = {0,1,2,3,4,5};
	 * 
	 * ��̬��ʼ��
	 * int[] arr2 = new int[5];  //����һ��������5�ģ���������
	 * 
	 * String[] arr3 = new String[10];   //����һ��������10�ģ��ַ�������
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		//����ľ�̬��ʼ��
		// ����һ��int���͵�����   ��������ֽ���arr1
		int[] arr1 = {1,2,3,4,5,6};
		//���鶨���ʽ2
		// ����һ��int���͵ı��� ���������һ������
		int arr2[] = {1,2,3,4,5,6,7};
		
		//����Ķ�̬��ʼ��
		//����Ķ�̬��ʼ������Ҫ������.  ����ָ���ǣ���������п��ԷŶ��ٸ�Ԫ��.
		int[] arr3 = new int[5];
		//��Ϊ������5������ֻ������5��Ԫ��
		
		//����ĸ�ֵ��ȡֵ   ->  �����ʹ��
		//������ͨ���±������ʵ�      ��ֵ:  ������[�±�] = ֵ;    ȡֵ: ������[�±�]
		//�±��0��ʼ.     ����Ǵ�1��ʼ.
		
		//Ϊarr3��ֵ
		arr3[0] = 1;
		arr3[1] = 10;
		arr3[2] = 100;
		arr3[3] = 1000;
		arr3[4] = 10000;
		//arr3[5] = 100000;   //java.lang.ArrayIndexOutOfBoundsException   �����±�Խ���쳣 
		
		//ȡֵ
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);
		System.out.println(arr3[3]);
		System.out.println(arr3[4]);
		
		//ѭ��ʹ������..
		//�����ѭ����ʹ���±꣬��ô��Ҫʹ��forѭ��
		for(int i=0;i<5;i++)
		{
			System.out.println(arr3[i]);
		}
		
		//���������ѭ����ʹ���±꣬��ô����ʹ��foreachѭ��
		// ��ʱ��������������   �����������ÿһ��Ԫ�ص��������ͱ���һ��
		for(int temp : arr3)
		{
			System.out.println(temp);
		}
		
		//��ά����Ķ���
		int[] arr4 = {1,2,3};  //����һά����
		//��ά����Ķ���
		int[][] arr5 = {{1,2,3},{4,5,6},{7,8,9}};
		
		//��λ����Ķ�̬����
		//��Ϊ��ά������Ǳ�1ά��λ�ã��ͱ�ʾ�У�2ά��λ�þͱ�ʾ�м���
		//����һ���������еı�
		int[][] arr6 = new int[3][4];
		
		//��ֵ ȡֵ
		arr6[0][0] = 99;
		arr6[0][1] = 98;
		arr6[0][2] = 97;
		arr6[0][3] = 96;

		arr6[1][0] = 21;
		arr6[1][1] = 22;
		arr6[1][2] = 23;
		arr6[1][3] = 24;		
		
		arr6[2][0] = 45;
		arr6[2][1] = 46;
		arr6[2][2] = 47;
		arr6[2][3] = 48;
		
		//ȡֵ �ڶ��еڶ���
		System.out.println(arr6[1][1]);
		System.out.println(arr6[2][3]);
		
		//ѭ��  ��Ҫ˫��ѭ��
		for(int i=0;i<arr6.length;i++)  //���ѭ��������ѭ����
		{
			for(int j=0;j<arr6[i].length;j++)	//�ڲ�ѭ�� ѭ����
			{
				// ��ȡ��ά�����е�ÿһ��Ԫ��
				System.out.print(arr6[i][j] + "\t");
			}
			System.out.println();
		}
		
		//�ɱ��λ����Ķ���
		//ֻ����һά����ĳ���.
		int[][] arr7 =new int[3][];
		//�����ά�ĳ���
		arr7[0] = new int[3];
		arr7[1] = new int[4];
		arr7[2] = new int[2];
		
		int a = 10;
		//��ֵ
//		arr7[0][0] = 1;
//		arr7[0][1] = 2;
//		arr7[0][2] = 3;
//
//		arr7[1][0] = 4;
//		arr7[1][1] = 5;
//		arr7[1][2] = 6;
//		arr7[1][3] = 7;
//
//		arr7[2][0] = 8;
//		arr7[2][1] = 9;
		
		//ѭ��  ��Ҫ˫��ѭ��
		for(int i=0;i<arr7.length;i++)  //���ѭ��������ѭ����
		{
			for(int j=0;j<arr7[i].length;j++)	//�ڲ�ѭ�� ѭ����
			{
				// ��ȡ��ά�����е�ÿһ��Ԫ��
				//arr7[i][j] = a++;
				System.out.print(arr7[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		for(int[] temp : arr7)
		{
			for(int temp1 :temp)
			{
				System.out.print(temp1 + "\t");
			}
			System.out.println();
		}
		
		
	}
}
