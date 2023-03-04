package ck.test.designpatterns.model;

public class Database {
	
	private static Database instance = new Database();
	
	private Database() {
	}

	public static Database getInstance() {
		return instance;
	}
	
	// Old way of creating a singleton was like this:
	
	private static Database instanceOld;
	
	public static Database getInstanceOld() { // but this is not thread-safe
		if (instanceOld == null) {            // if first thread is interrupted after null-check and a second thread checks
			instanceOld = new Database();     // it is still null and there might be 2 objects now if the first thread starts
		}                                     // resumes and creates the object too
		return instanceOld;
	}
	
	public void connect() {
		System.out.println("Connected to DB");
	}
	
	public void disconnect() {
		System.out.println("Disconnected");
	}
	
}
