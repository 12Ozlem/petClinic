package com.petClinic.demo.service;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import com.petClinic.demo.model.BaseEntity;

public class AbstractMapService<T extends BaseEntity, ID extends Long> {
	
	protected Map<Long, T> map = new HashMap<>();
	
	Set<T> findAll()
	{
		return new HashSet<>(map.values());
	}
	void deleteByID(ID id)
	{
		map.remove(id);
	}
	
	T save(T object)
	{
		if(object != null) {
			if (object.getId() == null) {
				object.setId(getNextId(object));
			}
		}
		else
		{
			throw new RuntimeException("Object can not be null");
		}
		return map.put(object.getId(), object);
	}
	
	
	T findById(ID id) {
		return map.get(id);
	}

	void delete( T object) {
		map.entrySet().removeIf(entry -> entry.getValue().equals(object));
	}
	
	private Long getNextId(T Object)
	{
		Long nextId = null;
		try {
			nextId = Collections.max((Collection<? extends Long>) map.keySet()) +1L;
		}catch(NoSuchElementException exp)
		{
			nextId = 1L;
		}
		return nextId;
	}

}
