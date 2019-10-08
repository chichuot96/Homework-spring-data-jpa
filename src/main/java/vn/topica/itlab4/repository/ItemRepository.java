package vn.topica.itlab4.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import vn.topica.itlab4.entity.Item;

public interface ItemRepository extends PagingAndSortingRepository<Item, Integer>{
	@Query("SELECT cate FROM Category cate, Item item WHERE cate.id = " +
			"item.categoryId AND cate.name  = ?1")
	List<Item> findByCategory(String category, Pageable page);
}
