$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/featureS/MyFirstSearchInGoogle.feature");
formatter.feature({
  "name": "Google search",
  "description": "  I want to search some in google",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Successful search in Google",
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
  "name": "Alejandro is on Google home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "GoogleSearchStepDefinition.alejandro_is_on_Google_home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he makes a search",
  "keyword": "When "
});
formatter.match({
  "location": "GoogleSearchStepDefinition.he_makes_a_search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he validates thath result is success",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleSearchStepDefinition.he_validates_thath_result_is_success()"
});
formatter.embedding("image/png", "embedded0.png");
formatter.result({
  "status": "passed"
});
});