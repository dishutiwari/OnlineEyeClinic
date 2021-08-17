package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.service.ITestService;


	@RestController
	@RequestMapping("test/api/v1")
	public class TestController {
	    @Autowired
		private ITestService ts;
	    @SuppressWarnings({ "rawtypes", "unchecked" })
		@GetMapping("/tests")
		public ResponseEntity<List<Test>> getAllTests(){
			List<Test> test= ps.getAllPatients();
			if(test.isEmpty()) {
				return new ResponseEntity("Sorry! Patients not found!", 
						HttpStatus.NOT_FOUND);
			}
			
			return new ResponseEntity<List<Test>>(patient, HttpStatus.OK);
		}
	    @SuppressWarnings({ "rawtypes", "unchecked" })
		@PostMapping("/tests")
		public ResponseEntity<List<Test>> InsertPatient(@RequestBody Test test){
			List<Test> test= ps.savePatient(test);
			if(test.isEmpty()) {
				return new ResponseEntity("Sorry! Patients not found!", 
						HttpStatus.NOT_FOUND);
			}
			
			return new ResponseEntity<List<Test>>(test, HttpStatus.OK);
		}

	}
