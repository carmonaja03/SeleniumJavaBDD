//package com.StepDef;
//
//import java.util.Iterator;
//import java.util.List;
//import java.util.Map;
//import java.util.Set;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//import io.cucumber.datatable.DataTable;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class DataTableHandling {
//	public static WebDriver driver = Hooks.driver;
//
//	@Then("^i validate below labels in the page$")
//	public void verifyLabels(DataTable data) {
//		List<String> list = data.asList(String.class);
//		for (String s : list) {
////			 |Email address|Password|
//			String str = driver.findElement(By.xpath("//*[normalize-space(text())='" + s + "']")).getText();
//			if (s.equals(str)) {
//				System.out.println("Lable available");
//			}
//		}
//
//	}
//
//	@When("^user enter inputs as per below header and value$")
//	public void dataTableWithDifferentValues(DataTable data) {
//		List<Map<String, String>> list = data.asMaps(String.class, String.class);
//
//		for (Map<String, String> map : list) {
//
//			String email = map.get("Email address");
//			String pass = map.get("Password");
//			System.out.println("Email: " + email);
//			System.out.println("Password: " + pass);
//		}
//
//		for (Map<String, String> map : list) {
//			Set<String> mp = map.keySet();
//			Iterator<String> it = mp.iterator();
//			while (it.hasNext()) {
//				String key = it.next();
//				String value = map.get(key);
//
//				System.out.println("Key: " + key);
//				System.out.println("Value: " + value);
//			}
//
//		}
//
//	}
//}
