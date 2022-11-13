package main.entities;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class ItemBC extends ItemB {
	
	public String additionalInfo;
	
	public ItemBC() {}
	
	public ItemBC(String name, Integer price, String description, String additionalInfo) {
		super(name, price, description);
		this.additionalInfo=additionalInfo;
	}

}