package com.sample.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.todo.mappers.TodoMapper;
import com.sample.todo.vo.Todo;

@Service
public class TodoServiceImpl implements TodoService {
	
	@Autowired
	private TodoMapper todoMapper;
	
	public List<Todo> getAllTodo() {
		List<Todo> todos = todoMapper.getAllTodo();
		
		return todos;
	}
	
	public void addTodo(Todo todo) {
		todoMapper.addTodo(todo);
	}
	
	public void deleteTodo(int no) {
		todoMapper.deleteTodo(no);
	}

}
