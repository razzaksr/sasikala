package spring.each.SasikalaUI.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class TemplateStyle 
{
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	public DataSource getDataSource() {
		return dataSource;
	}
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		jdbcTemplate=new JdbcTemplate(this.dataSource);
	}
	public int insertion(Watch watch)
	{
		String qry="insert into smart(model,os,price,wifi,blue) values(?,?,?,?,?)";
		return jdbcTemplate.update(qry,new Object[] {watch.getModel(),watch.getOs(),watch.getPrice(),watch.isWifi(),watch.isBluetooth()});
	}
	public int stocks()
	{
		return jdbcTemplate.queryForObject("select count(*) from smart", Integer.class);
	}
	public int getPrice(String model)
	{
		return jdbcTemplate.queryForObject("select price from smart where model='"+model+"'", Integer.class);
	}
	public String getModel(int sno)
	{
		return jdbcTemplate.queryForObject("select model from smart where id="+sno, String.class);
	}
	public Watch getOne(int sno)
	{
		return jdbcTemplate.queryForObject("select * from smart where id="+sno, new Iterating());
	}
	public List<Watch> getAll()
	{
		return jdbcTemplate.query("select * from smart", new Iterating());
	}
	private static final class Iterating implements RowMapper<Watch>
	{
		@Override
		public Watch mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			Watch watch=new Watch();watch.setWatchId(rs.getInt("id"));
			watch.setModel(rs.getString("model"));watch.setPrice(rs.getInt("price"));
			watch.setOs(rs.getString("os"));watch.setBluetooth(rs.getBoolean("blue"));
			watch.setWifi(rs.getBoolean("wifi"));
			return watch;
		}
	}
}