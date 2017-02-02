public class Course
{
	private ArrayList<Student> students;
	private ArrayList<Double> grades;
	private String title;
	private String teacher;
	
	public Course()
	{
		this("No Title Given", "Professor Doe");
	}
	
	public Course(String title, String teacher)
	{
		this.title = title;
		this.teacher = teacher;
	}
	
	public double averageGrade()
	{
		int sum = 0;
		for (double i : grades)
			sum += i;
		return sum/grades.size();
	}
	
	public int getEnrollment()
	{
		return students.size();
	}
	
	public void enrollStudent(Student student)
	{
		students.add(student);
	}
	
	public String toString()
	{
		return "The course, " + title + " is taught by " + teacher + ". It has " + this.getEnrollment + " students, and the average grade of the course is " + this.averageGrade;
	}
	
	public ArrayList<Student> getStudents()
	{
		return students;
	}
	
	public ArrayList<Double> getGrades()
	{
		return grades;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public String getTeacher()
	{
		return teacher;
	}
}