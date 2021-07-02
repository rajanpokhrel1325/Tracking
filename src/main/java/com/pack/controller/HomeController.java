package com.pack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pack.vo.CreatePackage;

@Controller
public class HomeController {
	
	@RequestMapping(method = RequestMethod.GET, value="/home")
	public String homecontrol(Model m)
	{
		m.addAttribute("createPackage", new CreatePackage());
		return "home";
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/trackForm")
	public void track_id_control(@RequestParam("tnum") String id,  ModelMap mp)
	{
		
		mp.addAttribute("id", id);
	}

	
	@RequestMapping(method = RequestMethod.POST, value="/createPack")
	public void createPackage(@ModelAttribute(value="createPackage" ) CreatePackage createpackage, BindingResult  result, Model model )
	{
		System.out.println(createpackage.getAddress());
		System.out.println(createpackage.getSender());
	}
	
	

}
