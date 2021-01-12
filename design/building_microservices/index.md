Building Microservices:

* low coupling, high cohesion
* prematurely  decomposing  a  system  into  microservices can be costly, especially if you are new to the domain. In many ways, having an existing codebase you want to decompose into microservices is much easier than trying togo to microservices from the beginning.
* service boundary - business vs technical slice
* shared DB is effectively a very large, shared API, also specific technology choice
* sync vs async (optimistic) 
* style - request/response  or event-based.
* PACT
* hexagonal architecture:
Ports - business logic is isolated. UserRepo -> save, knows only about interface. Save can save to db, or via network call.
Make the core of the system interact through ports
* Robert C. Martin’s definition of the Single Responsibility Principle, which states “Gather together those things that change for the same reason, and separate those things that change for different reasons.”
* software architect is a town planner, divides city in zones. “Be worried about what happens between the boxes, and be liberal in what happens inside.”

