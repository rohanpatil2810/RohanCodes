package com.service;
import java.util.ArrayList;
import java.util.List;

import com.model.*;

public class BookStore {
	
	List<Book> l=new ArrayList();
	Book b=new Book(1,"Thoughts","ROhan","Motivational",200f);
	Book b1=new Book(2,"Rich Dad","Rohan","Inspirational",500f);
	Book b2=new Book(3,"ShareMarket","Rohan","Studious",440f);
	Book b3=new Book(4,"ShareMarket","Rohan","Science",440f);
	Book b4=new Book(5,"ShareMarket","Rohan","Fiction",440f);
	Book b5=new Book(5,"ShareMarket","Rohan","Iction",-40f);
	public BookStore() throws UnvalidBook{
		
	l.add(b);
	l.add(b1);
	l.add(b2);
	l.add(b3);
	l.add(b4);
	l.add(b5);
	for(Book obj:l) {
		if(obj.getTitle()=="Scince") {
			System.out.println(obj+" from BookStore");
		}
		if(obj.getAuthor()=="Fiction") {
			System.out.println(obj+" from BookStore");
		}
		else if(obj.getPrice()<0) {
				throw new UnvalidBook("Price must be +ve for book "+obj.getBookid());				
			
		}
		
	}
	//System.out.println();
	System.out.println(l);
	
	}
	public List toreturnList() {
		return l;
	}
	public void filtering() {
		
	}
	public static void main(String[] args) throws UnvalidBook {
		try {
			BookStore bs=new BookStore();
		} catch (UnvalidBook e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
}
