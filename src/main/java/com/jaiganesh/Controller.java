package com.jaiganesh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jaiganesh.entities.Employee;
import com.jaiganesh.entities.Greeting;
import com.jaiganesh.entities.Hero;
import com.jaiganesh.entities.Student;
import com.jaiganesh.entities.UserModel;
import com.jaiganesh.service.EmployeeService;
import com.jaiganesh.service.HeroService;
import com.jaiganesh.service.StudentService;
import com.jaiganesh.service.UserService;

@RestController
public class Controller {
	@Autowired
	UserService uservice;

	@Autowired
	StudentService sservice;

	@Autowired
	EmployeeService service;
	
	@Autowired
	HeroService heroSerive;

	/*
	 * @Autowired Greeting greet;
	 */

	@RequestMapping(value = "dev", method = RequestMethod.GET)
	public String getStringValue(@RequestParam("name") String name) {
		return name + " developer";
	}

	@RequestMapping(value = "emp", method = RequestMethod.GET)
	public String getEmployeeValue(@RequestParam("name") String name) {
		return name + " is a employee";
	}

	@RequestMapping(value = "/api/login", method = RequestMethod.POST)
	public boolean getServiceMethod(@RequestBody UserModel user) {
		//System.out.println(user.getUsername()+"--"+ user.getPassword());
		return uservice.login(user.getUsername(), user.getPassword());
	}

	/*
	 * @RequestMapping(value = "student", method = RequestMethod.POST) public
	 * void saveStudentMethod(@RequestBody StudentModel model) {
	 * sservice.insertRecord(model.getId(),model.getStudentName(),model.
	 * getStudentSubject()); }
	 */

	@RequestMapping(value = "student", method = RequestMethod.POST)
	public void saveStudentMethod(@RequestBody Student model) {
		sservice.insertRecord(model.getId(), model.getStudentName(), model.getStudentSubject());
	}

	public String template = "Hello, %s!";
	// private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		// System.out.println(">>>>>>>>"+counter.incrementAndGet());
		return new Greeting(101, String.format(template, name));
	}

	@RequestMapping("/employee")
	public void getEmployeeDetails() {
		/*
		 * List<Employee> emp= service.employeeRecord();
		 * 
		 * for(Employee ee:emp){
		 * System.out.println(ee.getEid()+"--"+ee.getEname()+"--"+ee.getErole())
		 * ; }
		 */

		List<Employee> e = service.getRecords();

		for (Employee ee : e) {
			System.out.println(ee.getEid() + "--" + ee.getEname() + "--" + ee.getErole());
		}
	}
		@RequestMapping("/heros")
		public List<Hero> getHeroDetails() {
			/*
			 * List<Employee> emp= service.employeeRecord();
			 * 
			 * for(Employee ee:emp){
			 * System.out.println(ee.getEid()+"--"+ee.getEname()+"--"+ee.getErole())
			 * ; }
			 */

			List<Hero> e = heroSerive.getRecords();

			for (Hero ee : e) {
				System.out.println(ee.getEname() + "--" + ee.getEid());
			}
			return e;
	}
}
