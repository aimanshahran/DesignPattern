Let us revisit the message logging utility we built while discussing the Factory Method and the Singleton patterns earlier. Let us suppose that some of the clients are now in need of logging messages in new ways beyond what is offered by the message logging utility. Let us consider the following two small features that clients would like to have:

- Transform an incoming message to an HTML document and store it in a log file.
- Transform an incoming message to an HTML document and display it on the screen.
- Apply encryption on an incoming message and store it in a log file.
- Apply encryption on an incoming message and display it on the screen.

If we had additional Logger types (for example a DBLogger to log messages to a database), it would lead to more subclasses. With every new feature that needs to be added, there will be a multiplicative growth in the number of subclasses and soon we will have an exploding class hierarchy.
Rescue the situation above by using the Decorator pattern. The Decorator pattern recommends having a wrapper around an object to extend its functionality by object composition rather than by inheritance.
