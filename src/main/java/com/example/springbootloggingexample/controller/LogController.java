package com.example.springbootloggingexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootloggingexample.service.LogService;

@RestController
public class LogController {

	@Autowired
	private LogService logService;
	
	@GetMapping("/changeloglevel")
	public String changeLogLevel(@RequestParam(required = false) String loggerName,
			@RequestParam(required = false) String level) {
		return logService.setLoglevel(loggerName, level);
	}
}
