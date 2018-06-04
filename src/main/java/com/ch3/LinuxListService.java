package com.ch3;

public class LinuxListService implements ListService {

	@Override
	public String showListCmd() {
		return "ls";
	}

}
