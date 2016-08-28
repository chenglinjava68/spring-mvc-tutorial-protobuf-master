package com.example.tutorial;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.taojoe.Transformer;
import com.github.taojoe.proto.Transform;
import com.google.protobuf.ByteString;

@RestController
public class AddressBookController {
    @RequestMapping("person")
    AddressBookProtos.Person person() {
    	Transformer trans=new Transformer();
    	AddressBookProtos.Person.Builder user= AddressBookProtos.Person.newBuilder().setUid("uu").addTags("aa").addTags("bb")
                 .setLoginTime(LocalDateTime.now().toString())
                 .setLevelType(Transform.UserLevelType.LV0)
                 .setAvatar(ByteString.copyFrom("abc".getBytes()))
                 .setEnabled(true);
    	
    	Person person=trans.messageToJava(message, clz)
    	
        return AddressBookProtos.Person.newBuilder()
                .setId(1234)
                .setName("John Doe")
                .setEmail("jdoe@example.com")
                .addPhone(
                        AddressBookProtos.Person.PhoneNumber.newBuilder()
                                .setNumber("555-4321")
                                .setType(AddressBookProtos.Person.PhoneType.HOME))
                .build();
    }
}
