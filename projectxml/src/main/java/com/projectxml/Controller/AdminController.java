package com.projectxml.Controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

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
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.projectxml.model.Customer;
import com.projectxml.model.Item;
import com.projectxml.service.CustomerService;
import com.projectxml.service.ItemService;


@Controller
public class AdminController {
	@Autowired
	CustomerService c;
	@Autowired
	ItemService i;

	@RequestMapping("/addItem")
	public ModelAndView addItem() {
		System.out.println("enter add products");
		Item item = new Item();
		System.out.println("i am in add item page");
		return new ModelAndView("addItem", "item", item);
	}

	@RequestMapping("/addProduct")
	public String item(@ModelAttribute("item") Item item, @RequestParam("choosefile") MultipartFile file) 
	{
		System.out.println("add product page");
		i.addItem(item);
		MultipartFile itemimage = file;
		System.out.println(itemimage);
		Path path = Paths.get("H://niitsoftwares//saisirproject//projectxml//src//main//webapp//WEB-INF//resources//images//"+ item.getItemId() + ".jpg");
		if (itemimage != null && !itemimage.isEmpty()) {
			try {
				itemimage.transferTo(new File(path.toString()));
				System.out.println("done toString");
			} catch (IllegalStateException | IOException e) {
				e.printStackTrace();
			}
			System.out.println("image null");
		}
		return "redirect:/viewitem";

	}

	@RequestMapping("/viewitem")
	public ModelAndView viewitem() throws JsonGenerationException, JsonMappingException, IOException {
		List<Item> list = i.viewItem();
		System.out.println("list:" + list);
		ObjectMapper mapper = new ObjectMapper();
		String listJson = mapper.writeValueAsString(list);
		System.out.println("JSON data:" + listJson);
		return new ModelAndView("viewitem", "listofitems", listJson);
	}

	@RequestMapping("/ViewCustomers")
	public ModelAndView viewCustomerd() throws JsonGenerationException, JsonMappingException, IOException {
		System.out.println("view customers");
		List<Customer> list = c.viewCustomer();
		ObjectMapper mapper = new ObjectMapper();
		String listJson = mapper.writeValueAsString(list);
		System.out.println(listJson);
		System.out.println("List is:" + list);
		return new ModelAndView("ViewCustomers", "listofCustomers", listJson);
	}

	@RequestMapping("/deleteItem")
	public String deleteItem(@RequestParam("id") int id) {
		i.deleteItem(id);
		return "redirect:/viewitem";
	}

	@RequestMapping("/editItem")
	public ModelAndView editItem(@RequestParam("id") int id) {
		System.out.println("id:" + id);
		Item item = i.getItemById(id);
		System.out.println("Item Name:" + item.getItemName());
		return new ModelAndView("uniqueItem", "item", item);
	}

	@RequestMapping("/updatemyItem")
	public String updateprod(@RequestParam("itemId") String itemId, @RequestParam("itemName") String itemName,
			@RequestParam("description") String description, @RequestParam("category") String category,
			@RequestParam("price") String price) {
		int itemId1 = Integer.parseInt(itemId);
		Item item = i.getItemById(itemId1);
		item.setItemName(itemName);
		item.setDescription(description);
		item.setCategory(category);
		item.setPrice(Float.parseFloat(price));
		i.updateItem(item);
		return "redirect:/viewitem";

	}

}
