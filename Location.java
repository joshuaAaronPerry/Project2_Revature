package com.revature.models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

public class Location {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "loc_gen")
	@SequenceGenerator(initialValue = 1, name = "loc_gen", sequenceName = "location_id_generator")
	@Column(name = "l_id", nullable = false, precision = 10)
	private int l_id;
	
	@Column(name = "name", length = 40)
	private String name;
	
	@Column(name = "city", length = 40)
	private String city;
	
	@Column(name = "state", length = 40)
	private String state;
	
	public Location() {
	}

	public Location(int l_id, String name, String city, String state) {
		this.l_id = l_id;
		this.name = name;
		this.city = city;
		this.state = state;
	}

	public int getL_id() {
		return l_id;
	}

	public void setL_id(int l_id) {
		this.l_id = l_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + l_id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
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
		Location other = (Location) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (l_id != other.l_id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Location [l_id=" + l_id + ", name=" + name + ", city=" + city + ", state=" + state + "]";
	}
	
}
