package vn.topica.itlab4.repository;


import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import vn.topica.itlab4.entity.Category;

@Repository
public interface CategoryRepository extends PagingAndSortingRepository<Category,Integer>{
	
	@Query("SELECT obj FROM Category obj, Type t WHERE obj.typeId = t.id AND " +
			"t.name=?1")
	List<Category> findByType(String type,Pageable page);
	
	Category findByName(String name);
}
