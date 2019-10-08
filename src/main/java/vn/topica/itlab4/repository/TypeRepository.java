package vn.topica.itlab4.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import vn.topica.itlab4.entity.Type;

public interface TypeRepository extends PagingAndSortingRepository<Type, Integer>
{
	Type findTypeByName(String name);
	Type findTypeById(int id);
}
