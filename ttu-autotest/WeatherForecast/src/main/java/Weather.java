import java.util.Date;

public class Weather {
	private double currentTemperature;
	private double maxTemperature;
	private double minTemperature;
	private Date date;
	private float coordinates;
	
    public double CurrentTemperature() {
        return currentTemperature;
    }
    
    public Date getDate(){
    	return date;
    }
    
    public double getMaxTemperature(Date date) {
        return maxTemperature;
    }
    
    public double getMinTemperature(Date date) {
        return minTemperature;
    }
    
    public float getCoordinates() {
    	return coordinates;
    	
    }
}
