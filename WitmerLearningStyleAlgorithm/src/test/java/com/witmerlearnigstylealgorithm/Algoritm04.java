package com.witmerlearnigstylealgorithm;

import org.openqa.selenium.chrome.ChromeDriver;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Algoritm04 {

	public static void main(String[] args) throws InterruptedException, IOException {

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
		
		LocalDateTime now = LocalDateTime.now();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a, dd MMMM yyyy");
        
        String formattedDateTime = now.format(formatter);
        
        System.out.println("Taken at: " + formattedDateTime);
        
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
				 questionText.contains(question31) || questionText.contains(question32) ||
				 questionText.contains(question33) || questionText.contains(question34) ||
				 questionText.contains(question35) || questionText.contains(question36) ||
				 questionText.contains(question37) || questionText.contains(question38) ||
				 questionText.contains(question39) || questionText.contains(question40)){
				 
				 option1.click(); Thread.sleep(500);
				 
			 } else if (questionText.contains(question41) || questionText.contains(question42) ||
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
		
		String expected_act_ref_colour_and_width = "width: 83.3333%; background-color: rgb(18, 40, 76);";
		
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
				
		String expected_sen_int_colour_and_width = "width: 83.3333%; background-color: rgb(18, 40, 76);";
				
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
						
		String expected_vis_ver_colour_and_width = "width: 83.3333%; background-color: rgb(18, 40, 76);";
						
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
								
		String expected_seq_glo_colour_and_width = "width: 83.3333%; background-color: rgb(18, 40, 76);";
								
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
		
		Thread.sleep(11000);
        
        WebElement button = driver.findElement(By.xpath("(//button[@class='ass-start-btn text-uppercase'])[1]"));
        
        button.click();
        
        LocalDateTime gen = LocalDateTime.now();
        
        DateTimeFormatter formattergen = DateTimeFormatter.ofPattern("hh:mm a, dd MMMM yyyy");
        
        String formattedDateTimegen = gen.format(formattergen);
        
        System.out.println("Report generated: " + formattedDateTimegen);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(text(),'Back')]")));
		
		driver.findElement(By.xpath("//button[contains(text(),'Back')]")).click();
		
		System.out.println("");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@id='profileDropdown']")));
		
		driver.findElement(By.xpath("//a[@id='profileDropdown']")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'SETTINGS')]")));
		
		driver.findElement(By.xpath("//div[contains(text(),'SETTINGS')]")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='firstName']")));
		
		WebElement firstnameelement= driver.findElement(By.xpath("//input[@id='firstName']"));
		
		String firstname = firstnameelement.getAttribute("value");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='lastName']")));
		
		WebElement lastnameelement = driver.findElement(By.xpath("//input[@id='lastName']"));
		
		String lastname = lastnameelement.getAttribute("value");
		
		System.out.println("Username: "+firstname+" "+lastname);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//select[@class='genderselect']")));
		
		WebElement genderelement = driver.findElement(By.xpath("//select[@class='genderselect']"));
		
		String gender = genderelement.getAttribute("defaults");
		
		System.out.println("User Gender: "+gender);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='DOB']")));
		
		WebElement dobElement = driver.findElement(By.xpath("//input[@id='DOB']"));
		
		String dobText = dobElement.getAttribute("value");
		
		LocalDate dob = LocalDate.parse(dobText);
		
        LocalDate currentDate = LocalDate.now();
        
        Period period = Period.between(dob, currentDate);
        
        int age = period.getYears();
        
        System.out.println("User Age: "+age+" years");
		
        System.out.println("=========================PDF TESTING===============================");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the URL of the PDF file:");
        
        String pdfUrl = scanner.nextLine();
        
        URL pdfurl = new URL(pdfUrl);
        
        InputStream ip = pdfurl.openStream();
		
		BufferedInputStream bf = new BufferedInputStream(ip);
		
		Thread.sleep(1000);
		
		PDDocument PDDoc = PDDocument.load(bf, "062000");
		
		PDFTextStripper pdfstr = new PDFTextStripper();
		
		System.out.println("=========================PAGE COUNT===============================");
		
		//Page Count
		
		int pagecount = PDDoc.getNumberOfPages();
		
		System.out.println("Pdf Total Page Count: " + pagecount);
		
		Assert.assertEquals(pagecount, 5);
		
		System.out.println("=========================PAGE COUNT===============================");
		
		/*System.out.println("=========================FULL PDF CONTENT===============================");
		
		//Full Page Content
		
		String pdffullcontent = pdfstr.getText(PDDoc);
				
		System.out.println(pdffullcontent);
		
		System.out.println("=========================FULL PDF CONTENT===============================");*/
				
		System.out.println("=========================PAGE CONTENT - 01===============================");
		
		pdfstr.setStartPage(1);
		
		pdfstr.setEndPage(1);
		
		String pagecontent01 = pdfstr.getText(PDDoc);
		
		if(pagecontent01.contains(firstname+" "+lastname)) {
			
			System.out.println("Username is Corrert");
			
		}else {
			
			System.out.println("Username is Incorrert");
		}
		
		boolean ageresult = pagecontent01.contains("Age: "+age+" years");
		
		if (ageresult) {
			
		    System.out.println("User Age is Correct");
		    
		}else {
			
		    System.out.println("User Age is Incorrect");
		}

		if(pagecontent01.contains(gender)) {
			
			System.out.println("User Gender is Corrert");
			
		}else {
			
			System.out.println("User Gender is Incorrert");
		}
				
		if(pagecontent01.contains(formattedDateTime)) {
			
			System.out.println("Test Taken Date and Time is Corrert");
			
		}else {
			
			System.out.println("Test Taken Date and Time is Incorrert");
		}
				
		if(pagecontent01.contains(formattedDateTimegen)) {
			
			System.out.println("Report Generated Date and Time is Corrert");
			
		}else {
			
			System.out.println("Report Generated Date and Time is Incorrert");
		}
		
		System.out.println("=========================PAGE CONTENT - 01===============================");
		
		System.out.println("=========================PAGE CONTENT - 03===============================");
		
		pdfstr.setStartPage(3);
		
		pdfstr.setEndPage(3);
		
		String pagecontent03 = pdfstr.getText(PDDoc);
		
		String description_act_ref = "On the dimension of active/reective, your score indicates that you have a strong preference for reective\r\n"
				+ "learning styles. This means you, to some extent, tend to retain and understand information best by doing\r\n"
				+ "something active with it, i.e., discussing or applying it or explaining it to others. However, this also means\r\n"
				+ "that sitting through meetings or seminars without getting to do anything physical but take notes is\r\n"
				+ "particularly hard is for you.";
		
		String description_sen_int = "On the dimension of sensing/intuitive, your score indicates that you have a strong preference for a sensing\r\n"
				+ "learning style. This means you often like solving problems by well-established methods and dislike\r\n"
				+ "complications and surprises. You also don’t like “plug-and-chug” tasks that involve a lot of memorization\r\n"
				+ "and routine calculations.";
		
		String description_vis_ver = "On the dimension of visual/verbal, your score indicates that you have a strong preference for verbal\r\n"
				+ "learning. This means you remember best what you see—pictures, diagrams,   ow charts, timelines,   lms,\r\n"
				+ "and demonstrations. You may have dif  culty learning in an environment that emphasises verbal learning.";
		
		String description_seq_glo = "On the dimension of sequential/global, your score indicates that you have a strong preference for\r\n"
				+ "sequential learning. You strongly prefer gaining understanding in linear steps, with each step following\r\n"
				+ "logically from the previous one. However, you may struggle when it comes to solving complex problems\r\n"
				+ "as compared to global learners.";
		
		if(pagecontent03.contains(description_act_ref)) {
			
			System.out.println("Description of Act_Ref is Corrert");
			
		} else {
			
			System.out.println("Description of Act_Ref is Incorrert");
		}
		
		if(pagecontent03.contains(description_sen_int)) {
			
			System.out.println("Description of Sen_Int is Corrert");
			
		} else {
			
			System.out.println("Description of Sen_Int is Incorrert");
		}
		
		if(pagecontent03.contains(description_vis_ver)) {
			
			System.out.println("Description of Vis_Ver is Corrert");
			
		} else {
			
			System.out.println("Description of Vis_Ver is Incorrert");
		}
		
		if(pagecontent03.contains(description_seq_glo)) {
			
			System.out.println("Description of Seq_Glo is Corrert");
			
		} else {
			
			System.out.println("Description of Seq_Glo is Incorrert");
		}

		System.out.println("=========================PAGE CONTENT - 03===============================");	
				
				
		//driver.findElement(By.xpath("//button[contains(text(),'Back')]")).click();
		
		//driver.quit();
		
	}

}
