package ck.test.designpatterns.view;

import java.awt.HeadlessException;

import javax.swing.JFrame;

import ck.test.designpatterns.model.Model;

public class View extends JFrame {
	
	private Model model;

	public View(Model model) throws HeadlessException {
		super("MVC Demo");
		this.model = model;
	}

	
}
