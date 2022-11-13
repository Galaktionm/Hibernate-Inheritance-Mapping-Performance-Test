package main.entities;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class ItemB extends Item{
	
	private String description;
	
	public ItemB() {}
	
	public ItemB(String name, Integer price, String description) {
		super(name, price);
		this.description=description;
	}

}
