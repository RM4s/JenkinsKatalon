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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

CustomKeywords.'loginKeyword.doLogin.loginCURA'()

WebUI.selectOptionByValue(findTestObject('Object Repository/demoUATKatalon/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare C'), 
    'Seoul CURA Healthcare Center', true)

WebUI.click(findTestObject('Object Repository/demoUATKatalon/Page_CURA Healthcare Service/span_Visit Date (Required)_gly'))

WebUI.click(findTestObject('Object Repository/demoUATKatalon/Page_CURA Healthcare Service/td_28'))

WebUI.setText(findTestObject('Object Repository/demoUATKatalon/Page_CURA Healthcare Service/textarea_Comment_comment'), 
    'This is a Katalon Test')

WebUI.click(findTestObject('Object Repository/demoUATKatalon/Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.verifyElementVisible(findTestObject('Object Repository/demoUATKatalon/Page_CURA Healthcare Service/h2_Appointment Confirmation'))

WebUI.closeBrowser()

