/*
�߼������
&  &&  |  ||  !  ^

˵����
�߼�����������Ķ���boolean���͵ı���






*/





class  LogicTest
{
	public static void main(String[] args) 
	{
        //���� & �� &&
		//��ͬ��1��& �� && ����������ͬ
		//��ͬ��2�������������trueʱ�����߶���ִ�з����ұߵ�����
		//��ͬ�㣺�����������falseʱ��& �����ִ�з����ұߵ����㣬 && ����ִ�з����ұߵ�����
		//�������Ƽ�ʹ�� && ||
		boolean a1 = true;
		a1 = false;
		int num = 10;
		if(a1 & (num++ > 0))
		{
			System.out.println("�������ڱ���");
		}	
		else
		{
			System.out.println("���������Ͼ�");
		}

		System.out.println("num = " + num);


		boolean a2 = true;
		a2 = false;
		int num1 = 10;
		if(a1 && (num1++ > 0))
		{
			System.out.println("�������ڱ���");
		}	
		else
		{
			System.out.println("���������Ͼ�");
		}

		System.out.println("num1 = " + num1);

		// ���֣� | �� ||


	}
}