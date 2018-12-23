package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object urldef
     
    /**
     * <p></p>
     */
    public static Object shortTimeOut
     
    /**
     * <p></p>
     */
    public static Object longTimeOut
     
    /**
     * <p></p>
     */
    public static Object urlKatalonDemo
     
    /**
     * <p></p>
     */
    public static Object User
     
    /**
     * <p></p>
     */
    public static Object Pass
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['urldef' : 'https://katalon-demo-cura.herokuapp.com/'])
        allVariables.put('MyProfile', allVariables['default'] + ['shortTimeOut' : 3, 'longTimeOut' : 15, 'urlKatalonDemo' : 'https://katalon-demo-cura.herokuapp.com/', 'User' : 'John Doe', 'Pass' : 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM'])
        
        String profileName = RunConfiguration.getExecutionProfile()
        def selectedVariables = allVariables[profileName]
		
		for(object in selectedVariables){
			String overridingGlobalVariable = RunConfiguration.getOverridingGlobalVariable(object.key)
			if(overridingGlobalVariable != null){
				selectedVariables.put(object.key, overridingGlobalVariable)
			}
		}

        urldef = selectedVariables["urldef"]
        shortTimeOut = selectedVariables["shortTimeOut"]
        longTimeOut = selectedVariables["longTimeOut"]
        urlKatalonDemo = selectedVariables["urlKatalonDemo"]
        User = selectedVariables["User"]
        Pass = selectedVariables["Pass"]
        
    }
}
