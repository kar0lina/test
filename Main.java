package lab;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Packet nowy = new Packet("cos", "niewiem", 5);
		//System.out.println(nowy.toString());
		//Sequence niewiem = new Sequence("onieee", "maslo", 2, -5, "wow", 30);
		//System.out.println(niewiem.toString());
		//System.out.println(niewiem.device);
		
		Integer[] buffer= {1,2,3,4,5};
				
		TimeHistory<Integer> historia1 = new TimeHistory<Integer>("device1", "fajne", 1 , 1, "unit", 1, buffer, 55);
		System.out.println(historia1.toString());
		buffer[3] = 0;
		Spectrum<Integer> spectrum1 = new Spectrum<Integer>(null, null, 0, 0, null, 0,buffer, null);
		System.out.println(spectrum1.toString());
		Alarm alarm1 = new Alarm(null, null, 0, 0, 0, 0);
		System.out.println(alarm1.toString());
	}
	

}

