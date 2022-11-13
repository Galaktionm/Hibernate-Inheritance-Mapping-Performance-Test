package main.entities;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class ItemCA extends ItemC {
	
	public String additionalInfo;
	
	public ItemCA() {}
	
	public ItemCA(String name, Integer price, String description, String additionalInfo) {
		super(name, price, description);
		this.additionalInfo=additionalInfo;
	}

}