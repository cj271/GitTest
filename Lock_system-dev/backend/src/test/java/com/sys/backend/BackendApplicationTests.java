package com.sys.backend;

import com.sys.backend.Entity.Pet;
import com.sys.backend.Repository.JpaPetRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Optional;

@SpringBootTest
class BackendApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("测试启动");
	}
	@Autowired
	JpaPetRepository jpaPetRepository;
	/*
	*测试增删查改
	* */
	@Test
	void testAddPet() {
		System.out.println("测试启动testAddPet");
		Pet pet = new Pet();
		//如果设置了id,那么首先进行查询操作，若id已存在，则进行更新操作，不存在则进行插入操作
		//pet.setId(1);
		pet.setColor("red");
//		pet.setName("mike");
		jpaPetRepository.save(pet);
	}
	/*根据id查*/
	@Test
	void testFindPet() {
		System.out.println("测试启动testFindPet");
		Optional<Pet> optional=jpaPetRepository.findById(2);
		Pet pet = optional.get();
		System.out.println(pet.getName());
	}


}
