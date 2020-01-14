package spring.each.SasikalaUI.data;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccessObject 
{
	private DataSource dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public boolean createTable()
	{
		try {
			PreparedStatement ps=dataSource.getConnection().prepareStatement("create table smart(id int(4) not null auto_increment,model varchar(40) not null,os varchar(20) not null,price int(6) not null, wifi bool not null, blue bool not null, primary key(id))");
			return ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public int adding(Watch watch)
	{
		try {
			PreparedStatement ps=dataSource.getConnection().prepareStatement("insert into smart(model,os,price,wifi,blue) values(?,?,?,?,?)");
			ps.setString(1, watch.getModel());ps.setString(2, watch.getOs());
			ps.setInt(3, watch.getPrice());ps.setBoolean(4, watch.isWifi());
			ps.setBoolean(5, watch.isBluetooth());
			return ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
}
