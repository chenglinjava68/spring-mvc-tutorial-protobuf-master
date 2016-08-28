package com.example.tutorial;

import java.util.List;

/**
 * message PhoneNumber { required string number = 1; optional PhoneType type = 2
 * [default = HOME]; } repeated PhoneNumber phone = 4; }
 * 
 * message AddressBook { repeated Person person = 1; }
 * 
 * @author Administrator
 *
 */
public class Person {
	private String name;
	private Integer id;
	private String email;
	List<PhoneNumber> phoneNumber;

	private static class PhoneNumber {
		private String number;
		private PhoneType type = PhoneType.HOME;
		public String getNumber() {
			return number;
		}
		public void setNumber(String number) {
			this.number = number;
		}
		public PhoneType getType() {
			return type;
		}
		public void setType(PhoneType type) {
			this.type = type;
		}
	}
	enum PhoneType {
		MOBILE(0), HOME(1), WORK(2);
		private int index;

		private PhoneType(int index) {
			this.index = index;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
