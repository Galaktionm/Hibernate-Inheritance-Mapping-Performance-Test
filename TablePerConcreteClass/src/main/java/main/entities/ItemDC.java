package main.entities;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class ItemDC extends ItemD {
	
	public String additionalInfo;
	
	public ItemDC() {}
	
	public ItemDC(String name, Integer price, String description, String additionalInfo) {
		super(name, price, description);
		this.additionalInfo=additionalInfo;
	}

}