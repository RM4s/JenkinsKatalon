package loginKeyword

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class doLogin {

	@Keyword
	public void loginCURA(){

		WebUI.click(findTestObject('Object Repository/demoUATKatalon/Page_CURA Healthcare Service/a_Make Appointment'))

		WebUI.setText(findTestObject('Object Repository/demoUATKatalon/Page_CURA Healthcare Service/input_Username_username'), 'John Doe')

		WebUI.setEncryptedText(findTestObject('Object Repository/demoUATKatalon/Page_CURA Healthcare Service/input_Password_password'),
				'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

		WebUI.click(findTestObject('Object Repository/demoUATKatalon/Page_CURA Healthcare Service/button_Login'))
	}
}
