package com.sample.todo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.sample.todo.service.TodoService;
import com.sample.todo.vo.Todo;

public class App {

	public static void main(String[] args) {
		
		String resource = "classpath:/META-INF/spring/app-context.xml";
		ApplicationContext context = new GenericXmlApplicationContext(resource);
		
		TodoService service = context.getBean(TodoService.class);
		List<Todo> todos = service.getAllTodo();
	
		System.out.println(todos.size());
		/*
		Todo todo = new Todo();
		todo.setTitle("제목임당");
		todo.setDates("2017-10-16");
		todo.setContents("내용임당");
		
		service.addTodo(todo);
		*/
		
		service.deleteTodo(62);
	}
}
