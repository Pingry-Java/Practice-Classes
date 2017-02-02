public class Student
{
	private String name;
	private int age;
	private static int oldestStudent = 0;
	
	public String toString()
	{
		return "The student, " + name + " is " + age + " years old.";
	}
	
	public int haveBirthday()
	{
		age++;
		if (age > oldestStudent)
			oldestStudent = age;
		return age;
	}
	
	public Student()
	{
		this("John Doe", 0);
	}
	
	public Student(String name)
	{
		this(name, 0);
	}
	
	public Student(int age)
	{
		this("John Doe", age);
	}
	
	public Student(String name, int age)
	{
		this.name = name;
		this.age = age;
		if (age > oldestStudent)
			oldestStudent = age;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
}