package com.electronics.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.electronics.entity.Mobile;
import com.electronics.repositary.MobileRepository;

@Repository
public class MobileDao {
	@Autowired
	MobileRepository mr;

	public String setMobile(Mobile mob) {
		mr.save(mob);
		return "Saved";
	}

	public String setAllMobile(List<Mobile> mobs) {
		mr.saveAll(mobs);
		return "saved All";
	}

	public List<Mobile> getAllMobile() {

		return mr.findAll();
	}

	public Mobile getById(int x) {
		return mr.findById(x).get();
	}

	public List<Mobile> getByBrand(String x) {
		return mr.getByBrand(x);
	}

	public Mobile getMax() {
		return mr.getMax();
	}

	public List<String> getBrandByColor(String c) {
		return mr.getBrandByColor(c);
	}

}
