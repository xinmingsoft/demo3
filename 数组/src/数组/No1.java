package 数组;

public class No1 {
	/*
	 * 数组 ? 一组相同数据类型的数据的集合    一组int  一组String
	 * 
	 * 定义的定义 
	 * 静态初始化
	 * int[] arr = {0,1,2,3,4,5};
	 * 
	 * 动态初始化
	 * int[] arr2 = new int[5];  //定义一个长度是5的，整型数组
	 * 
	 * String[] arr3 = new String[10];   //定义一个长度是10的，字符串数组
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		//数组的静态初始化
		// 定义一个int类型的数组   数组的名字叫做arr1
		int[] arr1 = {1,2,3,4,5,6};
		//数组定义格式2
		// 定义一个int类型的变量 这个变量是一个数组
		int arr2[] = {1,2,3,4,5,6,7};
		
		//数组的动态初始化
		//数组的动态初始化必须要给长度.  长度指的是，这个数组中可以放多少个元素.
		int[] arr3 = new int[5];
		//因为长度是5，所以只能最多放5个元素
		
		//数组的赋值和取值   ->  数组的使用
		//数组是通过下标来访问的      赋值:  数组名[下标] = 值;    取值: 数组名[下标]
		//下标从0开始.     序号是从1开始.
		
		//为arr3赋值
		arr3[0] = 1;
		arr3[1] = 10;
		arr3[2] = 100;
		arr3[3] = 1000;
		arr3[4] = 10000;
		//arr3[5] = 100000;   //java.lang.ArrayIndexOutOfBoundsException   数组下标越界异常 
		
		//取值
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);
		System.out.println(arr3[3]);
		System.out.println(arr3[4]);
		
		//循环使用数组..
		//如果在循环中使用下标，那么就要使用for循环
		for(int i=0;i<5;i++)
		{
			System.out.println(arr3[i]);
		}
		
		//如果不想再循环中使用下标，那么可以使用foreach循环
		// 临时变量的数据类型   必须跟数组中每一个元素的数据类型保持一致
		for(int temp : arr3)
		{
			System.out.println(temp);
		}
		
		//二维数组的定义
		int[] arr4 = {1,2,3};  //定义一维数组
		//二维数组的定义
		int[][] arr5 = {{1,2,3},{4,5,6},{7,8,9}};
		
		//二位数组的动态定义
		//因为二维数组就是表，1维的位置，就表示行，2维的位置就表示有几列
		//定义一个三行四列的表
		int[][] arr6 = new int[3][4];
		
		//赋值 取值
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
		
		//取值 第二行第二列
		System.out.println(arr6[1][1]);
		System.out.println(arr6[2][3]);
		
		//循环  需要双重循环
		for(int i=0;i<arr6.length;i++)  //外侧循环，用于循环行
		{
			for(int j=0;j<arr6[i].length;j++)	//内测循环 循环列
			{
				// 获取二维数组中的每一个元素
				System.out.print(arr6[i][j] + "\t");
			}
			System.out.println();
		}
		
		//可变二位数组的定义
		//只定义一维数组的长度.
		int[][] arr7 =new int[3][];
		//定义二维的长度
		arr7[0] = new int[3];
		arr7[1] = new int[4];
		arr7[2] = new int[2];
		
		int a = 10;
		//赋值
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
		
		//循环  需要双重循环
		for(int i=0;i<arr7.length;i++)  //外侧循环，用于循环行
		{
			for(int j=0;j<arr7[i].length;j++)	//内测循环 循环列
			{
				// 获取二维数组中的每一个元素
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
		
		
		System.out.println("今天天气真好啊");
		
	}
}
