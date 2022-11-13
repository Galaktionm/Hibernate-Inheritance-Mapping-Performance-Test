package main.entities;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class ItemE extends Item{
	
	private String description;
	
	public ItemE() {}
	
	public ItemE(String name, Integer price, String description) {
		super(name, price);
		this.description=description;
	}

}