package StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class State {
	private int stated;
	private String statename;
	public State() {
		super();
	}
	public State(int stated, String statename) {
		super();
		this.stated = stated;
		this.statename = statename;
	}
	public int getStated() {
		return stated;
	}
	public void setStated(int stated) {
		this.stated = stated;
	}
	public String getStatename() {
		return statename;
	}
	public void setStatename(String statename) {
		this.statename = statename;
	}
	@Override
	public String toString() {
		return "State [stated=" + stated + ", statename=" + statename + "]";
	}
}

class City {
	private int cityid;
	private String cityname;
	private State objState;
	private int pollutionIndex;
	private int population;
	private int area_of_city;
	public City() {
		super();
	}
	public City(int cityid, String cityname, State objState, int pollutionIndex, int population, int area_of_city) {
		super();
		this.cityid = cityid;
		this.cityname = cityname;
		this.objState = objState;
		this.pollutionIndex = pollutionIndex;
		this.population = population;
		this.area_of_city = area_of_city;
	}
	public int getCityid() {
		return cityid;
	}
	public void setCityid(int cityid) {
		this.cityid = cityid;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public State getObjState() {
		return objState;
	}
	public void setObjState(State objState) {
		this.objState = objState;
	}
	public int getPollutionIndex() {
		return pollutionIndex;
	}
	public void setPollutionIndex(int pollutionIndex) {
		this.pollutionIndex = pollutionIndex;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public int getArea_of_city() {
		return area_of_city;
	}
	public void setArea_of_city(int area_of_city) {
		this.area_of_city = area_of_city;
	}
	@Override
	public String toString() {
		return "City [cityid=" + cityid + ", cityname=" + cityname + ", objState=" + objState + ", pollutionIndex="
				+ pollutionIndex + ", population=" + population + ", area_of_city=" + area_of_city + "]";
	}
}

public class StreamAPI_2 {
	public static void main(String[] args) {
		List<City> cities=new ArrayList<>();
		cities.add(new City(11,"Pune", new State(1, "Maharashtra"), 13,80000000,100));
		cities.add(new City(12,"Mumbai", new State(1, "Maharashtra"), 17,100000000,150));
		cities.add(new City(13,"Delhi", new State(2, "Delhi"), 20,80000000,80));
		cities.add(new City(14,"Banglore", new State(3, "Karnataka"), 12,80000000,130));
		cities.add(new City(15,"Chennai", new State(4, "TamilNadu"), 14,80000000,140));
		cities.add(new City(16,"Indore", new State(5, "MadhyaPradesh"), 13,80000000,90));
		cities.add(new City(17,"Bhopal", new State(5, "MadhyaPradesh"), 13,80000000,95));
		cities.add(new City(18,"Manglore", new State(3, "Karnataka"), 13,80000000,110));
		System.out.println("1. WAP to find the city with less area and highest population");
		System.out.println(cities.stream().max(Comparator.comparingInt(City::getPopulation)).get());
		System.out.println("2. WAP to find the city with high pollution_index and high city area.");
		System.out.println(cities.stream().max(Comparator.comparingDouble(City::getPollutionIndex)).get());
		System.out.println("3. WAP to print the city detail on the basis of lowest pollution_index first \r\n"
				+ "and so on.\r\n");
		System.out.println(cities.stream().sorted((o1, o2) -> o1.getPollutionIndex()-o2.getPollutionIndex()).collect(Collectors.toList()));
		System.out.println("WAP to print city with lowest pollution index and lowest area of city.");
		System.out.println("Lowest Pollution Index:"+cities.stream().mapToDouble(i->i.getPollutionIndex()).min().getAsDouble());
		System.out.println("Lowest Area Of City:"+cities.stream().mapToDouble(i->i.getArea_of_city()).min().getAsDouble());
		System.out.println("6. WAP to print total area of each state.");
		System.out.println(cities.stream().mapToInt(i->i.getArea_of_city()).sum());
		System.out.println("7.WAP to count how many cities in every state we are having.");
		System.out.println(cities.stream().collect(Collectors.toMap(City::getCityname, City::getObjState)));
	}
}
