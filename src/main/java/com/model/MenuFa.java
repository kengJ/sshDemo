package com.model;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@Table(name="Menu_Fa")
public class MenuFa {

	@Id
	@GeneratedValue
	@Column(length=18)
	private long Id;
	
	private String Name;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="MenuFaIds")
	private Set<MenuSn> MenuSns;
	
	@ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name="MenuHeaderId")
	private MenuHeader MenuHeader;
	
	public MenuHeader getMenuHeader() {
		return MenuHeader;
	}

	public void setMenuHeader(MenuHeader menuHeader) {
		MenuHeader = menuHeader;
	}

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

	public Set<MenuSn> getMenuSns() {
		return MenuSns;
	}

	public void setMenuSns(Set<MenuSn> menuSns) {
		MenuSns = menuSns;
	}

	@Override
	public String toString() {
		return "MenuFa [Id=" + Id + ", Name=" + Name + ", MenuSns=" + MenuSns + "]";
	}

	
}
