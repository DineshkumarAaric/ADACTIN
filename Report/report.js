$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Login functionality for adactin application",
  "description": "",
  "id": "login-functionality-for-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 10,
  "name": "Successful login into the adactin application with valid credential",
  "description": "",
  "id": "login-functionality-for-adactin-application;successful-login-into-the-adactin-application-with-valid-credential",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "user enter application url",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user enter \"\u003cusername\u003e\" as username",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user enter \"\u003cpassword\u003e\" as password",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user verify the username in the homepage",
  "keyword": "Then "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "login-functionality-for-adactin-application;successful-login-into-the-adactin-application-with-valid-credential;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 17,
      "id": "login-functionality-for-adactin-application;successful-login-into-the-adactin-application-with-valid-credential;;1"
    },
    {
      "cells": [
        "kaviyarkmk",
        "test@1234"
      ],
      "line": 18,
      "id": "login-functionality-for-adactin-application;successful-login-into-the-adactin-application-with-valid-credential;;2"
    },
    {
      "cells": [
        "ragu1234",
        "ragu1234"
      ],
      "line": 19,
      "id": "login-functionality-for-adactin-application;successful-login-into-the-adactin-application-with-valid-credential;;3"
    },
    {
      "cells": [
        "Mahamilky",
        "hari.9500"
      ],
      "line": 20,
      "id": "login-functionality-for-adactin-application;successful-login-into-the-adactin-application-with-valid-credential;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "the user is loggedin the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "goes to the landing page",
  "keyword": "Then "
});
formatter.match({
  "location": "AAStepdefinitionLogin.the_user_is_loggedin_the_application()"
});
formatter.result({
  "duration": 414255438,
  "status": "passed"
});
formatter.match({
  "location": "AAStepdefinitionLogin.goes_to_the_landing_page()"
});
formatter.result({
  "duration": 38496,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Successful login into the adactin application with valid credential",
  "description": "",
  "id": "login-functionality-for-adactin-application;successful-login-into-the-adactin-application-with-valid-credential;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "user enter application url",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user enter \"kaviyarkmk\" as username",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user enter \"test@1234\" as password",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user verify the username in the homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "AAStepdefinitionLogin.user_enter_application_url()"
});
formatter.result({
  "duration": 7059699807,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kaviyarkmk",
      "offset": 12
    }
  ],
  "location": "AAStepdefinitionLogin.user_enter_as_username(String)"
});
formatter.result({
  "duration": 275219027,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test@1234",
      "offset": 12
    }
  ],
  "location": "AAStepdefinitionLogin.user_enter_as_password(String)"
});
formatter.result({
  "duration": 151666520,
  "status": "passed"
});
formatter.match({
  "location": "AAStepdefinitionLogin.user_verify_the_username_in_the_homepage()"
});
formatter.result({
  "duration": 2790692410,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "the user is loggedin the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "goes to the landing page",
  "keyword": "Then "
});
formatter.match({
  "location": "AAStepdefinitionLogin.the_user_is_loggedin_the_application()"
});
formatter.result({
  "duration": 70832,
  "status": "passed"
});
formatter.match({
  "location": "AAStepdefinitionLogin.goes_to_the_landing_page()"
});
formatter.result({
  "duration": 23097,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Successful login into the adactin application with valid credential",
  "description": "",
  "id": "login-functionality-for-adactin-application;successful-login-into-the-adactin-application-with-valid-credential;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "user enter application url",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user enter \"ragu1234\" as username",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user enter \"ragu1234\" as password",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user verify the username in the homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "AAStepdefinitionLogin.user_enter_application_url()"
});
formatter.result({
  "duration": 936730380,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ragu1234",
      "offset": 12
    }
  ],
  "location": "AAStepdefinitionLogin.user_enter_as_username(String)"
});
formatter.result({
  "duration": 187546355,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ragu1234",
      "offset": 12
    }
  ],
  "location": "AAStepdefinitionLogin.user_enter_as_password(String)"
});
formatter.result({
  "duration": 148347184,
  "status": "passed"
});
formatter.match({
  "location": "AAStepdefinitionLogin.user_verify_the_username_in_the_homepage()"
});
formatter.result({
  "duration": 1601735581,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "the user is loggedin the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "goes to the landing page",
  "keyword": "Then "
});
formatter.match({
  "location": "AAStepdefinitionLogin.the_user_is_loggedin_the_application()"
});
formatter.result({
  "duration": 113434,
  "status": "passed"
});
formatter.match({
  "location": "AAStepdefinitionLogin.goes_to_the_landing_page()"
});
formatter.result({
  "duration": 47734,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Successful login into the adactin application with valid credential",
  "description": "",
  "id": "login-functionality-for-adactin-application;successful-login-into-the-adactin-application-with-valid-credential;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "user enter application url",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user enter \"Mahamilky\" as username",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user enter \"hari.9500\" as password",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user verify the username in the homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "AAStepdefinitionLogin.user_enter_application_url()"
});
formatter.result({
  "duration": 726291536,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mahamilky",
      "offset": 12
    }
  ],
  "location": "AAStepdefinitionLogin.user_enter_as_username(String)"
});
formatter.result({
  "duration": 170802877,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "hari.9500",
      "offset": 12
    }
  ],
  "location": "AAStepdefinitionLogin.user_enter_as_password(String)"
});
formatter.result({
  "duration": 141531432,
  "status": "passed"
});
formatter.match({
  "location": "AAStepdefinitionLogin.user_verify_the_username_in_the_homepage()"
});
formatter.result({
  "duration": 1359814113,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "the user is loggedin the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "goes to the landing page",
  "keyword": "Then "
});
formatter.match({
  "location": "AAStepdefinitionLogin.the_user_is_loggedin_the_application()"
});
formatter.result({
  "duration": 51327,
  "status": "passed"
});
formatter.match({
  "location": "AAStepdefinitionLogin.goes_to_the_landing_page()"
});
formatter.result({
  "duration": 29770,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Sucessfull SearchHotel into the adactin application",
  "description": "",
  "id": "login-functionality-for-adactin-application;sucessfull-searchhotel-into-the-adactin-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 22,
      "name": "@Hotelsearch"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "user enter location",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "user enter hotels",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user enter room",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user enter children",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "user verify the username in the searchpage",
  "keyword": "Then "
});
formatter.match({
  "location": "BBStepdefinitionHotelsearch.user_enter_location()"
});
formatter.result({
  "duration": 425604417,
  "status": "passed"
});
formatter.match({
  "location": "BBStepdefinitionHotelsearch.user_enter_hotels()"
});
formatter.result({
  "duration": 191678716,
  "status": "passed"
});
formatter.match({
  "location": "BBStepdefinitionHotelsearch.user_enter_room()"
});
formatter.result({
  "duration": 264460311,
  "status": "passed"
});
formatter.match({
  "location": "BBStepdefinitionHotelsearch.user_enter_children()"
});
formatter.result({
  "duration": 212290219,
  "status": "passed"
});
formatter.match({
  "location": "BBStepdefinitionHotelsearch.user_verify_the_username_in_the_searchpage()"
});
formatter.result({
  "duration": 2044203069,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "the user is loggedin the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "goes to the landing page",
  "keyword": "Then "
});
formatter.match({
  "location": "AAStepdefinitionLogin.the_user_is_loggedin_the_application()"
});
formatter.result({
  "duration": 43628,
  "status": "passed"
});
formatter.match({
  "location": "AAStepdefinitionLogin.goes_to_the_landing_page()"
});
formatter.result({
  "duration": 21045,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "Sucessfull SearchHotel into the adactin application",
  "description": "",
  "id": "login-functionality-for-adactin-application;sucessfull-searchhotel-into-the-adactin-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 30,
      "name": "@booking"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "user click continue",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "user click radio button",
  "keyword": "Then "
});
formatter.match({
  "location": "CCStepdefinitionbooking.user_click_continue()"
});
formatter.result({
  "duration": 168724122,
  "status": "passed"
});
formatter.match({
  "location": "CCStepdefinitionbooking.user_click_radio_button()"
});
formatter.result({
  "duration": 1721912291,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "the user is loggedin the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "goes to the landing page",
  "keyword": "Then "
});
formatter.match({
  "location": "AAStepdefinitionLogin.the_user_is_loggedin_the_application()"
});
formatter.result({
  "duration": 84177,
  "status": "passed"
});
formatter.match({
  "location": "AAStepdefinitionLogin.goes_to_the_landing_page()"
});
formatter.result({
  "duration": 32849,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "Sucessfull SearchHotel into the adactin application",
  "description": "",
  "id": "login-functionality-for-adactin-application;sucessfull-searchhotel-into-the-adactin-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 35,
      "name": "@payment"
    }
  ]
});
formatter.step({
  "line": 37,
  "name": "user enter firstname",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "user enter lastname",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user enter address",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user enter cardnumber",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "user enter carddetails",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "user enter expirymonth",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "user enter expiryyear",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "user enter ccv",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "user click booking button",
  "keyword": "Then "
});
formatter.match({
  "location": "DDStepdefinitionpayment.user_enter_firstname()"
});
formatter.result({
  "duration": 353677421,
  "status": "passed"
});
formatter.match({
  "location": "DDStepdefinitionpayment.user_enter_lastname()"
});
formatter.result({
  "duration": 133853895,
  "status": "passed"
});
formatter.match({
  "location": "DDStepdefinitionpayment.user_enter_address()"
});
formatter.result({
  "duration": 207068179,
  "status": "passed"
});
formatter.match({
  "location": "DDStepdefinitionpayment.user_enter_cardnumber()"
});
formatter.result({
  "duration": 253134943,
  "status": "passed"
});
formatter.match({
  "location": "DDStepdefinitionpayment.user_enter_carddetails()"
});
formatter.result({
  "duration": 235662105,
  "status": "passed"
});
formatter.match({
  "location": "DDStepdefinitionpayment.user_enter_expirymonth()"
});
formatter.result({
  "duration": 337965622,
  "status": "passed"
});
formatter.match({
  "location": "DDStepdefinitionpayment.user_enter_expiryyear()"
});
formatter.result({
  "duration": 181223345,
  "status": "passed"
});
formatter.match({
  "location": "DDStepdefinitionpayment.user_enter_ccv()"
});
formatter.result({
  "duration": 171706237,
  "status": "passed"
});
formatter.match({
  "location": "DDStepdefinitionpayment.user_click_booking_button()"
});
formatter.result({
  "duration": 180459081,
  "status": "passed"
});
});