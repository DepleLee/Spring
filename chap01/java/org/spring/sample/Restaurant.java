package org.spring.sample;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

// 의존성 주입 방법 : setter주입(@Setter(onMethod = {@Autowired)),  생성자주입, 필드주입, final사용(최근가장핫함)

@Component
@Data
//@AllArgsConstructor
@RequiredArgsConstructor
public class Restaurant {
	private final Chef chef;

	//세터
//	private Chef chef;	
//	@Autowired
//	@Setter(onMethod_ = {@Autowired})
//	public void setChef(Chef chef) {
//		this.chef = chef;
//	}
	
	
// 필드 주입
//	@Autowired
//	public void setChef(Chef chef) {
//		this.chef = chef;
//	}
//	
	
	
	
	
	
	
	
	
}
