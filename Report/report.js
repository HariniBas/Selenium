$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Sample.feature");
formatter.feature({
  "name": "To validate the ICIC bank Login page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To validate Login Page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "To launch the chrome browser and maximize the window",
  "keyword": "Given "
});
formatter.match({
  "location": "IcicPage.to_launch_the_chrome_browser_and_maximize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To launch the url of the ICIC bank",
  "keyword": "When "
});
formatter.match({
  "location": "IcicPage.to_launch_the_url_of_the_ICIC_bank()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To check the page is working",
  "keyword": "And "
});
formatter.match({
  "location": "IcicPage.to_check_the_page_is_working()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "IcicPage.to_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});