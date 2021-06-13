package com.it.web.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.it.web.common.ApiRestResponse;
import com.it.web.exception.DigitalPlatformException;
import com.it.web.exception.DigitalPlatformExceptionEnum;
import com.it.web.mapper.PersonMapper;
import com.it.web.model.entity.Person;
import com.it.web.model.req.PersonReq;
import com.it.web.service.PersonService;
import com.it.web.util.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonMapper personMapper;

    @Value("${file.upload.dir}")
    private String path;

    @Override
    public ApiRestResponse insertPersonInfo(Person person) {
        int i = personMapper.updateByPrimaryKeySelective(person);
        if(i<0){
            throw new DigitalPlatformException(DigitalPlatformExceptionEnum.UPDATE_FAILED);
        }
        return ApiRestResponse.success();
    }

    @Override
    public Map<String, Object> insertPersonPicture(MultipartFile file) {
        String fileName = FileUtils.getFileName(file.getOriginalFilename());

        boolean upload = FileUtils.upload(file, path, fileName);
        Person person = new Person();

        if (true == upload) {
            person.setPersonPicture("http://8.140.159.85" + path + "/" + fileName);
        }

        int i = personMapper.insertSelective(person);

        Map<String, Object> map = new HashMap<>();
        map.put("personId",person.getPersonId());
        map.put("personPicture",person.getPersonPicture());
        return map;
    }

    @Override
    public PageInfo getPersons(PersonReq personReq) {
        PageHelper.startPage(personReq.getPageNum(), personReq.getPageSize());
        List<Person> persons = personMapper.getPersons(personReq);
        PageInfo pageInfo = new PageInfo(persons);
        return pageInfo;
    }

    @Override
    public void update(Person person) {
        personMapper.updateByPrimaryKeySelective(person);
    }

    @Override
    public void delete(Person person) {
        personMapper.deleteByPrimaryKey(person.getPersonId());
    }

    @Override
    public List<Person> getPersonByUserId(Integer userId){
        List<Person> personList = personMapper.getPersonByUserId(userId);
        return personList;
    }


}
