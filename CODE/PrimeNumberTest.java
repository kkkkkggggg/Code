/*
100�����������������
����:������ֻ�ܱ�1����������������Ȼ��-->��2��ʼ���������-1����Ϊֹ
�����ܱ��������������
*/

class PrimeNumberTest 
{
	public static void main(String[] args) 
	{
		
		boolean isFlag = true

		for (int i = 2;i <= 100 ;i++ )//����100���ڵ���Ȼ��
		{
			for (int j = 2;j < i ;j++ )//j����iȥ��
			{
				if (i % j == 0)//i��j����
				{
					isFlag = false
				}
			}

			if (isFlag == true)
			{
				System.out.println(i);
			}

			isFlag = true;//����isFlag
		}
	}
}