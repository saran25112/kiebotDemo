package com.kiebot;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class Careers  extends ProjectF1 {

	public static void main(String[] args) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://kiebot.com/");
		WebElement careersButton = driver.findElement(By.xpath("//a[text()='Careers']"));
		careersButton.click();
		String mainPath="//div[contains(@class,'elementor-element elementor-element')and not(contains(@class, 'elementor-hidden-desktop'))][contains(@class,'elementor-widget elementor-widget-shortcode')]";
		List<WebElement> currentOpenings = driver.findElements(By.xpath(mainPath));
		for (int i = 1; i <= currentOpenings.size(); i++) {
			WebElement currentOpening = driver.findElement(By.xpath("("+mainPath+")["+i+"]/div/div/div/section/div/div/div/section/div/div/div/div/div/h2/a"));
			String jobTitle = currentOpening.getText();
			String href = currentOpening.getAttribute("href");
			
			System.out.println(jobTitle);
			List<WebElement> details = driver.findElements(By.xpath("("+mainPath+")["+i+"]/div/div/div/section/div/div/div/section/div/div[2]/div/div/div/ul/li"));
			
			for (int j = 1; j <= details.size(); j++) {
				WebElement detail = driver.findElement(By.xpath("("+mainPath+")["+i+"]/div/div/div/section/div/div/div/section/div/div[2]/div/div/div/ul/li["+j+"]"));
				String detai = detail.getText();
				System.out.println(detai);
			}
			System.out.println("link==>"+href);
			line(20);
		}
		
		
		driver.close();
	}

}
