package ck.test.designpatterns.controller;

import ck.test.designpatterns.model.Model;
import ck.test.designpatterns.view.LoginFormEvent;
import ck.test.designpatterns.view.LoginListener;
import ck.test.designpatterns.view.View;

public class Controller implements LoginListener {
	
	private View view;
	private Model model;
	
	public Controller(View view, Model model) {
		this.view = view;
		this.model = model;
	}

	@Override
	public void loginPerformed(LoginFormEvent event) {
		System.out.println("LoginEvent revieved: " + event.getName() + " - " + event.getPassword());
		
	}
	
}
