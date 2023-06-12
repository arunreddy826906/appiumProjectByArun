package commonpractice;

import java.util.Optional;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v95.network.Network;

import com.google.common.collect.ImmutableList;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DevToolsAituation3BlockUrlpages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver=new ChromeDriver();
	    DevTools dt=driver.getDevTools();
	    Command cmd1=Network.enable(Optional.empty(), Optional.empty(), Optional.empty());
	    Command cmd2=Network.setBlockedURLs(ImmutableList.of("*.png","*.gif","*.css"));
	    dt.send(cmd1);
	    dt.send(cmd2);
	    driver.get("https://www.redbus.in");
	}

}
