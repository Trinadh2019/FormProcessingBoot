package com.trinadh.model.daos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.trinadh.view.vo.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao{
	
	@Autowired(required=true)
	private HibernateTemplate hibTemplate;

	@Override
	@Transactional(readOnly=false)
	public int save(Customer cust) {
		return (int) hibTemplate.save(cust);
	}

	@Override
	public void update(Customer cust) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int cid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Customer get(int cid) {
		// TODO Auto-generated method stub
		return null;
	}

}
