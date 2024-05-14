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

WebUI.click(findTestObject('Student Details/Family/Family_Tab'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Student Details/Information/No(Saving PopUp)_Button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Student Details/Family/AddFamilyLink_Buttton'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Student Details/Family/1AddFamily/Add Family_Label'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Student Details/Family/1AddFamily/SubType_List'), findTestData('Test_Data').getValue(
        2, 10), false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Student Details/Family/1AddFamily/Responsible_CheckBox'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Student Details/Family/1AddFamily/SearchPerson_Button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Student Details/Family/2Person Search_SubWindow/Person Search_Label'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Student Details/Family/2Person Search_SubWindow/Create Person Without ID Card_Button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Student Details/Family/3Person Identity_SubWindow/Person Identity_Label'), 0, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Student Details/Family/3Person Identity_SubWindow/Person Type_List'), findTestData(
        'Test_Data').getValue(3, 10), false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Student Details/Family/3Person Identity_SubWindow/First Name_TextField'), findTestData('Test_Data').getValue(
        4, 10), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Student Details/Family/3Person Identity_SubWindow/Family Name_TextField'), findTestData('Test_Data').getValue(
        5, 10), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Student Details/Family/3Person Identity_SubWindow/English First Name__TextField'), findTestData(
        'Test_Data').getValue(6, 10), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Student Details/Family/3Person Identity_SubWindow/English Family Name__TextField'), findTestData(
        'Test_Data').getValue(7, 10), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Student Details/Family/3Person Identity_SubWindow/Birth Date_DatePicker'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Student Details/Family/3Person Identity_SubWindow/Years_List'), findTestData('Test_Data').getValue(
        8, 10), false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Student Details/Family/3Person Identity_SubWindow/Months_List'), findTestData(
        'Test_Data').getValue(9, 10), false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Student Identity_SubWindow/0Static Objects/8-3-1980'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Student Details/Family/3Person Identity_SubWindow/Gender_List'), findTestData(
        'Test_Data').getValue(10, 10), false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Student Details/Family/3Person Identity_SubWindow/Nationality_List'), findTestData(
        'Test_Data').getValue(11, 10), false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Student Details/Family/3Person Identity_SubWindow/Religion_List'), findTestData(
        'Test_Data').getValue(12, 10), false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Student Details/Family/3Person Identity_SubWindow/BirthCountry_List'), findTestData(
        'Test_Data').getValue(13, 10), false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Student Details/Family/3Person Identity_SubWindow/Save(Person Identity)_Buttton'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Generic Objects/Save Anyway_Button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Student Details/Family/2Person Search_SubWindow/Full Name first row(person search)'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Student Details/Family/2Person Search_SubWindow/Save(person Search)_Button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Student Details/Family/1AddFamily/Save(Add Family)_Button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Generic Objects/Student Details close(x)_Button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Student Details/Information/No(Saving PopUp)_Button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Generic Objects/Student Search close(x)_Button'), FailureHandling.CONTINUE_ON_FAILURE)

