package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Skill;
import utility.ConnectionManager;

public class SkillDAO{
	int id;
	String skill;
public Skill getSkillBylD(Long id) throws ClassNotFoundException, SQLException 
{
			Connection connection = ConnectionManager.getConnection();

			Skill skill = null;

			String sqlString = "select * from skill where id=" + id;
			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery(sqlString);

			while (resultSet.next()) {
				if (resultSet.getInt("id") == id) {
					skill = new Skill(resultSet.getLong("id"), resultSet.getString("name"));
				}
			}
			return skill;
		}
	
}
