package main.entities;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class ItemAB extends ItemA {
	
	public String additionalInfo;
	
	public ItemAB() {}
	
	public ItemAB(String name, Integer price, String description, String additionalInfo) {
		super(name, price, description);
		this.additionalInfo=additionalInfo;
	}

}