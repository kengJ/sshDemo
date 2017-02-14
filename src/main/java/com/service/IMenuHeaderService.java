package com.service;

import java.util.List;

import com.model.MenuHeader;

public interface IMenuHeaderService {
	public List<MenuHeader> getMenuList();
	public void AddMenuHeader(String HeaderName);
}
