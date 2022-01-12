package com.niteshb.nitpetclinic.controllers;

import com.niteshb.nitpetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owner")
@Controller
public class OwnerController {

	private final OwnerService ownerService;

	public OwnerController(OwnerService ownerService) {
		this.ownerService = ownerService;
	}

	@RequestMapping({ "", "/index" })
	public String listOwners(Model model) {
		model.addAttribute("owners", ownerService.findAll());
		return "owner/index";
	}

}
