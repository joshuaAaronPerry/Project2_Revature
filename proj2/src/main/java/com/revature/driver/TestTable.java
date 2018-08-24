package com.revature.driver;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Test")
public class TestTable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqName")
	@SequenceGenerator(initialValue = 1, sequenceName = "seqName", allocationSize = 1, name = "seqName")
	@Column(name = "TID", nullable = false, precision = 10)
	private int tid;
	
	@Column (name = "SID", length = 10)
	private int sid;
	
	@Column(name = "NAME", length = 20)
	private String name;
	
	@Column(name = "STATUS", length = 10)
	private String status;
	
	@Column(name = "ERROR", length = 150)
	private String error;	

}
