package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import controller.Dao.EmployeeDao;
import controller.model.Product;

@Controller
public class Employee {
	@Autowired
	private EmployeeDao employeeDao;
	
	@RequestMapping("/")
  public String employee(Model m) {
	List<Product>products=employeeDao.getProduct();
	m.addAttribute("products",products);
	  return "index";
  }
	@RequestMapping("/add")
	public String addEmployee(Model m) {
  m.addAttribute("title","AddEmployee")	;	
		return "add_employee_form";
	}  
	@RequestMapping(value = "/handle-Product",method =RequestMethod.POST)
	public RedirectView handleProduct(@ModelAttribute Product product ,HttpServletRequest request) {
		System.out.println(product);
		this.employeeDao.createEmployee(product);
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
	return redirectView;
	}
	
}
