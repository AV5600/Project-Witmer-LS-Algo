package com.witmerlearnigstylealgorithm;

import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Algoritm03 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		//WebDriverManager.firefoxdriver().setup();
		
		//WebDriverManager.edgedriver().setup();

		WebDriver driver = new ChromeDriver();

		//WebDriver driver = new FirefoxDriver();

		//WebDriver driver = new EdgeDriver();
		
		driver.get("https://app.mindn.ai/#/login");
		
		driver.manage().window().maximize();
		
		// Clear cookies
		
		driver.manage().deleteAllCookies();

		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("arunachalam@energetics.ai");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Mail@123");
		
		driver.findElement(By.id("loginButton")).click();
		
		Duration timeout = Duration.ofSeconds(20);
        
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'Wellness')]")));
        
        driver.findElement(By.xpath("//div[contains(text(),'Wellness')]")).click();
        
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Learning Style')]")));
		
        driver.findElement(By.xpath("//span[contains(text(),'Learning Style')]")).click();
        
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(text(),'Start')]")));
		
		driver.findElement(By.xpath("//button[contains(text(),'Start')]")).click();
        
        List<WebElement> element = driver.findElements(By.xpath("(//button[contains(text(),'CONTINUE')])[2]"));

        if (!element.isEmpty()) {

			driver.findElement(By.xpath("(//button[contains(text(),'CONTINUE')])[2]")).click();

		}
                
        for (int i = 1; i<=44 ; i++) {
           
        	 String question01 = Ls_Question_Option.question01; String question02 = Ls_Question_Option.question02; 
			 String question03 = Ls_Question_Option.question03; String question04 = Ls_Question_Option.question04; 
			 String question05 = Ls_Question_Option.question05; String question06 = Ls_Question_Option.question06; 
			 String question07 = Ls_Question_Option.question07; String question08 = Ls_Question_Option.question08; 
			 String question09 = Ls_Question_Option.question09; String question10 = Ls_Question_Option.question10; 
			 String question11 = Ls_Question_Option.question11; String question12 = Ls_Question_Option.question12; 
			 String question13 = Ls_Question_Option.question13; String question14 = Ls_Question_Option.question14; 
			 String question15 = Ls_Question_Option.question15; String question16 = Ls_Question_Option.question16; 
			 String question17 = Ls_Question_Option.question17; String question18 = Ls_Question_Option.question18; 
			 String question19 = Ls_Question_Option.question19; String question20 = Ls_Question_Option.question20; 
			 String question21 = Ls_Question_Option.question21; String question22 = Ls_Question_Option.question22; 
			 String question23 = Ls_Question_Option.question23; String question24 = Ls_Question_Option.question24; 
			 String question25 = Ls_Question_Option.question25; String question26 = Ls_Question_Option.question26; 
			 String question27 = Ls_Question_Option.question27; String question28 = Ls_Question_Option.question28; 
			 String question29 = Ls_Question_Option.question29; String question30 = Ls_Question_Option.question30; 
			 String question31 = Ls_Question_Option.question31; String question32 = Ls_Question_Option.question32; 
			 String question33 = Ls_Question_Option.question33; String question34 = Ls_Question_Option.question34; 
			 String question35 = Ls_Question_Option.question35; String question36 = Ls_Question_Option.question36; 
			 String question37 = Ls_Question_Option.question37; String question38 = Ls_Question_Option.question38; 
			 String question39 = Ls_Question_Option.question39; String question40 = Ls_Question_Option.question40; 
			 String question41 = Ls_Question_Option.question41; String question42 = Ls_Question_Option.question42; 
			 String question43 = Ls_Question_Option.question43; String question44 = Ls_Question_Option.question44;
			 
			 WebElement option1 = Ls_Question_Option.option1(driver); WebElement option2 = Ls_Question_Option.option2(driver);
			 
			 WebElement questionclass = driver.findElement(By.xpath("//span[@class='ass-intro-title ass-questions']"));

			 String questionText = questionclass.getText();
			 
			 if (questionText.contains(question01) || questionText.contains(question02) ||
				 questionText.contains(question03) || questionText.contains(question04) ||
				 questionText.contains(question05) || questionText.contains(question06) ||
				 questionText.contains(question07) || questionText.contains(question08) ||
				 questionText.contains(question09) || questionText.contains(question10) ||
				 questionText.contains(question11) || questionText.contains(question12) ||
				 questionText.contains(question13) || questionText.contains(question14) ||
				 questionText.contains(question15) || questionText.contains(question16) ||
				 questionText.contains(question17) || questionText.contains(question18) ||
				 questionText.contains(question19) || questionText.contains(question20) ||
				 questionText.contains(question21) || questionText.contains(question22) ||
				 questionText.contains(question23) || questionText.contains(question24) ||
				 questionText.contains(question25) || questionText.contains(question26) ||
				 questionText.contains(question27) || questionText.contains(question28) ||
				 questionText.contains(question29) || questionText.contains(question30) ||
				 questionText.contains(question31) || questionText.contains(question32)){
				 
				 option1.click(); Thread.sleep(500);
				 
			 } else if (questionText.contains(question33) || questionText.contains(question34) ||
					    questionText.contains(question35) || questionText.contains(question36) ||
					    questionText.contains(question37) || questionText.contains(question38) ||
					    questionText.contains(question39) || questionText.contains(question40) ||
					    questionText.contains(question41) || questionText.contains(question42) ||
					    questionText.contains(question43) || questionText.contains(question44)){
			 
				        option2.click(); Thread.sleep(500);
			 } 
        }
        
        driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
        
        driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
        
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(text(),'OK')]")));
		
		driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
		
		//Act-Ref Result Bar
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[@class='wit-result-progress-bar ls-progress-bar-left']//div[@class='wit-result-progress-bar-value'])[1]")));
		
		WebElement bar_result_colour_and_width_01 = driver.findElement(By.xpath("(//div[@class='wit-result-progress-bar ls-progress-bar-left']//div[@class='wit-result-progress-bar-value'])[1]"));
		
		String actual_act_ref_result_colour_and_width = bar_result_colour_and_width_01.getAttribute("style");
		
		System.out.println("Act-Ref Actual Result Colour and Width: " + actual_act_ref_result_colour_and_width);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//p[@class='wit-result-progress-title'])[1]")));
		
		WebElement bar_result_text_01 = driver.findElement(By.xpath("(//p[@class='wit-result-progress-title'])[1]"));
		
		String actual_act_ref_result_text = bar_result_text_01.getText();
		
		System.out.println("Act-Ref Actual Result Text: " + actual_act_ref_result_text);
		
		String expected_act_ref_colour_and_width = "width: 50%; background-color: rgb(116, 195, 212);";
		
		String expected_act_ref_text = "Active";
		
		if (expected_act_ref_colour_and_width.contains(actual_act_ref_result_colour_and_width)) {
			
			System.out.println("Act_Ref Score Colour and Width is Correct");
			
		} else {
			
			System.out.println("Act_Ref Score Colour and Width is Incorrect");
			
		}
		
		if (expected_act_ref_text.contains(actual_act_ref_result_text)) {
			
			 System.out.println("Act_Ref Score Text is Correct");
			
		} else {
			
			 System.out.println("Act_Ref Score Text is Incorrect");
			
		}
		
		//Sen-Int Result Bar
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[@class='wit-result-progress-bar ls-progress-bar-left']//div[@class='wit-result-progress-bar-value'])[2]")));
				
		WebElement bar_result_colour_and_width_02 = driver.findElement(By.xpath("(//div[@class='wit-result-progress-bar ls-progress-bar-left']//div[@class='wit-result-progress-bar-value'])[2]"));
				
		String actual_sen_int_result_colour_and_width = bar_result_colour_and_width_02.getAttribute("style");
				
		System.out.println("Sen-Int Actual Result Colour and Width: " + actual_sen_int_result_colour_and_width);
				
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//p[@class='wit-result-progress-title'])[2]")));
				
		WebElement bar_result_text_02 = driver.findElement(By.xpath("(//p[@class='wit-result-progress-title'])[2]"));
				
		String actual_sen_int_result_text = bar_result_text_02.getText();
				
		System.out.println("Sen-Int Actual Result Text: " + actual_sen_int_result_text);
				
		String expected_sen_int_colour_and_width = "width: 50%; background-color: rgb(116, 195, 212);";
				
		String expected_sen_int_text = "Sensing";
				
		if (expected_sen_int_colour_and_width.contains(actual_sen_int_result_colour_and_width)) {
					
				System.out.println("Sen_Int Score Colour and Width is Correct");
					
		} else {
					
				System.out.println("Sen_Int Score Colour and Width is Incorrect");
					
		}
				
		if (expected_sen_int_text.contains(actual_sen_int_result_text)) {
					
				System.out.println("Sen_Int Score Text is Correct");
					
		} else {
					
				System.out.println("Sen_Int Score Text is Incorrect");
					
		}
		
		//Vis-Ver Result Bar
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[@class='wit-result-progress-bar ls-progress-bar-left']//div[@class='wit-result-progress-bar-value'])[3]")));
						
		WebElement bar_result_colour_and_width_03 = driver.findElement(By.xpath("(//div[@class='wit-result-progress-bar ls-progress-bar-left']//div[@class='wit-result-progress-bar-value'])[3]"));
						
		String actual_vis_ver_result_colour_and_width = bar_result_colour_and_width_03.getAttribute("style");
						
		System.out.println("Vis-Ver Actual Result Colour and Width: " + actual_vis_ver_result_colour_and_width);
						
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//p[@class='wit-result-progress-title'])[3]")));
						
		WebElement bar_result_text_03 = driver.findElement(By.xpath("(//p[@class='wit-result-progress-title'])[3]"));
						
		String actual_vis_ver_result_text = bar_result_text_03.getText();
						
		System.out.println("Vis-Ver Actual Result Text: " + actual_vis_ver_result_text);
						
		String expected_vis_ver_colour_and_width = "width: 50%; background-color: rgb(116, 195, 212);";
						
		String expected_vis_ver_text = "Visual";
						
		if (expected_vis_ver_colour_and_width.contains(actual_vis_ver_result_colour_and_width)) {
							
				System.out.println("Vis_Ver Score Colour and Width is Correct");
							
		} else {
							
				System.out.println("Vis_Ver Score Colour and Width is Incorrect");
							
		}
						
		if (expected_vis_ver_text.contains(actual_vis_ver_result_text)) {
							
				System.out.println("Vis_Ver Score Text is Correct");
							
		} else {
							
				System.out.println("Vis_Ver Score Text is Incorrect");
							
		}
		
		//Seq-Glo Result Bar
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[@class='wit-result-progress-bar ls-progress-bar-left']//div[@class='wit-result-progress-bar-value'])[4]")));
								
		WebElement bar_result_colour_and_width_04 = driver.findElement(By.xpath("(//div[@class='wit-result-progress-bar ls-progress-bar-left']//div[@class='wit-result-progress-bar-value'])[4]"));
								
		String actual_seq_glo_result_colour_and_width = bar_result_colour_and_width_04.getAttribute("style");
								
		System.out.println("Seq-Glo Actual Result Colour and Width: " + actual_seq_glo_result_colour_and_width);
								
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//p[@class='wit-result-progress-title'])[4]")));
								
		WebElement bar_result_text_04 = driver.findElement(By.xpath("(//p[@class='wit-result-progress-title'])[4]"));
								
		String actual_seq_glo_result_text = bar_result_text_04.getText();
								
		System.out.println("Seq-Glo Actual Result Text: " + actual_seq_glo_result_text);
								
		String expected_seq_glo_colour_and_width = "width: 50%; background-color: rgb(116, 195, 212);";
								
		String expected_seq_glo_text = "Sequential";
								
		if (expected_seq_glo_colour_and_width.contains(actual_seq_glo_result_colour_and_width)) {
									
				System.out.println("Seq_Glo Score Colour and Width is Correct");
									
		} else {
									
				System.out.println("Seq_Glo Score Colour and Width is Incorrect");
									
		}
								
		if (expected_seq_glo_text.contains(actual_seq_glo_result_text)) {
									
				System.out.println("Seq_Glo Score Text is Correct");
									
		} else {
									
				System.out.println("Seq_Glo Score Text is Incorrect");
									
		}
				
				
		//driver.findElement(By.xpath("//button[contains(text(),'Back')]")).click();
		
		//driver.quit();
		
	}

}
