package calculator.main;

import java.util.Scanner;
import calculator.menu.*;
import calculator.operations.*;


public class Calculator {

	public static void main(String[] args) {
		Menus menu = new Menus();
		Scanner sc = new Scanner(System.in);
		int op;
		char ex ='n';
		menu.welcome();		
		do {
			do {
				menu.mainmenu();
				op = sc.nextInt();
				
			}while (op<1 ! )
			
		}while(ex!='y');
		while (op!=5)
		if (op==5) {
			menu.bye();
		}else {	
		
			switch(op) {
			case 1:
			}
			
		}
		
		
		

	}

}
