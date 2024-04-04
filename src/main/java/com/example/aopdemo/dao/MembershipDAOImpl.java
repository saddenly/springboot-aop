package com.example.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAOImpl implements MembershipDAO {

    @Override
    public void addSillyMembership() {
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING A MEMBERSHIP ACCOUNT");
    }

    @Override
    public void goToSleep(){
        System.out.println(getClass() + ": SLEEPING IN MEMBERSHIP ACCOUNT");
    }
}
