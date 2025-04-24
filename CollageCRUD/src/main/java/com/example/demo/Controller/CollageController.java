package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Collage;
import com.example.demo.service.CollageService;

@RestController
public class CollageController {

	@Autowired
	private CollageService cs;

	@PostMapping("/add")
	public void add(@RequestBody Collage collage) {
		cs.add(collage);
	}

	@GetMapping("/Display")
	public List<Collage> display() {
		return cs.display();
	}

	@DeleteMapping("/DeleteRecord/{id}")
	public void delete(@PathVariable Integer id) {
		cs.delete(id);
	}

	@PutMapping("/Update/{id}")
	public void updateCollage(@RequestBody Collage collage, @PathVariable Integer id) {
		cs.update(collage, id);
	}

}
