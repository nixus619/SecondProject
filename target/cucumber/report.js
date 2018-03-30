$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("feature/Outline.feature");
formatter.feature({
  "name": "ETL Load Job",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Adding a new customer",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Pass"
    }
  ]
});
formatter.step({
  "name": "an ETL Process job",
  "keyword": "Given "
});
formatter.step({
  "name": "a \u003ccustomer\u003e is added to ZCITY",
  "keyword": "When "
});
formatter.step({
  "name": "the \u003ccustomer\u003e will be added to the target database",
  "keyword": "Then "
});
formatter.step({
  "name": "the integrity between the two databases remain",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "customer"
      ]
    },
    {
      "cells": [
        "\"John\""
      ]
    },
    {
      "cells": [
        "\"Tim\""
      ]
    },
    {
      "cells": [
        "\"Bill\""
      ]
    }
  ]
});
formatter.scenario({
  "name": "Adding a new customer",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Pass"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "an ETL Process job",
  "keyword": "Given "
});
formatter.match({
  "location": "Definition.loadETLFile()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a \"John\" is added to ZCITY",
  "keyword": "When "
});
formatter.match({
  "location": "Definition.addCustomer_ZCITY(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the \"John\" will be added to the target database",
  "keyword": "Then "
});
formatter.match({
  "location": "Definition.addToTarget(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the integrity between the two databases remain",
  "keyword": "And "
});
formatter.match({
  "location": "Definition.integrityCheck()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Adding a new customer",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Pass"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "an ETL Process job",
  "keyword": "Given "
});
formatter.match({
  "location": "Definition.loadETLFile()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a \"Tim\" is added to ZCITY",
  "keyword": "When "
});
formatter.match({
  "location": "Definition.addCustomer_ZCITY(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the \"Tim\" will be added to the target database",
  "keyword": "Then "
});
formatter.match({
  "location": "Definition.addToTarget(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the integrity between the two databases remain",
  "keyword": "And "
});
formatter.match({
  "location": "Definition.integrityCheck()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Adding a new customer",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Pass"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "an ETL Process job",
  "keyword": "Given "
});
formatter.match({
  "location": "Definition.loadETLFile()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a \"Bill\" is added to ZCITY",
  "keyword": "When "
});
formatter.match({
  "location": "Definition.addCustomer_ZCITY(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the \"Bill\" will be added to the target database",
  "keyword": "Then "
});
formatter.match({
  "location": "Definition.addToTarget(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the integrity between the two databases remain",
  "keyword": "And "
});
formatter.match({
  "location": "Definition.integrityCheck()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Duplicate Entry",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Fail"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "a customer load file",
  "keyword": "Given "
});
formatter.match({
  "location": "Definition.load()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a customer is added",
  "keyword": "When "
});
formatter.match({
  "location": "Definition.addCustomer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the data warehouse is checked for duplicates",
  "keyword": "Then "
});
formatter.match({
  "location": "Definition.checkDuplicates()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the customer is added to the data warehouse",
  "keyword": "And "
});
formatter.match({
  "location": "Definition.addCustometerDW()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat stepDefinition.Definition.addCustometerDW(Definition.java:157)\r\n\tat ✽.the customer is added to the data warehouse(feature/Outline.feature:20)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Data integrity",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Fail"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "an ETL Process job",
  "keyword": "Given "
});
formatter.match({
  "location": "Definition.loadETLFile()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a purchase is added to the source",
  "keyword": "When "
});
formatter.match({
  "location": "Definition.addPurchase()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a change occurs in the target",
  "keyword": "Then "
});
formatter.match({
  "location": "Definition.addTarget()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an integrity check is made between the two databases",
  "keyword": "And "
});
formatter.match({
  "location": "Definition.checkIntegrity()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat stepDefinition.Definition.checkIntegrity(Definition.java:207)\r\n\tat ✽.an integrity check is made between the two databases(feature/Outline.feature:27)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});