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

package uk.gov.hmrc.ui.pages
import org.openqa.selenium.By
import uk.gov.hmrc.ui.pages.BasePage

object HomePage extends BasePage {

  override def pageUrl: String = "http://localhost:20110/online-agent-authorisations-frontend/agent-authorisation"

  def pageUrlNoVendor: String = "http://localhost:20110/online-agent-authorisations-frontend/agent-authorisation"

  override def pageTitle: String =
    "Authorise a client - Online Agent Authorisation - GOV.UK"

  // Manage Authorisations

  val requestAuthorisation: By =
    By.id("request-authorisation")

  val unsubmittedRequests: By =
    By.id("unsubmitted-requests")

  val pendingRequests: By =
    By.id("pending-requests")

  // Your Account

  val changeDetails: By =
    By.id("change-details")

  val changePassword: By =
    By.id("change-password")

  val manageTeam: By =
    By.id("manage-team")

  val manageTeamAccess: By =
    By.id("manage-team-access")

  val removeServices: By =
    By.id("remove-services")

  // Help and Information

  val faqs: By =
    By.id("faqs")

  val vatForAgents: By =
    By.id("vat-for-agents")

  val giveFeedback: By =
    By.id("give-feedback")

  val legalChanges: By =
    By.id("legal-changes")

  // Other Services

  val yourHmrcServices: By =
    By.id("your-hmrc-services")

  val toolsAndCalculators: By =
    By.id("tools-and-calculators")

  def clickLink(link: By): Unit =
    driver.findElement(link).click()
}
