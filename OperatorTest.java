/*
	��һ�⣺�ж����³������������

	int x = 10; 
	int a = x+ x++; 
	System.out.println("a =" + a); 
	System.out.println("x =" + x); 
	int b = x + ++x; 
	System.out.println("b =" + b); 
	System.out.println("x =" + x); 
	int c = x + x--; 
	System.out.println("c =" + c); 
	System.out.println("x =" + x); 
	int d = x + --x; 
	 

	System.out.println("d =" + d); 
	System.out.println("x =" + x); 

	 

	�ڶ��⣺�ж����³������������ 
	 

	int a = 15; 
	int b = 2; 
	double c = 2; 
	System.out.println(a + "/" + b + "=" + (a / b)); 
	System.out.println(a + "%" + b + "=" + (a % b)); 
	System.out.println(a + "/" + c + "=" + (a / c)); 
	System.out.println(a + "%" + c + "=" + (a % c)); 

	 

	�����⣺�ж����³������������ 
	boolean x, y, z; 
	int a = 15; 
	int b = 2; 
	x = a > b; // true; 
	y = a < b; // false; 
	z = a != b; // true; 
	System.out.println("x =" + x); 
	System.out.println("y =" + y); 
	System.out.println("z =" + z); 
	 

	�����⣺�ж����³������������ 

	int x; 
	double y; 
	 


	x = (int) 22.5 + (int) 34.7; 
	y = (double) x; 
	System.out.println("x = " + x); 
	System.out.println("y = " + y); 
	 

	�����⣺�ж����³������������ 

	int i = 5; 
	int j = 5; 
	int m = 5; 
	int n = 5; 
	i++; 
	j = j + 1; 
	m--; 
	n = n - 1; 
	System.out.println(i); 
	System.out.println(i++); 
	System.out.println(++i); 
	System.out.println(i--); 
	System.out.println(); 
	System.out.println(j); 
	System.out.println(j++); 
	System.out.println(j--); 
	System.out.println(--j); 
	System.out.println(); 
	System.out.println(m); 
	System.out.println(n); 
	 

	�����⣺�ж����³������������ 


	int i = 0; 
	int j = 0; 
	System.out.println(i); 
	System.out.println(j); 
	i++; 
	++j; 
	System.out.println(i); 
	System.out.println(j); 
	System.out.println("--------------------------"); 
	System.out.println(i++); 
	System.out.println(++j); 
	System.out.println("--------------------------"); 
	System.out.println(i); 
	System.out.println(j); 
*/



public class OperatorTest{
	public static void main(String[] args){

// ��һ�⣺�ж����³������������

	int x = 10;
	int a = x + x++; 
	System.out.println("a = " + a);	// a = 20
	System.out.println("x = " + x);	// x = 11

	int b = x + ++x; 
	System.out.println("b = " + b); // b = 23
	System.out.println("x = " + x); // x = 12

	int c = x + x--; 
	System.out.println("c = " + c); // c = 24
	System.out.println("x = " + x); // x = 11

	int d = x + --x; 
	System.out.println("d = " + d); // d = 21
	System.out.println("x = " + x); // x = 10
	




//	�ڶ��⣺�ж����³������������ 
	 

	int a = 15; 
	int b = 2; 
	double c = 2; 
	System.out.println(a + "/" + b + "=" + (a / b)); // 15/2=7
	System.out.println(a + "%" + b + "=" + (a % b)); // 15%2=1
	System.out.println(a + "/" + c + "=" + (a / c)); // 15/2.0=7.5
	System.out.println(a + "%" + c + "=" + (a % c)); // 15%2.0=0

	 

//	�����⣺�ж����³������������ 
	boolean x, y, z; 
	int a = 15; 
	int b = 2; 
	x = a > b;	// true
	y = a < b;	// false
	z = a != b; // true
	System.out.println("x = " + x); // x = true
	System.out.println("y = " + y); // y = false
	System.out.println("z = " + z); // z = true
	 

//	�����⣺�ж����³������������ 

	int x; 
	double y;
	x = (int)22.5 + (int)34.7; 
	y = (double)x; 
	System.out.println("x = " + x); // x = 56
	System.out.println("y = " + y); // y = 56.0
	 

//	�����⣺�ж����³������������ 

	int i = 5; 
	int j = 5; 
	int m = 5; 
	int n = 5; 
	i++;		// 6
	j = j + 1;	// 6
	m--;		// 4
	n = n - 1;	// 4
	System.out.println(i);		// 6
	System.out.println(i++);	// 6
	System.out.println(++i);	// 8
	System.out.println(i--);	// 8
	System.out.println();		// ����       
	System.out.println(j);		// 6
	System.out.println(j++);	// 6
	System.out.println(j--);	// 7
	System.out.println(--j);	// 5
	System.out.println();		// ����      
	System.out.println(m);		// 4
	System.out.println(n);		// 4
 

//	�����⣺�ж����³������������ 


	int i = 0; 
	int j = 0; 
	System.out.println(i);	// 0
	System.out.println(j);	// 0
	i++;	// 1
	++j;	// 1
	System.out.println(i);	// 1
	System.out.println(j);	// 1
	System.out.println("--------------------------"); 
	System.out.println(i++);// 1
	System.out.println(++j);// 2
	System.out.println("--------------------------"); 
	System.out.println(i);	// 2
	System.out.println(j);	// 2

	}
}