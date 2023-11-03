package com.myprojects.springboottodoapplication.repositories;

import org.springframework.data.repository.CrudRepository;

import com.myprojects.springboottodoapplication.models.TodoItem;

public interface TodoItemRepository extends CrudRepository<TodoItem, Long> {
}
