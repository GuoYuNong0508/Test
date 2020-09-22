package 类;

public class 老师的类 {
	//declare field
	private String teacherName;
	private int age;
	private String subject;
	private double height;
	private double weight;
	private String gender;
	
	//declare methods
	public String getSubject()
	{
		return subject;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int a)
	{
		age = a;
	}
	
	public String getTeacherName()
	{
		return teacherName;
	}
	public double getHeight()
	{
		return height;
	}
	public void setHeight(int b)
	{
		height = b;
	}
	public double getWeight()
	{
		return weight;
	}
	public void setWeight(int c)
	{
		weight = c;
	}
	public String getGender()
	{
		return gender;
	}

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String teacherName;
		老师的类 teacher1 = new 老师的类();
		老师的类 teacher2 = new 老师的类();
		teacher1.teacherName = "郭雨农";
		System.out.println(teacher1.getTeacherName());
		
	

	}

}
