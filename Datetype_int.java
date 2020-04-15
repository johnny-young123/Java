class Datetype_int {
	public static void main(String[] args) {
		/*
			数据类型—整数
			①每一个数据都是有一个数据类型的，直接写一个数字（123），他的默认类型是int——说明在开发中int的使用频率最高。
			一个整数可以使用不同的进制进行表示
			②使用打印语句打印出来的都是十进制的结果
			.......
			不同进制的表现形式
			  ①十进制，默认就是
			  ②二进制，0b开头  或者是0b开头
			  ③八进制，0开头
			  ④十六进制，0x开头  或者是0X开头

		*/
		System.out.println(123);
		int i = 123;
		System.out.println(i);

		i = 0b1111011;
		System.out.println(i);

		i =0173;
		System.out.println(i);

		i = 0x7B;
		System.out.println(i);
		System.out.println(1_2_3);//支持数字之间下划线的分隔

	}
}
