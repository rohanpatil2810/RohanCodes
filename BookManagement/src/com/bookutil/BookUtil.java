package com.bookutil;
import java.util.List;

import com.model.*;
import com.service.*;
public class BookUtil {

	public static void main(String[] args) throws UnvalidBook {
		// TODO Auto-generated method stub
		BookStore bs=new BookStore();
		List li=bs.toreturnList();
		System.out.println(li);
		
		
		
		
//		for(int i=0;i<li.size();i++) {
//			if((boolean) li.get(i)) {
//				Object o=li.get(i);
//				System.out.println(o);
//			}
//		}
		//System.out.println(bs);
		//System.out.println(bs.l);
//		BookStore bs1=(BookStore)(new Book(1,"Thoughts","ROhan","Motivational",200f));
//		BookStore bs1=(BookStore)(new Book(2,"Rich Dad","Rohan","Inspirational",500f));
//		BookStore bs2=(BookStore)(new Book(3,"ShareMarket","Rohan","Studious",440f));
//		
	}

}
