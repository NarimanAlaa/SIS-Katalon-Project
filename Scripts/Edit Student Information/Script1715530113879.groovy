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

WebUI.callTestCase(findTestCase('Search for student'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Student Details/Information/Full Name__TextField'), findTestData('Test_Data').getValue(2, 
        18), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Student Details/Information/English Name__TextField'), findTestData('Test_Data').getValue(
        3, 18), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Student Identity_SubWindow/Country_List'), findTestData('Test_Data').getValue(
        4, 18), false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Student Identity_SubWindow/State_List'), findTestData('Test_Data').getValue(5, 
        18), false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Student Identity_SubWindow/City_List'), findTestData('Test_Data').getValue(6, 
        18), false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Student Identity_SubWindow/Region_List'), findTestData('Test_Data').getValue(7, 
        18), false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Student Details/Information/Addresses_TextField'), findTestData('Test_Data').getValue(8, 18), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Student Details/Information/PhonesEmails_List'), findTestData('Test_Data').getValue(
        9, 18), false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Student Details/Information/PhonesEmails_TextField'), findTestData('Test_Data').getValue(10, 
        18), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Student Details/Information/Add PhonesEmails_Button'), FailureHandling.CONTINUE_ON_FAILURE)

String expectedFullName = WebUI.getAttribute(findTestObject('Student Details/Information/Full Name__TextField'), 'value', 
    FailureHandling.CONTINUE_ON_FAILURE)

String expectedEnglishFullName = WebUI.getAttribute(findTestObject('Student Details/Information/English Name__TextField'), 
    'value', FailureHandling.CONTINUE_ON_FAILURE)

String expectedMobilePhone = WebUI.getAttribute(findTestObject('Student Details/Information/PhonesEmails value colomn_CellTextBox'), 
    'value', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Student Details/Information/Save_Button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Generic Objects/Student Details close(x)_Button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Generic Objects/Student Search close(x)_Button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Generic Objects/Registration_Menu'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Generic Objects/Search_SubMenu'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Search Page/Student Number_TextField'), GlobalVariable.StudentNumber, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Search Page/student Name After saving in the table'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Search Page/student Name After saving in the table'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Search Page/Student Details_Button(SubMenu)'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Student Details/Information/Information_Tab'), 0, FailureHandling.CONTINUE_ON_FAILURE)

String actualFullName = WebUI.getAttribute(findTestObject('Student Details/Information/Full Name__TextField'), 'value', 
    FailureHandling.CONTINUE_ON_FAILURE)

String actulaEnglishFullName = WebUI.getAttribute(findTestObject('Student Details/Information/English Name__TextField'), 
    'value', FailureHandling.CONTINUE_ON_FAILURE)

String actualMobilePhone = WebUI.getAttribute(findTestObject('Student Details/Information/PhonesEmails value colomn_CellTextBox'), 
    'value', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(actualFullName, expectedFullName, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(actulaEnglishFullName, expectedEnglishFullName, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(actualMobilePhone, expectedMobilePhone, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Generic Objects/Student Details close(x)_Button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Student Details/Information/No(Saving PopUp)_Button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Generic Objects/Student Search close(x)_Button'), FailureHandling.CONTINUE_ON_FAILURE)

