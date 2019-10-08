package vn.topica.itlab4.service;

import vn.topica.itlab4.entity.Type;

public interface TypeService {
	Type save(Type type);
	
	Type find(int id);
}
