class AgeException extends Exception
{
    public AgeException(String message)
    {
        super(message);
    }
}



public class Person
{
    private String name;
    private int age;

    public Person(String name,int age) throws AgeException
    {
        if(age <0 || age>150)
        {
            throw new AgeException("age must be between o to 150");
        }
        this.name=name;
        this.age=age;

    }
    public String getName() {
        return name;
    }
    public  int getAge()
    {
        return age;
    }
}

