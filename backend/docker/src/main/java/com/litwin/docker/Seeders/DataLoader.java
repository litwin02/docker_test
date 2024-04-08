package com.litwin.docker.Seeders;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.litwin.docker.Models.Item;
import com.litwin.docker.Repositories.ItemRepository;

@Component
public class DataLoader implements CommandLineRunner{

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public void run(String... args) {
        
        List<Item> items = Arrays.asList(
            new Item("Item 1", 10.0),
            new Item("Item 2", 20.0),
            new Item("Item 3", 30.0)
        );
        itemRepository.saveAll(items);
    }
    
}
