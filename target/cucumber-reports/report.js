$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/feature/UserJourney.feature");
formatter.feature({
  "name": "Login feature",
  "description": "  I want to verify login ",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Validate user flow of  onboarding screen",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am in Welcome screen of Betway",
  "keyword": "Given "
});
formatter.match({
  "location": "UserJourney_Step.i_am_in_Welcome_screen_of_Betway()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on forgot password",
  "keyword": "When "
});
formatter.match({
  "location": "UserJourney_Step.i_click_on_forgot_password()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});