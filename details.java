package finalProject2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class details {

Scanner sc=new Scanner(System.in);
	
	List l=new ArrayList();
	
	String teamName;
	int points;
	String results;
	
	public details(String teamName, int points, String results) {
		super();
		this.teamName = teamName;
		this.points = points;
		this.results=results;
	}

	public String toString() {
		return teamName+" "+points;
	}
	
	
	}
	


