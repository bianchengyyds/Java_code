/*
	Ϊʲôʹ��ѭ�����:
		1. Ҫ���ڿ���̨�����100��100
		System.out.println(100);
		System.out.println(100);
		System.out.println(100);
		System.out.println(100);
		System.out.println(100);
		...
		���ַ����е㸴��, ����Ҫʹ��ѭ�������ʵ�����ҵ��.

*/
public class ForTest01{
	public static void main(String[] args){
		
		int i = 0;
		int count = 0;	// �����ӡ����ĸ���
		for(i = 1; i <= 100; i++){
			System.out.println(100);
			count++;
		}
		System.out.println("count = " + count);
	}
}