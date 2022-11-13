package main.entities;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class ItemDB extends ItemD {
	
	public String additionalInfo;
	
	public ItemDB() {}
	
	public ItemDB(String name, Integer price, String description, String additionalInfo) {
		super(name, price, description);
		this.additionalInfo=additionalInfo;
	}

}