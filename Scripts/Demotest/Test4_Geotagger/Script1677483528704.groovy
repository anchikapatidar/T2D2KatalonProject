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

WebUI.navigateToUrl('https://develop-v2.t2d2.ai/projects/1/tools/geotagger?drawingId=421')

WebUI.click(findTestObject('Page_Geotagger/i_Reset Selection_pi pi-upload icon trash-icon'))

WebUI.sendKeys(findTestObject('Page_Geotagger/img_Upload geotag csv_m-auto'), 'C:\\Users\\Inheritx\\Documents\\T2D2\\geotag.csv')

WebUI.verifyElementPresent(findTestObject('Page_Geotagger/csv_selected'), 5)

WebUI.click(findTestObject('Page_Geotagger/button_Upload'))

WebUI.waitForElementVisible(findTestObject('Page_Geotagger/span_Geotags are uploaded successfully'), 5)

WebUI.verifyElementVisible(findTestObject('Page_Geotagger/span_Geotags are uploaded successfully'))

