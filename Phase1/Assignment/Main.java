package LockedMe;


import LockedMe.FileHandling.HandleOptions;
import LockedMe.FileHandling.MenuOptions;



public class Main {
	public static void main(String[] args) {
		MenuOptions.WelcomeScreen();
		HandleOptions.WelcomeScreen();
		FileHandling.viewFiles("Phase1 Assignment/Hi");
	}

}
