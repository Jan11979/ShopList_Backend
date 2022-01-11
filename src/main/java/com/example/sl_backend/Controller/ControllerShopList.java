package com.example.sl_backend.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("sl")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ControllerShopList {

    @GetMapping(path = "/miau")
    public String getMiau() {
        System.out.println("getMiau Called");
        return "Miau2000";
    }
    @PutMapping(path = "/todo/{id}/update")
    public void putUpdatedTodo(@PathVariable int  id, @RequestBody ItemData todo) {

        System.out.println("putUpdatedTodo Called" + todo.description);
        //todoService.updateToDoItem(id, todo );
    }
}
/*
     *  export const putUpdatedTodo = todo =>
     *             axios.put(`/api/todo/${todo.id}/update`, todo)

@PutMapping(path = "/todo/{id}/update")
public void putUpdatedTodo(@PathVariable int  id, @RequestBody ToDoItem todo) {
    todoService.updateToDoItem(id, todo );
}
 */

