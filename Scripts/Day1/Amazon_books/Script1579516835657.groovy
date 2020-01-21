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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.amazon.in/')

WebUI.click(findTestObject('Object Repository/Page_Online Shopping site in India Shop Online for Mobiles Books Watches Shoes and More - Amazonin/i_Skip to main content_hm-icon nav-sprite'))

WebUI.click(findTestObject('Object Repository/Page_Online Shopping site in India Shop Online for Mobiles Books Watches Shoes and More - Amazonin/div_Books  Audible'))

WebUI.click(findTestObject('Object Repository/Page_Online Shopping site in India Shop Online for Mobiles Books Watches Shoes and More - Amazonin/div_All Books'))

WebUI.click(findTestObject('Object Repository/Page_Book Store Online  Buy Books Online at Best Prices in India  Books Shopping  Amazonin/img'))

WebUI.closeBrowser()

