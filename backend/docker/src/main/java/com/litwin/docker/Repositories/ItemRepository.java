package com.litwin.docker.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.litwin.docker.Models.Item;

public interface ItemRepository extends JpaRepository<Item, Long>{

}
