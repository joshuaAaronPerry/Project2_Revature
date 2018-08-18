package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Building")
public class Building {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "build_gen")
	@SequenceGenerator(initialValue = 1, name = "build_gen", sequenceName = "building_id_generator")
	@Column(name = "b_id", nullable = false, precision = 10)
	private int b_id;
	
	@Column(name = "name")
	private String name;

	public Building() {
	}

	public Building(int b_id, String name) {
		this.b_id = b_id;
		this.name = name;
	}

	public int getB_id() {
		return b_id;
	}

	public void setB_id(int b_id) {
		this.b_id = b_id;
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
		result = prime * result + b_id;
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
		Building other = (Building) obj;
		if (b_id != other.b_id)
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
		return "Building [b_id=" + b_id + ", name=" + name + "]";
	}
	
}
