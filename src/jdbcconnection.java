import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class jdbcconnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		String host="localhost";
		String port="3306";
		String dbName = "qadbt";
		Connection con=DriverManager.getConnection("jdbc:mysql://"+ host+":"+ port+"/"+dbName,"root","lily@1980");
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select * from Employeeinfo where name='ram'");
		
		while(rs.next())
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajay\\Documents\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(rs.getString("location"));
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(rs.getString("location"));
		//System.out.println(rs.getInt("id"));
		//System.out.println(rs.getString("location"));
		}
		
		
	}

}
