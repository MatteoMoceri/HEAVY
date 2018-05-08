package function;

public class Chunk extends Sim{
	
	public double densityPercent;
	public double length;
	public double width;
	public double height;
	public double vol;
	public String state;
	public String type;
	
	public Chunk(double d, double l, double w, double h, String s, String p){
		densityPercent = d;
		length = l;
		width = w;
		height = h;
		state = s;
		type = p;
		
		vol = (l*w*h);
	}
}
