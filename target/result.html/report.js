$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("book.feature");
formatter.feature({
  "line": 1,
  "name": "Testing flight booking page as per given requirements.",
  "description": "",
  "id": "testing-flight-booking-page-as-per-given-requirements.",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 2,
  "name": "Booking a flight for given source and destination.",
  "description": "",
  "id": "testing-flight-booking-page-as-per-given-requirements.;booking-a-flight-for-given-source-and-destination.",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "Initializing the browser and open the url",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Enter the flight details \u003csrc\u003e and \u003cdest\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "search for flight",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "able to select best flight",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "close the browser",
  "keyword": "And "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "testing-flight-booking-page-as-per-given-requirements.;booking-a-flight-for-given-source-and-destination.;",
  "rows": [
    {
      "cells": [
        "src",
        "dest"
      ],
      "line": 10,
      "id": "testing-flight-booking-page-as-per-given-requirements.;booking-a-flight-for-given-source-and-destination.;;1"
    },
    {
      "cells": [
        "Bengaluru",
        "Delhi"
      ],
      "line": 11,
      "id": "testing-flight-booking-page-as-per-given-requirements.;booking-a-flight-for-given-source-and-destination.;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Booking a flight for given source and destination.",
  "description": "",
  "id": "testing-flight-booking-page-as-per-given-requirements.;booking-a-flight-for-given-source-and-destination.;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "Initializing the browser and open the url",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Enter the flight details Bengaluru and Delhi",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "search for flight",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "able to select best flight",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.initializing_the_browser_and_open_the_url()"
});
formatter.result({
  "duration": 15096311600,
  "status": "passed"
});
formatter.match({
  "location": "Steps.enter_the_flight_details_Bengaluru_and_Delhi()"
});
formatter.result({
  "duration": 10696068100,
  "status": "passed"
});
formatter.match({
  "location": "Steps.search_for_flight()"
});
formatter.result({
  "duration": 28410407700,
  "status": "passed"
});
formatter.match({
  "location": "Steps.able_to_select_best_flight()"
});
formatter.result({
  "duration": 1564192300,
  "status": "passed"
});
formatter.match({
  "location": "Steps.close_the_browser()"
});
formatter.result({
  "duration": 51400,
  "status": "passed"
});
});