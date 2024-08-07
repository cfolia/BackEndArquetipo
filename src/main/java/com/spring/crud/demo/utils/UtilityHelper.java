package com.spring.crud.demo.utils;

import com.spring.crud.demo.model.SportsIcon;
import com.spring.crud.demo.model.Student;
import com.spring.crud.demo.model.emp.Address;
import com.spring.crud.demo.model.emp.Employee;
import com.spring.crud.demo.model.emp.PhoneNumber;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class UtilityHelper {

    private UtilityHelper() {
    }

    public static Supplier<List<Student>> studentSupplier = () ->
            Arrays.asList(
            		Student.builder().rollNo(1).firstName("Santhosh").lastName("Vernekar").marks(300.0f).build(),
            		Student.builder().rollNo(2).firstName("Ram").lastName("A").marks(950.0f).build(),
            		Student.builder().rollNo(3).firstName("Raj").lastName("Kumar").marks(500.0f).build(),
            		Student.builder().rollNo(4).firstName("Vishnu").lastName("Vardhan").marks(600.0f).build(),
            		Student.builder().rollNo(5).firstName("Rashmika").lastName("S").marks(500.0f).build(),
            		Student.builder().rollNo(6).firstName("Aditi").lastName("P").marks(600.0f).build(),
            		Student.builder().rollNo(7).firstName("Salman").lastName("Khan").marks(700.0f).build(),
            		Student.builder().rollNo(8).firstName("Shahrukh").lastName("Khan").marks(800.0f).build(),
            		Student.builder().rollNo(9).firstName("Yash").lastName("Kumar").marks(900.0f).build(),
            		Student.builder().rollNo(10).firstName("Rakshit").lastName("Shetty").marks(800.0f).build(),
            		Student.builder().rollNo(11).firstName("Sudeep").lastName("Kumar").marks(900.0f).build(),
            		Student.builder().rollNo(12).firstName("Rishab").lastName("Shetty").marks(800.0f).build(),
            		Student.builder().rollNo(13).firstName("Ajay").lastName("Devgn").marks(750.0f).build(),
            		Student.builder().rollNo(14).firstName("Amitabh").lastName("Bachchan").marks(850.0f).build(),
            		Student.builder().rollNo(15).firstName("Abhishek").lastName("Bachchan").marks(780.0f).build(),
            		Student.builder().rollNo(16).firstName("Hrithik").lastName("Roshan").marks(820.0f).build(),
            		Student.builder().rollNo(17).firstName("Saif").lastName("Ali Khan").marks(830.0f).build(),
            		Student.builder().rollNo(18).firstName("Ranbir").lastName("Kapoor").marks(770.0f).build(),
            		Student.builder().rollNo(19).firstName("Ranveer").lastName("Singh").marks(760.0f).build(),
            		Student.builder().rollNo(20).firstName("Akshay").lastName("Kumar").marks(880.0f).build(),
            		Student.builder().rollNo(21).firstName("Kartik").lastName("Aaryan").marks(790.0f).build(),
            		Student.builder().rollNo(22).firstName("Tiger").lastName("Shroff").marks(740.0f).build(),
            		Student.builder().rollNo(23).firstName("Varun").lastName("Dhawan").marks(850.0f).build(),
            		Student.builder().rollNo(24).firstName("Arjun").lastName("Kapoor").marks(820.0f).build(),
            		Student.builder().rollNo(25).firstName("Sidharth").lastName("Malhotra").marks(810.0f).build(),
            		Student.builder().rollNo(26).firstName("Ayushmann").lastName("Khurrana").marks(790.0f).build(),
            		Student.builder().rollNo(27).firstName("Vicky").lastName("Kaushal").marks(800.0f).build(),
            		Student.builder().rollNo(28).firstName("Ishaan").lastName("Khatter").marks(780.0f).build(),
            		Student.builder().rollNo(29).firstName("Aditya").lastName("Roy Kapur").marks(770.0f).build(),
            		Student.builder().rollNo(30).firstName("Farhan").lastName("Akhtar").marks(750.0f).build(),
            		Student.builder().rollNo(31).firstName("John").lastName("Abraham").marks(800.0f).build(),
            		Student.builder().rollNo(32).firstName("Sunny").lastName("Deol").marks(700.0f).build(),
            		Student.builder().rollNo(33).firstName("Bobby").lastName("Deol").marks(710.0f).build(),
            		Student.builder().rollNo(34).firstName("Anil").lastName("Kapoor").marks(830.0f).build(),
            		Student.builder().rollNo(35).firstName("Govinda").lastName("Ahuja").marks(760.0f).build(),
            		Student.builder().rollNo(36).firstName("Nawazuddin").lastName("Siddiqui").marks(840.0f).build(),
            		Student.builder().rollNo(37).firstName("Rajkummar").lastName("Rao").marks(820.0f).build(),
            		Student.builder().rollNo(38).firstName("Pankaj").lastName("Tripathi").marks(850.0f).build(),
            		Student.builder().rollNo(39).firstName("Irrfan").lastName("Khan").marks(900.0f).build(),
            		Student.builder().rollNo(40).firstName("Manoj").lastName("Bajpayee").marks(880.0f).build(),
            		Student.builder().rollNo(41).firstName("Naseeruddin").lastName("Shah").marks(860.0f).build(),
            		Student.builder().rollNo(42).firstName("Om").lastName("Puri").marks(820.0f).build(),
            		Student.builder().rollNo(43).firstName("Paresh").lastName("Rawal").marks(840.0f).build(),
            		Student.builder().rollNo(44).firstName("Boman").lastName("Irani").marks(810.0f).build(),
            		Student.builder().rollNo(45).firstName("Anupam").lastName("Kher").marks(830.0f).build(),
            		Student.builder().rollNo(46).firstName("Kay").lastName("Kay Menon").marks(780.0f).build(),
            		Student.builder().rollNo(47).firstName("Jimmy").lastName("Sheirgill").marks(790.0f).build(),
            		Student.builder().rollNo(48).firstName("Randeep").lastName("Hooda").marks(770.0f).build(),
            		Student.builder().rollNo(49).firstName("Nawazuddin").lastName("Siddiqui").marks(810.0f).build(),
            		Student.builder().rollNo(50).firstName("Pankaj").lastName("Tripathi").marks(850.0f).build(),
            		Student.builder().rollNo(51).firstName("Manoj").lastName("Bajpayee").marks(880.0f).build(),
            		Student.builder().rollNo(52).firstName("Kartik").lastName("Aaryan").marks(790.0f).build()

            );



    public static Supplier<List<SportsIcon>> sportIconsSupplier = () ->
            Arrays.asList(
                    SportsIcon.builder().name("Virat").specialName("King Kohli").sports("Cricketer").age(33).olampian(false).build(),
					SportsIcon.builder().name("Neeraj").specialName("Chopra").sports("Javelin").age(25).olampian(true).build(),
					SportsIcon.builder().name("Marry").specialName("Kom").sports("Boxing").age(35).olampian(false).build(),
                    SportsIcon.builder().name("Lionel").specialName("Messi").sports("Footballer").age(35).olampian(false).build(),
                    SportsIcon.builder().name("Roger").specialName("Federer").sports("TennisPlayer").age(36).olampian(true).build(),
                    SportsIcon.builder().name("Tiger").specialName("Tiger Woods").sports("Golf").age(40).olampian(true).build(),
                    SportsIcon.builder().name("PV Sindhu").specialName("Queen").sports("Badminton").age(27).olampian(true).build()
            );




	public static Supplier<List<Employee>> employeeSupplier = () -> {

		Employee santhosh = Employee.builder()
				.id(1)
				.firstName("Santhosh")
				.lastName("Vernekar")
				.age(30)
				.noOfChildren(0)
				.spouse(true)
				.address(Address.builder()
						.id(1)
						.streetAddress("WhiteField")
						.city("Bengaluru")
						.state("Karnataka")
						.country("India")
						.postalCode("560010")
						.build()
				)
				.hobbies(Arrays.asList("Travelling", "Sports"))
				.build();

		PhoneNumber santhoshNumber = PhoneNumber.builder()
				.id(1)
				.type("Mobile")
				.number("1234567890")
				.employee(santhosh)
				.build();

		santhosh.setPhoneNumbers(Arrays.asList(santhoshNumber));






		Employee virat = Employee.builder()
				.id(1)
				.firstName("Virat")
				.lastName("Kohli")
				.age(28)
				.noOfChildren(0)
				.spouse(true)
				.address(Address.builder()
						.id(1)
						.streetAddress("Delhi Road")
						.city("Bangalore")
						.state("Karnataka")
						.country("India")
						.postalCode("560010")
						.build()
				)
				.hobbies(Arrays.asList("Dancing", "Cricket"))
				.build();

		PhoneNumber aryansNumber = PhoneNumber.builder()
				.id(1)
				.type("Mobile")
				.number("1234555555")
				.employee(virat)
				.build();

		virat.setPhoneNumbers(Arrays.asList(aryansNumber));


		return Arrays.asList(santhosh, virat);
	};
}
