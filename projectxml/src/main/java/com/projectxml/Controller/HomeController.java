package com.projectxml.Controller;

import java.io.IOException;
import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.projectxml.dao.CategoryDao;
import com.projectxml.model.Customer;
import com.projectxml.model.Item;
import com.projectxml.service.CategoryService;
import com.projectxml.service.CustomerService;
import com.projectxml.service.ItemService;

@Controller
public class HomeController {
	@Autowired
	CategoryService c;
	@Autowired
	ItemService i;
	@Autowired
	CustomerService service;
	@RequestMapping("/")//this / and dispatcher servlet / should match
	public ModelAndView homep()
	{
		System.out.println("starting of the method of home load()");
		return new ModelAndView("home");//this home and views home jsp name shld match  
	}
	@RequestMapping("/home")//this / and dispatcher servlet / should match
	public ModelAndView home()
	{
		System.out.println("starting of the method of home load()");
		return new ModelAndView("home");//this home and views home jsp name shld match  
	}
	@RequestMapping("/About us")
	public ModelAndView aboutUs()
	{
		System.out.println("I am in aboutUs");
		return new ModelAndView("About us");
	}
	@RequestMapping("/Contact Us")
	public ModelAndView Contactus()
	{
		System.out.println("I am in aboutUs");
		return new ModelAndView("Contact Us");
	}
	@RequestMapping("/Mens")
	public ModelAndView mens(@RequestParam("category") String category) throws JsonGenerationException, JsonMappingException, IOException
	{

		System.out.println("category");
		List<Item> listCategory=c.getItemByCategory(category);
		ObjectMapper mapper= new ObjectMapper();
		String itemJSON=mapper.writeValueAsString(listCategory);
		System.out.println("JSON data:"+itemJSON);
		return new ModelAndView("Mens","me",itemJSON);
	}
	
	
	@RequestMapping("/signUp")//this signIn and href signIn jsp page name shld match
	public ModelAndView signUp()
	{
		Customer customer=new Customer();
		System.out.println("signUp()method called");
		
		return new ModelAndView("signUp","customerObj" , customer);//this signIn and views signIn jsp name shld match //customerobj is key to know the value to pass values to the controller
	}
	@RequestMapping("/login")
	public String loginMethod()
	{
		return "login";
	}

	@RequestMapping("/logout")
	public ModelAndView logout(HttpServletRequest request)
	{
		request.getSession().invalidate();
		System.out.println("logout page called");

		return  new ModelAndView("redirect:/home");
		
	}
	@RequestMapping("/CustomerAccess")
	public ModelAndView CustomerCheck(Principal principal) throws JsonGenerationException, JsonMappingException, IOException
	{
		List<Item> list = i.viewItem();
	System.out.println("list:" + list);
	ObjectMapper mapper = new ObjectMapper();
	String listJson = mapper.writeValueAsString(list);
	System.out.println("JSON data:" + listJson);
	return new ModelAndView("customerHome", "listofitems", listJson);
}
	@RequestMapping("/viewSelectedItem")
	public ModelAndView viewSelectedItem(@RequestParam("id") String id)
	{
		System.out.println("inside the view selected items");
		Item item=i.getItemById(Integer.parseInt(id));
		return new ModelAndView("viewSelectedItem","item",item);
		
		
	}
		
	@RequestMapping("/AdminAccess")
	public ModelAndView AdminCheck(Principal principal)
	{
		System.out.println("userName" +principal .getName());
		return new ModelAndView("adminHome");
	}
	
	
	@RequestMapping("/reg")//this signIn and href signIn jsp page name shld match
	public ModelAndView signup(@Valid@ModelAttribute ("customerObj")Customer customer,BindingResult bindingResult)//it will push object directly into  d/b//@valid is for validation
	{
		System.out.println("Iam in register page");
		if(bindingResult.hasErrors())
		{
			System.out.println("has errors");
			System.out.println("binding result");
			return new ModelAndView("signUp");
		}
		System.out.println("Username:"+customer.getUsername());
		System.out.println("password:"+customer.getPassword());
		service.addCustomer(customer);
		System.out.println("done saving");
		return new ModelAndView("login", "message","you are successfully registered");//this signUp and views signUp jsp name shld match //customerobj is key to know the value to pass values to the controller
	}

	
}
