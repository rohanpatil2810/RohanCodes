package com.service;

public class UnvalidBook extends Exception{
	UnvalidBook(String msg){
		System.out.println(msg);
	}
}
