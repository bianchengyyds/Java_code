/*
	*1����Ŀ��һ��5λ�����ж����ǲ��ǻ���������12321�ǻ���������λ����λ��ͬ��ʮλ��ǧλ��ͬ

	*2����Ŀ�����ӳ������⣺���ӵ�һ��ժ�����ɸ����ӣ���������һ�룬����񫣬�ֶ����һ����
	�ڶ��������ֽ�ʣ�µ����ӳԵ�һ�룬�ֶ����һ�����Ժ�ÿ�����϶�����ǰһ��ʣ�µ�һ����һ����
	����10���������ٳ�ʱ��ֻʣ��һ�������ˡ����һ�칲ժ�˶���

	3����Ŀ������ 1! + 2! + 3! + 4! +... + 10!
		˵����4! ��ʾ4�Ľ׳ˡ�4�Ľ׳��ǣ�1 * 2 * 3 * 4

	4����Ŀ��һ���100�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�������£�
	�����ڵ�10�����ʱ��������������

	5��һ����λ����ǡ�õ���ȥ��������λ����֮����ʣ����λ����3���������λ���Ƕ��٣�
*/
public class Day10{
	public static void main(String[] args){
	/*
	1.
	
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("������һ����λ�������� ");
		int num = s.nextInt();
		for(int i = 1; i <= 4; i++){
			num /= 10;
			int yuShu = num % 10;
		}
	
		int x = 12321;
		int a = 0, b = 0;
        int c = x;
        while (c!=0)
        {
            a = c % 10;
            b = b * 10 + a;
            c = c / 10;
        }
        if(b==x){
            System.out.print("�ǻ�����");
        }else{
            System.out.print("���ǻ�����");
        }
	*/
	/*
	2.
	
		int day = 1;
		int num = 900;
		for(num = 900; num <= 5000; num++){
			for(day = 1; day <= 10; day++){
				num = num / 2 - 1;
				if(day == 10 && num == 1){
					System.out.println(num);
				}
			}
		}
	*/
	/*
		int num = 1;
		int day = 10;
		System.out.println("��" + day + "��������:" + num);
		for (day = 9; day >= 1; day--) {
			num = 2 * (num + 1);
			System.out.println("��" + day + "��������:" + num);
		}
		System.out.println("�����ڵ�1��ժ��" + num + "������");
	*/
	/*
	3.
	
		int i = 1;
		int jieCheng = 1;
		int sum = 0;
		for(i = 1; i <= 10; i++){
			jieCheng *= i;
			sum += jieCheng;
		}
		System.out.println(sum);
	*/
	/*
	4.
	
		int i = 1;
		int height = 100;
		int sum = 0;
		for(i = 1; i <= 10; i++){
			sum += height;
			height /= 2;
		}
		System.out.println(sum);
	*/
	/*
	5.
	
		int i = 1000;
		for(i = 1000; i <= 9999; i++){
			if(i == i % 1000 * 3){
				System.out.println(i + " ");
			}
		}
	*/
	}
}