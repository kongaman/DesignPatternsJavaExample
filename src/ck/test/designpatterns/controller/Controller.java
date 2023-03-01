package ck.test.designpatterns.controller;

import ck.test.designpatterns.model.Model;
import ck.test.designpatterns.view.View;

public class Controller {
	
	private View view;
	private Model model;
	
	public Controller(View view, Model model) {
		this.view = view;
		this.model = model;
	}
	
}
