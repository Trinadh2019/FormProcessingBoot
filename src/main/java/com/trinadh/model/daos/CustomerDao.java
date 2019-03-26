package com.trinadh.model.daos;

import com.trinadh.view.vo.Customer;

public interface CustomerDao {
	
	public int save(Customer cust);
	public void update(Customer cust);
	public void delete(int cid);
	public Customer get(int cid);

}
