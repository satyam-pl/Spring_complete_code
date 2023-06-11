package springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")             //to return a new object always while creating a new object we have to change the 
                               // scope to protype because it by default follows  the singleton pattern
public class Demo{
	
	@Value("#{11+22}")
	private int x;
	
	@Value("#{T(java.lang.Math).sqrt(23)}")
	private int y;

    @Value("#{T(java.lang.Math).PI}")
	private double z;
    
    public double getZ()
    {
    	return z;
    }
    
    public void setZ(double z)
    {
    	this.z=z;
    }
	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public Demo(int x, int y,double z) {
		super();
		this.x = x;
		this.y = y;
		this.z=z;
	}


	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "DemoSpel [x=" + x + ", y=" + y + "z "+ z;
	}
	
	
	

}
