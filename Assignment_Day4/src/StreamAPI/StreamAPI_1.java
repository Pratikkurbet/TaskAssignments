package StreamAPI;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Item {
	int itemid;
	String iname;
	LocalDateTime date_of_manufacturing, date_of_expiry;
	int price;

	public Item() {
		super();
	}

	public Item(int itemid, String iname, LocalDateTime date_of_manufacturing, LocalDateTime date_of_expiry,
			int price) {
		super();
		this.itemid = itemid;
		this.iname = iname;
		this.date_of_manufacturing = date_of_manufacturing;
		this.date_of_expiry = date_of_expiry;
		this.price = price;
	}

	public int getItemid() {
		return itemid;
	}

	public void setItemid(int itemid) {
		this.itemid = itemid;
	}

	public String getIname() {
		return iname;
	}

	public void setIname(String iname) {
		this.iname = iname;
	}

	public LocalDateTime getDate_of_manufacturing() {
		return date_of_manufacturing;
	}

	public void setDate_of_manufacturing(LocalDateTime date_of_manufacturing) {
		this.date_of_manufacturing = date_of_manufacturing;
	}

	public LocalDateTime getDate_of_expiry() {
		return date_of_expiry;
	}

	public void setDate_of_expiry(LocalDateTime date_of_expiry) {
		this.date_of_expiry = date_of_expiry;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [itemid=" + itemid + ", iname=" + iname + ", date_of_manufacturing=" + date_of_manufacturing
				+ ", date_of_expiry=" + date_of_expiry + ", price=" + price + "]";
	}
}

public class StreamAPI_1 {
	public static void main(String[] args) {
		List<Item> item = new ArrayList<>();
		item.add(new Item(1, "water bottle", LocalDateTime.of(2017, 2, 13, 15, 56),
				LocalDateTime.of(2018, 2, 13, 15, 56), 10));
		item.add(new Item(2, "mobile", LocalDateTime.of(2022, 2, 13, 15, 56),
				null, 1000000));
		item.add(new Item(3, "notebook", LocalDateTime.of(2018, 2, 13, 15, 56),
				null, 100));
		item.add(new Item(4, "medicine", LocalDateTime.of(2021, 2, 13, 15, 56),
				LocalDateTime.of(2024, 2, 13, 15, 56), 1000));
		item.add(new Item(5, "chips", LocalDateTime.of(2017, 2, 13, 15, 56),
				LocalDateTime.of(2018, 2, 13, 15, 56), 10));
		item.add(new Item(6, "Laptop", LocalDateTime.of(2017, 2, 13, 15, 56),
				null, 100000));
		System.out.println("WAP to find the average price of item from the list of given items.");
		System.out.println(item.stream().mapToDouble(i->i.price).average().getAsDouble());
		System.out.println("WAP to print detail of item which is having highest and lowest price.");
		System.out.println("Highest Price:"+" "+ item.stream().mapToDouble(i->i.price).max().getAsDouble());
		System.out.println("Lowest Price:"+" "+ item.stream().mapToDouble(i->i.price).min().getAsDouble());
		System.out.println("WAP to print the item with maximum price and not having any expiry date");
		System.out.println("Item with Highest price:"+item.stream().sorted((o1, o2) -> o2.getPrice()-o1.getPrice()).findFirst().get());
		System.out.println("WAP to store item name and price from list to set.");
		System.out.println(item.stream().map(i->i.getIname()).collect(Collectors.toSet()));
		System.out.println(item.stream().map(i->i.getPrice()).collect(Collectors.toSet()));
		System.out.println("WAP to remove duplicate prices from the list of the items");
		System.out.println(item.stream().distinct().collect(Collectors.toList()));
	}
}
