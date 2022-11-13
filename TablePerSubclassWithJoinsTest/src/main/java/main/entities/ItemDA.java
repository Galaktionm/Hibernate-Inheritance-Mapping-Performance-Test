package main.entities;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class ItemDA extends ItemD {
	
	public String additionalInfo;
	
	public ItemDA() {}
	
	public ItemDA(String name, Integer price, String description, String additionalInfo) {
		super(name, price, description);
		this.additionalInfo=additionalInfo;
	}

}