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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.tokopedia.com/')

WebUI.waitForPageLoad(0, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Objects/search_bar'), 'iphone 14 pro')

WebUI.sendKeys(findTestObject('Object Repository/Objects/search_bar'), Keys.chord(Keys.ENTER))

WebUI.waitForPageLoad(0)

WebUI.scrollToPosition(0, 500)

WebUI.click(findTestObject('Objects/input_min_price'))

WebUI.setText(findTestObject('Objects/input_min_price'), '100000')

WebUI.sendKeys(findTestObject('Objects/input_min_price'), Keys.chord(Keys.ENTER))

WebUI.waitForPageLoad(0)

WebUI.scrollToElement(findTestObject('Object Repository/Objects/input_max_price'), 0)

WebUI.setText(findTestObject('Object Repository/Objects/input_max_price'), '30000000')

WebUI.sendKeys(findTestObject('Object Repository/Objects/input_max_price'), Keys.chord(Keys.ENTER))

WebUI.waitForPageLoad(0, FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Object Repository/Objects/sort'))

WebUI.click(findTestObject('Objects/button_Harga Terendah'))

String name01 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item01'))

String name02 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item02'))

String name03 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item03'))

String name04 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item04'))

String name05 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item05'))

String name06 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item06'))

String name07 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item07'))

String name08 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item08'))

String name09 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item09'))

String name10 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item10'))

String name11 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item11'))

String name12 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item12'))

String name13 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item13'))

String name14 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item14'))

String name15 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item15'))

String name16 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item16'))

String name17 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item17'))

String name18 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item18'))

String name19 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item19'))

String name20 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item20'))

String name21 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item21'))

String name22 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item22'))

String name23 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item23'))

String name24 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item24'))

String name25 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item25'))

String name26 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item26'))

String name27 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item27'))

String name28 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item28'))

String name29 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item29'))

String name30 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item30'))

String name31 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item31'))

String name32 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item32'))

String name33 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item33'))

String name34 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item34'))

String name35 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item35'))

String name36 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item36'))

String name37 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item37'))

String name38 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item38'))

String name39 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item39'))

String name40 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item40'))

String name41 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item41'))

String name42 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item42'))

String name43 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item43'))

String name44 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item44'))

String name45 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item45'))

String name46 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item46'))

String name47 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item47'))

String name48 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item48'))

String name49 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item49'))

String name50 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item50'))

String name51 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item51'))

String name52 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item52'))

String name53 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item53'))

String name54 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item54'))

String name55 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item55'))

String name56 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item56'))

String name57 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item57'))

String name58 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item58'))

String name59 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item59'))

String name60 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item60'))

String name61 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item61'))

String name62 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item62'))

String name63 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item63'))

String name64 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item64'))

String name65 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item65'))

WebUI.scrollToPosition(9999999, 9999999)

WebUI.scrollToElement(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/next'), 0)

WebUI.click(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/next'))

String name66 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item01'))

String name67 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item02'))

String name68 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item03'))

String name69 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item04'))

String name70 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item05'))

String name71 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item06'))

String name72 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item07'))

String name73 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item08'))

String name74 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item09'))

String name75 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item10'))

String name76 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item11'))

String name77 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item12'))

String name78 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item13'))

String name79 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item14'))

String name80 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item15'))

String name81 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item16'))

String name82 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item17'))

String name83 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item18'))

String name84 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item19'))

String name85 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item20'))

String name86 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item21'))

String name87 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item22'))

String name88 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item23'))

String name89 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item24'))

String name90 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item25'))

String name91 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item26'))

String name92 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item27'))

String name93 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item28'))

String name94 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item29'))

String name95 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item30'))

String name96 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item31'))

String name97 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item32'))

String name98 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item33'))

String name99 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item34'))

String name100 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item35'))

String name101 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item36'))

String name102 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item37'))

String name103 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item38'))

String name104 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item39'))

String name105 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item40'))

String name106 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item41'))

String name107 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item42'))

String name108 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item43'))

String name109 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item44'))

String name110 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item45'))

String name111 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item46'))

String name112 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item47'))

String name113 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item48'))

String name114 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item49'))

String name115 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item50'))

String name116 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item51'))

String name117 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item52'))

String name118 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item53'))

String name119 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item54'))

String name120 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item55'))

String name121 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item56'))

String name122 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item57'))

String name123 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item58'))

String name124 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item59'))

String name125 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item60'))

String name126 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item61'))

String name127 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item62'))

String name128 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item63'))

String name129 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item64'))

String name130 = WebUI.getText(findTestObject('Objects/item_list/Page_Jual iphone 14 pro  Tokopedia/item65'))

CustomKeywords.'myPack.WriteExcel.demoKey'(name01, name02, name03, name04, name05, name06, name07, name08, name09, name10, 
    name11, name12, name13, name14, name15, name16, name17, name18, name19, name20, name21, name22, name23, name24, name25, 
    name26, name27, name28, name29, name30, name31, name32, name33, name34, name35, name36, name37, name38, name39, name40, 
    name41, name42, name43, name44, name45, name46, name47, name48, name49, name50, name51, name52, name53, name54, name55, 
    name56, name57, name58, name59, name60, name61, name62, name63, name64, name65, name66, name67, name68, name69, name70, 
    name71, name72, name73, name74, name75, name76, name77, name78, name79, name80, name81, name82, name83, name84, name85, 
    name86, name87, name88, name89, name90, name91, name92, name93, name94, name95, name96, name97, name98, name99, name100, 
    name101, name102, name103, name104, name105, name106, name107, name108, name109, name110, name111, name112, name113, 
    name114, name115, name116, name117, name118, name119, name120, name121, name122, name123, name124, name125, name126, 
    name127, name128, name129, name130)

