An application is built to validate a given customer address. This application can be part of a larger customer data management application.

Different client objects can create a Customer object and invoke the isValidAddress method to check the validity of the customer address. For the purpose of validating the address, the Customer class expects to make use of an address validator class that provides the interface declared in the AddressValidator interface.

The USAddress class is designed to implement the AddressValidator interface so that Customer objects can use USAddress instances as part of the customer address validation process without any problems as shown below:

The application needs to be enhanced to deal with customers from Canada as well. This requires a validator for verifying the addresses of Canadian customers. Let us assume that a utility class CAAddress, with the required functionality to validate a given Canadian address, already exists.

From the CAAddress class implementation below, it can be observed that the CAAddress does offer the validation service required by the Customer class, but the interface it offers is different from what the Customer class expects.

The CAAddress class offers an isValidCanadianAddr method, but the Customer expects an isValidAddress method as declared in the AddressValidator interface. This incompatibility in the interface makes it difficult for a Customer object to use the existing CAAddress class. One of the options is to change the interface of the CAAddress class, but it is not advisable as there could be other applications using the CAAddress class in its current form. Changing the CAAddress class interface can affect all of those current clients of the CAAddress class.

The AddressValidator interface expected by the client is defined in the form of a Java interface. Now let us assume that the client expects the AddressValidator interface to be available as an abstract class instead of a Java interface. Because the adapter CAAddressAdapter has to provide the interface declared by the AddressValidator abstract class, the adapter needs to be designed to subclass the AddressValidator abstract class and implement its abstract methods.
