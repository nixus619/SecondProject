Feature: ETL Load Job

	@Pass
  Scenario Outline: Adding a new customer
    Given an ETL Process job
    When a <customer> is added to ZCITY
    Then the <customer> will be added to the target database
    And the integrity between the two databases remain
 Examples:
 | customer |
 | "John"	|
 | "Tim" 	|
 | "Bill" |
 
 @Fail
 Scenario: Duplicate Entry
 Given a customer load file
 When a customer is added
 Then the data warehouse is checked for duplicates
 And the customer is added to the data warehouse
 
 @Fail
 Scenario: Data integrity
 Given an ETL Process job
 When a purchase is added to the source
 Then a change occurs in the target
 And an integrity check is made between the two databases