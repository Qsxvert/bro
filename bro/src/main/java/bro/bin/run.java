package bro.bin;

import bro.app.App;
import bro.app.Main;

public class run {
	public static void main(String[] args) {
		Main main = new Main();
		main.show();
		
		App app = new App();
		app.broConfig();
		
	}
}
