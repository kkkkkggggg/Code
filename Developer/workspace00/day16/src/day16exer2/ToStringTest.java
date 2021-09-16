package day16exer2;

import day16exer1.Order;
/*
 * 
 * Object类中的toString()的使用
 * 
 * 1.当我们输出一个对象的引用时，实际上就是调用对象的同toString()
 * 
 * 2.Object类中toString()的定义
 * public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
    
    3.像String、Date、File、包装类等都重写 了Object类中的toString()方法
    使得在调用对象的toString()方法时，返回“实体内容”信息
    
    4.自定义类也可以重写toString()方法，在调用此方法时，返回对象的“实体内容”
*/
public class ToStringTest
{
	public static void main(String args[])
	{
		Order o = new Order(11,"yy");
		
		System.out.println(o.toString());
	}
}
