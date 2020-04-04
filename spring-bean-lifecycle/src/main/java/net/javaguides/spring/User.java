package net.javaguides.spring;

import org.springframework.beans.factory.annotation.Required;

@SuppressWarnings("deprecation")
public class User {
	private Integer id;
	private String name;

	public User() {
	}

	public User(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	@Required
	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
}
