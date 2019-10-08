package vn.topica.itlab4.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ITEM")
public class Item {
	@Id
	private int id;
	@Column(name = "ITEM_NAME", length = 100, nullable = false)
	private String name;
	@Column(name = "category_id")
	private int categoryId;
	public Item(int id, String name, int categoryId) {
		super();
		this.id = id;
		this.name = name;
		this.categoryId = categoryId;
	}
	
	
	
	
}
