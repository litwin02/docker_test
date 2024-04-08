package com.litwin.docker.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.litwin.docker.Models.Item;
import com.litwin.docker.Repositories.ItemRepository;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class ItemController {

    @Autowired
    private ItemRepository itemRepository;

    @GetMapping("/items")
    public List<Item> getItems()
    {
        return itemRepository.findAll();
    }
}
