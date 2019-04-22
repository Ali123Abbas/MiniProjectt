import java.util.*;
class ProjectSwitch2{
	public static void main(String[] args) {
		
		Scanner ob=new Scanner(System.in);



			System.out.println("\n\n1. Calculator \n\n2. Unit Converter \n\n3. Season \n\n4. Marksheet \n\n5. HESCO  Bill. \n\n6. About Developer \n\n\n Enter your Selection please?	");
			
			int sel=ob.nextInt();

			switch(sel){
				

				case 1: 
				
				System.out.println("Please Select your Calculator Type? \n1.Calculator(Menu) \n2.Calculator(Op)");
				int sel2=ob.nextInt();
				switch(sel2){
					case 1: 
					
				System.out.println("1.Addition \n2.Subtraction \n3.Multilpication \n4.Division \n5.Remainder \nEnter Selection?");
				int sel3=ob.nextInt();
				
					switch(sel3){
							case 1: 

							System.out.println("Enter 1st Values?");
							int a=ob.nextInt();
							
							System.out.println("Enter 2nd Values?");
							int b=ob.nextInt();
							
							System.out.println("Addition is: "+(a+b));
							break;
							
							case 2: 
							System.out.println("Enter 1st Values?");
								a=ob.nextInt();
							
							System.out.println("Enter 2nd Values?");
								b=ob.nextInt();
							System.out.println("Subtraction is: "+(a-b));
							break;
					
							case 3:
							System.out.println("Enter 1st Values?");
								a=ob.nextInt();
								
							System.out.println("Enter 2nd Values?");
								b=ob.nextInt();
							System.out.println("Multiplication is: "+(a*b));
							break; 	
					
							case 4:
							System.out.println("Enter 1st Values?");
								a=ob.nextInt();
								
							System.out.println("Enter 2nd Values?");
								b=ob.nextInt();
							System.out.println("Division is: "+(a/b));	
							break; 	
							
							case 5:
							System.out.println("Enter 1st Values?");
								a=ob.nextInt();
							
							System.out.println("Enter 2nd Values?");
								b=ob.nextInt();
							System.out.println("Remainder is: "+(a%b));
							break; 	

							default:
							System.out.println("Invalid Selection.");
						}
				
				
				break;
				
				

				case 2:
				System.out.println("Enter 1st Value?");
		int a1=ob.nextInt();

		System.out.println("Enter 2nd Value?");
		int b1=ob.nextInt();

		System.out.println("Enter Operator?");
		char sel4=ob.next().charAt(0);


				switch(sel4){
					case '+': 
				
			System.out.println("Addition is: "+(a1+b1));
			break;

			case '-': 
			System.out.println("Subtraction is: "+(a1-b1)); 
			break;


			case'X':
			case'x':
			case '*': 
			System.out.println("Multiplication is: "+(a1*b1));
			break;

			case'\\':
			case '/':
			System.out.println("Divison is: "+(a1/b1));
			break;	
			
			case '%': 
			System.out.println("Remainder is: "+(a1%b1));
			break;
			
			default:
			System.out.println("Invalid Operator");
		}
				
				
				break;

					
					default:  
					System.out.println("Invalid Selection.");
				
				
				}
				





				break;

				





				case 2:

				System.out.println("1.Kilo to Gram \n2.Gram to Kilo \n3.Feet to Inch \n4.Inch to Feet \nEnter Selection?");
				int sel5=ob.nextInt();


				switch(sel5){

					case 1:
					System.out.println("Enter Kilo?");
							int kilo = ob.nextInt();
							int gram = kilo*1000;
							System.out.println("Grams: " +gram);
							break;

					case 2:
					System.out.println("Enter Grams: ");
							int grams = ob.nextInt();
							int kilos = grams/1000;
							System.out.println("Kilo: "+kilos);
							break; 

					case 3:
					System.out.println("Enter Feet?");
							int feet = ob.nextInt();
							int inch = feet/12;
							System.out.println("Inches : "+inch);
							break;

					case 4:
					System.out.println("Enter Inches? ");
							int inches = ob.nextInt();
							int feets = inches*12;
							System.out.println("Feet: "+feets);
							break;							

				default:
				System.out.println("Invalid Selection.");	
				}
			
				





				break;
				


				


				case 3:

				 System.out.println("Enter Month No: ");
						int mon=ob.nextInt();

						switch(mon){
							
							case 11: 
							System.out.println("The Season is Winter. ");
							break;
							
							case 12: 
							System.out.println("The Season is Winter. ");
							break;
							
							case 1: 
							System.out.println("The Season is Winter. ");
							break;

							case 2: 
							System.out.println("The Season is Spring. ");
							break;
							
							case 3: 
							System.out.println("The Season is Spring. ");
							break;
							
							case 4: 
							System.out.println("The Season is Spring. ");
							break;
							
							case 5: 
							System.out.println("The Season is Summer. ");
							break;
							
							case 6: 
							System.out.println("The Season is Summer. ");
							break;

							case 7: 
							System.out.println("The Season is Summer. ");
							break;

							case 8: 
							System.out.println("The Season is Autumn. ");
							break;

							case 9: 
							System.out.println("The Season is Autumn. ");
							break;

							case 10: 
							System.out.println("The Season is Autumn. ");
							break;
							
							default:
							System.out.println("Invalid Selection.");

						}
						
						


						break;
						
						



						case 4:

						System.out.println("Enter marks of Java?");
								int j=ob.nextInt();

								System.out.println("Enter Marks of Oracle?");
								int o=ob.nextInt();

								System.out.println("Enter Marks of Visual Basic ?");
								int vb=ob.nextInt();

								System.out.println("Enter Marks of C++");
								int cp=ob.nextInt();

								System.out.println("Enter Marks Of c?");
								int cc=ob.nextInt();

								int f=j+o+vb+cp+cc;
								int g=500;

								float h=f*100/g;
								System.out.println("\nTotal marks are: 500");

								System.out.print("\nThe Obtained Marks are: "+f);

								System.out.println("\n\nThe Percantage is: "+h );

								if(h>=90 && h<=100)
							{
							System.out.println("\nYour grade is A-1");
							}

							if(h>=80 && h<90)
							{
								System.out.println("\nYour grade is A");
							}

							if(h>=70 && h<80){
								System.out.println("\nYour grade is B");
							}

							if(h>=60 && h<70){
								System.out.println("\nYour grade is C");
							}

							if(h>=50 && h<60 ){
								System.out.println("\nYour grade is D");
							}

							if(h>=40 && h<50){
								System.out.println("\nYour grade is E");
								
							}

							if (h<=39){
							
								System.out.println("\nYour grade is Fail.");
							}
						


								break;
								
								

								case 5: 

								System.out.println("Enter Electric Units?");
									int unit=ob.nextInt();

							if( unit<=100 )
										System.out.println("The Charges 1 to 100 is: "+(unit*2)); 		

							else if(unit>100 && unit<=200 )
										System.out.println("The Charges 100 to 200 is: "+(unit*4-200)); 
						
							else if(unit>200 && unit<=300 )
										System.out.println("The Charges 100 to 200 is: "+(unit*6-600)); 
					
							else if(unit>300 && unit<=400)
										System.out.println("The Charges 100 to 200 is: "+(unit*8-1200)); 
					
							else if(unit>400 && unit<=500)
										System.out.println("The Charges 100 to 200 is: "+(unit*10-2000)); 
						
							break;


							
							case 6:

										System.out.println("The Name Of Developer : Ali Abbas"+"\n\nEmail Add: aliabbasabbasi022@gmail.com"+"\n\nCell No: +923065863353"+"\n\nAddress: Qno: c-139 Sindh University Colony Jamshoro"+"\n\nThe Organisation under i work is Sir Sachal Joyo's Centre.");		
							break;														

							default:
										System.out.println("Invalid Selection.");	
						
			
			}
										
			

			}

			
			

			}


	
