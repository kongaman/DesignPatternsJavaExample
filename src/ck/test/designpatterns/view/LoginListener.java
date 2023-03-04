package ck.test.designpatterns.view;

import java.util.EventListener;

public interface LoginListener extends EventListener {
	
	void loginPerformed(LoginFormEvent event);

}
