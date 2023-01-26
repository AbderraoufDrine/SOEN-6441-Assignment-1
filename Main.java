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
					 boolean flag = true;
					 while(flag) {
						 System.out.println("Enter employee info in this format (FirstName LastName Age Salary): ");
						 try {
							 String info = sc.nextLine();
							 String[] s = info.split(" ");
							 if (s.length != 4)
								 throw new RuntimeException();
							 String first = s[0];
							 String last = s[1];
							 int age = Integer.parseInt(s[2]);
							 double salary = Double.parseDouble(s[3]);
							 FullTimeEmployee e = new FullTimeEmployee(first, last, age, salary);
							 System.out.println("Adding Full time employee...");
							 cheques.add(e);
							 flag = false;
						 } catch (RuntimeException e) {
							 System.out.println("It seems you're input format is wrong please try again");
							 System.out.println();
							 flag = true;
						 }
					 }

	        	 }
	        	 if(input==2)
	        	 {
					 boolean flag = true;
					 while(flag) {

						 System.out.println("Enter employee info in this format (FirstName LastName Age HoursWorked Echelon): ");
						 try {
							 String info = sc.nextLine();
							 String[] s = info.split(" ");
							 if (s.length != 5)
								 throw new RuntimeException();
							 String first = s[0];
							 String last = s[1];
							 int age = Integer.parseInt(s[2]);
							 int hours = Integer.parseInt(s[3]);
							 int echelon = Integer.parseInt(s[4]);
							 PartTimeEmployee e = new PartTimeEmployee(first, last, age, hours, echelon);
							 System.out.println("Adding Part time employee...");
							 cheques.add(e);
							 flag = false;
						 } catch (RuntimeException e) {
							 System.out.println("It seems you're input format is wrong please try again");
							 System.out.println();
							 flag = true;
						 }
					 }


				 }
	        	 else if(input==3)
	        	 {
					 boolean flag = true;
					 while(flag) {
						 System.out.println("Enter Bill info in this format (Name Month Day Year Amount): ");
						 try {
							 String info = sc.nextLine();
							 String[] s = info.split(" ");
							 if (s.length != 5)
								 throw new RuntimeException();
							 String name = s[0];
							 String month = s[1];
							 int day = Integer.parseInt(s[2]);
							 int year = Integer.parseInt(s[3]);
							 int amount = Integer.parseInt(s[4]);
							 Bill b = new Bill(name, month, day, year, amount);
							 System.out.println("Adding Bill...");
							 cheques.add(b);
							 flag = false;
						 }
						 catch (RuntimeException e) {
							 System.out.println("It seems you're input format is wrong please try again");
							 System.out.println();
							 flag = true;
						 }
					 }

	        	 }
	        	 else if(input==4)
	        	 {
	        		 System.out.println("Issueing cheques:");
	        		 int number = 1; //cheque number
	        		 for(Paid cheque:cheques)
	        		 {
	        			 System.out.println();
	        			 System.out.println("Cheque number:" + number);
						 System.out.println(cheque.toString());
	        			 number++;
	        		 }

	        		 
	        	 }
	        	 else if(input==5)
	        	 {
	        		 System.out.println("Thank you for using the system!");
	        		 sc.close();
	        		 break;
	        	 }

	        }
		}
}


//Hadi Ahmad 24 1000
//Abed Drine 23 20 3
//Hydro Jan 31 2023 200
