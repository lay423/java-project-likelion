package com.dao;

public class UserDaoFactory {

    public UserDao awsUserDao(){    // 날개 5개 선풍기
        AWSConnectionMaker awsConnectionMaker = new AWSConnectionMaker();
        UserDao userDao = new UserDao(awsConnectionMaker);
        return userDao;
    }

    public UserDao localUserDao() {
        UserDao userDao = new UserDao(new LocalConnectionMaker());
        return userDao;
    }
}
