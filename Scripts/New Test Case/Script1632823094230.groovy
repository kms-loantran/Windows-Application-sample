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
import org.openqa.selenium.WebElement as WebElement

Windows.startApplicationWithTitle('C:\\Program Files\\PuTTY\\putty.exe', '')

Windows.click(findWindowsObject('Object Repository/TreeItem'))

def a = Windows.getAttribute(findWindowsObject('Object Repository/CheckBox - Cursor blinks'), 'ToggleState')

String b = Windows.getAttribute(findWindowsObject('Object Repository/CheckBox - Cursor blinks'), 'IsAvailable')

String c = Windows.getAttribute(findWindowsObject('Object Repository/CheckBox - Cursor blinks'), 'x')

println('loan testtttttttt  aaaaaa:  ' + a)

println('loan testtttttttt  bbbbb:  ' + b)

println('loan testtttttttt  ccccccc:  ' + c)

assert a == 'Off'

WebUI.comment('')

