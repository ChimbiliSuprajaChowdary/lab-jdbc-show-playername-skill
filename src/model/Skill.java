package model;

public class Skill
{
	public long skill_id;
	String skill_name;
	
	
	public Skill(long skill_id, String skill_name) {
		this.skill_id = skill_id;
		this.skill_name = skill_name;
	}
	public long getSkill_id() {
		return skill_id;
	}
	public void setSkill_id(long skill_id) {
		this.skill_id = skill_id;
	}
	public String getSkill_name() {
		return skill_name;
	}
	public void setSkill_name(String skill_name) {
		this.skill_name = skill_name;
	}
	
	
}

