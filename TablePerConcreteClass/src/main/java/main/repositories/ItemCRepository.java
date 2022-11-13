package main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import main.entities.*;

public interface ItemCRepository extends JpaRepository<ItemC, Long> {

}