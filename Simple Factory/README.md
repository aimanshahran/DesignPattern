A Java interface Logger that declares the interface to be used by the client objects to log messages can be defined. In general, an incoming message could be logged to different output media, in different formats. Different concrete implementer classes of the Logger interface can handle these differences in implementation. Two such implementers are described in the table below.

Evaluate whether Simple Factory design pattern is suitable for the scenario described. Then, apply the suitable one to encapsulate the necessary implementation for selecting and instantiating an appropriate Logger implementer inside a separate getLogger method in a separate class LoggerFactory. As part of its implementation, the method getLogger checks the logger.properties property file to see if file logging is enabled and decides which Logger implementation is to be instantiated. 
The selected Logger implementer instance is returned as an object of type Logger.
With the getLogger method in place, client objects do not need to deal with the intricacies involved in selecting and instantiating an appropriate Logger implementer. Client objects do not need to know the existence of different implementers of the Logger interface and their associated functionality.

Whenever a client object such as the LoggerTest needs to log a message, it can:
- Invoke the method getLogger. When the method returns, the client object does not have to know the exact Logger subtype that is instantiated as long
as the returned object is of the Logger type.
- Invoke the log method exposed by the Logger interface on the returned
object.
