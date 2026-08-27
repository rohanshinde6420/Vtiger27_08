Feature: Lead creation functionality

  @LeadCreation
  Scenario: Create_lead_with_mandatory_fields_TC03
    Given user is on login page
    When user enters valid credentials and click on login
    When user click on new lead link
    And user enters lastname and company and click on save button
    Then lead should be created successfully