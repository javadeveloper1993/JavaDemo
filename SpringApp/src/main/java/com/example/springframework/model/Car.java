package com.example.springframework.model;

public class Car {

	private String color;
	private double price;
	private String modelName;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", price=" + price + ", modelName="
				+ modelName + "]";
	}

}
