package com.bjinfotech.oa.dao;

import com.bjinfotech.oa.domain.Fawen;

/**
 * author:cleverpig
 */
public interface FawenDao {

  public abstract Fawen load(Integer id);

  public abstract Integer insert(Fawen f);

  public abstract void update(Fawen f);

  public abstract void delete(Integer id);

}