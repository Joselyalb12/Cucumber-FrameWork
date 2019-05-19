$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Josel/Desktop/Automation Documents/CucumberBDDFrameWork/src/main/java/Feature/login.feature");
formatter.feature({
  "name": "Ebay login Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Ebay Login Test Scenario",
  "description": "Given: User is already in login page\nWhen: title of the login page is Ebay\nThen: user enters username and password \nThen: user clicks on login button\nThen: User is on homepage",
  "keyword": "Scenario"
});
});