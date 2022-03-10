package method;

public class MotorOperator {
	public static void main(String[] args)
	{
		Motor motor=new Motor();
		motor.run();
		motor.Stop();
		System.out.println("---------------------");
		WaterPumpMotor wpm=new WaterPumpMotor();
		wpm.run();
		wpm.stop();
		System.out.println("-----------------------");
		wpm.run(true);
		wpm.stop(false);
		wpm.reset();
		System.out.println("--------------------------");
		wpm.run(-1,"petrol");
		wpm.stop(2,"petrol and oil",true);
	}

}
