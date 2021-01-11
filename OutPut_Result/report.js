$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/khosuzzaman/MyTest/AutomationSuitOfIndex/src/main/java/com/feature/component1.feature");
formatter.feature({
  "line": 1,
  "name": "As a user i am able to see and find the major functions of the TOP part on Index Home",
  "description": "",
  "id": "as-a-user-i-am-able-to-see-and-find-the-major-functions-of-the-top-part-on-index-home",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Major functionality search from Component_1",
  "description": "",
  "id": "as-a-user-i-am-able-to-see-and-find-the-major-functions-of-the-top-part-on-index-home;major-functionality-search-from-component-1",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I am on HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I clear the set title Box",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I write a message or can put any value \"\u003cnewValue\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I click on Set Title Button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I am able to see Entered value displayed on RIGHT side of the title TAG",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I can close the browser.",
  "keyword": "And "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "as-a-user-i-am-able-to-see-and-find-the-major-functions-of-the-top-part-on-index-home;major-functionality-search-from-component-1;",
  "rows": [
    {
      "cells": [
        "newValue"
      ],
      "line": 13,
      "id": "as-a-user-i-am-able-to-see-and-find-the-major-functions-of-the-top-part-on-index-home;major-functionality-search-from-component-1;;1"
    },
    {
      "cells": [
        "I Love This Title"
      ],
      "line": 14,
      "id": "as-a-user-i-am-able-to-see-and-find-the-major-functions-of-the-top-part-on-index-home;major-functionality-search-from-component-1;;2"
    },
    {
      "cells": [
        "I Have This Title"
      ],
      "line": 15,
      "id": "as-a-user-i-am-able-to-see-and-find-the-major-functions-of-the-top-part-on-index-home;major-functionality-search-from-component-1;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "Major functionality search from Component_1",
  "description": "",
  "id": "as-a-user-i-am-able-to-see-and-find-the-major-functions-of-the-top-part-on-index-home;major-functionality-search-from-component-1;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I am on HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I clear the set title Box",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I write a message or can put any value \"I Love This Title\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I click on Set Title Button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I am able to see Entered value displayed on RIGHT side of the title TAG",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I can close the browser.",
  "keyword": "And "
});
formatter.match({
  "location": "Component1.i_am_on_Index_Home()"
});
formatter.result({
  "duration": 290353446,
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.WebDriver.getTitle()\" because \"com.stepDefinitions.Component1.driver\" is null\n\tat com.stepDefinitions.Component1.i_am_on_Index_Home(Component1.java:40)\n\tat ✽.Given I am on HomePage(/Users/khosuzzaman/MyTest/AutomationSuitOfIndex/src/main/java/com/feature/component1.feature:5)\n",
  "status": "failed"
});
formatter.match({
  "location": "Component1.i_clear_the_set_title_Box()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "I Love This Title",
      "offset": 40
    }
  ],
  "location": "Component1.i_write_a_message_or_can_put_any_value(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Component1.i_click_on_SEt_Title_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Component1.i_am_able_to_see_Entered_value_displayed_on_RIGHT_side_of_the_title_TAG()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Component1.i_can_close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 15,
  "name": "Major functionality search from Component_1",
  "description": "",
  "id": "as-a-user-i-am-able-to-see-and-find-the-major-functions-of-the-top-part-on-index-home;major-functionality-search-from-component-1;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I am on HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I clear the set title Box",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I write a message or can put any value \"I Have This Title\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I click on Set Title Button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I am able to see Entered value displayed on RIGHT side of the title TAG",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I can close the browser.",
  "keyword": "And "
});
formatter.match({
  "location": "Component1.i_am_on_Index_Home()"
});
formatter.result({
  "duration": 3556952,
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.WebDriver.getTitle()\" because \"com.stepDefinitions.Component1.driver\" is null\n\tat com.stepDefinitions.Component1.i_am_on_Index_Home(Component1.java:40)\n\tat ✽.Given I am on HomePage(/Users/khosuzzaman/MyTest/AutomationSuitOfIndex/src/main/java/com/feature/component1.feature:5)\n",
  "status": "failed"
});
formatter.match({
  "location": "Component1.i_clear_the_set_title_Box()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "I Have This Title",
      "offset": 40
    }
  ],
  "location": "Component1.i_write_a_message_or_can_put_any_value(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Component1.i_click_on_SEt_Title_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Component1.i_am_able_to_see_Entered_value_displayed_on_RIGHT_side_of_the_title_TAG()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Component1.i_can_close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});