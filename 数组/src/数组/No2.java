package 数组;

public class No2 {
	/*
	 * 变量是一个盒子 这个盒子只能装一种数据类型的一个值.
	 * 数组是一串盒子 这一串盒子里面 只能放一种数据类型   每个盒子里面也只能装一个值
	 */
	
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		System.out.println(a); // 不能输出数组的值， 因为数组名里存放的是地址  不是值 
		System.out.println(a[2]); //通过下标访问数组元素
		a[2] = 20; 
		System.out.println(a[2]);
		
		int[] b = new int[5];
		// 需要为b这个数组中的每一个元素赋值
		b[0] = 10;
		b[1] = 20;
		b[2] = 30;
		b[3] = 40;
		b[4] = 50;
		
		//显示数组中每一个元素的值，一定要用循环,  一定要用下标.
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
		//数组的使用
		// 求数组中的最大值  最小值  总值  平均值   查找数组中的某一个元素的值  排序
		
		// 问题版本1
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
		
		// 版本2 没有得到最大值的下标
		max = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		System.out.println(max);
		
		//版本3
		max = 0;  //下标0
		int min = 0;
		int sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > arr[max])
			{
				//赋值，下标
				max = i;
			}
			if(arr[i] < arr[max])
			{
				min = i;
			}
			sum += arr[i];
		}
		System.out.println("最大值是"+arr[max]+"最大值的下表是"+max);
		System.out.println("最大值是"+arr[min]+"最大值的下表是"+min);
		System.out.println(sum);
		System.out.println((double)sum/arr.length);
		
		
		//查找 
		int search = -3;
		int flag = 0;
		//用来保存被找到值得下标
		int index = -1;
		for(int i=0;i<arr.length;i++)
		{
			
			//如果找到了
			if(search == arr[i])
			{
				flag++;
				index = i;
			}
		}
		if(flag != 0)
		{
			System.out.println("找到了,有"+flag+"个,下标是"+index);
		}else{
			System.out.println("没找到");
		}
		
		// 1, 外层循环 数组长度-1 
		// 2, 内层循环 数组长度-i-1
		// 3, 第j个元素和j+1个元素比较并交换
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
		
		
		//冒泡原理
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
