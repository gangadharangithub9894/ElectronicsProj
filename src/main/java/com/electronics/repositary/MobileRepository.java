package com.electronics.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.electronics.entity.Mobile;

public interface MobileRepository extends JpaRepository<Mobile, Integer> {
	
	@Query(value="select * from mobile_details where brand like ?" ,nativeQuery=true)
	public List<Mobile> getByBrand(String x);
    
	@Query(value="select * from mobile_details where price=(select max(price) from mobile_details) ",nativeQuery=true)
	public Mobile getMax();

	@Query(value="select brand from mobile_details where colour like ?",nativeQuery=true)
    public List<String> getBrandByColor(String c);
	

    

	
	
	

}
