package Crwaling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Crwaling {
	public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
	public static final String WEB_DRIVER_PATH = "C:\\chromedriver\\chromedriver.exe";

	public static void main(String[] args) {
		try {
			System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
		} catch (Exception e) {
			e.printStackTrace();
		}

		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://vibe.naver.com/today");

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.xpath("/html/body/div/div[2]/div/div/a[2]")).click();
		// 팝업 끄기
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.xpath("/html/body/div/div/div/header/div[1]/div[2]/span/input")).click();
		// 검색어 커서 올리기
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 검색 입력
		driver.findElement(By.xpath("/html/body/div/div/div/header/div[1]/div[2]/span/input")).sendKeys("다비치");

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("/html/body/div/div/div/header/div[1]/div[2]/span/input")).sendKeys(Keys.ENTER);

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String tt = driver
				.findElement(By.xpath(
						"/html/body/div/div/div/div[3]/div/div[2]/div/div[1]/div[1]/div[2]/div[1]/span[1]/a/span"))
				.getText(); // 텍스트 긁어오기
		System.out.println(tt);

	}
}
