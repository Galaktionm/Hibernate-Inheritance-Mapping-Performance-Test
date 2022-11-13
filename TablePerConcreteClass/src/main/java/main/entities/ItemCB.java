package main.entities;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class ItemCB extends ItemC {
	
	public String additionalInfo;
	
	public ItemCB() {}
	
	public ItemCB(String name, Integer price, String description, String additionalInfo) {
		super(name, price, description);
		this.additionalInfo=additionalInfo;
	}

}