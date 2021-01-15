package com.qamar.example.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qamar.example.repository.UserRepo;
import com.qamar.example.service.SequenceGeneratorService;
import com.qamar.example.service.UserService;
import com.qamar.example.service.UserServiceImpl;
import com.qamar.examplemodel.DatabaseSequence;
import com.qamar.examplemodel.MethodsData;
import com.qamar.examplemodel.User;


@RestController
@RequestMapping("/api/v1")
public class UserController {

	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@Autowired
	private SequenceGeneratorService sequenceGeneratorService;
	
	 @GetMapping("/allMethodsData")
	    public MethodsData getLargestnumber(@RequestBody MethodsData data) {
		 
		 MethodsData result = new MethodsData();

		 int [] numbersMeetNumbers = userServiceImpl.numbersMeetNumbers(data.getArr());
		 List<String> duplicate = userServiceImpl.findDuplicates(data.getDuplicate());
		 String noWhiteSpace = userServiceImpl.whiteSpacesGalore(data.getWhitespace());
		 
		 result.setArr(numbersMeetNumbers);
		 result.setDuplicate(duplicate);
		 result.setWhitespace(noWhiteSpace);
	        return result;
	    }
	 
	 @PostMapping("/employees")
	    public User storeUser(@Validated @RequestBody User user) {
		 user.setId(sequenceGeneratorService.generateSequence(User.SEQUENCE_NAME));
		 return userRepo.save(user);
	    }


	
}
