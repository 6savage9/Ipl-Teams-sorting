package finalProject2;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class teams {
	
	List l=new ArrayList();
	
	Scanner sc=new Scanner(System.in);
	details d;

	public void addTeam() {
		
		System.out.println("Enter Team name: ");
		String name=sc.next();
		System.out.println("Enter Points: ");
		int points=sc.nextInt();
		
		String results="";
		
		for(int i=0; i<5; i++) {
			System.out.println("Enter Result W or L");
			String input1=sc.next();
			
			if(!(input1.equals("W") || input1.equals("L") || input1.equals("w") || input1.equals("l"))) {
				System.out.println("Invalid Input");
			}
			
			else {
				if(input1.equals("w") || input1.equals("l")) {
					input1.toUpperCase();
				}
				results=results+input1;
			}
				
			
		}
		
		d=new details(name, points, results);
		
		l.add(d);
		
	}
	
	public void display() {
		
		for(int i=0; i<l.size(); i++) {
			System.out.println(l.get(i));
		}
		
	}
	
	public void consecLoss() {
		
		for(int i=0; i<l.size(); i++) {
			
			details m=(details)l.get(i);
		//	System.out.println(m);

			String []s1=m.results.split("");
			
			for(int j=0; j<s1.length; j++) {
				
				if(s1[j].equals("L")) {
					
					if((j+1)<s1.length) {
						if(s1[j].equals(s1[j+1])) {
							System.out.println(m.teamName);
							break;
						}
					}
						
				}
				
			}
			
		}
	}
	
	public void userSelects() {
		
		System.out.println("1. Consecutive Wins    2. Consecutive Loss");
		int input=sc.nextInt();
		System.out.println("Select Number of Results: ");
		int input2=sc.nextInt();
		
		if(input2<=5) {
			
			switch(input) {
			
			case 1:{
				
				for(int i=0; i<l.size(); i++) {
					
					details m=(details)l.get(i);
					String []s1=m.results.split("");
					
					if(input2==1) {
						
						for(int j=0; j<s1.length; j++) {
							
							if(s1[j].equals("W")) {
								System.out.println(m.teamName);
								break;
							}
						}
						
					}
					else if(input2==2) {
						
						for(int j=0; j<s1.length; j++) {
							if(j<4) {
								if(s1[j].equals("W")) {
									if(s1[j+1].equals("W")) {
									System.out.println(m.teamName);
									break;
									}
								}
							}
							
						}
						
					}
					else if(input2==3) {
						
						for(int j=0; j<s1.length; j++) {
							if(j<3) {
								if(s1[j].equals("W")) {
									if(s1[j+1].equals("W")) {
										if(s1[j+2].equals("W")) {
											System.out.println(m.teamName);
											break;
										}
									}
								}
							}
							
						}
						
					}
					else if(input2==4) {
						for(int j=0; j<s1.length; j++) {
							if(j<2) {
								if(s1[j].equals("W")) {
									if(s1[j+1].equals("W")) {
										if(s1[j+2].equals("W")) {
											if(s1[j+3].equals("W")) {
												System.out.println(m.teamName);
												break;
											}
										}
									}
								}
							}
							
						}
						
					}
					else if(input2==5) {
						for(int j=0; j<s1.length; j++) {
							if(j<1) {
								if(s1[j].equals("W")) {
									if(s1[j+1].equals("W")) {
										if(s1[j+2].equals("W")) {
											if(s1[j+3].equals("W")) {
												if(s1[j+4].equals("W")) {
													System.out.println(m.teamName);
													break;
												}
											}
										}
									}
								}
							}
							
						}
					}
				}
				
				break;
				
			}
			
			case 2:{
				for(int i=0; i<l.size(); i++) {
					
					details m=(details)l.get(i);
					String []s1=m.results.split("");
					
					if(input2==1) {
						
						for(int j=0; j<s1.length; j++) {
							
							if(s1[j].equals("L")) {
								System.out.println(m.teamName);
								break;
							}
						}
						
					}
					else if(input2==2) {
						
						for(int j=0; j<s1.length; j++) {
							if(j<4) {					//USED TO AVOID OUT OF BOUND EXCEPTION
								if(s1[j].equals("L")) {
									if(s1[j+1].equals("L")) {
									System.out.println(m.teamName);
									break;
									}
								}
							}
							
						}
						
					}
					else if(input2==3) {
						
						for(int j=0; j<s1.length; j++) {
							if(j<3) {						//USED TO AVOID OUT OF BOUND EXCEPTION
								if(s1[j].equals("L")) {
									if(s1[j+1].equals("L")) {
										if(s1[j+2].equals("L")) {
											System.out.println(m.teamName);
											break;
										}
									}
								}
							}
							
						}
						
					}
					else if(input2==4) {
						for(int j=0; j<s1.length; j++) {
							if(j<2) {						//USED TO AVOID OUT OF BOUND EXCEPTION
								if(s1[j].equals("L")) {
									if(s1[j+1].equals("L")) {
										if(s1[j+2].equals("L")) {
											if(s1[j+3].equals("L")) {
												System.out.println(m.teamName);
												break;
											}
										}
									}
								}
							}
							
						}
						
					}
					else if(input2==5) {
						for(int j=0; j<s1.length; j++) {
							if(j<1) {				//USED TO AVOID OUT OF BOUND EXCEPTION
								if(s1[j].equals("L")) {
									if(s1[j+1].equals("L")) {
										if(s1[j+2].equals("L")) {
											if(s1[j+3].equals("L")) {
												if(s1[j+4].equals("L")) {
													System.out.println(m.teamName);
													break;
												}
											}
										}
									}
								}
							}
							
						}
					}
				}
				
				break;
				
			}
			
			default: {
				System.out.println("Invalid Input");
				break;
			}
			
			}
			
		}
		
		else {
			System.err.println("Selected value of Results exceed matches played!!!");
		}
		
	}
	
}


















