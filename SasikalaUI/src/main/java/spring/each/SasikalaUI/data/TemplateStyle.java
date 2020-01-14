package spring.each.SasikalaUI.data;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
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
}