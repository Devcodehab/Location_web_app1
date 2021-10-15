package com.psa.location_web_app1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.psa.location_web_app1.entities.Location;
import com.psa.location_web_app1.repositories.LocationRepository;

@Controller
public class LocationController {
	
	@Autowired
	private LocationRepository locationRepo;
	
	@RequestMapping("showLocation")
	public String showLocation() {
		return "showLocation";
		
	}

	@RequestMapping("/saveLoc")
	public String saveLoc(@ModelAttribute("location") Location location,ModelMap modelmap) {
		locationRepo.save(location);
		modelmap.addAttribute("msg","location saved!!");
		return("showLocation");
	} 
}
