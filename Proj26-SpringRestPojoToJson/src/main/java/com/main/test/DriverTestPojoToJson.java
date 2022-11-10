package com.main.test;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.main.pojo.Car;

public class DriverTestPojoToJson {

	public static void main(String[] args) {
		
		try {
			// create object mapper
			ObjectMapper mapper = new ObjectMapper();
			
				
			Car car = new Car("yellow", "renault");
			mapper.writeValue(new File("target/car.json"), car);

		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
