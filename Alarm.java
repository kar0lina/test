package lab;

public class Alarm extends Packet{

	public int channelNr;
	public int threshold;
	public int direction;
	
	
	public Alarm(String device, String description, long date, int channelNr, int threshold, int direction){
		super(device, description, date);
		this.channelNr=channelNr;
		this.threshold=threshold;
		this.direction=direction;
		// TODO Auto-generated constructor stub
	}
	
	public String toString (){
		
		return super.toString () +"channelNr: "+ channelNr +";  threshold: " + threshold + ";  direction: "+ direction;
	}
	

}
