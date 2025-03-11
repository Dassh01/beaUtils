# beaUtils
## Overview:
A constantly evolving personalized utility library for Java projects. 
## Methods:
### askForThing:
Handler that covers user input of all kinds, includes a built in try/catch in avoidance of userMismatch exceptions. \
Useful for any case involving requests from a user in a terminal.
### userInputBoolean (Overloaded):
Automatic input parser which converts requests into booleans, one version of the method strictly accepts "yes"/"y" as true input. \
Another version of the method accepts a hashmap as a second parameter, allowing flexible configurations for what the method consider true input.
### retryUntilSuccess:
Takes in a lambda method and attempts to execute it until it provides a successful output, returns the output of attempted lambda. \
Great for attempting a volatile piece of code (like a user entering something that may crash your program).
### roundAsDouble: 
Rounds pesky doubles provided as the first parameter to the amount of decimal places provided as the second parameter.
### roundAsString:
Rounds utilizing roundAsDouble but returns as a String instead.

##
Also check out [mstd](https://github.com/mopo3ob-jack/mstd)!
