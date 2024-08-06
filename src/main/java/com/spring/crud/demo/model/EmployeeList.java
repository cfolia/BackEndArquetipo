package com.spring.crud.demo.model;

import java.util.ArrayList;
import java.util.List;

import com.spring.crud.demo.model.emp.Employee;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class EmployeeList {
    public List<Employee> items= new ArrayList<>();
}
