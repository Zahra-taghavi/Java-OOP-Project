package finalClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;

public class Menu {
	
	static Scanner console = new Scanner(System.in);

	public static void main(String[] args) {
		menu();
	}
	public static void menu() {
		
		System.out.printf("1.record\n");
		System.out.printf("2.edit\n");
		System.out.printf("3.search\n");
		System.out.printf("4.report\n");
		System.out.printf("5.exit\n");
		System.out.printf("Enter the desired number : \n");
		int x = console.nextInt();
		switch(x)
		{
		case 1 :record();
			break;
		case 2 :edit();
			break;
		case 3 :search();
			break;
		case 4 :report();
			break;
		case 5 : 
			System.exit(x);
			break;
		default : System.out.printf("incorect\n");
		        menu();
		}
	}
	
	public static void record() {
		
		System.out.println("Selact the desired option : ");
		System.out.println("1.alive creature\n2.natural resource\n3.Back\n>>>>>");
		int x = console.nextInt();
		switch (x) {
		case 1 :
		{
			System.out.println("Selact the desired option : ");
			System.out.println("1.human\n2.animal\n3.Back\n>>>>>");
			int y = console.nextInt();
			switch (y) {
			case 1 :
				human();
				break ;
			case 2 :
				animal();
				break ;
			case 3 :
				record();
			    break;
			default :
			{
				System.out.println("The desired option is not allowed!!!");
				record() ;
				break ;
			}
			}
			break ;
		}
		case 2 :
		{
			System.out.println("Selact the desired option : ");
			System.out.println("1.terrene\n2.plant\n3.back\n>>>>>");
			int z = console.nextInt();
			switch (z) {
			case 1 :
				terrene() ;
				break ;
			case 2 :
				plant() ;
				break ;
			case 3 : 
				record();
			    break;
			default :
			{
				System.out.println("The desired option is not allowed!!!");
				record() ;
				break ;
			}
			}
			break ;
		}
		case 3 : 
			menu();
		    break;
		default :
		{
			System.out.println("The desired option is not allowed!!!");
			record() ;
			break ;
		}
		}
	}
	
	public static void human() {
		
		System.out.println("Selact the desired option : ");
		System.out.println("1.fars\n2.arab\n3.tork\n4.kord\n5.baloch\n6.torkaman\n7.back\n>>>>>");
		int k = console.nextInt();
		switch (k) {
		case 1 :
		case 2 :
		case 3 :
		case 4 :
		case 5 :
		case 6 :
			person(k);
			break ;
		case 7 : 
			record();
		    break;
		default :
		{
			System.out.println("The desired option is not allowed!!!");
			human() ;
			break ;
		}
		}
	}
	
	public static void animal() {
		
		System.out.println("Selact the desired option : ");
		System.out.println("1.mamal\n2.oviparous\n3.back\n>>>>>");
		int i = console.nextInt();
		switch (i) {
		case 1 :
		case 2 :
			animalInfo(i);
			break ;
		case 3 : 
			record();
			break;
		default :
		{
			System.out.println("The desired option is not allowed!!!");
			animal() ;
			break ;
		}
		}
	}

	public static void terrene() {
		
		System.out.println("Selact the desired option : ");
		System.out.println("1.water area\n2.land\n3.back\n>>>>>");
		int j = console.nextInt();
		switch (j) {
		case 1 :
		{
			System.out.println("Selact the desired option : ");
			System.out.println("1.lake\n2.sea\n3.back\n>>>>>");
			int k = console.nextInt();
			switch (k) {
			case 1 :
			case 2 :
			{
				waterArea(k);
				break ;
			}
			case 3 : 
				terrene();
			    break;
			default :
			{
				System.out.println("The desired option is not allowed!!!");
				terrene() ;
				break ;
			}
			}
			break ;
		}
		case 2 :
		{
			System.out.println("Selact the desired option : ");
			System.out.println("1.desert\n2.plain\n3.mountain\n4.forest\n5.back\n>>>>>");
			int k = console.nextInt();
			switch (k) {
			case 1 :
			case 2 :
			case 4 :
			{
				landTypeABD(k);
				break ;
			}
			case 3 :
			{
				mountain();
				break ;
			}
			case 5 : 
				terrene() ;
			    break;
			default :
			{
				System.out.println("The desired option is not allowed!!!");
				terrene() ;
				break ;
			}
			}
			break ;
		}
		case 3 : record();
			break;
		default :
		{
			System.out.println("The desired option is not allowed!!!");
			terrene() ;
			break ;
		}
		}
	}
	
	public static void plant() {
		
		System.out.println("Selact the desired option : ");
		System.out.println("1.tree\n2.flower\n3.medical\n4.feedstuf\n5.back\n>>>>>");
		int m = console.nextInt();
		switch (m) {
		case 1 :
		{
			System.out.println("Selact the desired option : ");
			System.out.println("1.Fruit\n2.Fruitless\n3.back\n>>>>>");
			int i = console.nextInt();
			switch (i) {
			case 1 :
			{
				m = 5 ;
				break ;
			}
			case 2 :
			{
				m = 6 ;
				break ;
			}
			case 3 : plant();
			break;
			default :
			{
				System.out.println("The desired option is not allowed!!!");
				plant() ;
				break ;
			}
			}
			plantInfo(m);
			break ;
		}
		case 2 :
		case 3 :
		case 4 :
			plantInfo(m);
			break ;
		case 5 : 
			record();
			break;
		default :
		{
			System.out.println("The desired option is not allowed!!!");
			plant() ;
			break ;
		}
		}
	}
	
