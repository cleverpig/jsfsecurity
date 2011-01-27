package com.bjinfotech.jsf.utils;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class LoggingPhaseListener implements PhaseListener {
  /**
   * 
   */
  private static final long serialVersionUID = 2150363183413246807L;
  private Log log = LogFactory.getLog(LoggingPhaseListener.class);
  
  public void afterPhase(PhaseEvent event) {
    // TODO Auto-generated method stub
    if (log.isDebugEnabled()){
      log.debug("afterPhase:"+event.getPhaseId());
    }
  }

  public void beforePhase(PhaseEvent event) {
    // TODO Auto-generated method stub
    if (log.isDebugEnabled()){
      log.debug("beforePhase:"+event.getPhaseId());
    }
  }

  public PhaseId getPhaseId() {
    // TODO Auto-generated method stub
    return PhaseId.ANY_PHASE;
  }
}
