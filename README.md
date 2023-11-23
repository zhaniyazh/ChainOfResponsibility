# ChainOfResponsibility
A help desk ticketing system that allows different types of support requests to be handled by different support teams
However, a lower level handlers cannot handle a higher level requests.

There are 3 different handlers: hardware, software, networkk.
Each handler is organized in a hierarchical order, such that a lower-level handler can pass a support request up to a higher-level handler if it cannot handle the request itself.
