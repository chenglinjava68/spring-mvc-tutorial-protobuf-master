package com.example.tutorial;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tutorial.AddressBookProtos.Person;
import com.github.taojoe.Transformer;

@RestController
public class AddressBookController {
	
    @RequestMapping("person")
    private Demo getPerson() {
    	Transformer trans= new Transformer();
    	AddressBookProtos.Person.Builder user= AddressBookProtos.Person.newBuilder().setId(1)
    			.setEmail("705366435@qq.com").setName("chenglinjava")
    			.addPhone(Person.PhoneNumber.newBuilder().setNumber("11").setType(Person.PhoneType.HOME));
    	Demo demo = trans.messageToJava(user, Demo.class);
    	System.out.println(demo.getPhone().get(0).getNumber());
    	System.out.println(demo.getPhone().get(0).getType());
    	return demo;
    }
}
