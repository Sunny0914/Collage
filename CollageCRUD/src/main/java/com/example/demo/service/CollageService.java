package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.example.demo.model.Collage;
@Service
public interface CollageService {

	public void add(Collage collage);

	public List<Collage> display();

	public void delete(Integer id);

	public void update(Collage collage, Integer id);
}
