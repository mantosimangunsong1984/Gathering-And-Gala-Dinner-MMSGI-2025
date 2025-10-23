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

WebUI.click(findTestObject('Master Doorprize/Page_Gala Dinner MMS GROUP Indonesia - Admin Dashboard/span_Master-Doorprize'))

WebUI.click(findTestObject('Master Doorprize/Add New Doorprize/Page_Gala Dinner MMS GROUP Indonesia - Admin Dashboard/button_Add-New-Doorprize'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Master Doorprize/Add New Doorprize/Page_Gala Dinner MMS GROUP Indonesia - Admin Dashboard/input_Code'), 
    'MMS1')

WebUI.setText(findTestObject('Master Doorprize/Add New Doorprize/Page_Gala Dinner MMS GROUP Indonesia - Admin Dashboard/input_Doorprize_name'), 
    'Mac Book Pro')

WebUI.setText(findTestObject('Master Doorprize/Add New Doorprize/Page_Gala Dinner MMS GROUP Indonesia - Admin Dashboard/input_GroupDoorPrize'), 
    '1')

WebUI.selectOptionByLabel(findTestObject('Master Doorprize/Add New Doorprize/Page_Gala Dinner MMS GROUP Indonesia - Admin Dashboard/select_Doorprize-type'), 
    'Standard', false)

WebUI.selectOptionByLabel(findTestObject('Master Doorprize/Add New Doorprize/Page_Gala Dinner MMS GROUP Indonesia - Admin Dashboard/select_Status'), 
    'Active', false)

WebUI.click(findTestObject('Master Doorprize/Add New Doorprize/Page_Gala Dinner MMS GROUP Indonesia - Admin Dashboard/button_Save-Add-Doorprize'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

