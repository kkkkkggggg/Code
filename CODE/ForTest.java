/*
Forѭ���ṹ���ĸ�Ҫ��
һ��ѭ���ṹ���ĸ�Ҫ��
�ٳ�ʼ������
��ѭ������
��ѭ����
�ܵ�������

����forѭ���Ľṹ
 
for(��;��;��)
{
	��
}

ִ�й��̢� - �� - �� - �� - �� - �� - �� - ... - ��


*/

class ForTest 
{
	public static void main(String[] args) 
	{
		/*
		int i;
		for (i = 1;i <= 150 ;i++ )
		{
			if ((i % 3) == 0 && (i % 5) == 0 && (i % 7) == 0)
			{
				System.out.println(i + " " + "foo" + " " + "biz" + " " + "baz");
			}
			else if ((i % 3) == 0 && (i % 5) == 0)
			{
				System.out.println(i + " " + "foo" + " " + "biz");
			}
			else if ((i % 3) == 0 && (i % 7) == 0)
			{
				System.out.println(i + " " + "foo"+ " " + "baz");
			}
			else if ((i % 5) == 0 && (i % 7) == 0)
			{
				
				System.out.println(i + " " + "biz"+ " " + "baz");

			}
			else if ((i % 3) == 0)
			{
				System.out.println(i + " " + "foo");
			}
			else if ((i % 5) == 0)
			{
				System.out.println(i + " " + "biz");
			}
			else if ((i % 7) == 0)
			{
				System.out.println(i + " " + "baz");
			}
			else
			System.out.println(i);
		}
		*/
		for (int i = 1;i <= 150 ;i++ )
		{
			System.out.print(i + "  ");
			if (i % 3 == 0)
			{
				System.out.print("foo ");
			}
			if (i % 5 == 0)
			{
				System.out.print("biz ");
			}
			if (i % 7 == 0)
			{
				System.out.print("baz ");
			}
			System.out.println(); //����
		}
		
	}
}