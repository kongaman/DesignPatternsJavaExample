package ck.test.designpatterns;

import javax.swing.SwingUtilities;

import ck.test.designpatterns.controller.Controller;
import ck.test.designpatterns.model.Model;
import ck.test.designpatterns.view.View;

public class Application {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(() -> {
			runApp();
		});
	}
	
	public static void runApp() {
		
		Model model = new Model();
		View view = new View(model);
		
		Controller controller = new Controller(view, model);
		
		view.setLoginListener(controller);
	}
}
