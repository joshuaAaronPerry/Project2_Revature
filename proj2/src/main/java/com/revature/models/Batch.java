package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Batch {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "b_gen")
	@SequenceGenerator(initialValue = 1, sequenceName = "batch_id_generator", name = "b_gen")
	@Column(name = "batch_id", nullable = false, precision = 10)
	private int batch_id;

	@Column(name = "name")
	private String name;
	
	public Batch() {
		super();
	}
	
	public Batch(int batch_id, String name) {
		super();
		this.batch_id = batch_id;
		this.name = name;
	}

	public int getBatch_id() {
		return batch_id;
	}
	public void setBatch_id(int batch_id) {
		this.batch_id = batch_id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + batch_id;
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
		Batch other = (Batch) obj;
		if (batch_id != other.batch_id)
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
		return "Batch [batch_id=" + batch_id + ", name=" + name + "]";
	}
	
	
}
