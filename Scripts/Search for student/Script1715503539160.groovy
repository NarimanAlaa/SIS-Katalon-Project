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

WebUI.click(findTestObject('Generic Objects/Registration_Menu'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Generic Objects/Search_SubMenu'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Search Page/Student Number_TextField'), GlobalVariable.StudentNumber, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Search Page/student Name After saving in the table'), 0, FailureHandling.CONTINUE_ON_FAILURE)

String SearchResultStudentNumber = WebUI.getText(findTestObject('Search Page/Student Number After saving in the table'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(SearchResultStudentNumber, GlobalVariable.StudentNumber, false, FailureHandling.CONTINUE_ON_FAILURE)

String SearchResultStudentName = WebUI.getText(findTestObject('Search Page/student Name After saving in the table'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(SearchResultStudentName, GlobalVariable.StudentName, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Search Page/student Name After saving in the table'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Search Page/Student Details_Button(SubMenu)'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Student Details/Information/Information_Tab'), 0, FailureHandling.CONTINUE_ON_FAILURE)

String StudentNumberInformationTab = WebUI.getAttribute(findTestObject('Student Details/Information/Student Number_TextField'), 
    'value', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(StudentNumberInformationTab, GlobalVariable.StudentNumber, false, FailureHandling.CONTINUE_ON_FAILURE)

