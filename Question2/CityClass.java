package Question2;
import java.util.*;
public class CityClass {

	private String cityName;
	
	

	public CityClass() {
		
	}

	public CityClass(String cityName) {
		this.cityName = cityName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "CityClass [cityName=" + cityName + "]";
	}
}
