import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.relevantcodes.extentreports.ExtentReports
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.annotation.SetUp
import com.kms.katalon.core.annotation.SetupTestCase
import com.kms.katalon.core.annotation.TearDown
import com.kms.katalon.core.annotation.TearDownTestCase

/**
 * Some methods below are samples for using SetUp/TearDown in a test suite.
 */

/**
 * Setup test suite environment.
 */


@SetUp(skipped = false) // Please change skipped to be false to activate this method.
def setUp() {
	// Put your code here.
	
	WebUI.openBrowser('')
	
	WebUI.navigateToUrl('https://develop-v2.t2d2.ai/')
	
	WebUI.maximizeWindow()
	
	WebUI.click(findTestObject('Object Repository/Page_T2D2 Portal/input__email'))
	
	WebUI.setText(findTestObject('Object Repository/Page_T2D2 Portal/input__email'), 'ravi.gajera@inheritx.com')
	
	WebUI.setEncryptedText(findTestObject('Object Repository/Page_T2D2 Portal/input__password'), 'OQ/mCumLJyKffr86dNSKEQ==')
	
	//WebUI.switchToFrame(findTestObject('Page_T2D2 Portal/iframe_Sign Up_hubspot-conversations-iframe'), 5)
	//
	//WebUI.click(findTestObject('Object Repository/Page_T2D2 Portal/close_btn'))
	//
	//WebUI.switchToDefaultContent()
	//
	//WebUI.click(findTestObject('Object Repository/Page_T2D2 Portal/a_'))
	WebUI.click(findTestObject('Object Repository/Page_T2D2 Portal/button_Log In'))
	
	
}

/**
 * Clean test suites environment.
 */
@TearDown(skipped = false) // Please change skipped to be false to activate this method.
def tearDown() {
	// Put your code here.
	WebUI.closeBrowser()
}

/**
 * Run before each test case starts.
 */
@SetupTestCase(skipped = true) // Please change skipped to be false to activate this method.
def setupTestCase() {
	// Put your code here.
}

/**
 * Run after each test case ends.
 */
@TearDownTestCase(skipped = true) // Please change skipped to be false to activate this method.
def tearDownTestCase() {
	// Put your code here.
}

/**
 * References:
 * Groovy tutorial page: http://docs.groovy-lang.org/next/html/documentation/
 */