	public static void person(int number) {
		
		System.out.println("please select gender : ");
		System.out.println("1.male\n2.female");
		int gender = console.nextInt();
		if(gender!=2 && gender!=1)
		{
			System.out.println("The desired option is not allowed!!!");
			person(number);
		}
		String temp = console.nextLine();
		System.out.println("please enter the first name : ");
		String fname = console.nextLine();
		System.out.println("please enter the last name : ");
		String lname = console.nextLine();
		System.out.println("please enter the age : ");
		temp = console.nextLine();
		String age = checkFormat(temp);
		System.out.println("please enter the id : ");
		temp = console.nextLine();
		int Exists = checkID(temp,"human.txt");
		if (Exists == 1) {//1 vojod darad 
            System.out.println("This ID already exists!!!\n");
            System.out.print("Try again\n");
			menu();
        }
        String id = checkFormat(temp);
		System.out.println("please enter the date of birth : ");
		System.out.println("-year :");
		temp = console.nextLine();
		String byear = checkFormat(temp);
		System.out.println("-month :");
		temp = console.nextLine();
		String bmonth = checkFormat(temp);
		System.out.println("-day :");
		temp = console.nextLine();
		String bday = checkFormat(temp);
		System.out.println("Is alive ?");
		System.out.println("1.yes\n2.no");
		int alive = console.nextInt();
		boolean  ISaLIVE = true ;
		String dyear = ""  , dmonth = "" , dday = "" ;
		switch(alive)
		{
		case 1 :
		{
			ISaLIVE = true;
			dyear = "0" ;
			dmonth = "0" ;
			dday = "0" ;
			break;
		}
		case 2 :
		{
			ISaLIVE = false;
			temp = console.nextLine();
			System.out.println("please enter the date of death : ");
			System.out.println("-year :");
			temp = console.nextLine();
			dyear = checkFormat(temp);
			System.out.println("-month :");
			temp = console.nextLine();
			dmonth = checkFormat(temp);
			System.out.println("-day :");
			temp = console.nextLine();
			dday = checkFormat(temp);
			break;
		}
		default :
		{
			System.out.println("The desired option is not allowed!!!");
			person(number) ;
			break ;
		}
		}
		switch (number) {//1.fars\n2.arab\n3.tork\n4.kord\n5.baloch\n6.torkaman
		case 1 :
		{
			Farse person = new Farse();
			person.setId(id);
			if(gender == 1)
			{
				person.Male();
				temp = "male";
			}
			else
			{
				person.Female();
				temp = "female";
			}
			person.setFirstName(fname);
			person.setLastName(lname);
			person.setAge(age);
			person.setYeareOfBirth(byear);
			person.setMonthOfBirth(bmonth);
			person.setDayOfBirth(bday);
			person.isAlive = ISaLIVE ;
			person.setYearOfDeath(dyear);
			person.setMonthOfDeath(dmonth);
			person.setDayOfDeath(dday);
			try {  
			      FileWriter myWriter = new FileWriter("human.txt",true);
			      BufferedWriter Writer = new BufferedWriter(myWriter);
			      Writer.write(person.getId());
			      Writer.append("\n");
			      Writer.write("fars");
			      Writer.append("\n");
			      Writer.append(temp);//gender
			      Writer.append("\n");
			      Writer.append(person.getFirstName());
			      Writer.append("\n");
			      Writer.append(person.getLastName());
			      Writer.append("\n");
			      Writer.append(person.getAge());
			      Writer.append("\n");
			      Writer.append(person.getYearOfBirth());
			      Writer.append("\n");
			      Writer.append(person.getMonthOfBirth());
			      Writer.append("\n");
			      Writer.append(person.getDayOfBirth());
			      Writer.append("\n");
			      Writer.append(person.getYearOfDeath());
			      Writer.append("\n");
			      Writer.append(person.getMonthOfDeath());
			      Writer.append("\n");
			      Writer.append(person.getDayOfDeath());
			      Writer.append("\n");
			      Writer.close();
			      System.out.println("Done Successfully");
			 } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    } 
			break ;
		}
		case 2 :
		{
			Arab person = new Arab();
			person.setId(id);
			if(gender == 1)
			{
				person.Male();
				temp = "male";
			}
			else
			{
				person.Female();
				temp = "female";
			}
			person.setFirstName(fname);
			person.setLastName(lname);
			person.setAge(age);
			person.setYeareOfBirth(byear);
			person.setMonthOfBirth(bmonth);
			person.setDayOfBirth(bday);
			person.isAlive = ISaLIVE ;
			person.setYearOfDeath(dyear);
			person.setMonthOfDeath(dmonth);
			person.setDayOfDeath(dday);
			try {  
			      FileWriter myWriter = new FileWriter("human.txt",true);
			      BufferedWriter Writer = new BufferedWriter(myWriter);
			      Writer.write(person.getId());
			      Writer.append("\n");
			      Writer.write("arab");
			      Writer.append("\n");
			      Writer.append(temp);//gender
			      Writer.append("\n");
			      Writer.append(person.getFirstName());
			      Writer.append("\n");
			      Writer.append(person.getLastName());
			      Writer.append("\n");
			      Writer.append(person.getAge());
			      Writer.append("\n");
			      Writer.append(person.getYearOfBirth());
			      Writer.append("\n");
			      Writer.append(person.getMonthOfBirth());
			      Writer.append("\n");
			      Writer.append(person.getDayOfBirth());
			      Writer.append("\n");
			      Writer.append(person.getYearOfDeath());
			      Writer.append("\n");
			      Writer.append(person.getMonthOfDeath());
			      Writer.append("\n");
			      Writer.append(person.getDayOfDeath());
			      Writer.append("\n");
			      Writer.close();
			      System.out.println("Done Successfully");
			 } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    } 
			break ;
		}
		case 3 :
		{
			Tork person = new Tork();
			person.setId(id);
			if(gender == 1)
			{
				person.Male();
				temp = "male";
			}
			else
			{
				person.Female();	
				temp = "female";
			}
			person.setFirstName(fname);
			person.setLastName(lname);
			person.setAge(age);
			person.setYeareOfBirth(byear);
			person.setMonthOfBirth(bmonth);
			person.setDayOfBirth(bday);
			person.isAlive = ISaLIVE ;
			person.setYearOfDeath(dyear);
			person.setMonthOfDeath(dmonth);
			person.setDayOfDeath(dday);
			try {  
			      FileWriter myWriter = new FileWriter("human.txt",true);
			      BufferedWriter Writer = new BufferedWriter(myWriter);
			      Writer.write(person.getId());
			      Writer.append("\n");
			      Writer.write("tork");
			      Writer.append("\n");
			      Writer.append(temp);//gender
			      Writer.append("\n");
			      Writer.append(person.getFirstName());
			      Writer.append("\n");
			      Writer.append(person.getLastName());
			      Writer.append("\n");
			      Writer.append(person.getAge());
			      Writer.append("\n");
			      Writer.append(person.getYearOfBirth());
			      Writer.append("\n");
			      Writer.append(person.getMonthOfBirth());
			      Writer.append("\n");
			      Writer.append(person.getDayOfBirth());
			      Writer.append("\n");
			      Writer.append(person.getYearOfDeath());
			      Writer.append("\n");
			      Writer.append(person.getMonthOfDeath());
			      Writer.append("\n");
			      Writer.append(person.getDayOfDeath());
			      Writer.append("\n");
			      Writer.close();
			      System.out.println("Done Successfully");
			 } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    } 
			break ;
		}
		case 4 :
		{
			Kord person = new Kord();
			person.setId(id);
			if(gender == 1)
			{
				person.Male();
				temp = "male";
			}
			else
			{
				person.Female();
				temp = "female";
			}
			person.setFirstName(fname);
			person.setLastName(lname);
			person.setAge(age);
			person.setYeareOfBirth(byear);
			person.setMonthOfBirth(bmonth);
			person.setDayOfBirth(bday);
			person.isAlive = ISaLIVE ;
			person.setYearOfDeath(dyear);
			person.setMonthOfDeath(dmonth);
			person.setDayOfDeath(dday);
			try {  
			      FileWriter myWriter = new FileWriter("human.txt",true);
			      BufferedWriter Writer = new BufferedWriter(myWriter);
			      Writer.write(person.getId());
			      Writer.append("\n");
			      Writer.write("kord");
			      Writer.append("\n");
			      Writer.append(temp);//gender
			      Writer.append("\n");
			      Writer.append(person.getFirstName());
			      Writer.append("\n");
			      Writer.append(person.getLastName());
			      Writer.append("\n");
			      Writer.append(person.getAge());
			      Writer.append("\n");
			      Writer.append(person.getYearOfBirth());
			      Writer.append("\n");
			      Writer.append(person.getMonthOfBirth());
			      Writer.append("\n");
			      Writer.append(person.getDayOfBirth());
			      Writer.append("\n");
			      Writer.append(person.getYearOfDeath());
			      Writer.append("\n");
			      Writer.append(person.getMonthOfDeath());
			      Writer.append("\n");
			      Writer.append(person.getDayOfDeath());
			      Writer.append("\n");
			      Writer.close();
			      System.out.println("Done Successfully");
			 } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    } 
			break ;
		}
		case 5 :
		{
			Baloch person = new Baloch();
			person.setId(id);
			if(gender == 1)
			{
				person.Male();
				temp = "male";
			}
			else
			{
				person.Female();
				temp = "female";
			}
			person.setFirstName(fname);
			person.setLastName(lname);
			person.setAge(age);
			person.setYeareOfBirth(byear);
			person.setMonthOfBirth(bmonth);
			person.setDayOfBirth(bday);
			person.isAlive = ISaLIVE ;
			person.setYearOfDeath(dyear);
			person.setMonthOfDeath(dmonth);
			person.setDayOfDeath(dday);
			try {  
			      FileWriter myWriter = new FileWriter("human.txt",true);
			      BufferedWriter Writer = new BufferedWriter(myWriter);
			      Writer.write(person.getId());
			      Writer.append("\n");
			      Writer.write("baloch");
			      Writer.append("\n");
			      Writer.append(temp);//gender
			      Writer.append("\n");
			      Writer.append(person.getFirstName());
			      Writer.append("\n");
			      Writer.append(person.getLastName());
			      Writer.append("\n");
			      Writer.append(person.getAge());
			      Writer.append("\n");
			      Writer.append(person.getYearOfBirth());
			      Writer.append("\n");
			      Writer.append(person.getMonthOfBirth());
			      Writer.append("\n");
			      Writer.append(person.getDayOfBirth());
			      Writer.append("\n");
			      Writer.append(person.getYearOfDeath());
			      Writer.append("\n");
			      Writer.append(person.getMonthOfDeath());
			      Writer.append("\n");
			      Writer.append(person.getDayOfDeath());
			      Writer.append("\n");
			      Writer.close();
			      System.out.println("Done Successfully");
			 } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    } 
			break ;
		}
		case 6 :
		{
			Torkaman person = new Torkaman();
			person.setId(id);
			if(gender == 1)
			{
				person.Male();
				temp = "male";
			}
			else
			{
				person.Female();
				temp = "female";
			}
			person.setFirstName(fname);
			person.setLastName(lname);
			person.setAge(age);
			person.setYeareOfBirth(byear);
			person.setMonthOfBirth(bmonth);
			person.setDayOfBirth(bday);
			person.isAlive = ISaLIVE ;
			person.setYearOfDeath(dyear);
			person.setMonthOfDeath(dmonth);
			person.setDayOfDeath(dday);
			try {  
			      FileWriter myWriter = new FileWriter("human.txt",true);
			      BufferedWriter Writer = new BufferedWriter(myWriter);
			      Writer.write(person.getId());
			      Writer.append("\n");
			      Writer.write("torkaman");
			      Writer.append("\n");
			      Writer.append(temp);//gender
			      Writer.append("\n");
			      Writer.append(person.getFirstName());
			      Writer.append("\n");
			      Writer.append(person.getLastName());
			      Writer.append("\n");
			      Writer.append(person.getAge());
			      Writer.append("\n");
			      Writer.append(person.getYearOfBirth());
			      Writer.append("\n");
			      Writer.append(person.getMonthOfBirth());
			      Writer.append("\n");
			      Writer.append(person.getDayOfBirth());
			      Writer.append("\n");
			      Writer.append(person.getYearOfDeath());
			      Writer.append("\n");
			      Writer.append(person.getMonthOfDeath());
			      Writer.append("\n");
			      Writer.append(person.getDayOfDeath());
			      Writer.append("\n");
			      Writer.close();
			      System.out.println("Done Successfully");
			 } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    } 
			break ;
		}
		//defult nadare chon vorodi kontorol shode
		}
		
		//bazgasht be menu
		menu();
		
	}
	
	public static void animalInfo(int number){
		
		System.out.println("please enter the type : ");
		String type = console.next();
		int Exists = checkID(type,"animal.txt");
		if (Exists == 1) {//1 vojod darad 
			System.out.println("please enter the number : ");
			String temp1 = console.next();
			String NewNum = checkFormat(temp1);
			int NewNumber = Integer.parseInt(NewNum);
			BufferedReader br;
			String SNumber = "";
			try {
				br = new BufferedReader(new FileReader("animal.txt"));
				String line;
				while ((line = br.readLine()) != null) {
					if (line.startsWith(type)) {
						line = br.readLine();
						number = Integer.parseInt(line);
						NewNumber = number + NewNumber ;
						SNumber = Integer.toString(NewNumber);
					}
				}
				br.close();
				br = new BufferedReader(new FileReader("animal.txt"));
				FileWriter fw = new FileWriter("temp");
				while ((line = br.readLine()) != null) {
					if (line.startsWith(type)) {
						for(int i=0 ; i<1 ; i++)
						{
							fw.write(line + "\n");
							line = br.readLine();
						}
						line = SNumber ;
					}
					fw.write(line + "\n");
				}

				br.close();
				fw.close();
				
				
				br = new BufferedReader(new FileReader("temp"));
				FileWriter fw1 = new FileWriter("animal.txt");
				while ((line = br.readLine()) != null) {
					fw1.write(line + "\n");
				}
				br.close();
				fw1.close();
			} catch (IOException | NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			menu();
		}
		System.out.println("Is it a special animmal? ");
		System.out.println("1.Yes\n2.No\n>>>>>");
		int option = console.nextInt();
		String id = "0" ;
		String temp = "0" ;
		String num = "0" ;
		switch(option)
		{
		case 1 :
		{
			System.out.println("please enter the id : ");
			temp = console.next();
			id = checkFormat(temp);	
			num = "1" ;
			break;
		}
		case 2 :
		{
			System.out.println("please enter the number : ");
			temp = console.next();
			num = checkFormat(temp);
			break;
		}
		default :
		{
			System.out.println("The desired option is not allowed!!!");
			animalInfo(number) ;
			break;
		}
		}
		switch(number) {//1.mamal\n2.oviparous
		case 1 :
		{
			Mamal animal = new Mamal();
			animal.setType(type);
			animal.setNumber(num);
			animal.setId(id);
			try {  
			      FileWriter myWriter = new FileWriter("animal.txt",true);
			      BufferedWriter Writer = new BufferedWriter(myWriter);
			      Writer.write(animal.getId());
			      Writer.append("\n");
			      Writer.write("mamal");
			      Writer.append("\n");
			      Writer.write(animal.getType());
			      Writer.append("\n");
			      Writer.write(animal.getNumber());
			      Writer.append("\n");
			      System.out.println("Successfully wrote to the file.");
			      Writer.close();
			 } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    } 
			break ;
		}
		case 2 :
		{
			Oviparous animal = new Oviparous();
			animal.setType(type);
			animal.setNumber(num);
			animal.setId(id);
			try {  
			      FileWriter myWriter = new FileWriter("animal.txt",true);
			      BufferedWriter Writer = new BufferedWriter(myWriter);
			      Writer.write(animal.getId());
			      Writer.append("\n");
			      Writer.write("oviparous");
			      Writer.append("\n");
			      Writer.write(animal.getType());
			      Writer.append("\n");
			      Writer.write(animal.getNumber());
			      Writer.append("\n");
			      System.out.println("Done Successfully");
			      Writer.close();
			 } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    } 
			break ;
		}
		//defult nadare chon vorodi kontorol shode
		}
		//bazgasht be menu
		menu();
	}
	
	public static void waterArea(int number){
		
		System.out.println("please enter the type : ");
		String type = console.next();
		System.out.println("please enter the number : ");
		String temp = console.next();
		String num = checkFormat(temp);
		System.out.println("please enter the depth : ");
		temp = console.next();
		String depth = checkFormat(temp);
		
		int totalNum = 0 ;
		String Snumber = "" ;
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader("waterArea.txt"));
			String line;
			while ((line = br.readLine()) != null) {
				if (line.startsWith(type)) {
					line = br.readLine();
					if (line.startsWith(depth))
					{
						String lineNumber = br.readLine();
						int FNum = Integer.parseInt(num);
						line = br.readLine();
						totalNum = Integer.parseInt(lineNumber);
						totalNum = FNum + totalNum ;
						Snumber = Integer.toString(totalNum);
						editFile("waterArea.txt",depth,Snumber,1);
					    menu();
					}	
			}
			}
		} catch (IOException | NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		switch(number) {//1.lake\n2.sea
		case 1 :
		{
			Lake area = new Lake();
			area.setType(type);
			area.setNumber(num);
			area.setDepth(depth);
			try {  
			      FileWriter myWriter = new FileWriter("waterArea.txt",true);
			      BufferedWriter Writer = new BufferedWriter(myWriter);
			      Writer.write("lake");
			      Writer.append("\n");
			      Writer.write(area.getType());
			      Writer.append("\n");
			      Writer.write(area.getDepth());
			      Writer.append("\n");
			      Writer.write(area.getNumber());
			      Writer.append("\n");
			      System.out.println("Done Successfully");
			      Writer.close();
			 } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    } 
			break ;
		}
		case 2 :
		{
			Sea area = new Sea();
			area.setType(type);
			area.setNumber(num);
			area.setDepth(depth);
			try {  
			      FileWriter myWriter = new FileWriter("waterArea.txt",true);
			      BufferedWriter Writer = new BufferedWriter(myWriter);
			      Writer.write("sea");
			      Writer.append("\n");
			      Writer.write(area.getType());
			      Writer.append("\n");
			      Writer.write(area.getDepth());
			      Writer.append("\n");
			      Writer.write(area.getNumber());
			      Writer.append("\n");
			      System.out.println("Done Successfully");
			      Writer.close();
			 } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    } 
			break ;
		}
		//defult nadare chon vorodi kontorol shode
		}
		//bazgasht be menu
		menu();
		
	}
	
	public static void landTypeABD(int number){
		
		System.out.println("please enter the hectares : ");
		String temp = console.next();
		String hectares = checkFormat(temp);
		String type = "";
		switch(number) {
		case 1 :
			type = "desert";
			break;
		case 2 :
			type = "plain";
			break;
		case 4 :
			type = "forest";
			break;
		}
		int Exists = checkID(type,"land.txt");
		if (Exists == 1) {//1 vojod darad 
			int NewNumber = Integer.parseInt(hectares);
			BufferedReader br;
			String SNumber = "";
			try {
				br = new BufferedReader(new FileReader("land.txt"));
				String line;
				while ((line = br.readLine()) != null) {
					if (line.startsWith(type)) {
						line = br.readLine();
						number = Integer.parseInt(line);
						NewNumber = number + NewNumber ;
						SNumber = Integer.toString(NewNumber);
					}
				}
				br.close();
				br = new BufferedReader(new FileReader("land.txt"));
				FileWriter fw = new FileWriter("temp");
				while ((line = br.readLine()) != null) {
					if (line.startsWith(type)) {
						for(int i=0 ; i<1 ; i++)
						{
							fw.write(line + "\n");
							line = br.readLine();
						}
						line = SNumber ;
					}
					fw.write(line + "\n");
				}

				br.close();
				fw.close();
				
				
				br = new BufferedReader(new FileReader("temp"));
				FileWriter fw1 = new FileWriter("land.txt");
				while ((line = br.readLine()) != null) {
					fw1.write(line + "\n");
				}
				br.close();
				fw1.close();
			} catch (IOException | NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			menu();
		}
		
		switch(number) {// 1.desert\n2.plain\n4.forest
		case 1 :
		{
			Desert area = new Desert();
			area.setNumber(hectares);
			try {  
			      FileWriter myWriter = new FileWriter("land.txt",true);
			      BufferedWriter Writer = new BufferedWriter(myWriter);
			      Writer.write("desert");
			      Writer.append("\n");
			      Writer.write(area.getNumber());
			      Writer.append("\n");
			      Writer.write("0");
			      Writer.append("\n");
			      System.out.println("Done Successfully");
			      Writer.close();
			 } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    } 
			break ;
		}
		case 2 :
		{
			Plain area = new Plain();
			area.setNumber(hectares);
			try {  
			      FileWriter myWriter = new FileWriter("land.txt",true);
			      BufferedWriter Writer = new BufferedWriter(myWriter);
			      Writer.write("plain");
			      Writer.append("\n");
			      Writer.write(area.getNumber());
			      Writer.append("\n");
			      Writer.write("0");
			      Writer.append("\n");
			      System.out.println("Done Successfully");
			      Writer.close();
			 } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    } 
			break ;
		}
		case 4 :
		{
			Forest area = new Forest();
			area.setNumber(hectares);
			try {  
			      FileWriter myWriter = new FileWriter("land.txt",true);
			      BufferedWriter Writer = new BufferedWriter(myWriter);
			      Writer.write("forest");
			      Writer.append("\n");
			      Writer.write(area.getNumber());
			      Writer.append("\n");
			      Writer.write("0");
			      Writer.append("\n");
			      System.out.println("Done Successfully");
			      Writer.close();
			 } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    } 
			break ;

		}
		//defult nadare chon vorodi kontorol shode
		}
		//bazgasht be menu
		menu();
	}
	
	public static void mountain() {
		System.out.println("please enter the number : ");
		String temp = console.next();
		String num = checkFormat(temp);
		System.out.println("please enter the height : ");
		temp = console.next();
		String height = checkFormat(temp);
    	int totalNum=0 ;
    	String Snumber = "" ;
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader("land.txt"));
			String line;
			while ((line = br.readLine()) != null) {
				if (line.startsWith("mountain")) {
					String lineNumber = br.readLine();
					line = br.readLine();
					if (line.startsWith(height))
					{
						int FNum = Integer.parseInt(num);
						line = br.readLine();
						totalNum = Integer.parseInt(lineNumber);
						totalNum = FNum + totalNum ;
						Snumber = Integer.toString(totalNum);
						editPreviousLine("land.txt",height,Snumber);
						menu();	
					}	
			}
			}
		} catch (IOException | NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Mountain area = new Mountain();
		area.setHeight(height);
		area.setNumber(num);
		try {  
		      FileWriter myWriter = new FileWriter("land.txt",true);
		      BufferedWriter Writer = new BufferedWriter(myWriter);
		      Writer.write("mountain");
		      Writer.append("\n");
		      Writer.write(area.getNumber());
		      Writer.append("\n");
		      Writer.write(area.getHeight());
		      Writer.append("\n");
		      System.out.println("Done Successfully");
		      Writer.close();
		 } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    } 
		//bazgasht be menu
		menu();
	}
	
	public static void plantInfo(int number) {
		//2.flower\n3.medical\n4.feedstuf\n5.Fruit\n6.Fruitless
		System.out.println("please enter the type : ");
		String type = console.next();
		System.out.println("please enter the number : ");
		String temp = console.next();
		String num = checkFormat(temp);
		String pType = "" ;
		switch(number) 
		{
		case 2 :
			pType = "flower";
			break;
		case 3 :
			pType = "medical";
			break;
		case 4 :
			pType = "feedStuf";
			break;
		case 5 :
			pType = "fruit";
			break;
		case 6 :
			pType = "fruitLess";
			break;
		}
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader("plant.txt"));
			String line;
			while ((line = br.readLine()) != null) {
				if (line.startsWith(pType)) {
					String lineNumber = br.readLine();
					line = br.readLine();
					if (line.startsWith(type))
					{
						int NewNumber = Integer.parseInt(num);
						int OldNumber = Integer.parseInt(lineNumber);
						OldNumber = OldNumber + NewNumber ;
						String temp1 = Integer.toString(OldNumber);
						editPreviousLine("plant.txt",type,temp1);
						edit();	
					}
				}
			}
		}catch (IOException | NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		switch(number) {// 1.desert\n2.plain\n4.forest
		case 2 :
		{
			Flower area = new Flower();
			area.setNumber(num);
			area.setType(type);
			try {  
			      FileWriter myWriter = new FileWriter("plant.txt",true);
			      BufferedWriter Writer = new BufferedWriter(myWriter);
			      Writer.write("flower");
			      Writer.append("\n");
			      Writer.write(area.getNumber());
			      Writer.append("\n");
			      Writer.write(area.getType());
			      Writer.append("\n");
			      System.out.println("Done Successfully");
			      Writer.close();
			 } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    } 
			break ;
		}
		case 3 :
		{
			Medical area = new Medical();
			area.setNumber(num);
			area.setType(type);
			try {  
			      FileWriter myWriter = new FileWriter("plant.txt",true);
			      BufferedWriter Writer = new BufferedWriter(myWriter);
			      Writer.write("medical");
			      Writer.append("\n");
			      Writer.write(area.getNumber());
			      Writer.append("\n");
			      Writer.write(area.getType());
			      Writer.append("\n");
			      System.out.println("Done Successfully");
			      Writer.close();
			 } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    }
			break ;
		}
		case 4 :
		{
			FeedStuff area = new FeedStuff();
			area.setNumber(num);
			area.setType(type);
			try {  
			      FileWriter myWriter = new FileWriter("plant.txt",true);
			      BufferedWriter Writer = new BufferedWriter(myWriter);
			      Writer.write("feedStuf");
			      Writer.append("\n");
			      Writer.write(area.getNumber());
			      Writer.append("\n");
			      Writer.write(area.getType());
			      Writer.append("\n");
			      System.out.println("Done Successfully");
			      Writer.close();
			 } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    }
			break ;

		}
		case 5 :
		{
			Fruit area = new Fruit();
			area.setNumber(num);
			area.setType(type);
			try {  
			      FileWriter myWriter = new FileWriter("plant.txt",true);
			      BufferedWriter Writer = new BufferedWriter(myWriter);
			      Writer.write("fruit");
			      Writer.append("\n");
			      Writer.write(area.getNumber());
			      Writer.append("\n");
			      Writer.write(area.getType());
			      Writer.append("\n");
			      System.out.println("Done Successfully");
			      Writer.close();
			 } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    }
			break ;
		}
		case 6 :
		{
			FruitLess area = new FruitLess();
			area.setNumber(num);
			area.setType(type);
			try {  
			      FileWriter myWriter = new FileWriter("plant.txt",true);
			      BufferedWriter Writer = new BufferedWriter(myWriter);
			      Writer.write("fruitLess");
			      Writer.append("\n");
			      Writer.write(area.getNumber());
			      Writer.append("\n");
			      Writer.write(area.getType());
			      Writer.append("\n");
			      System.out.println("Done Successfully");
			      Writer.close();
			 } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    }
			break ;
		}
		//defult nadare chon vorodi kontorol shode
		}
		//bazgasht be menu
		menu();
	}
	
	public static String checkFormat(String temp) {
		boolean onlyDigit = true ;
		for(int i=0 ; i<temp.length() ; i++)
		{
			if(!Character.isDigit(temp.charAt(i)))
			{
				onlyDigit = false ;
				break;
			}
		}
		if(onlyDigit)
		{
			return temp ;	
		}
		else
		{
			System.out.print("You entered an illegal character instead of a number\n");
			System.out.print("Try again\n");
			menu();
			return "" ;
		}
	}
	
	public static int checkID(String temp , String filePath) {
        String newString = temp ;
        String line;
        boolean stringExists = false;
        BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(filePath));
			while ((line = reader.readLine()) != null) {
			    if (line.equals(newString)) {
			        stringExists = true;
			        break;
			    }
			}
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        //1 vojod darad 0 vojod nadarad
        if (stringExists) {
            return 1 ;
        } else {
            return 0 ;
        }
    }
	
    public static void edit() {
    	System.out.printf("Enter the part number you want to edit\n");
    	System.out.printf("1.human\n2.animal\n3.terrene\n4.plant\n5.back\n>>>>>");
    	int y = console.nextInt();
    	String temp ;
		switch (y) {
		case 1 :
			temp = console.nextLine();
			editHuman();
			break ;
		case 2 :
			temp = console.nextLine();
			editAnimal();
			break ;
		case 3 :
			temp = console.nextLine();
			editTerrene();
		    break;
		case 4 :
			temp = console.nextLine();
			editPlant();
			break ;
		case 5 :
			menu();
		    break;  
		default :
		{
			System.out.println("The desired option is not allowed!!!");
			menu() ;
			break ;
		}
		}
	}
    
    public static void editHuman() {
    	System.out.println("please enter the id : ");
    	String temp = console.nextLine();
		int Exists = checkID(temp,"human.txt");
		if (Exists == 0) {//0 vojod nadarad 
            System.out.println("This ID dosen't exists!!!\n");
            System.out.print("Try again\n");
			editHuman();
        }
		System.out.printf("Enter the part number you want to edit\n");
    	System.out.printf("1.race\n2.gender\n3.name\n4.family\n5.age\n6.date of birth\n7.date of death\n8.back\n>>>>>");
    	int y = console.nextInt();
    	switch (y) {
		case 1 :
		case 2 :
		case 3 :
		case 4 :
		case 5 :
		{
			String temp1 = console.nextLine();
			System.out.printf("Enter the replacement valu : \n");
			String EditLine = console.nextLine();
			editFile("human.txt",temp,EditLine,y);
			edit();
			break;
		}
		case 6 :
		{
			System.out.printf("1.year\n2.month\n3.day");
			int x = console.nextInt();
			y = y + x - 1 ;
			String temp1 = console.nextLine();
			System.out.printf("Enter the replacement valu : \n");
			String EditLine = console.nextLine();
			editFile("human.txt",temp,EditLine,y);
			edit();
			break;
		}
		case 7 :
		{
			System.out.printf("1.year\n2.month\n3.day");
			int x = console.nextInt();
			y = y + x + 1  ;
			String temp1 = console.nextLine();
			System.out.printf("Enter the replacement valu : \n");
			String EditLine = console.nextLine();
			editFile("human.txt",temp,EditLine,y);
			edit();
			break;
		}
		case 8 :
			edit();
		    break;  
		default :
		{
			System.out.println("The desired option is not allowed!!!");
			edit() ;
			break ;
		}
		}
    }
    
    public static void editAnimal() {
    	System.out.println("please enter the name of the desired animal : ");
    	String name = console.nextLine();
		int Exists = checkID(name,"animal.txt");
		if (Exists == 0) {//0 vojod nadarad 
            System.out.println("This type of animal dosen't exists!!!");
            System.out.print("Try again\n");
			editAnimal();
        }
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader("animal.txt"));
			String line;
			while ((line = br.readLine()) != null) {
				if (line.startsWith(name)) {
					line = br.readLine();
					int number = Integer.parseInt(line);
					System.out.printf("1.add\n2.reduce\n>>>>>");
					int x = console.nextInt();
					System.out.printf("Enter the number you want to change\n");
					int y = console.nextInt();
					switch(x) {
					case 1 :
					{
						y = y + number ;
						String temp1 = Integer.toString(y);
						editFile("animal.txt",name,temp1,1);
						edit();
						break;
					}
					case 2 :
					{
						y = number - y ;
						if(y<0)
						{
							System.out.println("The entered value is not allowed!!!");
							System.out.print("Try again\n");
							String temp = console.nextLine();
							editAnimal();
						}
						else
						{
							String temp1 = Integer.toString(y);
							editFile("animal.txt",name,temp1,1);
							edit();
						}
						break;
					}
					default :
					{
						System.out.println("The desired option is not allowed!!!");
						editAnimal() ;
						break ;
					}	
					}
			}
			}
				
		} catch (IOException | NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public static void editTerrene() {
    	System.out.print("1.land\n2.water area\n3.back\n>>>>>");
    	int z = console.nextInt();
    	switch(z) {
    	case 1 :
    	{
    		System.out.println("1.desert\n2.plain\n3.forest\n4.mountain\n5.back\n>>>>>");
    		int k = console.nextInt();
    		switch(k) {
    		case 1 :
    		case 2 : 
    		case 3 :
    		{
    			String teemp = console.nextLine();
    			String name = "" ;
    			switch(k){
    			case 1 :
    				name = "desert";
    				break ;
    			case 2 :
    				name = "plain";
    				break ;
    			case 3 :
    				name = "forest";
    				break ;
    			}
    			int Exists = checkID(name,"land.txt");
    			if (Exists == 0) {//0 vojod nadarad 
    	            System.out.println("This type of land dosen't exists!!!");
    	            System.out.print("Try again\n");
    				editTerrene();
    	        }
    			BufferedReader br;
    			try {
    				br = new BufferedReader(new FileReader("land.txt"));
    				String line;
    				while ((line = br.readLine()) != null) {
    					if (line.startsWith(name)) {
    						line = br.readLine();
    						int number = Integer.parseInt(line);
    						System.out.printf("1.add\n2.reduce\n>>>>>");
    						int x = console.nextInt();
    						System.out.printf("Enter the number you want to change\n");
    						int y = console.nextInt();
    						switch(x) {
    						case 1 :
    						{
    							y = y + number ;
    							String temp1 = Integer.toString(y);
    							editFile("land.txt",name,temp1,1);
    							edit();
    							break;
    						}
    						case 2 :
    						{
    							y = number - y ;
    							if(y<0)
    							{
    								System.out.println("The entered value is not allowed!!!");
    								System.out.print("Try again\n");
    								editTerrene();
    							}
    							else
    							{
    								String temp1 = Integer.toString(y);
    								editFile("land.txt",name,temp1,1);
    								edit();
    							}
    							break;
    						}
    						default :
    						{
    							System.out.println("The desired option is not allowed!!!");
    							editTerrene() ;
    							break ;
    						}	
    						}
    				}
    				}
    					
    			} catch (IOException | NumberFormatException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
    		}
    		case 4 :
    		{
    			String teemp = console.nextLine();
    	    	String name = "mountain";
    			int Exists = checkID(name,"land.txt");
    			if (Exists == 0) {//0 vojod nadarad 
    	            System.out.println("This type of land dosen't exists!!!");
    	            System.out.print("Try again\n");
    				editTerrene();
    	        }
    			System.out.printf("Enter the part number you want to edit\n");
    	    	System.out.printf("1.number\n2.height\n3.back\n>>>>>");
    	    	int i = console.nextInt();
    	    	switch(i) {
    	    	case 1 :
    	    	case 2 :
    	    	{
    	    		BufferedReader br;
        			try {
        				br = new BufferedReader(new FileReader("land.txt"));
        				String line;
        				while ((line = br.readLine()) != null) {
        					if (line.startsWith(name)) {
        						line = br.readLine();
        						if(i==2)
        						{
        							line = br.readLine();
        						}
        						int number = Integer.parseInt(line);
        						System.out.printf("1.add\n2.reduce\n>>>>>");
        						int x = console.nextInt();
        						System.out.printf("Enter the number you want to change\n");
        						int y = console.nextInt();
        						switch(x) {
        						case 1 :
        						{
        							y = y + number ;
        							String temp1 = Integer.toString(y);
        							editFile("land.txt",name,temp1,i);
        							edit();
        							break;
        						}
        						case 2 :
        						{
        							y = number - y ;
        							if(y<0)
        							{
        								System.out.println("The entered value is not allowed!!!");
        								System.out.print("Try again\n");
        								String tempp = console.nextLine();
        								editTerrene();
        							}
        							else
        							{
        								String temp1 = Integer.toString(y);
        								editFile("land.txt",name,temp1,i);
        								edit();
        							}
        							break;
        						}
        						default :
        						{
        							System.out.println("The desired option is not allowed!!!");
        							editTerrene() ;
        							break ;
        						}	
        						}
        				}
        				}
        					
        			} catch (IOException | NumberFormatException e) {
        				// TODO Auto-generated catch block
        				e.printStackTrace();
        			}
    	    	}
    	    	case 3 : 
            	{
            		edit();
            		break ;
            	}
            	default :
        		{
        			System.out.println("The desired option is not allowed!!!");
        			editTerrene() ;
        			break ;
        		}	
    	    	}
    	    	
    		}
    		case 5 : 
        	{
        		edit();
        		break ;
        	}
        	default :
    		{
    			System.out.println("The desired option is not allowed!!!");
    			editTerrene() ;
    			break ;
    		}	
    		}
    	}
    	case 2 :
    	{
    		String teemp = console.nextLine();
    		System.out.println("please enter the name of the desired water area : ");
	    	String name = console.nextLine();
			int Exists = checkID(name,"waterArea.txt");
			if (Exists == 0) {//0 vojod nadarad 
	            System.out.println("This type of land dosen't exists!!!");
	            System.out.print("Try again\n");
				editTerrene();
	        }
			System.out.printf("Enter the part number you want to edit\n");
	    	System.out.printf("1.depth\n2.number\n3.back\n>>>>>");
	    	int i = console.nextInt();
	    	switch(i) {
	    	case 1 :
	    	case 2 :
	    	{
	    		BufferedReader br;
    			try {
    				br = new BufferedReader(new FileReader("waterArea.txt"));
    				String line;
    				while ((line = br.readLine()) != null) {
    					if (line.startsWith(name)) {
    						line = br.readLine();
    						if(i==2)
    						{
    							line = br.readLine();
    						}
    						int number = Integer.parseInt(line);
    						System.out.printf("1.add\n2.reduce\n>>>>>");
    						int x = console.nextInt();
    						System.out.printf("Enter the number you want to change\n");
    						int y = console.nextInt();
    						switch(x) {
    						case 1 :
    						{
    							y = y + number ;
    							String temp1 = Integer.toString(y);
    							editFile("waterArea.txt",name,temp1,i);
    							edit();
    							break;
    						}
    						case 2 :
    						{
    							y = number - y ;
    							if(y<0)
    							{
    								System.out.println("The entered value is not allowed!!!");
    								System.out.print("Try again\n");
    								String tempp = console.nextLine();
    								editTerrene();
    							}
    							else
    							{
    								String temp1 = Integer.toString(y);
    								editFile("waterArea.txt",name,temp1,i);
    								edit();
    							}
    							break;
    						}
    						default :
    						{
    							System.out.println("The desired option is not allowed!!!");
    							editTerrene() ;
    							break ;
    						}	
    						}
    				}
    				}
    					
    			} catch (IOException | NumberFormatException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
	    	}
	    	case 3 : 
        	{
        		edit();
        		break ;
        	}
        	default :
    		{
    			System.out.println("The desired option is not allowed!!!");
    			editTerrene() ;
    			break ;
    		}	
	    	}
    	}
    	case 3 : 
    	{
    		edit();
    		break ;
    	}
    	default :
		{
			System.out.println("The desired option is not allowed!!!");
			editTerrene() ;
			break ;
		}	
    	}	
    }
    
    public static void editPlant() {
    	System.out.println("1.tree\n2.flower\n3.medical\n4.Fruit\n5.Fruitless\n6.back\n>>>>>");
    	int z = console.nextInt();
    	String type = "" ;
    	switch(z)
    	{
    	case 1 :
    		type = "tree";
    		break;
    	case 2 :
    		type = "flower";
    		break;
    	case 3 :
    		type = "medical";
    		break;
    	case 4 :
    		type = "fruit";
    		break;
    	case 5 :
    		type = "fruitless";
    		break;
    	}
    	int Exists = checkID(type,"plant.txt");
		if (Exists == 0) {//0 vojod nadarad 
            System.out.println("This type of land dosen't exists!!!");
            System.out.print("Try again\n");
			editPlant();
        }
		String teemp = console.nextLine();
		System.out.println("please enter the type of the desired plant : ");
    	String name = console.nextLine();
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader("plant.txt"));
			String line;
			while ((line = br.readLine()) != null) {
				if (line.startsWith(type)) {
					String lineNumber = br.readLine();
					line = br.readLine();
					if (line.startsWith(name))
					{
						
					}
					else
					{
						System.out.println("This type of land dosen't exists!!!");
			            System.out.print("Try again\n");
						editPlant();
					}
					int number = Integer.parseInt(lineNumber);
					System.out.printf("1.add\n2.reduce\n>>>>>");
					int x = console.nextInt();
					System.out.printf("Enter the number you want to change\n");
					int y = console.nextInt();
					switch(x) {
					case 1 :
					{
						y = y + number ;
						String temp1 = Integer.toString(y);
						editPreviousLine("plant.txt",name,temp1);
						edit();	
						break;
					}
					case 2 :
					{
						y = number - y ;
						if(y<0)
						{
							System.out.println("The entered value is not allowed!!!");
							System.out.print("Try again\n");
							teemp = console.nextLine();
							editPlant();
						}
						else
						{
							String temp1 = Integer.toString(y);
							editPreviousLine("plant.txt",name,temp1);
							edit();				
						}
						break;
					}
					default :
					{
						System.out.println("The desired option is not allowed!!!");
						editPlant() ;
						break ;
					}	
					}
			}
			}
				
		} catch (IOException | NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public static void editFile(String file , String FindLine , String EditLine , int numLine){
    	BufferedReader br;
		try {
				br = new BufferedReader(new FileReader(file));
				FileWriter fw = new FileWriter("temp");
				String line;
				while ((line = br.readLine()) != null) {
					if (line.startsWith(FindLine)) {
						for(int i=0 ; i<numLine ; i++)
						{
							fw.write(line + "\n");
							line = br.readLine();
						}
						line = EditLine ;
					}
					fw.write(line + "\n");
				}

				br.close();
				fw.close();
				
				
				br = new BufferedReader(new FileReader("temp"));
				FileWriter fw1 = new FileWriter(file);
				while ((line = br.readLine()) != null) {
					fw1.write(line + "\n");
				}
				br.close();
				fw1.close();
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.printf("Done Successfully\n");
    }
    
    public static void editPreviousLine(String filePath,String targetLine,String newContent) {
    	// khandad file v tashkil yek list
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        // peida kardan target line v taghir previous line
        int targetIndex = lines.indexOf(targetLine);
        if (targetIndex > 0) {
            int previousIndex = targetIndex - 1;
            lines.set(previousIndex, newContent);
        }

        // neveshtan modified lines dobare dar file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } 
        
    }
   
    public static void search() {
		System.out.printf("search in: \n1.human resources\n");
		System.out.printf("2.animal resources\n");
		System.out.printf("3.plant resources\n");
		System.out.printf("4.territorial resources\n");
		System.out.printf("5.Back to menu\n");
		System.out.printf("Enter the desired number : \n");
		int x = console.nextInt();
		switch(x)
		{
			case 1 : System.out.printf("1.based on ethnicity\n2.based on gender\n3.based on id\n4.back\n");
			System.out.printf("Enter the desired number : \n");
		    int x1 = console.nextInt();
			if((0<x1)&& (x1<5))
			{
				if(x1 == 4){search();}
				else{searchINhuman(x1);}

			}
			else{System.out.printf("incorecct\n"); search();}
			break;
			case 2 : System.out.printf("1.based on type\n2.based name\n3.based on id (just for special animals)\n4.back\n");
			System.out.printf("Enter the desired number : \n");
		    int x2 = console.nextInt();
			if((0<x2)&& (x2<5))
			{
				if(x2 == 4){search();}
				else{searchINanimal(x2);}

			}
			break;
			case 3 : searchINplant();
			break;
			case 4 :
			break;
			case 5 : menu();
			break;
			default : System.out.printf("incorecct\n"); search();

		}
		
	}
	public static void searchINhuman(int x)
	{
		try {
			FileReader searchhuman = new FileReader("human.txt");

        BufferedReader searchINhuman = new BufferedReader(searchhuman);
		String v;

		if(x == 1)//ethnicity
		{
			System.out.printf("Enter the name of the ethnicity : ");
			v = console.next();
				
			String line1 = null , line2 = null ;
			int check;


			while ((line1 = searchINhuman.readLine()) != null) {
				line2 = searchINhuman.readLine();
				check = line2.compareTo(v);
				if(check == 0)
				{
					System.out.printf("%s", line1 );
					for(int i = 0 ; i < 10 ; i++)
					{
						line2 = searchINhuman.readLine();
						System.out.printf("%10s", line2);

					}
					System.out.printf("\n");
				}
				else
				{
					for(int i = 0 ; i < 10 ; i++)
					{
						line2 = searchINhuman.readLine();

					}

				}	

			}
			searchINhuman.close();
			int c = 0 ;
            while(c == 0){
			System.out.printf("1.Back \n");
			System.out.printf("Enter the desired number : \n");
		    int a = console.nextInt();
			if(a != 1)
			{System.out.printf("incorecct\n");}
			else{search();}
			}


		}
		if(x == 2)//gender
		{
			System.out.printf("Enter gender : ");
			v = console.next();

			String line1 = null , line2 = null, line3 = null ;
			int check;


			while ((line1 = searchINhuman.readLine()) != null) {
				line2 = searchINhuman.readLine();
				line3 = searchINhuman.readLine();
				check = line3.compareTo(v);
				if(check == 0)
				{
					System.out.printf("%s%10S", line1 , line2 );
					for(int i = 0 ; i < 9 ; i++)
					{
						line3 = searchINhuman.readLine();
						System.out.printf("%10s", line3);

					}
					System.out.printf("\n");
				}
				else
				{
					for(int i = 0 ; i < 9 ; i++)
					{
						line3 = searchINhuman.readLine();

					}

				}	

			}
			searchINhuman.close();
			int c = 0 ;
            while(c == 0){
			System.out.printf("1.Back \n");
			System.out.printf("Enter the desired number : \n");
		    int a = console.nextInt();
			if(a != 1)
			{System.out.printf("incorecct\n");}
			else{search();}
			}
			

		}
		if(x == 3)//id 
		{
			System.out.printf("Enter id : ");
			v = console.next();

			String line1 = null;
			int check;


			while ((line1 = searchINhuman.readLine()) != null) {
				check = line1.compareTo(v);
				if(check == 0)
				{
					for(int i = 0 ; i < 11 ; i++)
					{
						if(i>=1)
						{
							line1 = searchINhuman.readLine();
						    System.out.printf("%10s", line1);
							continue;
						}
						line1 = searchINhuman.readLine();
						System.out.printf("%s", line1);

					}
					System.out.printf("\n");
				}
				else
				{
					for(int i = 0 ; i < 11 ; i++)
					{
						line1 = searchINhuman.readLine();

					}

				}	

			}
			searchINhuman.close();
			int c = 0 ;
            while(c == 0){
			System.out.printf("1.Back \n");
			System.out.printf("Enter the desired number : \n");
		    int a = console.nextInt();
			if(a != 1)
			{System.out.printf("incorecct\n");}
			else{search();}
			}

		}


		} catch(IOException e) {
            e.printStackTrace();
        }
		
		
	}

	public static void searchINanimal(int x)
	{
		try {
			FileReader searchanimal = new FileReader("animal.txt");

        BufferedReader searchINanimal = new BufferedReader(searchanimal);
		String v;

		if(x == 1)//type
		{
			System.out.printf("Enter type : ");
			v = console.next();
				
			String line1 = null , line2 = null ;
			int check;


			while ((line1 = searchINanimal.readLine()) != null) {
				line2 = searchINanimal.readLine();
				check = line2.compareTo(v);
				if(check == 0)
				{
					for(int i = 0 ; i < 2 ; i++)
					{
						if(i>=1)
						{
							line2 = searchINanimal.readLine();
						    System.out.printf("%10s", line2);
							continue;
						}
						line2 = searchINanimal.readLine();
						System.out.printf("%s", line2);

					}
					System.out.printf("\n");
				}
				else
				{
					for(int i = 0 ; i < 2 ; i++)
					{
						line2 = searchINanimal.readLine();

					}

				}	

			}
			searchINanimal.close();
			int c = 0 ;
            while(c == 0){
			System.out.printf("1.Back \n");
			System.out.printf("Enter the desired number : \n");
		    int a = console.nextInt();
			if(a != 1)
			{System.out.printf("incorecct\n");}
			else{search();}
			}


		}
		if(x == 2)//name special
		{
			System.out.printf("Enter name : ");
			v = console.next();

			String line1 = null , line2 = null, line3 = null ;
			int check;


			while ((line1 = searchINanimal.readLine()) != null) {
				line2 = searchINanimal.readLine();
				line3 = searchINanimal.readLine();
				check = line3.compareTo(v);
				if(check == 0)
				{
					System.out.printf("%s", line3);
					System.out.printf("%10s", line2);
					line3 = searchINanimal.readLine();
					System.out.printf("%10s", line3);
					System.out.printf("\n");
				}
				else
				{
					
					line3 = searchINanimal.readLine();

				}	

			}
			searchINanimal.close();
			int c = 0 ;
            while(c == 0){
			System.out.printf("1.Back \n");
			System.out.printf("Enter the desired number : \n");
		    int a = console.nextInt();
			if(a != 1)
			{System.out.printf("incorecct\n");}
			else{search();}
			}
			

		}
		if(x == 3)//id special
		{
			System.out.printf("Enter id : ");
			v = console.next();

			String line1 = null;
			int check;


			while ((line1 = searchINanimal.readLine()) != null) {
				check = line1.compareTo(v);
				if(check == 0)
				{
					for(int i = 0 ; i < 3 ; i++)
					{
						if(i>=1)
						{
							line1 = searchINanimal.readLine();
						    System.out.printf("%10s", line1);
							continue;
						}
						line1 = searchINanimal.readLine();
						System.out.printf("%s", line1);

					}
					System.out.printf("\n");
				}
				else
				{
					for(int i = 0 ; i < 3 ; i++)
					{
						line1 = searchINanimal.readLine();

					}

				}	

			}
			searchINanimal.close();
			int c = 0 ;
            while(c == 0){
			System.out.printf("1.Back \n");
			System.out.printf("Enter the desired number : \n");
		    int a = console.nextInt();
			if(a != 1)
			{System.out.printf("incorecct\n");}
			else{search();}
			}

		}


		} catch(IOException e) {
            e.printStackTrace();
        }

	}

	public static void searchINplant()
	{
		try {
			FileReader searchplant = new FileReader("plant.txt");

            BufferedReader searchINplant = new BufferedReader(searchplant);
		    String v;
		    System.out.printf("Enter type : ");
		    v = console.next();

		    String line1 = null, line2 = null;
		    int check;

		    while ((line1 = searchINplant.readLine()) != null) {
				check = line1.compareTo(v);
				if(check == 0)
				{
					
					line1 = searchINplant.readLine();
					line2 = searchINplant.readLine();
					System.out.printf("%s%10s", line2, line1);
					System.out.printf("\n");
				}
				else
				{
					for(int i = 0 ; i < 3 ; i++)
					{
						line1 = searchINplant.readLine();

					}

				}
			}
			searchINplant.close();
			int c = 0 ;
            while(c == 0){
			System.out.printf("1.Back \n");
			System.out.printf("Enter the desired number : \n");
		    int a = console.nextInt();
			if(a != 1)
			{System.out.printf("incorecct\n");}
			else{search();}
			}
		
		} catch(IOException e) {
            e.printStackTrace();
        }
	}
    
    public static void report() {

		System.out.printf("1.Namber of human resources\n");
		System.out.printf("2.Number of animal resources\n");
		System.out.printf("3.Number of plant resources\n");
		System.out.printf("4.Number of territorial resources\n");
		System.out.printf("5.Back to menu\n");
		System.out.printf("Enter the desired number : \n");
		int x = console.nextInt();
		switch(x)
		{
			case 1 : numhumanres();
			break;
			case 2 : numanimalres();
			break;
			case 3 : numplantres();
			break;
			case 4 : System.out.printf("1.land\n2.whater area\n3.back");
		    System.out.printf("Enter the desired number : \n");
			int x1 = console.nextInt();
			switch(x1)
			{
				case 1 :
				case 2 : numterritorialres(x1);
				break;
				case 3 : report();
				break;
				default : System.out.printf("incorecct\n");
			}
			
			break;
			case 5 : menu();
			break;
			default: System.out.printf("incorecct\n");
			        report();
		}

		
	}

	public  static void numhumanres()
	{
		try {
            FileReader numhuman = new FileReader("human.txt");

            BufferedReader reporthuman = new BufferedReader(numhuman);

			int ctork = 0,  cfars = 0,  ckord = 0,  ctorkaman = 0 , carab = 0,  cbaloch = 0,
			ctorkmale = 0 , cfarsmale = 0 , ckordmale = 0 , ctorkamanmale = 0 , carabmale = 0 , cbalochmale = 0, 
			ctorkfemale = 0, cfarsfemale = 0 , ckordfemale = 0 ,ctorkamanfemale = 0 , carabfemale = 0 ,cbalochfemale = 0 ;

			String line = null;

            while( (line = reporthuman.readLine() ) != null ) {
				int check = line.compareTo("tork");
                if( check == 0)
				{
					ctork++ ;
					line = reporthuman.readLine();
				    check = line.compareTo("male");
					if(check == 0)
					{
						ctorkmale++;
					}
					else
					{
						ctorkfemale++;
					}
				}
				else
				{
					
					check = line.compareTo("fars");
                    if( check == 0)
				    {
					    cfars++ ;
					    line = reporthuman.readLine();
				        check = line.compareTo("male");
					    if(check == 0)
					    {
						    cfarsmale++;
					    }
					    else
					    {
						    cfarsfemale++;
					    }
				    }
					else
					{
						check = line.compareTo("arab");
                        if( check == 0)
				        {
					        carab++ ;
					        line = reporthuman.readLine();
				            check = line.compareTo("male");
					        if(check == 0)
					        {
						        carabmale++;
					        }
					        else
					        {
						        carabfemale++;
					        }
				        }
						else
						{
							check = line.compareTo("kord");
							if( check == 0)
				            {
					            ckord++ ;
					            line = reporthuman.readLine();
				                check = line.compareTo("male");
					            if(check == 0)
					            {
						            ckordmale++;
					            }
					            else
					            {
						            ckordfemale++;
					            }
				            }
							else
							{
								check = line.compareTo("torkaman");
							    if( check == 0)
				                {
					                ctorkaman++ ;
					                line = reporthuman.readLine();
				                    check = line.compareTo("male");
					                if(check == 0)
					                {
						                ctorkamanmale++;
					                }
					                else
					                {
						                ctorkamanfemale++;
					                }
				                }
								else
								{
									check = line.compareTo("baloch");
							        if( check == 0)
				                    {
					                    cbaloch++ ;
					                    line = reporthuman.readLine();
				                        check = line.compareTo("male");
					                    if(check == 0)
					                    {
						                    cbalochmale++;
					                    }
					                    else
					                    {
						                    cbalochfemale++;
					                    }
				                    }
								}
							}

						}

					}
				}
            }
			 reporthuman.close();
			 
			System.out.printf("qhom    male   female total \n");
			System.out.printf("tork      %d      %d     %d \n", ctorkmale , ctorkfemale , ctork);
			System.out.printf("kord      %d      %d     %d \n", ckordmale , ckordfemale , ckord);
			System.out.printf("fars      %d      %d     %d \n", cfarsmale , cfarsfemale , cfars);
			System.out.printf("arab      %d      %d     %d \n", carabmale , carabfemale , carab);
			System.out.printf("torkaman  %d      %d     %d \n", ctorkamanmale , ctorkamanfemale , ctorkaman);
			System.out.printf("baloch    %d      %d     %d \n", cbalochmale , cbalochfemale , cbaloch);
			System.out.printf("total population:%d    person\n", (ctork + ckord + cfars + carab + cbaloch + ctorkaman));
			System.out.printf("__________________________________ \n");
			int o = 0;
            while(o == 0){
			System.out.printf("\n1.Details by ethnicity \n");
			System.out.printf("2.Details by gender \n");
			System.out.printf("3.Back \n");
			System.out.printf("Enter the desired number : \n");
		    int x = console.nextInt();
			switch(x)
			{
				case 1 : while(o == 0){
				System.out.println("1.fars\n2.arab\n3.tork\n4.kord\n5.baloch\n6.torkaman\n7.Back\n");
				System.out.printf("Enter the desired number : \n");
				x = console.nextInt();
				if((x>0) && (x<8))
				{
					if(x == 7){numhumanres();}
					else{numhumanres1(x);}
				}
				else{System.out.printf("incorecct\n");}
			    }
				break;
				case 2 : while( o == 0){
				System.out.println("1.male\n2.female\n3.Back\n");
				System.out.printf("Enter the desired number : \n");
				x = console.nextInt();
				if((x>0) && (x<4))
				{
					if(x == 3){numhumanres();}
					else{numhumanres2(x);}
				}
				else{System.out.printf("incorecct\n");}
			    }
				break;
				case 3 : report();
				break;
				default:System.out.printf("incorecct\n");
				        
			}
		    }



        }
        catch(IOException e) {
            e.printStackTrace();
        }

	}

	public  static void numhumanres1(int x)
	{
		try {
			FileReader numhuman = new FileReader("human.txt");
        BufferedReader reportbygh = new BufferedReader(numhuman);
		String line1 = null;
		String line2 = null;
		System.out.printf("id             gender     name    family       age           birth anniversary             death anniversary \n");
		if(x == 1)
		{
			while( (line1 = reportbygh.readLine() ) != null) 
			{
				line2 = reportbygh.readLine();
				int check = line2.compareTo("fars");
				if(check == 0)
				{
					System.out.printf("%10s", line1);
					for(int i = 0 ; i< 10 ; i++)
					{
						line2 = reportbygh.readLine();
						System.out.printf("%10s", line2);
					}
					System.out.printf("\n");

				}
				else
				{
					for(int i = 0 ; i< 10 ; i++)
					{
						line2 = reportbygh.readLine();
					}
				}

			}

			
		}
		if(x == 2)
		{
			while( (line1 = reportbygh.readLine() ) != null) 
			{
				line2 = reportbygh.readLine();
				int check = line2.compareTo("arab");
				if(check == 0)
				{
					System.out.printf("%10s", line1);
					for(int i = 0 ; i< 10 ; i++)
					{
						line2 = reportbygh.readLine();
						System.out.printf("%10s", line2);
					}
					System.out.printf("\n");

				}
				else
				{
					for(int i = 0 ; i< 10 ; i++)
					{
						line2 = reportbygh.readLine();
					}
				}

			}

		}
		if(x == 3)
		{
			while( (line1 = reportbygh.readLine() ) != null) 
			{
				line2 = reportbygh.readLine();
				int check = line2.compareTo("tork");
				if(check == 0)
				{
					System.out.printf("%10s", line1);
					for(int i = 0 ; i< 10 ; i++)
					{
						line2 = reportbygh.readLine();
						System.out.printf("%10s", line2);
					}
					System.out.printf("\n");

				}
				else
				{
					for(int i = 0 ; i< 10 ; i++)
					{
						line2 = reportbygh.readLine();
					}
				}

			}

		}
		if(x == 4)
		{
			while( (line1 = reportbygh.readLine() ) != null) 
			{
				line2 = reportbygh.readLine();
				int check = line2.compareTo("kord");
				if(check == 0)
				{
					System.out.printf("%10s", line1);
					for(int i = 0 ; i< 10 ; i++)
					{
						line2 = reportbygh.readLine();
						System.out.printf("%10s", line2);
					}
					System.out.printf("\n");

				}
				else
				{
					for(int i = 0 ; i< 10 ; i++)
					{
						line2 = reportbygh.readLine();
					}
				}

			}

		}
		if(x == 5)
		{
			while( (line1 = reportbygh.readLine() ) != null) 
			{
				line2 = reportbygh.readLine();
				int check = line2.compareTo("baloch");
				if(check == 0)
				{
					System.out.printf("%10s", line1);
					for(int i = 0 ; i< 10 ; i++)
					{
						line2 = reportbygh.readLine();
						System.out.printf("%10s", line2);
					}
					System.out.printf("\n");

				}
				else
				{
					for(int i = 0 ; i< 10 ; i++)
					{
						line2 = reportbygh.readLine();
					}
				}

			}

		}
		if(x == 6)
		{
			while( (line1 = reportbygh.readLine() ) != null) 
			{
				line2 = reportbygh.readLine();
				int check = line2.compareTo("torkaman");
				if(check == 0)
				{
					System.out.printf("%10s", line1);
					for(int i = 0 ; i< 10 ; i++)
					{
						line2 = reportbygh.readLine();
						System.out.printf("%10s", line2);
					}
					System.out.printf("\n");

				}
				else
				{
					for(int i = 0 ; i< 10 ; i++)
					{
						line2 = reportbygh.readLine();
					}
				}

			}

		}
		reportbygh.close();
		System.out.printf("\n");
		int o = 0;
		while(o == 0){
		System.out.printf("1.back\n");
		System.out.printf("Enter the desired number : \n");
		x = console.nextInt();
		if(x == 1){
			numhumanres();
		}
		else{
			System.out.printf("incorecct\n");
		}
	    }

		} catch(IOException e) {
            e.printStackTrace();
        }

	}
	public  static void numhumanres2(int x)
	{
		try {
			FileReader numhuman = new FileReader("human.txt");
        BufferedReader reportbyge = new BufferedReader(numhuman);
		String line1 = null;
		String line2 = null;
		String line3 = null;
		System.out.printf("id              race        name   family      age         birth anniversary          death anniversary \n");

		if ( x == 1)
		{
			while( (line1 = reportbyge.readLine() ) != null) 
			{
				line2 = reportbyge.readLine();
				line3 = reportbyge.readLine();
				int check = line3.compareTo("male");
				if(check == 0)
				{
					System.out.printf("%10s", line1);
					System.out.printf("%10s", line2);
					for(int i = 0 ; i< 9 ; i++)
					{
						line3 = reportbyge.readLine();
						System.out.printf("%10s", line3);
					}
					System.out.printf("\n");

				}
				else
				{
					for(int i = 0 ; i< 9 ; i++)
					{
						line2 = reportbyge.readLine();
					}
				}

			}

		}
		if ( x == 2)
		{
			while( (line1 = reportbyge.readLine() ) != null) 
			{
				line2 = reportbyge.readLine();
				line3 = reportbyge.readLine();
				int check = line3.compareTo("female");
				if(check == 0)
				{
					System.out.printf("%10s", line1);
					System.out.printf("%10s", line2);
					for(int i = 0 ; i< 9 ; i++)
					{
						line3 = reportbyge.readLine();
						System.out.printf("%10s", line3);
					}
					System.out.printf("\n");

				}
				else
				{
					for(int i = 0 ; i< 9 ; i++)
					{
						line2 = reportbyge.readLine();
					}
				}

			}

		}
		reportbyge.close();
		System.out.printf("\n");
		int o = 0;
		while(o == 0){
		System.out.printf("1.back\n");
		System.out.printf("Enter the desired number : \n");
		x = console.nextInt();
		if(x == 1){
			numhumanres();
		}
		else{
			System.out.printf("incorecct\n");
		}
	    }
		
		} catch(IOException e) {
            e.printStackTrace();
		}

	}

	public static void numanimalres()
	{
		try {
			FileReader numanimal = new FileReader("animal.txt");

            BufferedReader reportanimal = new BufferedReader(numanimal);

			int cmamal = 0 , coviparous = 0;

			String line = null;

            while( (line = reportanimal.readLine() ) != null ) {
				int check = line.compareTo("mamal");
                if( check == 0)
				{
					cmamal++ ;
				}
				else
				{
					
					check = line.compareTo("oviparous");
                    if( check == 0)
				    {
					    coviparous++ ;
				    }
				}
			}
			reportanimal.close();

		    System.out.printf("type       number \n");
			System.out.printf("mamal        %d     \n", cmamal);
			System.out.printf("oviparous    %d     \n\n", coviparous);
			System.out.printf("total : %d \n", coviparous + cmamal);
			System.out.printf("_______________________________ \n\n");
			int o = 0;
			while( o == 0){
			System.out.printf("1.Details of special animals \n");
			System.out.printf("2.Back \n");
			System.out.printf("Enter the desired number : \n");
		    int x = console.nextInt();
			switch(x)
			{
				case 1 : numanimalres1();
				break;
				case 2 : report();
				break;
				default : System.out.printf("incorecct\n");
			}
			}
			
		} catch(IOException e) {
            e.printStackTrace();
		}
		
	}

	public static void numanimalres1()
	{
		try {
			FileReader numanimal = new FileReader("animal.txt");

            BufferedReader reportanimalsp = new BufferedReader(numanimal);

			String line = null, id = "id", type = "type" , name = "name" ;
			System.out.printf("%s%18s%10s\n", id,type,name);
			int c = 0;

			while( (line = reportanimalsp.readLine() ) != null) 
			{
				int chack = line.compareTo("0");
				if(chack != 0)
				{
					c++;
					System.out.printf("%10s", line);
					for(int i = 0 ; i< 2 ; i++)
					{
						line = reportanimalsp.readLine();
						System.out.printf("%10s", line);
					}
					line = reportanimalsp.readLine();
					System.out.printf("\n");

				}
				else
				{
					for(int i = 0 ; i< 3 ; i++)
					{
						line = reportanimalsp.readLine();
					}
				}
				
			}
			System.out.printf("total : %d \n", c);
			int o = 0;
			while(o == 0){
		    System.out.printf("1.back\n");
		    System.out.printf("Enter the desired number : \n");
		    int x = console.nextInt();
		    if(x == 1){
			    numanimalres();
		    }
		    else{
			    System.out.printf("incorecct\n");
		    }
	        }
			reportanimalsp.close();

		} catch(IOException e) {
            e.printStackTrace();
		}

	}

	public static void numplantres()
	{
		try {
			FileReader numplant = new FileReader("plant.txt");

            BufferedReader reportplant = new BufferedReader(numplant);

			int cfruit = 0 , cfruitless = 0 , cflower = 0 , cmedical = 0 ,cfeedstuf = 0 , temp = 0 ;
			

			String line = null;

            while( (line = reportplant.readLine() ) != null ) {
				int check = line.compareTo("fruit");
                if( check == 0)
				{
					temp = Integer.parseInt(reportplant.readLine());
					cfruit = cfruit + temp ;
				}
				else
				{
					
					check = line.compareTo("fruitLess");
                    if( check == 0)
				    {
					    temp = Integer.parseInt(reportplant.readLine());
					    cfruitless = cfruitless + temp ;
				    }
					else
					{
						check = line.compareTo("flower");
						if( check == 0)
				        {
					        temp = Integer.parseInt(reportplant.readLine());
					        cflower = cflower + temp ;
				        }
						else
						{
							check = line.compareTo("medical");
						    if( check == 0)
				            {
					            temp = Integer.parseInt(reportplant.readLine());
					            cmedical = cmedical + temp ;
				            }
							else
							{
								check = line.compareTo("feedStuf");
						        if( check == 0)
				                {
					                temp = Integer.parseInt(reportplant.readLine());
					                cfeedstuf = cfeedstuf + temp ;
				                }
							}

						}
					}
				}
			}
			reportplant.close();

		    System.out.printf("type          number \n");
			System.out.printf("fruitTree        %d     \n", cfruit);
			System.out.printf("fruitlessTree    %d     \n", cfruitless ) ;
			System.out.printf("flower           %d     \n", cflower);
			System.out.printf("medical          %d     \n", cmedical);
			System.out.printf("feedStuf         %d     \n\n", cfeedstuf);
			System.out.printf("total : %d \n", cfruit + cfruitless + cflower + cmedical + cfeedstuf);
			System.out.printf("_______________________________ \n\n");
			int o = 0;
			while( o == 0){
			System.out.printf("1.Details of trees \n");
			System.out.printf("2.Details of flowers \n");
			System.out.printf("3.Details of medical \n");
			System.out.printf("4.Details of feedStuf \n");
			System.out.printf("5.Back \n");
			System.out.printf("Enter the desired number : \n");
		    int x = console.nextInt();
			switch(x)
			{
				case 1 : 
				case 2 :
				case 3 :
				case 4 : numplantres1(x);
				break;
				case 5 : report();
				break;
				default : System.out.printf("incorecct\n");
			}
			}
			
		} catch(IOException e) {
            e.printStackTrace();
		}

	}

	public static void numplantres1 (int x )
	{
		try {
			FileReader numplant = new FileReader("plant.txt");

            BufferedReader reportplant1 = new BufferedReader(numplant);
			String line1 = null , line2 = null , line3=null , type = "type" , name = "name" , number = "number" ;
			int check ;
			if(x == 1)
		    {
			System.out.printf("%s%12s%20s\n", name , type , number);

			while((line1 = reportplant1.readLine()) != null )
			{
				check = line1.compareTo("fruit");
                if( check == 0)
				{
					String fruit = "fruitTree";
					line2 = reportplant1.readLine();
					line3 = reportplant1.readLine();
					System.out.printf("%s%17s%15s\n", line3 ,fruit , line2);
					continue;
				}
				check = line1.compareTo("fruitLess");
                 if( check == 0)
				{
					String fruit = "fruitlessTree";
					line2 = reportplant1.readLine();
					line3 = reportplant1.readLine();
					System.out.printf("%s%20s%10s\n", line3 ,fruit , line2);
				}

			}
		    }
			if(x == 2)
			{
				System.out.printf("%s%10s\n", name , number);
				while((line1 = reportplant1.readLine()) != null )
				{
					check = line1.compareTo("flower");
                    if( check == 0)
					{
						line1 = reportplant1.readLine();
						line2 = reportplant1.readLine();
						System.out.printf("%s%10s\n", line2 , line1);
					}
				}

			}
			if(x == 3)
			{
				System.out.printf("%s%10s\n", name , number);
				while((line1 = reportplant1.readLine()) != null )
				{
					check = line1.compareTo("medical");
                    if( check == 0)
					{
						line1 = reportplant1.readLine();
						line2 = reportplant1.readLine();
						System.out.printf("%s%10s\n", line2 , line1);
					}
				}
			}
			if(x==4)
			{
				System.out.printf("%s%10s\n", name , number);
				while((line1 = reportplant1.readLine()) != null )
				{
					check = line1.compareTo("feedStuf");
                    if( check == 0)
					{
						line1 = reportplant1.readLine();
						line2 = reportplant1.readLine();
						System.out.printf("%s%10s\n", line2 , line1);
					}
				}
			}
			reportplant1.close();
			int c = 0 ;
            while(c == 0){
			System.out.printf("1.Back \n");
			System.out.printf("Enter the desired number : \n");
		    int a = console.nextInt();
			if(a != 1)
			{System.out.printf("incorecct\n");}
			else{c = 1;}
			}
		} catch(IOException e) {
            e.printStackTrace();
		}

	}

	public static void numterritorialres(int x)
	{
		if(x == 1)
		{
			try { 
				FileReader numland = new FileReader("land.txt");

                BufferedReader reportland = new BufferedReader(numland);

				String line = null , dhecktar = null , line3 = null, type = "type" , hight = "hight", number = "number";
				int check ;

				while((line = reportland.readLine()) != null)
				{
					check = line.compareTo("desert");
					if(check == 0)
					{
						dhecktar = reportland.readLine();

					}
					
					line3 = reportland.readLine();
					
				}

				
				
			} catch(IOException e) {
            e.printStackTrace();
		    }

		}
		if(x == 2)
		{

		}

	}

	
    
}
