package com.revature.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Trainer")
public class Trainer {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "t_gen")
	@SequenceGenerator(initialValue = 1, sequenceName = "train_id_generator", name = "t_gen")
	@Column(name = "t_id")
	private int t_id;
	
	@Column(name = "first")
	private String first;
	
	@Column(name = "last")
	private String last;
	
	@Column(name = "email")
	private String email;
	
	public Trainer() {
		super();
	}

	public Trainer(int t_id, String first, String last, String email) {
		super();
		this.t_id = t_id;
		this.first = first;
		this.last = last;
		this.email = email;
	}

	public int getT_id() {
		return t_id;
	}

	public void setT_id(int t_id) {
		this.t_id = t_id;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((first == null) ? 0 : first.hashCode());
		result = prime * result + ((last == null) ? 0 : last.hashCode());
		result = prime * result + t_id;
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
		Trainer other = (Trainer) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (first == null) {
			if (other.first != null)
				return false;
		} else if (!first.equals(other.first))
			return false;
		if (last == null) {
			if (other.last != null)
				return false;
		} else if (!last.equals(other.last))
			return false;
		if (t_id != other.t_id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Trainer [t_id=" + t_id + ", first=" + first + ", last=" + last + ", email=" + email + 
				"]";
	}
	
	
	
	
}
