package ck.caveofprogramming.designpatterns.demo1;

import javax.swing.SwingUtilities;

import ck.caveofprogramming.designpatterns.demo1.controller.Controller;
import ck.caveofprogramming.designpatterns.demo1.model.Model;
import ck.caveofprogramming.designpatterns.demo1.view.View;

public class Application {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				runApp();
			}
			
		});
	}
	
	public static void runApp() {
		Model model = new Model();
		View view = new View(model);

		Controller controller = new Controller(view, model);
		
		view.setLoginListener(controller);
	}

}
