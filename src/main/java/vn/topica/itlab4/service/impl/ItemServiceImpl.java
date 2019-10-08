package vn.topica.itlab4.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import vn.topica.itlab4.entity.Item;
import vn.topica.itlab4.repository.ItemRepository;
import vn.topica.itlab4.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService{
	@Autowired
	private ItemRepository repository;

	@Override
	public Item save(Item item) {
		return repository.save(item);
	}

	@Override
	public List<Item> findByCategory(String category, int pageIndex, int pageSize) {
		
		return repository.findByCategory(category, PageRequest.of(pageIndex, pageSize));
	}
}
