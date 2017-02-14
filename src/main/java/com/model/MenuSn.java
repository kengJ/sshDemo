package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Menu_Sn")
public class MenuSn {

	@Id
	@GeneratedValue
	@Column(length=18)
	private long Id;
	
	private String Name;
	
	private String Data;
	
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="MenuFaId")
	private MenuSn MenuFa;
	
	public MenuSn getMenuFa() {
		return MenuFa;
	}
	public void setMenuFa(MenuSn menuFa) {
		MenuFa = menuFa;
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
	public String getData() {
		return Data;
	}
	public void setData(String data) {
		Data = data;
	}
	
}
