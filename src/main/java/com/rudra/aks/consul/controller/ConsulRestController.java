package com.rudra.aks.consul.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consul")
public class ConsulRestController {

	private static Logger logger = LoggerFactory.getLogger(ConsulRestController.class);

	@GetMapping(path = "/get/{msg}")
	public ResponseEntity<?>	get(@PathVariable("msg") String msg) {
		logger.info("Start : " + getClass().getName() + " : get()");
		return new ResponseEntity<>("success" + msg, HttpStatus.OK);
	}
}
