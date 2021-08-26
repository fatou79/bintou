package com.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
	private static List<Todo> todos = new ArrayList();
	static {
	
	todos.add(new Todo("fatou's hair","cosmetic"));
	todos.add(new Todo("so elixir","perfume" ));
	todos.add(new Todo("centrum","vitamin"));
}
	public List<Todo> retrieveTodos(){
		return todos;
	}
}