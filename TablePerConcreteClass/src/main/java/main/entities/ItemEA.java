package main.entities;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class ItemEA extends ItemE {
	
	public String additionalInfo;
	
	public ItemEA() {}
	
	public ItemEA(String name, Integer price, String description, String additionalInfo) {
		super(name, price, description);
		this.additionalInfo=additionalInfo;
	}

}