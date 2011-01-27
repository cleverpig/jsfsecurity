package com.bjinfotech.oa.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.bjinfotech.oa.dao.FawenDao;
import com.bjinfotech.oa.domain.Fawen;

public class FawenDaoImpl extends HibernateDaoSupport implements FawenDao{
  /* (non-Javadoc)
   * @see com.bjinfotech.oa.dao.impl.FawenDao#load(java.lang.Integer)
   */
  public Fawen load(Integer id){
    return getHibernateTemplate().load(Fawen.class, id);
  }
  /* (non-Javadoc)
   * @see com.bjinfotech.oa.dao.impl.FawenDao#insert(com.bjinfotech.oa.domain.Fawen)
   */
  public Integer insert(Fawen f){
    Integer id=(Integer) getHibernateTemplate().save(f);
    return id;
  }
  
  /* (non-Javadoc)
   * @see com.bjinfotech.oa.dao.impl.FawenDao#update(com.bjinfotech.oa.domain.Fawen)
   */
  public void update(Fawen f){
    getHibernateTemplate().update(f);
  }
  
  /* (non-Javadoc)
   * @see com.bjinfotech.oa.dao.impl.FawenDao#delete(java.lang.Integer)
   */
  public void delete(Integer id){
    Fawen f=load(id);
    if (f!=null)
      getHibernateTemplate().delete(f);
  }
}
