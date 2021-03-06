package com.stock.hibernet.dao;

import java.util.List;

import com.stock.hibernet.model.Company;
import com.stock.hibernet.model.IPO;

public interface AdminDao {
	public List<Company> listAllCompany();
	
	public void addCompany(Company company, int userid);
	
	public Company getCompany(int companyid);
	
	public boolean deactivateCompany(int companyid);
	
	public boolean updateIPO(IPO ipo, int ipo_id);
	
	public void uploadFile(String filename, int companyId, String fromdate, String todate);

}
