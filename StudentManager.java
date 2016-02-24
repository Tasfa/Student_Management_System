import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentManager extends DBConnection
{
	private Connection conn=null;
	//open the connection
	public StudentManager()
	{
		conn=getConnection();
	}

	//opetation on student list 
	public int execUpdate(String sql)throws SQLException
	{
		int result=0;
		Statement statement =null;
		try
		{
			statement=conn.createStatement();
			result=statement.executeUpdate(sql);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			if(null!=statement)
				statement.close();
			closeConnection();
		}
		return result;
	}
	
	//search the student list and return the result
	public List<Student>Query(String sqlString)throws SQLException
	{
		List<Student>list=new ArrayList<Student>();
		Statement statement =null;
		ResultSet rs=null;
		
		try
		{
			statement = conn.createStatement();
			rs =statement.executeQuery(sqlString);
			while(rs.next())
				{
				Student m=new Student();
				m.setSno(rs.getString("sno"));
				m.setSname(rs.getString("sname"));
				m.setSsex(rs.getString("ssex"));
				m.setSage(rs.getInt("sage"));
				m.setSdept(rs.getString("sdept"));
				list.add(m);
				}
		}
		catch (SQLException e)
		{
			System.out.println(e);
		}
		finally
		{
			if(statement!=null)
				statement.close();
			if(rs!=null)
				rs.close();
			closeConnection();
		}
		return list;
	}
}