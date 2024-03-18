package com.hana.repository;

import com.hana.data.CustDto;
import com.hana.exception.DuplicatedIdException;
import com.hana.exception.NotFoundIdException;
import com.hana.frame.Repository;
import com.hana.frame.SQL;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustRepository implements Repository<String, CustDto> {

    @Override
    public CustDto insert(CustDto custDto, Connection connection) throws DuplicatedIdException, Exception {
        // 2. Connection

        // 3. SQL
        // 만들었다

        // 4. PreparedStatement
        PreparedStatement preparedStatement = null;

        try {
            // SQL문을 가져온다
            preparedStatement = connection.prepareStatement(SQL.insertCust);
            // SQL문 placeholder에 대응되는 문자열 설정
            preparedStatement.setString(1, custDto.getId());
            preparedStatement.setString(2, custDto.getPwd());
            preparedStatement.setString(3, custDto.getName());
            preparedStatement.executeUpdate();
        } catch (SQLIntegrityConstraintViolationException e) {
            throw new DuplicatedIdException("ERR0001");
        } catch (SQLException e) {
            throw new Exception("EXX0001");
        } finally {
            // 5. close
            if(preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return custDto;
    }

    @Override
    public CustDto update(CustDto custDto, Connection connection) throws NotFoundIdException, Exception {
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement(SQL.updateCust);
            preparedStatement.setString(1, custDto.getPwd());
            preparedStatement.setString(2, custDto.getName());
            preparedStatement.setString(3, custDto.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new NotFoundIdException("ERR0002");
        } finally {
            if(preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return custDto;
    }

    @Override
    public Boolean delete(String s, Connection connection) throws NotFoundIdException, Exception {
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement(SQL.deleteCust);
            preparedStatement.setString(1, s);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new NotFoundIdException("ERR0002");
        } finally {
            if(preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return true;
    }

    // 전체 데이터베이스를 보여준다
    @Override
    public List<CustDto> select(Connection connection) throws Exception {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<CustDto> custDtoList = new ArrayList<>();

        try {
            preparedStatement = connection.prepareStatement(SQL.selectAllCust);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String custId = resultSet.getString("id");
                String custPwd = resultSet.getString("pwd");
                String custName = resultSet.getString("name");

                CustDto custDto = CustDto.builder().id(custId).pwd(custPwd).name(custName).build();
                custDtoList.add(custDto);
            }
        } catch (SQLException e) {
            throw new NotFoundIdException("ERR0003");
        } finally {
            if(resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }

            if(preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }

            if(connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return custDtoList;
    }

    // 특정 아이디에 관한 데이터를 보여준다
    @Override
    public CustDto select(String s, Connection connection) throws NotFoundIdException, Exception {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        CustDto custDto = null;

        try {
            preparedStatement = connection.prepareStatement(SQL.selectCust);
            preparedStatement.setString(1, s);

            resultSet = preparedStatement.executeQuery();
            if(resultSet.next()) {
                String custId = resultSet.getString("id");
                String custPwd = resultSet.getString("pwd");
                String custName = resultSet.getString("name");

                custDto = CustDto.builder().id(custId).pwd(custPwd).name(custName).build();
            } else {
                throw new NotFoundIdException("ERR0002");
            }
        } catch (SQLException e) {
            System.out.println("SQL Error");
        } finally {
            if(resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }

            if(preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }

            if(connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return custDto;
    }
}
