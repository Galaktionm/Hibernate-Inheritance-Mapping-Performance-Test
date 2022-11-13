package main.entities;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class ItemD extends Item{
	
	private String description;
	
	public ItemD() {}
	
	public ItemD(String name, Integer price, String description) {
		super(name, price);
		this.description=description;
	}

}