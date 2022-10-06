package com.valtech.training.corejava;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class EmployeeesDAOTest {
//	@Test 
//	public void testUpdateEmployee() throws Exception {
//		EmployeeDAO dao=new EmployeeDAO();
//		dao.updateEmployee(new Employee(3,"New Three",25,1,121212));
//		Employee e=dao.getEmployee(3);
//		assertEquals(e.getId(),3);
//		assertEquals(e.getName(),"New Three");
//		assertEquals(25,e.getAge());
//		assertEquals(1,e.getGender());
//		assertEquals(121212,e.getSalary(),0.0000001);
//		
//		
//	}
	@Test
	public void testGetEmployeesByage() throws Exception{
		EmployeeeDAO dao=new EmployeeeDAO();
		List<Employeees> e=dao.getEmployeeByAge(23);
		assertEquals(1,e.size());
		
	}
	@Test
	public void testGetEmployeesByMale() throws Exception{
		EmployeeeDAO dao=new EmployeeeDAO();
		List<Employeees> e=dao.getEmployeeByMale(1);
		assertEquals(2,e.size());
		
	}
	
	@Test
	public void testGetEmployeesByFemale() throws Exception{
		EmployeeeDAO dao=new EmployeeeDAO();
		List<Employeees> e=dao.getEmployeeByMale(2);
		assertEquals(1,e.size());
		
	}
	@Test
	public void testGetEmployeesByOthers() throws Exception{
		EmployeeeDAO dao=new EmployeeeDAO();
		List<Employeees> e=dao.getEmployeeByMale(0);
		assertEquals(0,e.size());
		
	}
	@Test
	public void testGetEmployeesByAgeBetween() throws Exception{
		EmployeeeDAO dao=new EmployeeeDAO();
		List<Employeees> e=dao.getEmployeeByAgeBetween(21,23);
		assertEquals(3,e.size());
		
	}
	@Test
	public void testGetEmployeesBySalaryGreaterThan() throws Exception{
		EmployeeeDAO dao=new EmployeeeDAO();
		List<Employeees> e=dao.getEmployeeBySalaryGreaterThan(60000);
		assertEquals(1,e.size());
		
	}
	
	@Test
	public void testGetEmployeesBySalaryLessThan() throws Exception{
		EmployeeeDAO dao=new EmployeeeDAO();
		List<Employeees> e=dao.getEmployeeBySalaryLessThan(60000);
		assertEquals(2,e.size());
		
	}
	
	
//	@Test
//	public void testGetEmployees() throws Exception{
//		EmployeeDAO dao=new EmployeeDAO();
//		assertEquals(dao.count(),dao.getEmployees().size());
//		
//	}
	
	
//	@Test
//	public void testGetEmployee() throws Exception{
//		EmployeeDAO dao=new EmployeeDAO();
//		int count=dao.count();
//		Employee e=dao.getEmployee(1);
//		assertEquals(1,e.getId());
//		assertEquals(23,e.getAge());
//	}
//	
//
//	@Test
//	public void testSaveEmployee() throws Exception{
//		EmployeeDAO dao=new EmployeeDAO();
//		int count=dao.count();
//		dao.saveEmployee(new Employee(4,"Four",37,0,20000));
//		assertEquals(count+1,dao.count());
//		dao.deleteEmployee(4);
//		assertEquals(count,dao.count());
//		//assertEquals(2,dao.count());
//		//System.out.println(dao.count());
//		//Connection conn=dao.getConnection();
//		//conn.close();
//	}

}


