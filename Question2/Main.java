package Question2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List <CityClass> li=new ArrayList<>();
		li.add(new CityClass("Delhi"));
		li.add(new CityClass("Mumbai"));
		li.add(new CityClass("Punjab"));
		li.add(new CityClass("Rajasthan"));
		li.add(new CityClass("Bihar"));
		li.add(new CityClass("Bangalore"));
		li.add(new CityClass("Karnataka"));
		li.add(new CityClass("Odisa"));
		li.add(new CityClass("Asam"));
		
		Collections.sort(li, (c1,c2)-> c2.getCityName().compareTo(c1.getCityName()));
		
		for(CityClass city: li) {
			System.out.println(city.getCityName());
		}

	}

}
