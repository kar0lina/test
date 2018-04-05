package lab;

public class Spectrum<T> extends Sequence<T>{

	public String scaling;
	
	public Spectrum(String device, String description, long date, int channelNr, String unit, double resolution, T[] buffer, String scaling) {
		super(device, description, date, channelNr, unit, resolution, buffer);
		this.scaling=scaling;
		// TODO Auto-generated constructor stub
	}
	
	public String toString (){
		
		return super.toString () +" scaling: "+ scaling;
	}
	

}
