package anupk;

import java.util.Hashtable;
import java.util.Iterator;

public class DinerMenu implements Menu {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	Hashtable<String, MenuItem> menuItems = new Hashtable<String, MenuItem>();
	public DinerMenu() {
		addItem("Vegetarian BLT",
				"(Fakin’) Bacon with lettuce & tomato on whole wheat", true, 2.99);
		addItem("BLT",
				"Bacon with lettuce & tomato on whole wheat", false, 2.99);
		addItem("Soup of the day",
				"Soup of the day, with a side of potato salad", false, 3.29);
		addItem("Hotdog",
				"A hot dog, with saurkraut, relish, onions, topped with cheese",
				false, 3.05);
		// a couple of other Diner Menu items added here
		addItem("Hotdog1",
				"A hot dog, with saurkraut, relish, onions, topped with cheese",
				false, 2.90);
		addItem("Hotdog2",
				"A hot dog, with saurkraut, relish, onions, topped with cheese",
				false, 2.94);
		addItem("Hotdog3",
				"A hot dog, with saurkraut, relish, onions, topped with cheese",
				false, 2.99);
	}
	public void addItem(String name, String description,
			boolean vegetarian, double price)
	{
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("Sorry, menu is full! Can’t add item to menu");
		} else {
			menuItems.put(menuItem.getName(), menuItem);
			numberOfItems = numberOfItems + 1;
		}
	}
	public Iterator<MenuItem> createIterator() {
		return menuItems.values().iterator();
	}
	// other menu methods here
}