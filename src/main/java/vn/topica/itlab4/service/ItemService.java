package vn.topica.itlab4.service;

import java.util.List;

import vn.topica.itlab4.entity.Item;

public interface ItemService {
	Item save(Item item);
	List<Item> findByCategory(String category, int pageIndex, int pageSize);
}
