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

WebUI.navigateToUrl('https://www.katalon.com/')

WebUI.click(findTestObject('Page_Katalon Studio Simplify API Web Mobile Automation Tests/a_Login'))

WebUI.setText(findTestObject('Page_Sign in  Katalon Studio/input_Enter your details below_user_email'), 'zzzd')

WebUI.setEncryptedText(findTestObject('Page_Sign in  Katalon Studio/input_Enter your details below_user_pass'), '1rPGswz8OIQ=')

WebUI.click(findTestObject('Page_Sign in  Katalon Studio/input_Remember me_login-btn'))

def get = new URL("https://httpbin.org/get").openConnection();
def getRC = get.getResponseCode();
println(getRC);
if(getRC.equals(200)) {
	println(get.getInputStream().getText());
}
WebUI.delay(10)
WebUI.setText(findTestObject('Page_Sign in  Katalon Studio/input_Enter your details below_user_email'), '200000')