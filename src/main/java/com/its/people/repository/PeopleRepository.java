package com.its.people.repository;

import com.its.people.DTO.PeopleDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PeopleRepository {
    @Autowired
    private SqlSessionTemplate sql;

    public void save(String name, int age) {
        //넘겨받은 name, age를  PeopleDTO 객체에 담자
        System.out.println("PeopleRepository.save");
        System.out.println("name = " + name + ", age = " + age);
        PeopleDTO peopleDTO = new PeopleDTO();
        peopleDTO.setName(name);
        peopleDTO.setAge(age);
        //new PeopleDTO() 우변을 작성 후 alt+enter
        sql.insert("People.save", peopleDTO);
    }
    public int save1 (PeopleDTO peopleDTO){
        return sql.insert("People.save", peopleDTO);
    }
}
