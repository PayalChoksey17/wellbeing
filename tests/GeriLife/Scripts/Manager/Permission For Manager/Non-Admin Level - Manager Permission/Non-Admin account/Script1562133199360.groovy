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
 * Scenario 2 : Login to Non-Admin Account
 */
WebUI.setText(findTestObject('Object Repository/Assign Manager/User Level/Page_GeriLife/input_Email_at-field-email (1)'),
	'gerilife440@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Assign Manager/User Level/Page_GeriLife/input_Password_at-field-passwo (1)'),
	'kbs23wq117C4z+7JL/PnBA==')

WebUI.click(findTestObject('Object Repository/Assign Manager/User Level/Page_GeriLife/button_Sign In (1)'))
