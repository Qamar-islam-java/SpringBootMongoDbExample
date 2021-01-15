package com.qamar.example.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class UserServiceImpl implements UserService{

	@Override
	public int[] numbersMeetNumbers(int[] arr) {
		 int[] max = new int[1];
		 max[0] = Arrays.stream(arr).max().getAsInt();
	        return max;
	}

	@Override
	public List<String> findDuplicates(List<String> str) {
			List<String> l = new ArrayList<>();
		 l.add(str.stream().max(Comparator.comparingInt(String::length)).get());
		 return l;
	}

	@Override
	public String whiteSpacesGalore(String str) {

			return str.replaceAll("\\s+","");
	}

}
