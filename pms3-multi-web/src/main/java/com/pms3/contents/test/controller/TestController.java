package com.pms3.contents.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pms3.Pms3Application;
import com.pms3.Entity.TestVOEntity;
import com.pms3.contents.test.entity.TestDTOEntity;

@Controller
public class TestController {

	@RequestMapping(value="/test")
	public String test(Model model) {
		
		TestVOEntity testVOEntity = new TestVOEntity();
		TestDTOEntity testDTOEntity = new TestDTOEntity();
		
		testVOEntity.setTestDTO(testDTOEntity.getTestDTO());
		
		String testVO = testVOEntity.getTestVO();
		String testDTO = testVOEntity.getTestDTO();
		
		model.addAttribute("testVO", testVO);
		model.addAttribute("testDTO", testDTO);
		
		return "testView";
	}
	
}
