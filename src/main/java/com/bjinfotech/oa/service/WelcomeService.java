package com.bjinfotech.oa.service;

/**
 * Created by IntelliJ IDEA.
 * User: cleverpig
 * Date: 11-1-13
 * Time: 下午4:46
 * To change this template use File | Settings | File Templates.
 */
public interface WelcomeService {
  //  @PreAuthorize("hasRole('PERM_ACCESS_ADMIN')")
  String sayHelloForAdmin();

  //  @PreAuthorize("hasAnyRole('PERM_ACCESS_ADMIN','PERM_ACCESS_USER')")
  String sayHelloForUser();
}
