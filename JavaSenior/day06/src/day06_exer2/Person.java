package day06_exer2;

/**
 * @acthor KKKKK
 * @creay 2021-04-21-{TIME}
 */
public class Person
{
    public int id;
    public String name;

    public Person()
    {
    }

    public Person(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o)
    {
        if(this == o)
            return true;
        if(o == null || getClass() != o.getClass())
            return false;

        Person person = (Person) o;

        if(id != person.id)
            return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode()
    {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString()
    {
        return "Person{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}
