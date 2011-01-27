package com.bjinfotech.oa.backingbean;

import javax.faces.component.UIParameter;
import javax.faces.event.ActionEvent;

import com.bjinfotech.oa.domain.Fawen;
import com.bjinfotech.oa.service.FawenService;

public class FawenBean {
  private Fawen fawen;
  private FawenService service;
  
  public FawenBean() {
    super();
  }
//  @PostConstruct
//  public void postConstruct(){
//    service.loadFawenFromId(new Integer(1));
//  }
  public Fawen getFawen() {
    return fawen;
  }

  public void setFawen(Fawen fawen) {
    this.fawen = fawen;
  }

  public FawenService getService() {
    return service;
  }

  public void setService(FawenService service) {
    this.service = service;
  }
  
  public void readExampleActionListener(ActionEvent event){
    UIParameter param = (UIParameter) event.getComponent().findComponent("exampleId");
    String id=(String) param.getValue();
    fawen=service.loadFawenFromId(Integer.parseInt(id));
  }
}
