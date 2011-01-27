package com.bjinfotech.oa.domain;

import java.util.Date;

public class Fawen {
  private Integer id;
  private String wenhao;
  private String title;
  private String content;
  private Date fawenTime;
  private String groupId;
  private String state;
  
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public String getWenhao() {
    return wenhao;
  }
  public void setWenhao(String wenhao) {
    this.wenhao = wenhao;
  }
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }
  public Date getFawenTime() {
    return fawenTime;
  }
  public void setFawenTime(Date fawenTime) {
    this.fawenTime = fawenTime;
  }
  public String getGroupId() {
    return groupId;
  }
  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }
  
  @Override
  public String toString() {
    return "Fawen [title=" + title + ", wenhao=" + wenhao + "]";
  }
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((wenhao == null) ? 0 : wenhao.hashCode());
    return result;
  }
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Fawen other = (Fawen) obj;
    if (wenhao == null) {
      if (other.wenhao != null)
        return false;
    } else if (!wenhao.equals(other.wenhao))
      return false;
    return true;
  }
  
  
}
