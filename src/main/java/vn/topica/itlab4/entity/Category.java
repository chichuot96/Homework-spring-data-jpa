package vn.topica.itlab4.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CATEGORY")
public class Category {
	@Id
	private int id;
	@Column(name = "CATE_NAME", length = 80, nullable = false)
	private String name;
	@Column(name = "TYPE_ID", nullable = false)
	private int typeId;
	public Category(int id, String name, int typeId) {
		super();
		this.id = id;
		this.name = name;
		this.typeId = typeId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	
	
}
