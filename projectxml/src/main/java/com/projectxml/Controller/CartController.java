package com.projectxml.Controller;

import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
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
	@Autowired
	CartItem cartitem;
	@RequestMapping("/addtocart")
	public String  addItems(@RequestParam("id")String id)
	{
		System.out.println("cart controller = "+ id);
		String loggedInUserName=SecurityContextHolder.getContext().getAuthentication().getName();
		System.out.println("after loggedinusername = "+loggedInUserName);
		Customer customer=cs.getCustomerByName(loggedInUserName);	
		System.out.println("after get customer by name = "+customer);
		Cart cart=customer.getCart();
		cart.setCustomer(customer);
		CartItem ci=new CartItem();
		Item item=i.getItemById(Integer.parseInt(id));
		ci.setCart(cart);
		ci.setItem(item);
		ci.setImageid(item.getItemId());
		ci.setQuantity(1);
		ci.setTotalPrice(item.getPrice());
		cis.addItems(ci);
		System.out.println("Item added cart controller");
		return "redirect:/CustomerAccess";
	}
	@RequestMapping("/myStore")
	public ModelAndView disCart() throws JsonGenerationException, JsonMappingException, IOException
	{
		String activeUserName = SecurityContextHolder.getContext().getAuthentication().getName();
		Customer activeUser = cs.getCustomerByName(activeUserName);
		Cart cart=activeUser.getCart();
		int cartId = cart.getCartId();
		List<CartItem> list = cis.ViewCartProducts(cartId);
		ObjectMapper mapper = new ObjectMapper();
		String listJSON = mapper.writeValueAsString(list);
		return new ModelAndView("ViewCart","mycartlist",listJSON);
	}
	@RequestMapping("/deleteCartItem")
	public String deleteItem(@RequestParam("id") int id)
	{
		System.out.println("deleted");
		cis.deleteItem(cartitem);
		
		System.out.println("enter cartservice");
		return "redirect:/Cart";
	}


}
