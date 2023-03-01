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

WebUI.navigateToUrl('https://develop.t2d2.ai/#/projects/6225df7b8e013c5500d0693d/images/edit-image/63f773fa6ceae31ad451ada2?rf=%2Fprojects%2F6225df7b8e013c5500d0693d%2Fimages&page=1&limit=12&sortName=created_at&sortType=desc&queryType=2&region_id=6225df7d8e013c4885d06943')

WebUI.click(findTestObject('Page_Images/rextangleShape'))

WebUI.clickOffset(findTestObject('Page_Images/image'), 5, -5)

WebUI.dragAndDropByOffset(findTestObject('Page_Images/image'), 10, -10)

WebUI.click(findTestObject('Page_Images/Done_btn'))

WebUI.click(findTestObject('Page_Images/label'))

WebUI.click(findTestObject('Page_Images/material'))

WebUI.click(findTestObject('Page_Images/save_btn'))

WebUI.verifyElementNotVisible(findTestObject('Page_Images/detection'))

