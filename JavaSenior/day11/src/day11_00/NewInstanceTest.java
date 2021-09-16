package day11_00;

import org.junit.Test;

import java.util.Random;

/**
 * 通过反射创建对应的运行时类的对象
 *
 * @acthor KKKKK
 * @creay 2021-04-29-{TIME}
 */
public class NewInstanceTest
{
    @Test
    public void test() throws IllegalAccessException, InstantiationException
    {
        Class<Person> clazz = Person.class;

        //newInstance():调用此方法，创建对应的运行时类的对象
        //要想此方法正常的创建运行时类的对象，要求：
        //1.运行时类必须要提供空参的构造器
        //2.空参的构造器的访问权限不能小于缺省，通常，设置为public


        //通常在JavaBean中要求提供一个public的空参构造器
        //1.便于通过反射，创建运行时类的对象
        //2.便于子类继承此类时，默认调用super()时，保证父类有此构造器

        Person p1 = clazz.newInstance();

        System.out.println(p1);


    }

    //体会反射的动态性
    @Test
    public void test1()
    {
        int num = new Random().nextInt(3);//0,1,2
        String classPath = "";
        switch(num)
        {
            case 0:
                classPath = "java.util.Date";
                break;
            case 1:
                classPath = "java.lang.Object";
                break;
            case 2:
                classPath = "day11_00.Person";
                break;
        }

        try
        {
            Object instance = getInstance(classPath);
            System.out.println(instance);
        }catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }catch(IllegalAccessException e)
        {
            e.printStackTrace();
        }catch(InstantiationException e)
        {
            e.printStackTrace();
        }
    }



    /*
    创建一个指定类的对象
    classPath:指定类的全类名
     */
    public Object getInstance(String classPath) throws ClassNotFoundException, IllegalAccessException, InstantiationException
    {
        Class<?> aClass = Class.forName(classPath);
        return aClass.newInstance();
    }
}
