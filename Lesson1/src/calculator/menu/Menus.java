package calculator.menu;

public class Menus {
	public void welcome() {
		System.out.println("Welcome to my Calculator");
	}
	public void mainmenu() {
		System.out.println("Please select the operation:\n 1.Addition\n 2.Substraction\n 3.Multiplication\n 4.Division\n 5.EXIT");
	}
	public void insertnumber(char num) {
		System.out.println("Please insert number "+num+": ");
	}
	public void cont() {
		System.out.println("Continue? (y/n): ");
	}
	public void bye() {
		System.out.println("Bye, thank you for using our products!");
	}

}
