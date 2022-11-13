package main.entities;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class ItemAA extends ItemA {
	
	public String additionalInfo;
	
	public ItemAA() {}
	
	public ItemAA(String name, Integer price, String description, String additionalInfo) {
		super(name, price, description);
		this.additionalInfo=additionalInfo;
	}

}
