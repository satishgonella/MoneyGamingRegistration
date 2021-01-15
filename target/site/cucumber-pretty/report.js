$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/UserRegistration.feature");
formatter.feature({
  "name": "Validate the user registration",
  "description": "  As a new moneygaming.com player\n  I want to be able to register using my full details\n  So that I can play online casino games",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@RegisterUser"
    }
  ]
});
formatter.scenarioOutline({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am on a Money Gaming Landing Page",
  "keyword": "Given "
});
formatter.step({
  "name": "I clicked on JOIN NOW button",
  "keyword": "When "
});
formatter.step({
  "name": "I enter the following details \"\u003cTitle\u003e\", \"\u003cFirstName\u003e\", \"\u003cSurname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I select the checkbox and click on JoinNow button",
  "keyword": "And "
});
formatter.step({
  "name": "verify field level error message is displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Title",
        "FirstName",
        "Surname"
      ]
    },
    {
      "cells": [
        "Mr",
        "Jagadish",
        "Rajanala"
      ]
    }
  ]
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@RegisterUser"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on a Money Gaming Landing Page",
  "keyword": "Given "
});
formatter.match({
  "location": "RegistrationStepDefination.i_am_on_a_Money_Gaming_Landing_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I clicked on JOIN NOW button",
  "keyword": "When "
});
formatter.match({
  "location": "RegistrationStepDefination.i_clicked_on_JOIN_NOW_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the following details \"Mr\", \"Jagadish\", \"Rajanala\"",
  "keyword": "And "
});
formatter.match({
  "location": "RegistrationStepDefination.iEnterTheFollowingDetails(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select the checkbox and click on JoinNow button",
  "keyword": "And "
});
formatter.match({
  "location": "RegistrationStepDefination.i_select_the_checkbox_and_click_on_JoinNow_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify field level error message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationStepDefination.verify_field_level_error_message_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});