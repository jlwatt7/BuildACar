public class Car {
 
	public wheel [ ] wheels;
	
	public Car (int count)
	{
		int i;
		wheels = new wheel [count];
		for (i =0; i<count; i++);
		wheels [i] = new wheel ();
		
	}
	
	public Car() {
		this(4);
	}
	}
	
