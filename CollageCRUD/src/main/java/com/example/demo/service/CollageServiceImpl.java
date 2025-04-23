package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.CollageRepository;
import com.example.demo.model.Collage;

@Service
public class CollageServiceImpl implements CollageService {

	@Autowired
	private CollageRepository cr;
	
	
	@Override
	public void add(Collage collage) {
		// TODO Auto-generated method stub
		cr.save(collage);
	}

	@Override
	public List<Collage> display() {
		// TODO Auto-generated method stub
		return cr.findAll();
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		cr.deleteById(id);
	}

	@Override
	public void update(Collage collage, Integer id) {
		// TODO Auto-generated method stub
		collage.setId(id);
		cr.save(collage);
	}

}
