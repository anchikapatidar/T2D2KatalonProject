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

WebUI.setText(findTestObject('Page_Images/pro_loc'), GlobalVariable.pr)

CustomKeywords.'newPackage.general.refreshBrowser'()

WebUI.navigateToUrl('https://develop-v2.t2d2.ai/projects/1/imagery/explorer?id=16124&image_type=1&asset_type=image&parent_id=-1&parent_name=Non-Geotagged&is_next=0&is_nested=true&limit=100')

WebUI.click(findTestObject('Page_Images/rextangleShape'))

WebUI.clickOffset(findTestObject('Page_Images/image'), 5, -5)

WebUI.dragAndDropByOffset(findTestObject('Page_Images/image'), 10, -10)

WebUI.click(findTestObject('Page_Images/Done_btn'))

WebUI.click(findTestObject('Page_Images/selectLabel'))

WebUI.click(findTestObject('Page_Images/BioGrowth_Label'))

WebUI.click(findTestObject('Page_Images/save_btn'))

WebUI.waitForElementVisible(findTestObject('Page_Images/detection'), 5)

WebUI.mouseOver(findTestObject('Page_Images/detection'))

ID = WebUI.getText(findTestObject('Page_Images/detection_info'))

label = WebUI.getText(findTestObject('Page_Images/Detection_label'))

println('ID: ' + ID)

println('Label: ' + label)

