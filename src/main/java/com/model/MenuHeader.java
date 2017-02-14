package com.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="Menu_Header")
public class MenuHeader {

	@Id
	@GeneratedValue
	@Column(length=18)
	private long Id;
	
	private String Name;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="MenuHeaderId")
	private Set<MenuFa> MenuFas;

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Set<MenuFa> getMenuFas() {
		return MenuFas;
	}
	
	public void setMenuFas(Set<MenuFa> menuFas) {
		MenuFas = menuFas;
	}

	@Override
	public String toString() {
		return "MenuHeader [Id=" + Id + ", Name=" + Name + ", MenuFas=" + MenuFas + "]";
	}
	
	public MenuHeader(String HeaderName){
		this.Name = HeaderName;
		this.MenuFas = new HashSet<MenuFa>();
	}
}
