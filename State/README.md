By using Java Language, please implement this application.

Let us consider a business account at a bank with the overdraft facility. Such an account can exist in any one of the following three states at any given point of time:
- No transaction fee state — As long as the account balance remains greater than the minimum balance, no transaction fee will be charged for any deposit or withdrawal transaction. The example application has the mini- mum balance as $2,000.
- Transaction fee state — An account is considered to be in the transaction fee state when the account balance is positive but below the minimum balance. A transaction fee will be charged for any deposit or withdrawal transaction in this state. The example application has the transaction fee in this state as $2.
- Overdrawn state — This is the state of the account when an account balance is negative but within the overdraft limit. A transaction fee will be charged for any deposit or withdrawal transactions in this state. The example application has the transaction fee in this state as $5 and the overdraft limit is maintained as $1,000.

In all three states, a withdrawal transaction that exceeds the overdraft limit is not allowed.

The BusinessAccount class offers the basic functionality in the form of methods to enable a client object to perform deposit and withdrawal operations. In addition, the BusinessAccount class defines some of the transaction limits and offers accessor methods to read its state.

Define a common State class that contains the business account behavior that is common across all states. Instead of keeping the state-specific behavior inside the BusinessAccount class, by applying the State pattern, the behavior specific to each of the three states can be implemented in the form of three separate subclasses - NoTransactionFeeState, TransactionFeeState and OverDrawnState of the State class. In addition, these subclasses know the state it should transition to and when to make that transition. Each of these State subclasses implements this state transition functionality by overriding the parent class transitionState method as per the state transition rules detaile. transitionState method returns the State object that represents the current state of the BusinessAccount object after a transition of state.
