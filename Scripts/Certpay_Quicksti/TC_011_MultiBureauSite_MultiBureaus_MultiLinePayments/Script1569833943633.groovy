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

' Open certpay Quicksti appliction'
CustomKeywords.'utilities.SafeActions.openBrowser'(GlobalVariable.Quicksti_Url, (([GlobalVariable.pageLoadTime]) as int[]))

'Click on \'Use multi bureau entry screen\' checkbox'
CustomKeywords.'utilities.SafeActions.safeCheck'(findTestObject('CERTPAY_QUICKSTI/Login_ Page/MULTI_BUREAU_CHECKBOX'), 'Multi Bureau', 
        (([GlobalVariable.pageLoadTime]) as int[]))

'Enter \'Teller Id\''
CustomKeywords.'utilities.SafeActions.safeType'(findTestObject('CERTPAY_QUICKSTI/Login_ Page/TELLER_ID'), GlobalVariable.teller_id, 
    'Bureau code', (([GlobalVariable.pageLoadTime]) as int[]))

'Click on \'Next\''
CustomKeywords.'utilities.SafeActions.safeClick'(findTestObject('CERTPAY_QUICKSTI/Login_ Page/NEXT_BUTTON'), 'Next button', 
        (([GlobalVariable.pageLoadTime]) as int[]))

'Enter comments'
CustomKeywords.'pages.Quicksti.setCommnets'('0', '0', 'tester')

'Enter Payment amount'
CustomKeywords.'utilities.SafeActions.safeType'(findTestObject('CERTPAY_QUICKSTI/Payment_Information_Page/PAYMENT_AMOUNT'), 
    paymentAmount, 'Payment Amount', (([GlobalVariable.pageLoadTime]) as int[]))

'Enter paymnet type,reference Num,quantity'
CustomKeywords.'pages.Quicksti.setAmountDetailsForMultiBureau'('0', paymentType, '0', referenceNum, quantity)

'Enter comments'
CustomKeywords.'pages.Quicksti.setCommnets'('0', '1', 'tester')

'Enter paymnet amount'
CustomKeywords.'utilities.SafeActions.safeType'(findTestObject('CERTPAY_QUICKSTI/Payment_Information_Page/PAYMENT_AMOUNT'), 
    paymentAmount, 'Payment Amount', (([GlobalVariable.pageLoadTime]) as int[]))

'Enter paymnet type,reference Num,quantity'
CustomKeywords.'pages.Quicksti.setAmountDetailsForMultiBureau'('1', 'Taxes', '0', referenceNum, quantity)

'Enter comments'
CustomKeywords.'pages.Quicksti.setCommnets'('0', '2', 'tester')

'Enter Payment amount'
CustomKeywords.'utilities.SafeActions.safeType'(findTestObject('CERTPAY_QUICKSTI/Payment_Information_Page/PAYMENT_AMOUNT'), 
    paymentAmount, 'Payment Amount', (([GlobalVariable.pageLoadTime]) as int[]))

'Enter paymnet type,reference Num,quantity'
CustomKeywords.'pages.Quicksti.setAmountDetailsForMultiBureau'('2', paymentType, '0', referenceNum, quantity)

'Enter Payment amount'
CustomKeywords.'utilities.SafeActions.safeType'(findTestObject('CERTPAY_QUICKSTI/Payment_Information_Page/MULTIBUREAU_PAYMENT_AMOUNT'), 
    paymentAmount, 'Payment Amount', (([GlobalVariable.pageLoadTime]) as int[]))

'Enter paymnet type,reference Num,quantity'
CustomKeywords.'pages.Quicksti.setAmountDetailsForMultiBureau'('0', 'Registration Fees', '1', referenceNum, quantity)

'Enter Payment amount'
CustomKeywords.'utilities.SafeActions.safeType'(findTestObject('CERTPAY_QUICKSTI/Payment_Information_Page/MULTIBUREAU_PAYMENT_AMOUNT'), 
    paymentAmount, 'Payment Amount', (([GlobalVariable.pageLoadTime]) as int[]))

