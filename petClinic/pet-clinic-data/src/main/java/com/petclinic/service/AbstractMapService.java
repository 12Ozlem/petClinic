package com.petclinic.service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AbstractMapService<T, ID> {
	
	protected Map<ID, T> map = new HashMap<>();
	
	Set<T> findAll()
	{
		return new HashSet<>(map.values());
	}
	void deleteByID(ID id)
	{
		map.remove(id);
	}
	
	T save(ID id,T object)
	{
		return map.put(id, object);
	}
	
	
	T findById(ID id) {
		return map.get(id);
	}

	void delete( T object) {
		map.entrySet().removeIf(entry -> entry.getValue().equals(object));
	}

}
