package com.witmerlearnigstylealgorithm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ls_Question_Option {
	
	    //LS Questions

		public static final String question01 = "I understand something better after I";
		public static final String question02 = "I would rather be considered";
		public static final String question03 = "When I think about what I did yesterday I am most likely to get a";
		public static final String question04 = "4. I tend to";
		public static final String question05 = "When I am learning something new, it helps me to";
		public static final String question06 = "If I were a trainer, I would rather train a programme";
		public static final String question07 = "I prefer to get new information in";
		public static final String question08 = "Once I understand";
		public static final String question09 = "In a group working on difficult material, I am more likely to";
		public static final String question10 = "I find it easier";
		public static final String question11 = "In a book with lots of pictures and charts, I am likely to";
		public static final String question12 = "When I solve problems";
		public static final String question13 = "In training sessions I have taken";
		public static final String question14 = "In reading nonfiction, I prefer";
		public static final String question15 = "I like trainers";
		public static final String question16 = "When I’m analyzing a story or a novel";
		public static final String question17 = "When I start a problem, I am more likely to";
		public static final String question18 = "I prefer the idea of";
		public static final String question19 = "I remember best";
		public static final String question20 = "It is more important to me that a trainer";
		public static final String question21 = "I prefer to learn";
		public static final String question22 = "22. I am more likely to be considered";
		public static final String question23 = "When I get directions to a new place, I prefer";
		public static final String question24 = "I learn";
		public static final String question25 = "I would rather first";
		public static final String question26 = "When I am reading for enjoyment, I like writers to";
		public static final String question27 = "When I see a diagram or sketch in training sessions, I am most likely to remember";
		public static final String question28 = "When considering a body of information, I am more likely to";
		public static final String question29 = "I more easily remember";
		public static final String question30 = "When I have to perform a task, I prefer to";
		public static final String question31 = "When someone is showing me data, I prefer";
		public static final String question32 = "When writing a paper, I am more likely to";
		public static final String question33 = "When I have to work on a group project, I first want to";
		public static final String question34 = "I consider it higher praise to call someone";
		public static final String question35 = "When I meet people at a party, I am more likely to remember";
		public static final String question36 = "When I am learning something new, I prefer to";
		public static final String question37 = "37. I am more likely to be considered";
		public static final String question38 = "I prefer project that emphasize";
		public static final String question39 = "For entertainment, I would rather";
		public static final String question40 = "Some trainers start their training programme with an outline of what they will cover. Such outlines are";
		public static final String question41 = "The idea of doing work in groups";
		public static final String question42 = "When I am doing long calculations";
		public static final String question43 = "43. I tend to picture places I have been";
		public static final String question44 = "When solving problems in a group, I would be more likely to";
		
		//LS Options

		public static WebElement option1(WebDriver driver) {
			return driver.findElement(By.xpath("(//label[@class='ass-options '])[1]"));
		}

		public static WebElement option2(WebDriver driver) {
			return driver.findElement(By.xpath("(//label[@class='ass-options '])[2]"));
		}

}
