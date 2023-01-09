package com.example.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author TienNLN on 09/01/2023
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = -8092393000640290488L;

    private int id;
    private String name;
    private long price;
}
