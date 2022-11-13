package main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import main.entities.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