'Enter paymnet type,reference Num,quantity'
CustomKeywords.'pages.Quicksti.setAmountDetailsForMultiBureau'('1', 'Registration Fees', '1', referenceNum, quantity)

'Enter Payment amount'
CustomKeywords.'utilities.SafeActions.safeType'(findTestObject('CERTPAY_QUICKSTI/Payment_Information_Page/MULTIBUREAU_PAYMENT_AMOUNT'), 
    paymentAmount, 'Payment Amount', (([GlobalVariable.pageLoadTime]) as int[]))

'Enter paymnet type,reference Num,quantity'
CustomKeywords.'pages.Quicksti.setAmountDetailsForMultiBureau'('2', 'Registration Fees', '1', referenceNum, quantity)

'Enter Payment amount'
CustomKeywords.'utilities.SafeActions.safeType'(findTestObject('CERTPAY_QUICKSTI/Payment_Information_Page/MULTIBUREAU_PAY_AMOUNT2'), 
    paymentAmount, 'Payment Amount', (([GlobalVariable.pageLoadTime]) as int[]))

'Enter paymnet type,reference Num,quantity'
CustomKeywords.'pages.Quicksti.setAmountDetailsForMultiBureau'('0', 'Vehicles', '2', referenceNum, quantity)

'Enter comments'
CustomKeywords.'pages.Quicksti.setCommnets'('2', '0', 'tester')

'Enter Payment amount'
CustomKeywords.'utilities.SafeActions.safeType'(findTestObject('CERTPAY_QUICKSTI/Payment_Information_Page/MULTIBUREAU_PAY_AMOUNT2'), 
    paymentAmount, 'Payment Amount', (([GlobalVariable.pageLoadTime]) as int[]))

'Enter paymnet type,reference Num,quantity'
CustomKeywords.'pages.Quicksti.setAmountDetailsForMultiBureau'('1', 'Vehicles', '2', referenceNum, quantity)

'Enter comments'
CustomKeywords.'pages.Quicksti.setCommnets'('2', '1', 'tester')

'Enter Payment amount'
CustomKeywords.'utilities.SafeActions.safeType'(findTestObject('CERTPAY_QUICKSTI/Payment_Information_Page/MULTIBUREAU_PAY_AMOUNT2'), 
    paymentAmount, 'Payment Amount', (([GlobalVariable.pageLoadTime]) as int[]))

'Enter paymnet type,reference Num,quantity'
CustomKeywords.'pages.Quicksti.setAmountDetailsForMultiBureau'('2', 'Vehicles', '2', referenceNum, quantity)

'Enter comments'
CustomKeywords.'pages.Quicksti.setCommnets'('2', '2', 'tester')

'Click on \'Click here to manually enter card details\''
CustomKeywords.'utilities.SafeActions.safeClick'(findTestObject('CERTPAY_QUICKSTI/Payment_Information_Page/MANUAL_ENTRY_BUTTON'), 
    'ManualEntry', (([GlobalVariable.pageLoadTime]) as int[]))

amount_Value = CustomKeywords.'pages.Quicksti.getAttributeValue'(findTestObject('CERTPAY_QUICKSTI/Payment_Information_Page/SUB_TOTAL'))

'Enter firstname,lastname,card number'
CardNumber = CustomKeywords.'pages.Quicksti.setUserPaymentDetails'(GlobalVariable.firstName, GlobalVariable.lastName, GlobalVariable.AMEX_Card)

'Enter exp date,security code'
CustomKeywords.'pages.Quicksti.setExpDate'(expMonth, expYear, securityCode)

'Enter address'
CustomKeywords.'utilities.SafeActions.safeType'(findTestObject('CERTPAY_QUICKSTI/Payment_Information_Page/ADDRESS'), address, 
    'Address', (([GlobalVariable.pageLoadTime]) as int[]))

