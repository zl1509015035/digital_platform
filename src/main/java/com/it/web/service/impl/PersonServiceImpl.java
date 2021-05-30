package com.it.web.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.it.web.common.ApiRestResponse;
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
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonMapper personMapper;

    @Value("${file.upload.dir}")
    private String path;

    @Override
    public ApiRestResponse insertPersonInfo(MultipartFile file, Person person) {

        String fileName = FileUtils.getFileName(file.getOriginalFilename());

        boolean upload = FileUtils.upload(file, path, fileName);

        if (true == upload) {
            person.setPersonPicture(path + fileName);
        }

        personMapper.insertSelective(person);
        return ApiRestResponse.success();
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


}
