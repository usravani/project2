package com.projectxml.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.projectxml.model.Cart;
import com.projectxml.model.CartItem;
import com.projectxml.model.Customer;
import com.projectxml.model.Item;
import com.projectxml.service.CartItemService;
import com.projectxml.service.CustomerService;
import com.projectxml.service.ItemService;

@Controller
public class CartController {
	@Autowired
	ItemService i;
	@Autowired
	CartItemService cis;
	@Autowired
	CustomerService cs;
	@RequestMapping("/addtocart")
	public String  addItems(@RequestParam("id")String id)
	{
		System.out.println("cart controller = "+ id);
		String loggedInUserName=SecurityContextHolder.getContext().getAuthentication().getName();
		System.out.println("after loggedinusername = "+loggedInUserName);
		Customer customer=cs.getCustomerByName(loggedInUserName);	
		System.out.println("after get customer by name = "+customer);
		Cart cart=customer.getCart();
		CartItem ci=new CartItem();
		Item item=i.getItemById(Integer.parseInt(id));
		ci.setCart(cart);
		ci.setItem(item);
		ci.setQuantity(1);
		ci.setTotalPrice(item.getPrice());
		cis.addItems(ci);
		System.out.println("Item added cart controller");
		return "redirect/customerHome";
	}

}
