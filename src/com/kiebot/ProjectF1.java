package com.kiebot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProjectF1 {
	public static WebDriver driver;
	static {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public static void waitTime(int n) {
		n = n * 1000;
		try {
			Thread.sleep(n);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public static void line(int n) {
		for (int j = 0; j < n; j++) {
			System.out.print("___");

		}
		System.out.println("");
	}
}
