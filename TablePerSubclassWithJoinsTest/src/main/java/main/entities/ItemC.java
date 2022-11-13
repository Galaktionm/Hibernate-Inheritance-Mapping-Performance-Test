package main.entities;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class ItemC extends Item{
	
	private String description;
	
	public ItemC() {}
	
	public ItemC(String name, Integer price, String description) {
		super(name, price);
		this.description=description;
	}

}