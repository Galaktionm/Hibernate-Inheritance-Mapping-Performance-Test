package main.entities;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class ItemBB extends ItemB {
	
	public String additionalInfo;
	
	public ItemBB() {}
	
	public ItemBB(String name, Integer price, String description, String additionalInfo) {
		super(name, price, description);
		this.additionalInfo=additionalInfo;
	}

}