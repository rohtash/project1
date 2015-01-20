package com.tesco.resource.bundle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class ReadPropertiesFile {
	public static void main(String[] args) {
		try {
			File file = new File("src//main//resources//com//tesco//swagger//resource_bundle//read.properties");
			FileInputStream fileInput = new FileInputStream(file);
			Properties properties = new Properties();
			properties.load(fileInput);
			fileInput.close();
			System.out.println(properties.getProperty("favoriteVegetable"));
			System.out.println(properties.getProperty("favoriteVegetable"));
			System.out.println(properties.getProperty("favoriteFood"));
			System.out.println(properties.getProperty("favoriteSoda"));
			System.out.println(properties.getProperty("abc"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}