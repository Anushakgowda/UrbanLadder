package generic;

import java.io.File;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class GernericUtilies {
	public static void screenshot(WebDriver driver,String name)
	{
				Date d=new Date();
				String d1 = d.toString();
				String date2 = d1.replace(":","_");
				
			try
			{
				TakesScreenshot t=(TakesScreenshot)driver;
				File src = t.getScreenshotAs(OutputType.FILE);
				File dest=new File("/home/tyss/Desktop/newworkspace/urbanLadder/photo"+date2+name+".png");
				FileUtils.copyFile(src, dest);
			}
			catch(Exception e)
			{
				e.getStackTrace();
			}
				
		
				
				
				
	}

}
