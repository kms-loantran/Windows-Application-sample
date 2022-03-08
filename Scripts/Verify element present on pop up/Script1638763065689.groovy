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

Windows.startApplicationWithTitle('C:\\Program Files\\PuTTY\\putty.exe', 'PuTTY Configuration')

Windows.delay(3)

Windows.click(findWindowsObject('Object Repository/check pop up/TreeItem  - SSH - Host keys'))

//Windows.click(findWindowsObject('Object Repository/check pop up/Button - Add Key'))

Windows.switchToWindowTitle("abc", FailureHandling.OPTIONAL)

//Windows.switchToDesktop()

obj = findWindowsObject('Object Repository/check pop up/Text - error in  pop up')

Windows.verifyElementPresent(obj, 5, FailureHandling.OPTIONAL)

//Windows.click(findWindowsObject('Object Repository/check pop up/Text - error in  pop up'))

//Windows.click(findWindowsObject('Object Repository/check pop up/Button(1) - OK button in pop up'))

//Windows.click(findWindowsObject('Object Repository/check pop up/TitleBar'))

