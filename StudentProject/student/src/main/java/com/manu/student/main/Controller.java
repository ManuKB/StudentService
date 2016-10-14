/**
 * 
 */
package com.manu.student.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mohankumara.kb
 * 
 *
 */
@RestController
@RequestMapping("/main")
public class Controller {
	
	@RequestMapping(value="", method= RequestMethod.GET, produces="application/json")
	public List<String> test() {
		List<String> m = new ArrayList<String>();
		m.add("Welcome");
		return m;
	}
	
	@RequestMapping(value="/dummy", method= RequestMethod.GET, produces="application/json")
	public List<String> test1() {
		List<String> m = new ArrayList<String>();
		m.add("Welcome to ACcenture");
		m.add("by Mohan");
		return m;
	}

}
