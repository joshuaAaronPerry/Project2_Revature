package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Skill")
public class Skill {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "skill_gen")
	@SequenceGenerator(initialValue = 1, name = "skill_gen", sequenceName = "skill_id_generator")
	@Column(name = "S_ID", nullable = false)
	private int s_id;
	
	@Column(name = "NAME", length = 40)
	private String name;

	public Skill() {
		super();
	}

	public Skill(int s_id, String name) {
		super();
		this.s_id = s_id;
		this.name = name;
	}

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + s_id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Skill other = (Skill) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (s_id != other.s_id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Skill [s_id=" + s_id + ", name=" + name + "]";
	}
	
}
