package com.lulu.springemp;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.lulu.springemp.entity.Helpdisk;
import com.lulu.springemp.entity.Order;
import com.lulu.springemp.repo.OrderRepo;



	@CrossOrigin
	@RestController
	public class ControllerOrder {

		@Autowired
		OrderRepo orderrepo;
	

		@PostMapping("/createorder")
		public Order createorder(@RequestBody Order order) {

			return orderrepo.save(order);

		}

		@GetMapping("/getorder")

		public List<Order> getAllOrder() {

			return orderrepo.findAll(); // select * from product;

		}
		@DeleteMapping("/deleteusers/{id1}/{id2}")
        public String  deleteUser(@PathVariable("id1") int id1,@PathVariable("id2") int id2)
        {
           
            orderrepo.deleteById(id1);
            System.out.println("record got deleted");
            orderrepo.deleteById(id2);
            System.out.println("record got deleted");
            return  "Is deleted";
        }
		
		@PutMapping("/employees/{id}")   //
	    public ResponseEntity<Order> updateEmployee(@PathVariable Integer id, @RequestBody Order employeeDetails){
	       Order order = orderrepo.findById(id)
	                .orElseThrow(() -> new RuntimeException("User not exist with id :" + id));
	        
	        order.setName(employeeDetails.getName());
	        order.setBillamount(employeeDetails.getBillamount());
	        order.setAddress(employeeDetails.getAddress());
	        
	        Order updatedEmployee = orderrepo.save(order);
	        return ResponseEntity.ok(updatedEmployee);
	    }
	
	


	}



