package com.example.management.data.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.management.data.domain.Employee;
import com.example.management.data.mapper.EmployeeMapper;
import org.springframework.stereotype.Service;

/**
 * @author yabo.dg
 * @description 针对表【employee】的数据库操作Service实现
 * @createDate 2023-09-11 18:11:54
 */
@Service
public class EmployeeService extends ServiceImpl<EmployeeMapper, Employee> {

}




