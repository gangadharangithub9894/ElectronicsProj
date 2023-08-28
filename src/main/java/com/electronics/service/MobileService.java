package com.electronics.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.electronics.dao.MobileDao;
import com.electronics.entity.Mobile;

@Service
public class MobileService {
	@Autowired
	MobileDao md;

	public String setMobile(Mobile mob) {
		return md.setMobile(mob);
	}

	public String setAllMobile(List<Mobile> mobs) {
		return md.setAllMobile(mobs);

	}

	public List<Mobile> getAllMobile() {
		return md.getAllMobile();
	}

	public Mobile getById(int x) {
		return md.getById(x);
	}

	public List<Mobile> getByBrand(String x) {
		return md.getByBrand(x);
	}

	public Mobile getMax() {
		return md.getMax();
	}

	public List<String> getBrandByColor(String c) {
		
		return md.getBrandByColor(c);
	}

}
