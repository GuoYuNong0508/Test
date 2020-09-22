package 类;

public class CAR {
	//declare fields
    int color;
    int speed;
	
	//declare methods
	
	void run(int speed)
	{
		this.speed = 80;
		System.out.println("Run");
	}
	
	//declare a constructor（构造器）
	public CAR(int c,int s)
	{
		color = c;
		speed = s;
	}
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CAR myCar = new CAR(0,100);
		CAR herCar = new CAR(0,100);
		myCar.run();
		herCar.run();
		
		System.out.print(myCar.color+myCar.speed);
				
		
		
		

	}
	private void run() {
		// TODO Auto-generated method stub
		
	}

	public void startup()
	{
		System.out.println("Start up!");
	}

	

	private void run1(int speed) {
		// TODO Auto-generated method stub
		System.out.println("run with speed" + speed);
	}



}
