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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/demoUATKatalon/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.setText(findTestObject('Object Repository/demoUATKatalon/Page_CURA Healthcare Service/input_Username_username'), 'John Doe')

WebUI.setEncryptedText(findTestObject('Object Repository/demoUATKatalon/Page_CURA Healthcare Service/input_Password_password'), 
    'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Object Repository/demoUATKatalon/Page_CURA Healthcare Service/button_Login'))

WebUI.selectOptionByValue(findTestObject('Object Repository/demoUATKatalon/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare C'), 
    'Seoul CURA Healthcare Center', true)

WebUI.click(findTestObject('Object Repository/demoUATKatalon/Page_CURA Healthcare Service/span_Visit Date (Required)_gly'))

WebUI.click(findTestObject('Object Repository/demoUATKatalon/Page_CURA Healthcare Service/td_28'))

String  randomName = CustomKeywords.'TestDataGenerator.getRandomMaleName'()

WebUI.setText(findTestObject('demoUATKatalon/Page_CURA Healthcare Service/textarea_Comment_comment'),randomName)

WebUI.click(findTestObject('Object Repository/demoUATKatalon/Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.verifyElementVisible(findTestObject('Object Repository/demoUATKatalon/Page_CURA Healthcare Service/h2_Appointment Confirmation'))

WebUI.closeBrowser()
