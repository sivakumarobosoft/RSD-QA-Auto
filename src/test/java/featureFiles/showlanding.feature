#1)Scroll up & down
#2)Navigate to different categories inside shows landing (All, Home & Design)
#3) Tap on any card on the shows landing page (In All)
#4) Shows details page will open
#5) Scroll up & down in shows details page
#6) Tap on Add to list
#7) Tap on Like
#8) Tap on Resume button
#9) Tap on season selector dropdown
#10) New page will open . Close the page
#11) Tap on About the Show > See More
#12) Scroll down to the talent page
#Meet the Storytellers
@tag
Feature: showlanding page
  Verifying functionlities of showlanding page

  @tag1
  Scenario: Functional features of showlanding page
    Given user is on show landing page 
    And click on shows button
    When user scroll up & down
    And navigate to All
    And navigate to Home & Design
    And navigate to Food
    And navigate to Family
    And navigate to Farm & Garden
    And navigate to Gathering
    Then click on Treat Yourself with Skyler
    #Then tap Add to List
    #And click on Like
    #Then click Resume
    #Then press backbutton
    #Then click Season selectordropdown
    #And Click on X symbol
    And click scrolldown and click seemore
    #Then scrolldown and click more of storyteller

  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
