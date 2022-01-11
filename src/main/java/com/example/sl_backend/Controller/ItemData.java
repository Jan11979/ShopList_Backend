package com.example.sl_backend.Controller;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemData {
    String id;
    String description;
    String status;

    /*
    public ItemData(String description, String status) {
        this.id = null;
        this.description = description;
        this.status = status;
    }*/
}
