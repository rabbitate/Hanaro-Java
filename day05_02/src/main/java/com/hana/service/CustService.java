package com.hana.service;

import com.hana.data.CustDto;
import com.hana.exception.DuplicatedIdException;
import com.hana.exception.IdNotFoundException;
import com.hana.exception.NotFoundException;
import com.hana.frame.Dao;
import com.hana.frame.Service;
import com.hana.repository.CustDao;

import java.util.List;

public class CustService implements Service<String, CustDto> {
    Dao<String, CustDto> dao;

    public CustService() {
//        dao = new CustDao(); // 이렇게 되면 CustDao 클래스가 없어졌을 때 동작하지 않게 된다 -> CustDao 클래스에 의존성이 높다
        dao = new CustDao(); // MySQL로 교체
    }

    @Override
    public int add(CustDto custDto) throws DuplicatedIdException {
        System.out.println("Start Transaction ...");
        // Insert ...
        try {
            dao.insert(custDto); // throws Exception을 해줬기 때문에 Exception이 발생할 수 있음을 개발자에게 알려준다
            dao.insert(custDto);
            System.out.println("Commit ..."); // 계속 정상이면 Commit
        } catch (DuplicatedIdException e) {
            System.out.println("Rollback ...");
            throw e;
        } finally {
            System.out.println("End Transaction ...");
        }

        // LDAP Insert ...
        // SMS ...
        System.out.println("Send SMS ...");
        // Mail ...
        System.out.println("Send Mail ...");
        return 0;
    }

    @Override
    public int del(String s) throws IdNotFoundException {
        try {
            dao.delete(s);
        } catch (IdNotFoundException e) {
            throw e;
        }
        return 0;
    }

    @Override
    public int modify(CustDto custDto) throws IdNotFoundException {
        try {
            dao.update(custDto);
        } catch (IdNotFoundException e) {
            throw e;
        }
        return 0;
    }

    @Override
    public CustDto get(String s) throws NotFoundException {
        try {
            CustDto dto = dao.select(s);
            return dto;
        } catch (NotFoundException e) {
            throw e;
        }
    }

    @Override
    public List<CustDto> get() throws Exception {
        try {
            return dao.select();
        } catch (Exception e) {
            throw e;
        }
    }

}