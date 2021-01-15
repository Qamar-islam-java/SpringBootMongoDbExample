package com.qamar.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface UserService {

	int[] numbersMeetNumbers(int[] arr);
	List<String> findDuplicates(List<String> str);
	String whiteSpacesGalore(String str);
}
