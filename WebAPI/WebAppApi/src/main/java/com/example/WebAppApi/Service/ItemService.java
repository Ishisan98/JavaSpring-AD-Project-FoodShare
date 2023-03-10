package com.example.WebAppApi.Service;

import java.util.List;

import com.example.WebAppApi.Model.Item;



public interface ItemService {

    Item createItem (Item item);
    Item updateItem (Item item);
    List<Item> getItemList (Long id);
    Item getItemByName(String name);
    Item getItemById(Long id);
	void deleteItemById(Long id);
}