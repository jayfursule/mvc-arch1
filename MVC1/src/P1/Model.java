package P1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author Jay Fursule
 *
 */
public class Model 
{
	String url = "jdbc:oracle:thin:@//localhost:1521/XE";
	String un = "system";
	String pw = "system";
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet res = null;
	
	private String regno = null;
	private String name = null;
	private int marks1 = 0;
	private int marks2 = 0;
	private int marks3 = 0;
	private float avg =0.0f;
	public void setRegno(String regno) {
		this.regno = regno;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMarks1(int marks1) {
		this.marks1 = marks1;
	}
	public void setMarks2(int marks2) {
		this.marks2 = marks2;
	}
	public void setMarks3(int marks3) {
		this.marks3 = marks3;
	}
	public void setAvg(float avg) {
		this.avg = avg;
	}
	public String getRegno() {
		return regno;
	}
	public String getName() {
		return name;
	}
	public int getMarks1() {
		return marks1;
	}
	public int getMarks2() {
		return marks2;
	}
	public int getMarks3() {
		return marks3;
	}
	public float getAvg() {
		return avg;
	}
	
	
	public Model()
	{
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection(url, un, pw);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void getResult()
	{
		try
		{
			pstmt= con.prepareStatement("Select * from JULY_STUDENT1 WHERE REGNO = ?");
			pstmt.setString(1, regno);
			res= pstmt.executeQuery();
			
			
			while(res.next()==true)
			{
				regno = res.getString(1);
				name = res.getString(2);
				marks1 = res.getInt(3);
				marks2 = res.getInt(4);
				marks3 = res.getInt(5);
				avg = res.getFloat(6);
				
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
