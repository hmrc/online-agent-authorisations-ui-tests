/*
 * Copyright 2025 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.hmrc.ui.specs

import org.openqa.selenium.By
import org.scalatest.featurespec.AnyFeatureSpec
import org.scalatest.verbs.ShouldVerb
import org.scalatest.{BeforeAndAfterAll, BeforeAndAfterEach, GivenWhenThen}
import uk.gov.hmrc.selenium.webdriver.{Browser, ScreenshotOnFailure}
import uk.gov.hmrc.ui.pages.*
import uk.gov.hmrc.ui.util.Users.LoginTypes.HASDIRECT
import uk.gov.hmrc.ui.util.Users.UserTypes.Agent
import uk.gov.hmrc.ui.tags.*
import uk.gov.hmrc.selenium.webdriver.Driver.instance

class e2eSpec
    extends AnyFeatureSpec
    with BaseSpec
    with GivenWhenThen
    with ShouldVerb
    with BeforeAndAfterAll
    with BeforeAndAfterEach
    with Browser
    with ScreenshotOnFailure {

  Feature("OAA End to End Journeys") {

    Scenario(
      "Agent can access the authorise a client page",
      e2eJourney
    ) {

      Given("the user is logged in through the AuthWizard page")
      AuthWizard.login(HASDIRECT, Agent)

      Then("the OAA page is shown")
      HomePage.verifyPageTitle(HomePage.pageTitle)
    }
  }
  /*
  Scenario(
    "Agent can request an authorisation",
    e2eJourney
  ) {

    Given("the user is logged in through the AuthWizard page")
    AuthWizard.login(HASDIRECT, Agent)

    When("the user selects Request an authorisation")
    HomePage.clickLink(HomePage.requestAuthorisation)

    Then("the Request an authorisation page is shown")
    RequestAuthorisationPage.verifyPageTitle(
      RequestAuthorisationPage.pageTitle
    )
  }

  Scenario(
    "Agent can view unsubmitted requests",
    e2eJourney
  ) {

    Given("the user is logged in through the AuthWizard page")
    AuthWizard.login(HASDIRECT, Agent)

    When("the user selects Unsubmitted requests")
    HomePage.clickLink(HomePage.unsubmittedRequests)

    Then("the Unsubmitted requests page is shown")
    UnsubmittedRequestsPage.verifyPageTitle(
      UnsubmittedRequestsPage.pageTitle
    )
  }

  Scenario(
    "Agent can view requests waiting for an authorisation code",
    e2eJourney
  ) {

    Given("the user is logged in through the AuthWizard page")
    AuthWizard.login(HASDIRECT, Agent)

    When("the user selects Waiting for an authorisation code")
    HomePage.clickLink(HomePage.pendingRequests)

    Then("the Pending requests page is shown")
    PendingRequestsPage.verifyPageTitle(
      PendingRequestsPage.pageTitle
    )
  }

  Scenario(
    "Agent can change their details",
    e2eJourney
  ) {

    Given("the user is logged in through the AuthWizard page")
    AuthWizard.login(HASDIRECT, Agent)

    When("the user selects Change your details")
    HomePage.clickLink(HomePage.changeDetails)

    Then("the Change your details page is shown")
    ChangeYourDetailsPage.verifyPageTitle(
      ChangeYourDetailsPage.pageTitle
    )
  }

  Scenario(
    "Agent can change their password",
    e2eJourney
  ) {

    Given("the user is logged in through the AuthWizard page")
    AuthWizard.login(HASDIRECT, Agent)

    When("the user selects Change your password")
    HomePage.clickLink(HomePage.changePassword)

    Then("the Change your password page is shown")
    ChangeYourPasswordPage.verifyPageTitle(
      ChangeYourPasswordPage.pageTitle
    )
  }

  Scenario(
    "Manage your team is shown",
    e2eJourney
  ) {

    Given("the user is on the Authorise a client page")
    AuthWizard.login(HASDIRECT, Agent)

    When("the user selects Manage your team")
    HomePage.clickLink(HomePage.manageTeam)

    Then("the Manage your team page is shown")
    ManageYourTeamPage.verifyPageTitle(
      HomePage.pageTitle
    )
  }

  Scenario(
    "Manage your team's access link is shown",
    e2eJourney
  ) {

    Given("the user is on the Authorise a client page")
    AuthWizard.login(HASDIRECT, Agent)

    When("the user selected Manage your team's access")
    HomePage.clickLink(HomePage.manageTeamAccess)

    Then("the Manage your team's access page is shown")
    ManageTeamAccessPage.verifyPageTitle(
      ManageTeamAccessPage.pageTitle
    )
  }
   */
}
