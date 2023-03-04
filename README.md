# DesignPatternsJavaExample

Software Design Patterns in Java (Swing) - https://caveofprogramming.teachable.com/courses/2084

Separation back end <-> front end
General rule: 
- The front end imports back end stuff
- the back end **NEVER** imports front end stuff

Model-View-Controller
- The model represents/deals directly with the data
- The view interacts with the user (it's a view of the data-model) GUI
- The controller contains the logic of the application ("business logic" - neither data nor GUI)

Observer Pattern
- The observer is the listener that waits for something to trigger it
- The subject (view) that is observerd (by the controller) best doesn't even have to know that there is an obsever
- When something triggers a piece of code will run in the observing class.
- Usually an EventListener is used to listen to the subject and the Event to is used to pass data if needed.

Singleton Pattern
- You only allow one object created of the class that uses the singleton pattern
- Classic example is a database class that is used in multiple places in code but you only have 1 object with 1 connection to that database
- Use a private constructor and a public getInstance method to get the only existing instance of that class
- be careful where to instanciate the class to keep it thread-safe (check comment in Database class)