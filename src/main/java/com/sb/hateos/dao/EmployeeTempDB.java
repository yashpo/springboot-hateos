package com.sb.hateos.dao;

import java.util.ArrayList;
import java.util.List;

import com.sb.hateos.model.EmployeeVO;

public class EmployeeTempDB {
	 
    public static List<EmployeeVO> getAllEmployeeList()
    {
        List<EmployeeVO> list = new ArrayList<>();
 
        EmployeeVO empOne = new EmployeeVO(1, "Iron", "Man", "ironman@avengers.com");
        EmployeeVO empTwo = new EmployeeVO(2, "Thor", "Asgaurd", "thor@avengers.com");
        EmployeeVO empThree = new EmployeeVO(3, "Marvel", "Captain", "captainmarvel@avengers.com");
 
        list.add(empOne);
        list.add(empTwo);
        list.add(empThree);
 
        return list;
    }
}
