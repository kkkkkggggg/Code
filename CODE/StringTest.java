/*
String���ͱ�����ʹ��
1.String���������������ͣ�����Ϊ���ַ��� 
2.����String���ͱ���ʱ��ʹ��һ��""
3.String���ͱ������ԺͰ����������������㣬����ֻ�����������㣺+




*/
class StringTest 
{
	public static void main(String[] args) 
	{
	String a1 = "Hello World";
	
	System.out.println(a1);

	String a2 = "a";
	String a3 = "";

	//char c = ''; //���벻ͨ��

	//**************************

	int number = 1001;
	String numberStr = "xuehao";
	String info = numberStr + number;//+����������
	boolean b1 = true;
	String info1 = info + b1;//+:�������㣬������������������String
	System.out.println(info1);

	//**************************
	//��ϰ1
	char c = 'a';//a=97 A=65
	int num = 10;
	String str = "hello";
	System.out.println(c+num+str);//107hello
	System.out.println(c+str+num);//ahello10
	System.out.println(c+(num+str));//a10hello
	System.out.println((c+num)+str);//107hello
	System.out.println(str+num+c);//hello10a 
	

	//��ϰ2
	//*  *
	System.out.println("*  *");
	System.out.println('*' + '\t' + '*');
	System.out.println('*' + "\t" + '*');
	System.out.println('*' + '\t' + "*");
	System.out.println('*' + ('\t' + "*"));

	//*************************

	//String str1 = 123;//���벻ͨ��
	String str1 = 123 + "";
	System.out.println(str1);//"123"

	//int num1 = str1;
	//int num1 = (int)str1;//"123"

	int num1 = Integer.parseInt(str1);
	System.out.println(num1);
	}
}