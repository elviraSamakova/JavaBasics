package com.syntax.class25;

 class TestTaskBrowser  {

	 public static void main(String[] args) {
			
			RemoteWebDriver[] browserArray={new ChromeDriver(), new Firefox(), new Safari()};
			
			for(RemoteWebDriver browser: browserArray) {
				browser.open();
				browser.close();
				browser.getScreenshot();
				System.out.println(browser.getTitle());
				browser.navigate();
				System.out.println(" -----------------   ");
			}
		}
	}

	
