package method;

public class WaterPumpMotor extends Motor {
	void run()
	{
		System.out.println("this is default constructor");
	}
	void stop()
	{
		System.out.println("the waterpump stops");
	}
	void run(boolean working)
	{
		this.working=true;
		System.out.println("the water pumpmotor is working");
	}
	void stop(boolean st)
	{
	st=false;
	System.out.println("the water pump motor is not stop");
		}
	 void reset()
	{
		System.out.println("reset of methods");
	}
	 void run(int rtp,String fuelType)
	 {
		 this.rpm=rtp;
		 System.out.println("RPM"+rpm);
		 this.fueltype=fuelType;
		 System.out.println("fuel name is"+fuelType);
		  }
	 void stop(int rpm,String fuelType,boolean working)
	 {
		 System.out.println(this.rpm);
		 System.out.println(this.fueltype);
		 System.out.println(true);
	 }

}
