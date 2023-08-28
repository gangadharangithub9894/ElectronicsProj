package com.electronics.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.electronics.entity.Ac;
import com.electronics.repositary.AcRepositary;

@Repository
public class AcDao {
	@Autowired
	AcRepositary ar;

	public String setAc(Ac ac) {

		ar.save(ac);
		return "Saved";
	}

	public String setAllAc(List<Ac> acs) {
		
		 ar.saveAll(acs);
		 return "saved Thanks";
	}

	public List<Ac> getAllAc() {
		return ar.findAll();
	}

	public Ac getById(int x) {
		
		return ar.findById(x).get();
	}

}
