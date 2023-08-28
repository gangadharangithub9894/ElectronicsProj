package com.electronics.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.electronics.dao.AcDao;
import com.electronics.entity.Ac;

@Service
public class AcService {
	@Autowired
	AcDao adao;

	public String setAc(Ac ac) {
		return adao.setAc(ac);
	}

	public String setAllAc(List<Ac> acs) {
		return adao.setAllAc(acs);
	}

	public List<Ac> getAllAc() {
		return adao.getAllAc();
	}

	public Ac getById(int x) {
		
		return adao.getById(x);
	}

}
