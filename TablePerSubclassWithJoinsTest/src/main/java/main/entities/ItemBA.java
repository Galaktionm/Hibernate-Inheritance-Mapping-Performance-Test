package main.entities;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class ItemBA extends ItemB {
	
	public String additionalInfo;
	
	public ItemBA() {}
	
	public ItemBA(String name, Integer price, String description, String additionalInfo) {
		super(name, price, description);
		this.additionalInfo=additionalInfo;
	}

}