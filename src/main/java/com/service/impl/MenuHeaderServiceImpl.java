package com.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.dao.IMenuHeaderDao;
import com.model.MenuHeader;
import com.service.IMenuHeaderService;

@Transactional
@Service
public class MenuHeaderServiceImpl implements IMenuHeaderService {

	@Resource
	private IMenuHeaderDao menuHeaderDao;
	
	@Override
	public List<MenuHeader> getMenuList() {
		return menuHeaderDao.find("from MenuHeader");
	}

	@Override
	public void AddMenuHeader(String HeaderName) {
		MenuHeader menuHeader = new MenuHeader(HeaderName);
		menuHeaderDao.Save(menuHeader);
	}

}
