package com.tesco.resource.bundle;
import java.util.Locale;
import java.util.ResourceBundle;


public class ResourceBundleTest {

	public static void main(String[] args) {
		ResourceBundle rb;
		
		Locale locale = new Locale("en", "US");
		Locale franch =new Locale("fr","franch");
		
		rb = ResourceBundle.getBundle("propertyfiles.mybundle",locale);
		System.out.println(rb.getString("this"));
		
		rb= ResourceBundle.getBundle("propertyfiles.mybundle",franch);
		System.out.println(rb.getString("this"));
		
	}

}