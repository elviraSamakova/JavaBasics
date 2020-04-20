package com.syntax.class25;

public interface WebDriver {

	void open();
	void close();
	String getTitle();	
}
interface TakesScreenshot {
	void getScreenshot();
}

interface RemoteWebDriver extends WebDriver, TakesScreenshot{
	void navigate();
}

 class ChromeDriver implements RemoteWebDriver {

	@Override
	public void open() {
		System.out.println("Chrome open");
		
	}

	@Override
	public void close() {
		System.out.println("Chrome close");		
	}

	@Override
	public String getTitle() {
		String title ="Chrome";
		return title;
	}

	@Override
	public void getScreenshot() {
		System.out.println(this.getTitle()+" can take a screenshots");
		
	}

	@Override
	public void navigate() {
		System.out.println(this.getTitle()+" can navigate");		
	}
	
}
 
 
 class Firefox implements RemoteWebDriver {

		@Override
		public void open() {
			System.out.println("Firefox open");
			
		}

		@Override
		public void close() {
			System.out.println("Firefox close");		
		}

		@Override
		public String getTitle() {
			String title ="Firefox";
			return title;
		}

		@Override
		public void getScreenshot() {
			System.out.println(this.getTitle()+" can take a screenshots");
			
		}

		@Override
		public void navigate() {
			System.out.println(this.getTitle()+" can navigate");		
		}
		
	}
 
 class Safari implements RemoteWebDriver {

		@Override
		public void open() {
			System.out.println(this.getTitle()+" opens");
			
		}

		@Override
		public void close() {
			System.out.println(this.getTitle()+" closes");		
		}

		@Override
		public String getTitle() {
			String title ="Safari";
			return title;
		}

		@Override
		public void getScreenshot() {
			System.out.println(this.getTitle()+" can take a screenshots");
			
		}

		@Override
		public void navigate() {
			System.out.println(this.getTitle()+" can navigate");		
		}
		
	}
 

