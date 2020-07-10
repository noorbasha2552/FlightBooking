Feature: Testing flight booking page as per given requirements.
Scenario Outline: Booking a flight for given source and destination.	
	Given Initializing the browser and open the url
	When Enter the flight details <src> and <dest>
	When search for flight
	Then able to select best flight
	And close the browser
	
Examples:
	|src		|dest		|
	|Bengaluru|Delhi|