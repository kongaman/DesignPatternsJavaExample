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