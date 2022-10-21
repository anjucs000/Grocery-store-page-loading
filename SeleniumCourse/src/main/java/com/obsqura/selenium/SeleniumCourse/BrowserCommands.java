package com.obsqura.selenium.SeleniumCourse;

public class BrowserCommands extends Base {
	String actualTitle,actualURL;
	public void basicCommands() {
		actualTitle=driver.getTitle(); //to get title of the site
		System.out.println(actualTitle);
		actualURL=driver.getCurrentUrl();  //to get actual url from site
		System.out.println(actualURL); 
	}

	public static void main(String[] args) {
		BrowserCommands obj=new BrowserCommands();
		obj.initialiseBrowser();
		obj.basicCommands();
		obj.browserClose(); //to close the browser after operations otheriwise multiple browser pages 

	}

}
