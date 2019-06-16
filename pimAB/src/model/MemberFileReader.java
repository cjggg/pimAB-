package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javafx.beans.property.SimpleStringProperty;

public class MemberFileReader {
	Scanner sc = null;
	
	public MemberFileReader(File f) throws FileNotFoundException {
		sc = new Scanner(f);
	}
	public ArrayList<Member> readMember() {
		ArrayList<Member> retObj = new ArrayList<Member>();
		while(sc.hasNext()) {
			Member m = new Member();
			String strArr[] = sc.nextLine().split("\t");
			m.setEmail(strArr[0]);
			m.setPw(strArr[1]);
			m.setName(strArr[2]);
			m.setBirth(strArr[3]);
			m.setAge(strArr[4]);
			m.setAddress(strArr[5]);
			m.setContact(strArr[6]);
			retObj.add(m);			
		}
		return retObj;
	}
}