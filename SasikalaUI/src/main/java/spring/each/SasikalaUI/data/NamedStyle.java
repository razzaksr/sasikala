package spring.each.SasikalaUI.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

@Component
public class NamedStyle 
{
	private DataSource dataSource;
	private NamedParameterJdbcTemplate namedJdbc;
	public DataSource getDataSource() {
		return dataSource;
	}
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		namedJdbc=new NamedParameterJdbcTemplate(dataSource);
	}
	public List<Bike> getByRange(int one,int two)
	{
		String qry="select * from bike where price between :min and :max";
		Map<String, Object> src=new HashMap<>();
		src.put("min", one);src.put("max", two);
		return namedJdbc.query(qry,src, new Parse());
	}
	public List<Bike> getByPhrase(String startsWith)
	{
		String qry="select * from bike where model = :refer";
		SqlParameterSource src=new MapSqlParameterSource("refer",startsWith);
		System.out.println(qry+" "+src);
		return namedJdbc.query(qry,src, new Parse());
	}
	private static final class Parse implements RowMapper<Bike>
	{
		@Override
		public Bike mapRow(ResultSet rs, int rowNum) throws SQLException 
		{
			Bike bike=new Bike();bike.setBid(rs.getInt("bid"));bike.setPrice(rs.getInt("price"));
			bike.setModel(rs.getString("model"));bike.setMilage(rs.getInt("milage"));
			return bike;
		}	
	}
}