package org.example.app.service;

import org.example.app.dao.CustDao;
import org.example.app.dao.CustMysqlDao;
import org.example.app.data.CustDto;
import org.example.app.frame.Dao;
import org.example.app.frame.SendMail;
import org.example.app.frame.Service;

import java.util.List;

public class CustService implements Service<String, CustDto>, SendMail {
    Dao<String, CustDto> dao;

    public CustService() {
//        dao = new CustDao(); // 이렇게 되면 CustDao 클래스가 없어졌을 때 동작하지 않게 된다 -> CustDao 클래스에 의존성이 높다
        dao = new CustMysqlDao(); // MySQL로 교체
    }

    @Override
    public int add(CustDto custDto) {
        // Insert ...
        dao.insert(custDto);
        // LDAP Insert ...
        // SMS ...
        System.out.println("Send SMS ...");
        // Mail ...
//        System.out.println("Send Mail ...");
        this.sendEmail(custDto.getId());
        return 0;
    }

    @Override
    public int del(String s) {
        dao.delete(s);
        return 0;
    }

    @Override
    public int modify(CustDto custDto) {
        dao.update(custDto);
        return 0;
    }

    @Override
    public CustDto get(String s) {
        return dao.select(s);
    }

    @Override
    public List<CustDto> get() {
        return dao.select();
    }

    @Override
    public void sendEmail(String id) {
        System.out.println("Send Mail ... " + id);
    }
}
