package main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import main.entities.*;

public interface ItemBRepository extends JpaRepository<ItemB, Long> {

}