import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Day2/Login_Reuse'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/b_Leave'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/img_From_ui-datepicker-trigger'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_29'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/img_To_ui-datepicker-trigger'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_30'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input_Include Past Employees_btnSearch'))

WebUI.closeBrowser()

