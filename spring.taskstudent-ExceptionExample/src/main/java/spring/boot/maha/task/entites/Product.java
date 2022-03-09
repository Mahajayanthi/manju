package spring.boot.maha.task.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
@Entity
@Table
public class Product {
	@org.springframework.data.annotation.Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String Name;
	private int Id;
	public Product() {
		super();
	}
	public Product(String name, int id) {
		super();
		Name = name;
		Id = id;
	}
	public void setId(String id2) {
		
		
	}
	public void setName(String string) {
		
		
	}
	public String getId() {
		
		return null;
	}
	public string ()
	{
		return null;
	}

}
