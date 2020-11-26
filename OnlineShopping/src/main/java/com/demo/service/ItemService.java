package com.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entities.Item;
import com.demo.repository.ItemRepository;


@Service
@Transactional
public class ItemService {
	
	@Autowired
	private ItemRepository itemRepository;

	
	public Item save(Item e) {
		
		Item item = null;
		
		if(e.getItemId() == null) {
			item = (Item) itemRepository.save(e);
		}else {
			item = getItem(e.getItemId());
			
			if(item!=null) {
				item.setItemName(e.getItemName());
				item.setDescription(e.getDescription());
				item.setSuppliers(e.getSuppliers());
				item.setSpecifications(e.getSpecifications());
			}
		}
		
		return item;
		
	}	
	
	
	public List<Item> getAllItems(){
		return itemRepository.findAll();
	}
	
	public Item getItem(Long id) {
		Optional<Item> optEmp =  itemRepository.findById(id);
		Item e = null;
		if(optEmp.isPresent())
			e = optEmp.get();
		
		return e;
	}
	
	public Item remove(Long id) {
		
		Item e = getItem(id);
		if(e!=null) {
			itemRepository.delete(e);
		}
		return e;
	}
}