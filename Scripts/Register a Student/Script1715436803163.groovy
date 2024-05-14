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

WebUI.click(findTestObject('Search Page/Create Student Without ID Card_Button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Student Identity_SubWindow/Student Identity_Label'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Student Identity_SubWindow/First Name_TextField'), findTestData('Test_Data').getValue(2, 6), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Student Identity_SubWindow/Second Name_TextField'), findTestData('Test_Data').getValue(3, 
        6), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Student Identity_SubWindow/Third Name_TextField'), findTestData('Test_Data').getValue(4, 6), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Student Identity_SubWindow/Fourth Name_TextField'), findTestData('Test_Data').getValue(5, 
        6), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Student Identity_SubWindow/Family Name_TextField'), findTestData('Test_Data').getValue(6, 
        6), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Student Identity_SubWindow/English First Name_TextField'), findTestData('Test_Data').getValue(
        7, 6), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Student Identity_SubWindow/English Second Name_TextField'), findTestData('Test_Data').getValue(
        8, 6), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Student Identity_SubWindow/English Third Name_TextField'), findTestData('Test_Data').getValue(
        9, 6), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Student Identity_SubWindow/English Fourth Name_TextField'), findTestData('Test_Data').getValue(
        10, 6), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Student Identity_SubWindow/English Family Name_TextField'), findTestData('Test_Data').getValue(
        11, 6), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Student Identity_SubWindow/0Static Objects/blankplace'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Student Identity_SubWindow/Birth Date_Date Picker'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Student Identity_SubWindow/Years_List'), findTestData('Test_Data').getValue(12, 
        6), false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Student Identity_SubWindow/Months_List'), findTestData('Test_Data').getValue(13, 
        6), false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Student Identity_SubWindow/0Static Objects/8-3-2008'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Student Identity_SubWindow/Birth Country_List'), findTestData('Test_Data').getValue(
        14, 6), false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Student Identity_SubWindow/Gender_List'), findTestData('Test_Data').getValue(15, 
        6), false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Student Identity_SubWindow/Religion_List'), findTestData('Test_Data').getValue(
        16, 6), false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Student Identity_SubWindow/Nationality_List'), findTestData('Test_Data').getValue(
        17, 6), false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Student Identity_SubWindow/Nationality Category_List'), findTestData('Test_Data').getValue(
        18, 6), false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Student Identity_SubWindow/Country_List'), findTestData('Test_Data').getValue(
        19, 6), false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Student Identity_SubWindow/State_List'), findTestData('Test_Data').getValue(20, 
        6), false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Student Identity_SubWindow/City_List'), findTestData('Test_Data').getValue(21, 
        6), false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Student Identity_SubWindow/Region_List'), findTestData('Test_Data').getValue(22, 
        6), false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Student Identity_SubWindow/Type_List'), findTestData('Test_Data').getValue(23, 
        6), false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Student Identity_SubWindow/Value_TextField'), findTestData('Test_Data').getValue(24, 6), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Student Identity_SubWindow/Issue Place_TextField'), findTestData('Test_Data').getValue(25, 
        6), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Student Identity_SubWindow/Issue Date_Date Picker'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Generic Objects/CurrentDayLocatorr'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Student Identity_SubWindow/Add other Ids_Button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Student Identity_SubWindow/Type_List'), findTestData('Test_Data').getValue(26, 
        6), false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Student Identity_SubWindow/Value_TextField'), findTestData('Test_Data').getValue(24, 6), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Student Identity_SubWindow/Issue Place_TextField'), findTestData('Test_Data').getValue(25, 
        6), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Student Identity_SubWindow/Issue Date_Date Picker'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Generic Objects/CurrentDayLocatorr'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Student Identity_SubWindow/Add other Ids_Button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Student Identity_SubWindow/School_TextField'), findTestData('Test_Data').getValue(27, 6), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Student Identity_SubWindow/innerListSchool_List'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Student Identity_SubWindow/0Static Objects/Al-Rashedia Boys School - Cycle 3_Label'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Student Identity_SubWindow/Entry Type_List'), findTestData('Test_Data').getValue(
        28, 6), false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Student Identity_SubWindow/Grade_List'), findTestData('Test_Data').getValue(29, 
        6), false, FailureHandling.CONTINUE_ON_FAILURE)

String expectedFullName = WebUI.getAttribute(findTestObject('Student Identity_SubWindow/Full Name_TextField'), 'value', 
    FailureHandling.CONTINUE_ON_FAILURE)

String expectedEnglishName = WebUI.getAttribute(findTestObject('Student Identity_SubWindow/English Full Name_TextField'), 
    'value', FailureHandling.CONTINUE_ON_FAILURE)

String expectedBirthCountry = WebUI.getAttribute(findTestObject('Student Identity_SubWindow/Birth Country_List'), 'value', 
    FailureHandling.CONTINUE_ON_FAILURE)

String expectedBirthDate = WebUI.getAttribute(findTestObject('Student Identity_SubWindow/Birth Date_Date Picker'), 'value', 
    FailureHandling.CONTINUE_ON_FAILURE)

String expectedGender = WebUI.getAttribute(findTestObject('Student Details/Information/Gender_List'), 'value', FailureHandling.CONTINUE_ON_FAILURE)

