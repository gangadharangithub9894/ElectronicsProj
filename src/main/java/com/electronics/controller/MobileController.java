package com.electronics.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.electronics.entity.Mobile;
import com.electronics.service.MobileService;

@RestController
@RequestMapping("/mobile")
public class MobileController {
	@Autowired
	MobileService ms;

	@PostMapping(value = "/setMobile")
	public String setMobile(@RequestBody Mobile mob) {
		return ms.setMobile(mob);
	}

	@PostMapping(value = "/setAllMobile")
	public String setAllMobile(@RequestBody List<Mobile> mobs) {
		return ms.setAllMobile(mobs);
	}

	@GetMapping(value = "/getAllMobile")
	public List<Mobile> getAllMobile() {
		return ms.getAllMobile();
	}

	@GetMapping("/getById/{x}")
	public Mobile getById(@PathVariable int x) {
		return ms.getById(x);
	}

	@GetMapping("/getByBrand/{x}")
	public List<Mobile> getByBrand(@PathVariable String x) {
		return ms.getByBrand(x);
	}

	@GetMapping("/getMax")
	public Mobile getMax() {
		return ms.getMax();
	}

	@GetMapping("/getBrandByColor/{c}")
	public List<String> getBrandByColor(@PathVariable String c) {
		return ms.getBrandByColor(c);
	}

}
