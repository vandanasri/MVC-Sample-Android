![alt text](https://d1m75rqqgidzqn.cloudfront.net/wp-data/2022/06/23011227/iStock-1285888054.jpg)

#Model View Controller (MVC)
The Model-View-Controller (MVC) is an architectural pattern that separates an 
application into three main logical components: the model, the view, and 
the controller. Each of these components are built to handle specific 
development aspects of an application. MVC is one of the most frequently used 
industry-standard web development framework to create scalable and extensible
projects.

![alt text](https://static.packt-cdn.com/products/9781785889196/graphics/B05034_10_01.jpg)


MVC design pattern divides an application into three major aspects: Model, View, and Controller.

#Model

Model means data that is required to display in the view. Model represents a collection of classes that describes the business logic (business model and the data model). It also defines the business rules for data means as how the data can be changed and manipulated.

#View

The View represents UI components like XML, HTML etc. View displays the data that is received from the controller as the outcome. In MVC pattern View monitors the model for any state change and displays updated model. Model and View interact with each other using the Observer pattern.

#Controller

The Controller is responsible to process incoming requests. It processes the user’s data through the Model and passing back the results to View. It normally acts as a mediator between the View and the Model.

#Advantages
It keeps business logic separate in the model.
Support asynchronous techniques
The modification does not affect the entire model
Faster development process

#Disadvantages
Due to large code controller is unmanageable.
Hinders the Unit testing
Increased Complexity
