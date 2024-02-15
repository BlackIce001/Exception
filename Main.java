

public class Main
{
    public static void main(String[] args)
    {
        try
        {
            Person person1= new Person("Alice", 25);


            System.out.println("Name:"+person1.getName());
            System.out.println("age:" +person1.getAge());
            Person person3=new Person("Jack",56);
        }
        catch (AgeException e)
        {
            System.out.println("Exception occurred"+ e.getMessage());

        }
    }
}