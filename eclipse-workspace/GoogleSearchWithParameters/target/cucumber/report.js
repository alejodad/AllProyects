$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/feature/SearchInGoogle.feature");
formatter.feature({
  "name": "Search in google with data feature",
  "description": "  Alejandro wants makes a search in google with parameters",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Search in Google",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "he is in Google home page",
  "keyword": "Given "
});
formatter.step({
  "name": "he search \u003cword\u003e in google",
  "keyword": "When "
});
formatter.step({
  "name": "he verifies thath \u003cword\u003e results be in search",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "word"
      ]
    },
    {
      "cells": [
        "swithc"
      ]
    },
    {
      "cells": [
        "chopos"
      ]
    },
    {
      "cells": [
        "sdfsdlfkjerlkjlsd"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Search in Google",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "he is in Google home page",
  "keyword": "Given "
});
formatter.match({
  "location": "GoogleSearchWithDataStepDefinitions.heIsInGoogleHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he search swithc in google",
  "keyword": "When "
});
formatter.match({
  "location": "GoogleSearchWithDataStepDefinitions.heSearchInGoogle(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he verifies thath swithc results be in search",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleSearchWithDataStepDefinitions.heVerifiesThathResultsBeInSearch(String)"
});
formatter.embedding("image/png", "embedded0.png");
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search in Google",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "he is in Google home page",
  "keyword": "Given "
});
formatter.match({
  "location": "GoogleSearchWithDataStepDefinitions.heIsInGoogleHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he search chopos in google",
  "keyword": "When "
});
formatter.match({
  "location": "GoogleSearchWithDataStepDefinitions.heSearchInGoogle(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he verifies thath chopos results be in search",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleSearchWithDataStepDefinitions.heVerifiesThathResultsBeInSearch(String)"
});
formatter.embedding("image/png", "embedded1.png");
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search in Google",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "he is in Google home page",
  "keyword": "Given "
});
formatter.match({
  "location": "GoogleSearchWithDataStepDefinitions.heIsInGoogleHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he search sdfsdlfkjerlkjlsd in google",
  "keyword": "When "
});
formatter.match({
  "location": "GoogleSearchWithDataStepDefinitions.heSearchInGoogle(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he verifies thath sdfsdlfkjerlkjlsd results be in search",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleSearchWithDataStepDefinitions.heVerifiesThathResultsBeInSearch(String)"
});
formatter.embedding("image/png", "embedded2.png");
formatter.result({
  "status": "passed"
});
});