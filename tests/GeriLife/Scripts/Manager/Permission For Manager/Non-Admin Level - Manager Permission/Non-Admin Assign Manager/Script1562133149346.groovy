import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

/*
 * Scenario 1 : User is being assigned as Manager
 */
WebUI.click(findTestObject('Object Repository/Assign Manager/User Level/Page_GeriLife/a_              Homes (1)'))

WebUI.scrollToElement(findTestObject('Assign Manager/Admin Level/Page_GeriLife/h2_Onnela'), 5)

WebUI.click(findTestObject('Object Repository/Assign Manager/User Level/Page_GeriLife/button_Assign Manager (1)'))

WebUI.click(findTestObject('Object Repository/Assign Manager/User Level/Page_GeriLife/span_Select a user (1)'))

WebUI.delay(5)

WebUI.click(findTestObject('Assign Manager/User Level/Page_GeriLife/div_gerilife440gmail.com'))

WebUI.click(findTestObject('Object Repository/Assign Manager/User Level/Page_GeriLife/div_Users (1)'))

WebUI.click(findTestObject('Object Repository/Assign Manager/User Level/Page_GeriLife/button_Submit (1)'))

WebUI.delay(5)


WebUI.click(findTestObject('Object Repository/Assign Manager/User Level/Page_GeriLife/button_Logout (1)'))
