package com.bjinfotech.oa.backingbean;

import com.bjinfotech.oa.service.WelcomeService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: cleverpig
 * Date: 11-1-14
 * Time: 上午10:27
 * To change this template use File | Settings | File Templates.
 */
public class BasedUserBean {
  private String username;
  private String greetingWords;
  private WelcomeService welcomeService;
  private Log log= LogFactory.getLog(BasedUserBean.class);

  public BasedUserBean() {
  }

  @PostConstruct
  public void setupBean(){
    log.debug("init...");
    username=SecurityContextHolder.getContext().getAuthentication().getName();
    List<GrantedAuthority> authorities=new ArrayList<GrantedAuthority>(
        SecurityContextHolder.getContext().getAuthentication().getAuthorities()
    );
    boolean isAdmin=false;
    for(GrantedAuthority author:authorities){
      if (author.getAuthority().equals("PERM_ACCESS_ADMIN")){
        isAdmin=true;
        break;
      }
    }
    if (isAdmin){
      greetingWords=welcomeService.sayHelloForAdmin();
    }
    else{
      greetingWords=welcomeService.sayHelloForUser();
    }

  }
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getGreetingWords() {
    return greetingWords;
  }

  public void setGreetingWords(String greetingWords) {
    this.greetingWords = greetingWords;
  }

  public WelcomeService getWelcomeService() {
    return welcomeService;
  }

  public void setWelcomeService(WelcomeService welcomeService) {
    this.welcomeService = welcomeService;
  }
}