String expectedNationality = WebUI.getAttribute(findTestObject('Student Identity_SubWindow/Nationality_List'), 'value', 
    FailureHandling.CONTINUE_ON_FAILURE)

String expectedNationalityCategory = WebUI.getAttribute(findTestObject('Student Identity_SubWindow/Nationality Category_List'), 
    'value', FailureHandling.CONTINUE_ON_FAILURE)

String expectedReligion = WebUI.getAttribute(findTestObject('Student Identity_SubWindow/Religion_List'), 'value', FailureHandling.CONTINUE_ON_FAILURE)

String expectedSchool = WebUI.getAttribute(findTestObject('Student Identity_SubWindow/School_TextField'), 'value', FailureHandling.CONTINUE_ON_FAILURE)

String expectedEntryType = WebUI.getAttribute(findTestObject('Student Identity_SubWindow/Entry Type_List'), 'value', FailureHandling.CONTINUE_ON_FAILURE)

String expectedGrade = WebUI.getAttribute(findTestObject('Student Identity_SubWindow/Grade_List'), 'value', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Student Identity_SubWindow/Save_Button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Generic Objects/Save Anyway_Button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Enrollment Exceptions_SubWindow/Yes_Buton'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Enrollment Exceptions_SubWindow/Enrollment Exceptions_Label'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.uploadFile(findTestObject('Enrollment Exceptions_SubWindow/Upload Attachment1_Button'), 'C:\\Users\\Lenovo\\Desktop\\i1.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Enrollment Exceptions_SubWindow/Download Attachment1_Button'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.uploadFile(findTestObject('Enrollment Exceptions_SubWindow/Upload Attachment2_Button'), 'C:\\Users\\Lenovo\\Desktop\\i2.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Enrollment Exceptions_SubWindow/Download Attachment2_Button'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Enrollment Exceptions_SubWindow/Save_Button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Search Page/student Name After saving in the table'), 0, FailureHandling.CONTINUE_ON_FAILURE)

String studentName = WebUI.getText(findTestObject('Search Page/student Name After saving in the table'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(studentName, expectedEnglishName, false, FailureHandling.CONTINUE_ON_FAILURE)

GlobalVariable.StudentName = WebUI.getText(findTestObject('Search Page/student Name After saving in the table'), FailureHandling.CONTINUE_ON_FAILURE)

GlobalVariable.StudentNumber = WebUI.getText(findTestObject('Search Page/Student Number After saving in the table'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Search Page/student Name After saving in the table'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Search Page/Student Details_Button(SubMenu)'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Student Details/Information/Information_Tab'), 0, FailureHandling.CONTINUE_ON_FAILURE)

String actualFullName = WebUI.getAttribute(findTestObject('Student Details/Information/Full Name__TextField'), 'value', 
    FailureHandling.CONTINUE_ON_FAILURE)

String actualEnglishName = WebUI.getAttribute(findTestObject('Student Details/Information/English Name__TextField'), 'value', 
    FailureHandling.CONTINUE_ON_FAILURE)

String actualBirthCountry = WebUI.getAttribute(findTestObject('Student Details/Information/Birth Country_List'), 'value', 
    FailureHandling.CONTINUE_ON_FAILURE)

String actualBirthDate = WebUI.getAttribute(findTestObject('Student Details/Information/Birth Date_Date Picker'), 'value', 
    FailureHandling.CONTINUE_ON_FAILURE)

String actualGender = WebUI.getAttribute(findTestObject('Student Details/Information/Gender_List'), 'value', FailureHandling.CONTINUE_ON_FAILURE)

String actualNationality = WebUI.getAttribute(findTestObject('Student Details/Information/Nationality_List'), 'value', FailureHandling.CONTINUE_ON_FAILURE)

String actualNationalityCategory = WebUI.getAttribute(findTestObject('Student Details/Information/Nationality Category_List'), 
    'value', FailureHandling.CONTINUE_ON_FAILURE)

String actualReligion = WebUI.getAttribute(findTestObject('Student Details/Information/Religion_List'), 'value', FailureHandling.CONTINUE_ON_FAILURE)

String actualSchool = WebUI.getAttribute(findTestObject('Student Details/Information/School_TextField'), 'value', FailureHandling.CONTINUE_ON_FAILURE)

String actualEntryType = WebUI.getAttribute(findTestObject('Student Details/Information/Entry Type_List'), 'value', FailureHandling.CONTINUE_ON_FAILURE)

String actualGrade = WebUI.getAttribute(findTestObject('Student Details/Information/Grade_List'), 'value', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(actualFullName, expectedFullName, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(actualEnglishName, expectedEnglishName, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(actualBirthCountry, expectedBirthCountry, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(actualBirthDate, expectedBirthDate, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(actualGender, expectedGender, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(actualNationality, expectedNationality, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(actualNationalityCategory, expectedNationalityCategory, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(actualReligion, expectedReligion, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(actualSchool, expectedSchool, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(actualEntryType, expectedEntryType, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(actualGrade, expectedGrade, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Generic Objects/Student Details close(x)_Button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Student Details/Information/No(Saving PopUp)_Button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Generic Objects/Student Search close(x)_Button'), FailureHandling.CONTINUE_ON_FAILURE)