'Enter zip code'
CustomKeywords.'utilities.SafeActions.safeType'(findTestObject('CERTPAY_QUICKSTI/Payment_Information_Page/ZIP_CODE'), GlobalVariable.zipCode, 
    'zipcode', (([GlobalVariable.pageLoadTime]) as int[]))

'enter telephone'
CustomKeywords.'utilities.SafeActions.safeType'(findTestObject('CERTPAY_QUICKSTI/Payment_Information_Page/TELEPHONE'), GlobalVariable.telephone, 
    'Telephone', (([GlobalVariable.pageLoadTime]) as int[]))

'enter email address'
CustomKeywords.'utilities.SafeActions.safeType'(findTestObject('CERTPAY_QUICKSTI/Payment_Information_Page/EMAIL_ADDRESS'), 
    GlobalVariable.emailAddress, 'EMAIL address', (([GlobalVariable.pageLoadTime]) as int[]))

'Click on Next'
CustomKeywords.'utilities.SafeActions.safeClick'(findTestObject('CERTPAY_QUICKSTI/Payment_Information_Page/NEXT_BUTTON'), 
    'Next', (([GlobalVariable.pageLoadTime]) as int[]))

'Verify details like first and last name,amount,card num'
CustomKeywords.'pages.Quicksti.verifyUserPaymentDetails'(paymentAmount, GlobalVariable.firstName, GlobalVariable.lastName, 
    CardNumber)

WebUI.scrollToElement(findTestObject('CERTPAY_QUICKSTI/Payment_Details_Verification_Page/PROCESS'), 30)

'Click on Process'
CustomKeywords.'utilities.SafeActions.safeClick'(findTestObject('CERTPAY_QUICKSTI/Payment_Details_Verification_Page/PROCESS'), 
    'Process', (([GlobalVariable.pageLoadTime]) as int[]))

'Verify payment approval'
PaymentId = CustomKeywords.'pages.Quicksti.verifyPaymentApproval'(findTestObject('CERTPAY_QUICKSTI/Payment_Details_Verification_Page/APPROVED'))

'Navigate to reports site'
WebUI.navigateToUrl(GlobalVariable.Reports_url)

' Enter username,password,access code and Click On Login'
CustomKeywords.'pages.Bureau_Login_Page.loginToReportsSite'(GlobalVariable.userName, GlobalVariable.password, GlobalVariable.accessCode)

'Click on Reporting'
CustomKeywords.'utilities.SafeActions.safeClick'(findTestObject('SEARCH_PAYMENT/REPORTING'), 'Reporting', (([GlobalVariable.pageLoadTime]) as int[]))

'Click on Reporting'
CustomKeywords.'utilities.SafeActions.safeClick'(findTestObject('SEARCH_PAYMENT/REPORTING'), 'Reporting', (([GlobalVariable.pageLoadTime]) as int[]))

'Click on Quick Find Payment'
CustomKeywords.'utilities.SafeActions.safeClick'(findTestObject('SEARCH_PAYMENT/QUICK_FIND_PAYMENT'), 'Quick find payment', 
        (([GlobalVariable.pageLoadTime]) as int[]))

'Enter Payment id'
CustomKeywords.'utilities.SafeActions.safeType'(findTestObject('SEARCH_PAYMENT/PAYMENT_ID_INPUT_FIELD'), PaymentId, 'Payment id', 
        (([GlobalVariable.pageLoadTime]) as int[]))

'Click on Search'
CustomKeywords.'utilities.SafeActions.safeClick'(findTestObject('SEARCH_PAYMENT/SEARCH_BUTTON_1'), 'Search button', (([GlobalVariable.pageLoadTime]) as int[]))

'Verify payment id,amount,cardType'
CustomKeywords.'pages.Search_Page.validateApprovedTransactionsInReports'(PaymentId, 'American Express', amount_Value)

WebUI.closeBrowser()

