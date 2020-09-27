package anupk;
import java.util.*;

public class Waitress {
	Menu pancakeHouseMenu;
	Menu dinerMenu;
	Menu cafeMenu;
	public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
		this.cafeMenu = cafeMenu;
	}
	public void printMenu() {
		@SuppressWarnings("unchecked")
		Iterator<Menu> pancakeIterator = (Iterator<Menu>) pancakeHouseMenu.createIterator();
		@SuppressWarnings("unchecked")
		Iterator<Menu> dinerIterator = (Iterator<Menu>) dinerMenu.createIterator();
		@SuppressWarnings("unchecked")
		Iterator<Menu> cafeIterator = (Iterator<Menu>) cafeMenu.createIterator();
		System.out.println("MENU\n----\nBREAKFAST");
		printMenu(pancakeIterator);
		System.out.println("\nLUNCH");
		printMenu(dinerIterator);
		System.out.println("\nDINNER");
		printMenu(cafeIterator);
	}
	private void printMenu(Iterator<Menu> iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.print(menuItem.getName() + ",");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}
}
