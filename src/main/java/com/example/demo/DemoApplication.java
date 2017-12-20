package com.example.demo;

import com.example.demo.model.Air;
import com.example.demo.model.Document;
import com.example.demo.model.Passenger;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private DozerBeanMapper dozerBeanMapper;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		Document scrDocument = new Document();
		scrDocument.setNumber("111111");
		Passenger srcPassenger = new Passenger();
		srcPassenger.setDocument(scrDocument);
		srcPassenger.setInternalId("internalId");
		srcPassenger.setName("name");
		scrDocument.setPassenger(srcPassenger);

		Air srcAir = new Air();
		srcAir.setPnr("srcPnr");
		srcAir.getPassengers().add(srcPassenger);

		Document destDocument = new Document();
		destDocument.setNumber("22222");
		Passenger destPassenger = new Passenger();
		destPassenger.setDocument(destDocument);
		destPassenger.setName("name2");
		destPassenger.setInternalId("internalId");
		destDocument.setPassenger(destPassenger);

		Air destAir = new Air();
		destAir.setPnr("destPnr");
		destAir.getPassengers().add(destPassenger);

		dozerBeanMapper.map(srcAir, destAir);
		System.out.println(destPassenger);
	}
}
