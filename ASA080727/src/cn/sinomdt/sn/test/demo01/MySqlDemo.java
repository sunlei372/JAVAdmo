package cn.sinomdt.sn.test.demo01;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MySqlDemo {
  public void DemoMeth(){
	 try {
		 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		   String url="jdbc:sqlserver://localhost:1433;DatabaseName=SN";
		   Connection conn=DriverManager.getConnection(url, "sa", "never!again");
		   if (conn!=null) {
			System.out.println("���ӳɹ�");
		}else {
			System.out.println("����ʧ��");
		}
		   
	} catch (ClassNotFoundException e) {
		// TODO: handle exception
		e.printStackTrace();
	}catch (SQLException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
  }
}
