/**
 * 
 */
package com.assu.techweek.unicornmanager.unicorn.controller;

import java.util.List;

import javax.servlet.annotation.MultipartConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assu.techweek.unicornmanager.unicorn.model.Unicorn;
import com.assu.techweek.unicornmanager.unicorn.service.UnicornService;

/**
 * @author x738235
 *
 */
@RestController
@RequestMapping("/")
@CrossOrigin
@MultipartConfig(maxFileSize = 1024 * 1024 * 8, maxRequestSize = 1024 * 1024 * 20)
public class UnicornController {
	
	@Autowired
	private UnicornService unicornService;
	
	
	@GetMapping(value="/unicorns")
	public ResponseEntity<List<Unicorn>> getAllUnicorns()
	{
		return ResponseEntity.ok(unicornService.getAllUnicorns());
	}
	
	
	
	@GetMapping(value="/longunicorns")
	public ResponseEntity<List<Unicorn>> getAllLongUnicorns()
	{
		int i = 0;
		while(i < 100)
		{
			System.out.println("appel : " + i);
			i++;
		}
		
		
		return ResponseEntity.ok(unicornService.getAllUnicorns());
	}
	

}
