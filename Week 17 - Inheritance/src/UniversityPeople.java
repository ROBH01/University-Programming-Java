
class UniversityPeople {
	private String name, address, phoneNumber;

	UniversityPeople(String name, String address, String phoneNumber) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	String getName() {
		return name;
	}

	String getAddress() {
		return address;
	}

	String getPhoneNumber() {
		return phoneNumber;
	}

	void setName(String name) {
		this.name = name;
	}

	void setAddress(String address) {
		this.address = address;
	}

	void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
