package com.bjinfotech.oa.service.impl;

import com.bjinfotech.oa.dao.FawenDao;
import com.bjinfotech.oa.domain.Fawen;
import com.bjinfotech.oa.service.FawenService;

public class FawenServiceImpl implements FawenService {
  private FawenDao fawenDao;
  public Fawen loadFawenFromId(Integer id){
    return fawenDao.load(id);
  }
  public FawenDao getFawenDao() {
    return fawenDao;
  }
  public void setFawenDao(FawenDao fawenDao) {
    this.fawenDao = fawenDao;
  }
  
}
