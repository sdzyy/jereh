package com.sale.service.impl;

import java.util.List;

import com.sale.dao.SaleQuotationDao;
import com.sale.dao.impl.SaleQuotationDaoImpl;
import com.sale.entity.SaleQuotation;
import com.sale.entity.SaleQuotation_Detail;
import com.sale.service.SaleQuotationService;
import com.common.entity.PageBean;

public class SaleQuotationServiceImpl implements SaleQuotationService {
    SaleQuotationDao saleQuotationDao = new SaleQuotationDaoImpl();
	@Override
	public PageBean findList(SaleQuotation sq, int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return saleQuotationDao.findList(sq, pageNo, pageSize);
	}
	@Override
	public int deleteSaleQuotation(String code) {
		// TODO Auto-generated method stub
		return saleQuotationDao.deleteSaleQuotation(code);
	}
	@Override
	public List<SaleQuotation_Detail> showDetail(String scode) {
		// TODO Auto-generated method stub
		return saleQuotationDao.showDetail(scode);
	}
	@Override
	public int updateSaleQuotation(SaleQuotation saleQuotation) {
		// TODO Auto-generated method stub
		return saleQuotationDao.updateSaleQuotation(saleQuotation);
	}
	@Override
	public int addSaleQuotation(SaleQuotation saleQuotation) {
		// TODO Auto-generated method stub
		return saleQuotationDao.addSaleQuotation(saleQuotation);
	}
	
}
