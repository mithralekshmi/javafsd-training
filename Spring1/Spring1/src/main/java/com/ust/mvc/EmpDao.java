package com.ust.mvc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


public class EmpDao {
	
	JdbcTemplate template;

		public JdbcTemplate getTemplate() {
			return template;
		}

		public void setTemplate(JdbcTemplate template) {
			this.template = template;
		}
		
		public int save(Emp emp){
			String sql="insert into userdetails values("+emp.getUser_id()+",'"+emp.getUser_name()+"'," +emp.getPassword()+","+ ""+emp.getRole()+")";
			return template.update(sql);
		}

		public int update(Emp emp) {
		String sql = "update userdetails set Name = '"+emp.getUser_name()+"', "
		+ "password = "+emp.getPassword()+"role"+emp.getRole()+" where id= "+emp.getUser_id()+")";
		return template.update(sql);
		}
		
		public int delete(int user_id) {
			String sql = "delete from userdetails where id= "+user_id;
			return template.update(sql);
			}
		public Emp findById(int user_id){
			String sql= "select user_id,user_name,password,role from userdetails";
			return template.queryForObject(sql,new Object[] { user_id },
					new BeanPropertyRowMapper<Emp>(Emp.class));
		}
		public List<Emp>findAll() {
			return template.query("select user_id,user_name,password,role from userdetails",new RowMapper<Emp>(){
					public Emp mapRow(ResultSet rs,int row)throws SQLException{
				Emp user = new Emp();
				user.setUser_id(rs.getInt(1));
				user.setUser_name(rs.getString(2));
				user.setPassword(rs.getString(3));
				user.setRole(rs.getString(4));
				
				
				return user;
			}
			
			});
			
				}
		public String validate(int user_id , String password){
			
			String role = "";
			
			List<Emp>userList = null;
			String sql = "Select * from userdetails";
			userList = template.query(sql,new RowMapper<Emp>(){
				public Emp mapRow(ResultSet rs,int row)throws SQLException{
					Emp user = new Emp();
					user.setUser_id(rs.getInt(1));
					user.setUser_name(rs.getString(2));
					user.setPassword(rs.getString(3));
					user.setRole(rs.getString(4));
					
					
					return user;
				}
				
				});
			
			for(Emp users : userList){
				if(users.getUser_id()==user_id&&(users.getPassword()).equals(password)){
					role= users.getRole();
					
				}
			}
			return role;
			
			
		}

}