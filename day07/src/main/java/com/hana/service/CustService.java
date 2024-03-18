package com.hana.service;

import com.hana.data.CustDto;
import com.hana.exception.DuplicatedIdException;
import com.hana.exception.NotFoundIdException;
import com.hana.frame.ConnectionPool;
import com.hana.frame.Service;
import com.hana.repository.CustRepository;
import lombok.RequiredArgsConstructor;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor // 자동으로 final 개체 넣어준다
public class CustService implements Service<String, CustDto> {
    final CustRepository repository;
    ConnectionPool connectionPool;

    public CustService(){
        repository = new CustRepository();
        try {
            connectionPool = ConnectionPool.create();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // Transaction은 Service에서 한다
    @Override
    public CustDto add(CustDto custDto) throws DuplicatedIdException, Exception {
        Connection connection = connectionPool.getConnection();
        try {
            connection.setAutoCommit(false);
            repository.insert(custDto, connection);
//            repository.insert(custDto, connection); // Exception 발생하면
            connection.commit(); // commit되지 않고
        } catch (Exception e) {
            connection.rollback(); // rollback 된다
            throw e;
        } finally {
            connectionPool.releaseConnection(connection);
        }
//        repository.insert(custDto); // DuplicatedIdException
        return custDto;
    }

    @Override
    public CustDto modify(CustDto custDto) throws NotFoundIdException, Exception {
        Connection connection = connectionPool.getConnection();
        try {
            connection.setAutoCommit(false);
            repository.update(custDto, connection);
            connection.commit();
        } catch (NotFoundIdException e) {
            connection.rollback();
        } finally {
            connectionPool.releaseConnection(connection);
        }
        return repository.update(custDto, connection);
    }

    @Override
    public Boolean remove(String s) throws NotFoundIdException, Exception {
        Connection connection = connectionPool.getConnection();
        try {
            connection.setAutoCommit(false);
            repository.delete(s, connection);
            connection.commit();
        } catch (NotFoundIdException e) {
            connection.rollback();
        } finally {
            connectionPool.releaseConnection(connection);
        }
        return true;
    }

    @Override
    public List<CustDto> get() throws Exception {
        Connection connection = connectionPool.getConnection();
        List<CustDto> custDtoList = null;

        try {
            custDtoList = repository.select(connection);
        } catch (Exception e) {
            throw e;
        } finally {
            connectionPool.releaseConnection(connection);
        }
        return custDtoList;
    }

    @Override
    public CustDto get(String s) throws NotFoundIdException, Exception {
        Connection connection = connectionPool.getConnection();
        CustDto custDto = null;

        try {
            custDto = repository.select(s, connection);
        } catch (Exception e) {
            throw e;
        } finally {
            connectionPool.releaseConnection(connection);
        }
        return custDto;
    }
}
