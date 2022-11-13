package main.entities;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class ItemEB extends ItemE {
	
	public String additionalInfo;
	
	public ItemEB() {}
	
	public ItemEB(String name, Integer price, String description, String additionalInfo) {
		super(name, price, description);
		this.additionalInfo=additionalInfo;
	}

}