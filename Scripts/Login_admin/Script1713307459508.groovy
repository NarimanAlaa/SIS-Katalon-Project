import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('', FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://sis-test.itworxedu.net/SIS-TEST04/ZLMSWeb.html?login=1&locale=default', FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Login/Name_TextField'), findTestData('Test_Data').getValue(2, 2), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Login/Password_TextField'), findTestData('Test_Data').getValue(3, 2), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Login/Login_Button'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Login/Site_List'), 300, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Login/Site_List'), findTestData('Test_Data').getValue(4, 2), true, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Login/Login_Button'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Generic Objects/FilterExpander_Button'), 300, FailureHandling.STOP_ON_FAILURE)

