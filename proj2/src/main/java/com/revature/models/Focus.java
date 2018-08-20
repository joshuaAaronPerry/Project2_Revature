package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Focus {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "foc_gen")
	@SequenceGenerator(initialValue = 1, sequenceName = "focus_id_generator", name = "foc_gen")
	@Column(name = "f_id", nullable = false, precision = 10)
	private int f_id;
	
	@Column(name = "name")
	private String name;
	
	public Focus() {
		super();
	}
	public Focus(int f_id, String name) {
		super();
		this.f_id = f_id;
		this.name = name;
	}
	
	public int getF_id() {
		return f_id;
	}
	public void setF_id(int f_id) {
		this.f_id = f_id;
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
		result = prime * result + f_id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Focus other = (Focus) obj;
		if (f_id != other.f_id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Focus [f_id=" + f_id + ", name=" + name + "]";
	}
	
	
}
