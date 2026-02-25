
/*
Q3. Create a class called Employee to hold empid, empname , empemail , empcontact and empsalry.
write a menu driven program in cpp that implements the working of a Employee Using create a set and get function
and implements the logic.

The menu options should be: 

1. Add Employee Details.
2. Display All Employee Details.
3.Search Employee Using:
		- id.
		-name.
		-email.
		-salary.
		-address.
4.Delete Employee Details Using:
		- id.
		-name.
		-email.
		-salary. 
		-address.
5.Update Employee Details Using:
		- id.
		-name.
		-email.
		-salary.
		-address.
6. Display Details count of the Employee in Company.
7. Display Details the employee in the ascending order of employee salary.
8. Display the employee details in highest salary.
9. Display the employee details in minimum salary is 10000 to maximum salary is 60000.
10. Exit.
----------------------------------------------------------------------------------------
*/

	
		import java.util.*;

		class Employ
		{
			private int id;
			private String name;
			private String email;
			private int salary;
			private long contact;
			private String address;
			//setters
			public void setData(int id, String name, String email, int salary, long contact, String address)
			{
				this.id=id;
				this.name= name;
				this.email=email;
				this.salary=salary;
				this.contact=contact;
				this.address=address;
			}
			// getters
			public int getId()
			{
				return id;
			}
			public String getName()
			{
				return name;
			}
			public String getEmail()
			{
				return email;
			}
			public int getSalary()
			{
				return salary;
			}
			public long getContact()
			{
				return contact;
			}
			public String getAddress()
			{
				return address;
			}
			
		}
		
		public class EmployeeManagement3
		{
			

			public static void displayEmployee(Employ e) 
			{
				System.out.println("\n ID ||  Name  ||      Email     || Salary ||    Contact    ||   Address   ");
				System.out.println("\n---------------------------------------------------------------------------");
				System.out.print( e.getId()+ "\t");
				System.out.print( e.getName()+ "\t");
				System.out.print( e.getEmail()+ "\t");
				System.out.print( e.getSalary()+ "\t");
				System.out.print( e.getContact()+ "\t");
				System.out.print( e.getAddress()+ "\t");
				System.out.println("\n---------------------------------------------------------------------------");
			}
			
			public static void main(String x[])
			{
				Scanner sc = new Scanner(System.in);
				
				System.out.print("Enter No of Employee : ");
				int m= sc.nextInt();
				int n=0;
				
				Employ emp[]= new Employ[m];
				
				do
				{
					
					System.out.println("\nCase 1: Add Employee Details --------------------------------------------:");
					System.out.println("Case 2: Display All Employee Details ------------------------------------:");
					System.out.println("Case 3: Search Employee Using their Attributes 	-------------------------:");
					System.out.println("Case 4: Delete Employee Details Using their Attributes 	-----------------:");
					System.out.println("Case 5: Update Employee Details Using their Attributes  -----------------:");
					System.out.println("Case 6: Display Details count of the Employee in Company ----------------:");
					System.out.println("Case 7: Display Details in the ascending order of employee salary -------:");
					System.out.println("Case 8: Display employee with  highest salary ---------------------------:");
					System.out.println("Case 9: Display details in min salary is 10000 to max salary is 60000 ---:");
					System.out.println("Case 10: Exit  ----------------------------------------------------------:");
				
					
					System.out.print("\nEnter your Choice :");
					int choice = sc.nextInt();
					
					switch(choice)
					{
						case 1:
							System.out.println("\n# Add Employee Details : ");
							
							if (n >= m) 
							{
								System.out.println("Array is full! Cannot add more employees.");
								break;
							}
							for(int i=n; i<m; i++)
							{
								emp[i] = new Employ();
								
								System.out.print("\nEnter Id    : ");
								int id= sc.nextInt();
								
								System.out.print("Enter Name  : ");
								String name = sc.next();
								
								System.out.print("Enter Email : ");
								String email = sc.next();
								
								System.out.print("Enter Salary : ");
								int sal = sc.nextInt();
								
								System.out.print("Enter Contact : ");
								long contact = sc.nextLong();
								
								sc.nextLine();
								System.out.print("Enter Address : ");
								String address = sc.nextLine();
								
								emp[i].setData(id, name, email, sal, contact, address);
								n++;
							}
							System.out.print("\nDetail Added Successfully ! ");
							
						break;
						
						case 2:
								System.out.println("\n# Display All Employee Details.");
								System.out.println("\n ID ||  Name  ||      Email     || Salary ||    Contact    ||   Address   ");
								if(n==0)
								{
									System.out.println("No data Yet !");
								}
								else
								{
									for(int i=0; i<n; i++) 
									{
										System.out.println("\n--------------------------------- Emp "+(i+1)+" ---------------------------------");
										System.out.print(emp[i].getId()+ "\t");
										System.out.print(emp[i].getName()+ "\t");
										System.out.print(emp[i].getEmail()+ "\t");
										System.out.print(emp[i].getSalary()+ "\t");
										System.out.print(emp[i].getContact()+ "\t");
										System.out.print(emp[i].getAddress()+ "\t");
									
										System.out.println("\n-------------------------------------------------------------------------");
									}
								}	
						break;
						
						case 3:
							System.out.println("\n# Search Employee using their Attributes :");
							
								System.out.println("Search by: ");
								System.out.println("1. ID");
								System.out.println("2. Name");
								System.out.println("3. Email");
								System.out.println("4. Salary");
								System.out.println("5. Address");
								
								System.out.print("Enter choice: ");
								int searchChoice = sc.nextInt();
								sc.nextLine(); // consume newline
							
								boolean found = false;
							
								switch (searchChoice) {
									case 1:
										System.out.print("Enter Employee ID: ");
										int searchId = sc.nextInt();
										for (int i = 0; i < n; i++) {
											if (emp[i].getId() == searchId) {
												displayEmployee(emp[i]);
												found = true;
											
											}
										}
										break;
							
									case 2:
										System.out.print("Enter Employee Name: ");
										String searchName = sc.nextLine();
										for (int i = 0; i < n; i++) {
											if (emp[i].getName().equalsIgnoreCase(searchName)) {
												displayEmployee(emp[i]);
												found = true;
												
											}
										}
										break;
							
									case 3:
										System.out.print("Enter Employee Email: ");
										String searchEmail = sc.nextLine();
										for (int i = 0; i < n; i++) {
											if (emp[i].getEmail().equalsIgnoreCase(searchEmail)) {
												displayEmployee(emp[i]);
												found = true;
												
											}
										}
										break;
							
									case 4:
										System.out.print("Enter Employee Salary: ");
										int searchSal = sc.nextInt();
										for (int i = 0; i < n; i++) {
											if (emp[i].getSalary() == searchSal) {
												displayEmployee(emp[i]);
												found = true;
												
											}
										}
										break;
							
									case 5:
										System.out.print("Enter Employee Address: ");
										String searchAddr = sc.nextLine();
										for (int i = 0; i < n; i++) {
											if (emp[i].getAddress().equalsIgnoreCase(searchAddr)) {
												displayEmployee(emp[i]);
												found = true;
												
											}
										}
										break;
							
									default:
										System.out.println("Invalid choice!");
								}
							
								if (!found) {
									System.out.println("No matching employee found.");
								}
							break;
						
						case 4:
							System.out.println("\n#  Delete Employee Details Using their Attributes :");
							
							System.out.println("Search by: ");
								System.out.println("1. ID");
								System.out.println("2. Name");
								System.out.println("3. Email");
								System.out.println("4. Salary");
								System.out.println("5. Address");
								
								System.out.print("Enter choice: ");
								searchChoice = sc.nextInt();
								sc.nextLine(); // consume newline
							
								found = false;
								int ind=-1;
								switch (searchChoice) {
									
									case 1:
										System.out.print("Enter Employee ID: ");
										int searchId = sc.nextInt();
										
										for (int i = 0; i < n; i++) {
											if (emp[i].getId() == searchId) {
												displayEmployee(emp[i]);
												found = true;
												ind = i;
											}
										}
										
									break;
							
									case 2:
										System.out.print("Enter Employee Name: ");
										String searchName = sc.nextLine();
										 ind=-1;
										for (int i = 0; i < n; i++) {
											if (emp[i].getName().equalsIgnoreCase(searchName)) {
												displayEmployee(emp[i]);
												found = true;
												ind = i;
											}
										}
									break;	
							
									case 3:
										System.out.print("Enter Employee Email: ");
										String searchEmail = sc.nextLine();
										ind=-1;
										for (int i = 0; i < n; i++) {
											if (emp[i].getEmail().equalsIgnoreCase(searchEmail)) {
												displayEmployee(emp[i]);
												found = true;
												ind = i;
											}
										}
										
										break;
							
									case 4:
										System.out.print("Enter Employee Salary: ");
										int searchSal = sc.nextInt();
										ind=-1;
										for (int i = 0; i < n; i++) {
											if (emp[i].getSalary() == searchSal) {
												displayEmployee(emp[i]);
												found = true;
												ind =i ;
											}
										}
									
										break;
							
									case 5:
										System.out.print("Enter Employee Address: ");
										String searchAddr = sc.nextLine();
										ind=-1;
										for (int i = 0; i < n; i++) {
											if (emp[i].getAddress().equalsIgnoreCase(searchAddr)) {
												displayEmployee(emp[i]);
												found = true;
												ind = i;
											}
										}
										
										break;
									
							
									default:
										System.out.println("Invalid choice!");
								}
							
								if (found) {
									
									// Shift left to delete
									for (int i = ind; i < n - 1; i++) {
										emp[i] = emp[i + 1];
									}
									emp[n - 1] = null; // Clear last slot
									n--;
									System.out.println("\nRecord deleted Successfully!");
								} else
								{
									System.out.println("\nEmployee not found.");
								}
							break;
								
						case 5:
							System.out.println("\n# Update Employee Details Using their Attributes :");
								if(n==0)
								{
									System.out.println(" ! No Employee Present In Database !");
								}
						
								System.out.println("Search by: ");
								System.out.println("1. ID");
								System.out.println("2. Name");
								System.out.println("3. Email");
								System.out.println("4. Salary");
								System.out.println("5. Address");
								
								System.out.print("Enter choice: ");
								searchChoice = sc.nextInt();
								sc.nextLine(); // consume newline
							
								found = false;
								ind=-1;
								switch (searchChoice) {
									case 1:
										System.out.print("Enter Employee ID: ");
										int searchId = sc.nextInt();
										for (int i = 0; i < n; i++) {
											if (emp[i].getId() == searchId)
											{
												displayEmployee(emp[i]);
												found = true;
												ind=i;
											}	
										}
										break;
							
									case 2:
										System.out.print("Enter Employee Name: ");
										String searchName = sc.nextLine();
										for (int i = 0; i < n; i++) {
											if (emp[i].getName().equalsIgnoreCase(searchName))
											{
												displayEmployee(emp[i]);
												found = true;
												ind=i;
											}
										}
										break;
							
									case 3:
										System.out.print("Enter Employee Email: ");
										String searchEmail = sc.nextLine();
										for (int i = 0; i < n; i++) {
											if (emp[i].getEmail().equalsIgnoreCase(searchEmail))
											{
												displayEmployee(emp[i]);
												found = true;
												ind=i;
											}	
										}
										break;
							
									case 4:
										System.out.print("Enter Employee Salary: ");
										int searchSal = sc.nextInt();
										for (int i = 0; i < n; i++) {
											if (emp[i].getSalary() == searchSal)
											{
												displayEmployee(emp[i]);
												found = true;
												ind=i;
											}
										}
										break;
							
									case 5:
										System.out.print("Enter Employee Address: ");
										String searchAddr = sc.nextLine();
										
										for (int i = 0; i < n; i++) {
											if (emp[i].getAddress().equalsIgnoreCase(searchAddr)) {
												displayEmployee(emp[i]);
												found = true;
												ind=i;
											}
										}
										break;
									default:
										System.out.println("Invalid choice!");
								}
								if(found)
								{
									System.out.print("\nEnter Id      : ");
									int id= sc.nextInt();
									
									System.out.print("Enter Name    : ");
									String name = sc.next();
									
									System.out.print("Enter Email   : ");
									String email = sc.next();
									
									System.out.print("Enter Salary  : ");
									int sal = sc.nextInt();
									
									System.out.print("Enter Contact : ");
									long contact = sc.nextLong();
									
									sc.nextLine();
									System.out.print("Enter Address : ");
									String address = sc.nextLine();
									
									emp[ind].setData(id, name, email, sal, contact, address);
									
									System.out.print("\nDetail Updated Successfully ! ");
								}
								else{
									System.out.println("No matching employee found.");
								}
								break;
								
						case 6:
							System.out.println("\n# Display Details count of the Employee in Company :");
							
							System.out.println("Total Employee Currently : "+n);
							
							break;
							
						case 7:
								System.out.println(" Display Details in the ascending order of employee salary :");
								
								for(int i=0; i<n; i++)
								{
									for(int j=i+1; j<n; j++)
									{
										if(emp[i].getSalary() > emp[j].getSalary())
										{
											Employ temp = emp[i];
											emp[i] = emp[j];
											emp[j] = temp;
										}
									}
								}
								for(int i=0; i<n; i++)
								{
									System.out.println("\n--------------------------------- Emp "+(i+1)+" ---------------------------------");
									
									System.out.print(emp[i].getId()+ "\t");
									System.out.print(emp[i].getName()+ "\t");
									System.out.print(emp[i].getEmail()+ "\t");
									System.out.print(emp[i].getSalary()+ "\t");
									System.out.print(emp[i].getContact()+ "\t");
									System.out.print(emp[i].getAddress()+ "\t");
								
									System.out.println("\n-------------------------------------------------------------------------");
								}
							break;

						case 8:
								System.out.println("\n# Display employee with highest salary :");
								
								if (n == 0) {
									System.out.println("! There is No Data in System !");
								} else {
									ind = 0; // assume first employee is highest
									for (int i = 1; i < n; i++) {
										if (emp[i].getSalary() > emp[ind].getSalary()) {
											ind = i;
										}
									}
									System.out.println("\nEmployee with highest salary:");
									displayEmployee(emp[ind]);
								}
							break;
							
						case 9:
								System.out.println("\n# Display details in min salary is 10000 to max salary is 60000. :");
								found=false;
								for(int i=0; i<n; i++)
								{	
									if(emp[i].getSalary() >= 10000 && emp[i].getSalary() <= 60000)
									{
										System.out.println("\n--------------------------------- Emp "+(i+1)+" ---------------------------------");
								
										System.out.print(emp[i].getId()+ "\t");
										System.out.print(emp[i].getName()+ "\t");
										System.out.print(emp[i].getEmail()+ "\t");
										System.out.print(emp[i].getSalary()+ "\t");
										System.out.print(emp[i].getContact()+ "\t");
										System.out.print(emp[i].getAddress()+ "\t");
									
										System.out.println("\n-------------------------------------------------------------------------");
										found=true;
									}	
								}
								if(!found)
								{
									System.out.println (" There are no Employee with salaryrange 10000 - 60000 ");
								}
							break;
							
						case 10:
								
								System.out.println("\n    ------------------    Thank You !    -------------------  ");
								
								System.exit(0);
							break;	
							
					    default:
							System.out.println("\n# Enter Correct Choice : ") ;
					}

				}while(true);
			}
		}