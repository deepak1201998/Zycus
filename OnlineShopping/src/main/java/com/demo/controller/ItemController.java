package com.demo.controller;

import java.util.List;

import javax.validation.ValidationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entities.Item;
import com.demo.service.ItemService;


//@Controller
//@ResponseBody
@RestController
@RequestMapping(path = "/api/items")
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@GetMapping(path = "")
	public List<Item> getAll(){
		return this.itemService.getAllItems();
	}
	
	@GetMapping(path = "/{itemId}")
	public Item get(@PathVariable("itemId") Long id) {
		return this.itemService.getItem(id);
	}
	
	@PostMapping(path = "")
	public Item createItem(@RequestBody Item item) {
		
	//	return this.itemService.save(item);
		
		
		if(item.getItemName()!= null && item.getSpecifications()!= null && item.getDescription()!= null ) {
		return this.itemService.save(item);
				
		}
		else {
			throw new ValidationException("Item cannot be created");
		}
	}
	
	
	@DeleteMapping(path = "/{itemId}")
	public Item delete(@PathVariable("itemId") Long id) {
		return this.itemService.remove(id);
		
		
		
		
	}
	
	@PutMapping(path = "/{itemId}")
	public Item updateItem(@PathVariable("itemId") Long id,  @RequestBody Item item) {
		
		Item e = this.itemService.getItem(id);
		
		if(e!=null)
			e =  this.itemService.save(item);
		
		return e;
	}

}