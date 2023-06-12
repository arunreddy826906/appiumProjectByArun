package commonpractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaScriptExecutorSituation8ContentTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Pattern p=Pattern.compile("[I][n][d][i][a]",Pattern.CASE_INSENSITIVE);
      Matcher m=p.matcher("won 2nd worldcup india india");
      int count=0;
      while(m.find())
      {
    	  count++;
    	  
      }
      System.out.println("count is: "+count);
	}

}
