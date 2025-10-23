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

WebUI.callTestCase(findTestCase('Login/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Invitation/Page_Gala Dinner MMS GROUP Indonesia - Admin Dashboard/span_Invitattion'))

WebUI.click(findTestObject('Invitation/Add New Invitation/Page_Gala Dinner MMS GROUP Indonesia - Admin Dashboard/button_AddNew-Invitation'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Invitation/Add New Invitation/Page_Gala Dinner MMS GROUP Indonesia - Admin Dashboard/input_NIK'), 
    '11223344556677889900')

WebUI.setText(findTestObject('Invitation/Add New Invitation/Page_Gala Dinner MMS GROUP Indonesia - Admin Dashboard/input_Full-Name'), 
    'John Mayer')

WebUI.setText(findTestObject('Invitation/Add New Invitation/Page_Gala Dinner MMS GROUP Indonesia - Admin Dashboard/input_email-address'), 
    'simangunsong.manto17584@gmail.com')

WebUI.selectOptionByLabel(findTestObject('Invitation/Add New Invitation/Page_Gala Dinner MMS GROUP Indonesia - Admin Dashboard/select_country_code'), 
    '(+62) Indonesia', false)

WebUI.setText(findTestObject('Invitation/Add New Invitation/Page_Gala Dinner MMS GROUP Indonesia - Admin Dashboard/input_WA-Number'), 
    '81287842107')

WebUI.setText(findTestObject('Invitation/Add New Invitation/Page_Gala Dinner MMS GROUP Indonesia - Admin Dashboard/input_Company'), 
    'PT. MAJU MUNDUR SEJAHTERA')

WebUI.setText(findTestObject('Invitation/Add New Invitation/Page_Gala Dinner MMS GROUP Indonesia - Admin Dashboard/input_Bus-No'), 
    'H')

WebUI.selectOptionByLabel(findTestObject('Invitation/Add New Invitation/Page_Gala Dinner MMS GROUP Indonesia - Admin Dashboard/select_type_user'), 
    'Internal', false)

WebUI.selectOptionByLabel(findTestObject('Invitation/Add New Invitation/Page_Gala Dinner MMS GROUP Indonesia - Admin Dashboard/select_Avaliable'), 
    'Not Avaliable', false)

WebUI.selectOptionByLabel(findTestObject('Invitation/Add New Invitation/Page_Gala Dinner MMS GROUP Indonesia - Admin Dashboard/select_Avaliable'), 
    'Not Avaliable', false)

WebUI.click(findTestObject('Invitation/Add New Invitation/Page_Gala Dinner MMS GROUP Indonesia - Admin Dashboard/button_Save-Invitation'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

