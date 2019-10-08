package vn.topica.itlab4.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="TYPE")
public class Type {
	@Id
	private int id;
	@Column(name = "TYPE_NAME", length = 100, nullable = false)
	private String name;
	public Type(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}
