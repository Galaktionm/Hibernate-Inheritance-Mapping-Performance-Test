package main.entities;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class ItemAC extends ItemA {
	
	public String additionalInfo;
	
	public ItemAC() {}
	
	public ItemAC(String name, Integer price, String description, String additionalInfo) {
		super(name, price, description);
		this.additionalInfo=additionalInfo;
	}

}