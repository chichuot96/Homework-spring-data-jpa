package vn.topica.itlab4.service;

import java.util.List;

import vn.topica.itlab4.entity.Category;

public interface CategoryService {
	 Category save(Category cate);

	  List<Category> findByType(String type, int pageIndex, int pageSize);
}
