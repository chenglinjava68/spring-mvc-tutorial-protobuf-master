package com.example.tutorial;

import java.util.List;

public class Demo {
	private String name;
	private Integer id;
	private String email;
	public List<Phone> phone;

	public static class Phone {
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

	public List<Phone> getPhone() {
		return phone;
	}

	public void setPhone(List<Phone> phone) {
		this.phone = phone;
	}


}
