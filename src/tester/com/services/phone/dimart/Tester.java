package tester.com.services.phone.dimart;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import main.services.phone.dimart.Login;
import main.services.phone.dimart.Refferal;
import main.services.phone.dimart.Registration;
import main.services.phone.dimart.User;

class Tester {
	Login obj1;
	Registration obj2;
	User obj3;
	Refferal obj4;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before all");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After all");
	}

	@BeforeEach
	void setUp() throws Exception {
		obj1 = new Login();
		obj2 = new Registration();
		obj3 = new User();
		obj4 = new Refferal();
		System.out.println("Before each");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After each");
	}

	@Test
	@DisplayName("Login")
	public void checkLogin() {
		System.out.println("Login successful");
	}
	
	@Test
	@DisplayName("Registration")
	public void checkRegistration() {
		System.out.println("Registration successful");
	}
	
	@ParameterizedTest
	@CsvFileSource(resources = "/data.csv")
	@DisplayName("Csv File Source")
	public void testCheckParameterizedCsvFile(User data, boolean value) {
		System.out.println("Testing");
		assertEquals(value, obj3.printRefferal(data));
	}


}
