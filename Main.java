//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello world!");
//    }
//}

import java.util.*;

public class Main {
		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
			Scanner sc =new Scanner(System.in);
	        System.out.println("------------------------------------------------------------");
			System.out.println("Hello, welcome to Accounting System");
	        System.out.println("------------------------------------------------------------");
	        boolean goToMainMenu = true;
	        ArrayList<Paid> cheques = new ArrayList<Paid>();
	        while(goToMainMenu)
	        {
	        	System.out.println();
	        	 System.out.println("What do you want to do?" + "\n" +
	                "   1. Add a Fulltime employee" + "\n" +
	                "   2. Add a Parttime employee" + "\n" +
	                "   3. Add a bill " + "\n" +
	                "   4. Issue cheques" + "\n" +
	                "   5. Exit " + "\n" +
	                "Please enter your choice > ");
	        	 int input =Integer.parseInt(sc.nextLine());
	        	 while(input<1 || input>5)
	        	 {
	                 System.out.println("Please enter a number between 1 and 5. Try again: ");
	                 input = sc.nextInt();
	             }
	        	 if(input==1)
	        	 {
	 				 System.out.println("Enter employee info in this format (First name,last name,Age,Salary): ");
					 String info = sc.nextLine();
					 String[] s = info.split(" ");
	        		 String first = s[0];
	        		 String last = s[1];
	        		 int age = Integer.parseInt(s[2]);
	        		 double salary = Double.parseDouble(s[3]);
	        		 FullTimeEmployee e = new FullTimeEmployee(first,last,age,salary);
	        		 System.out.println("Adding Full time employee...");
	        		 cheques.add(e);
	        		 continue;
	        		 
	        	 }
	        	 if(input==2)
	        	 {
	 				 System.out.println("Enter employee info in this format (First name,last name,Age,Hours worked,Echelon): ");
					 String info = sc.nextLine();
					 String[] s = info.split(" ");
	        		 String first = s[0];
	        		 String last = s[1];
	        		 int age = Integer.parseInt(s[2]);
	        		 int hours = Integer.parseInt(s[3]);
	        		 int echelon = Integer.parseInt(s[4]);
	        		 PartTimeEmployee e = new PartTimeEmployee(first,last,age,hours,echelon);
	        		 System.out.println("Adding Part time employee...");
	        		 cheques.add(e);
	        		 continue;
	        		 
	        	 }
	        	 else if(input==3)
	        	 {
	 				 System.out.println("Enter Bill info in this format (Name,Month,Day,Year,Amount): ");
					 String info = sc.nextLine();
					 String[] s = info.split(" ");
	        		 String name = s[0];
	        		 String month = s[1];
	        		 int day = Integer.parseInt(s[2]);
	        		 int year = Integer.parseInt(s[3]);
	        		 int amount = Integer.parseInt(s[4]);
	        		 Bill b = new Bill(name,month, day, year, amount);
	        		 System.out.println("Adding Bill...");
	        		 cheques.add(b);
	        		 b.toString();
	        		 continue;
	        		 
	        	 }
	        	 else if(input==4)
	        	 {
	        		 System.out.println("Issueing cheques:");
	        		 int number = 1; //cheque number
	        		 for(Paid cheque:cheques)
	        		 {
	        			 System.out.println();
	        			 System.out.println("Cheque number:" + number);
	        			 cheque.toString();
	        			 number++;
	        		 }
	        		 continue;
	        		 
	        	 }
	        	 else if(input==5)
	        	 {
	        		 System.out.println("Thank you for using the system!");
	        		 goToMainMenu = false;
	        		 sc.close();
	        		 break;
	        	 }

	        }
		}
}


//Hadi Ahmad 24 1000
//Abed D 23 20 3
//Hydro Jan 31 2023 200
