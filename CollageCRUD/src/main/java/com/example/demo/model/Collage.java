package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Collage {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private float fees;
	public Collage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Collage(String name, float fees) {
		super();
		this.name = name;
		this.fees = fees;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Collage [id=" + id + ", name=" + name + ", fees=" + fees + "]";
	}
	
	
}
