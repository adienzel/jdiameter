package org.jdiameter.common.impl.app.t6a;

import org.jdiameter.api.Message;
import org.jdiameter.api.app.AppSession;
import org.jdiameter.api.t6a.events.JReportingInformationRequest;
import org.jdiameter.common.impl.app.AppRequestEventImpl;

/**
 * Created by Adi Enzel on 13/5/17.
 */
public class JReportingInformationRequestImpl extends AppRequestEventImpl implements JReportingInformationRequest {
  //private static final long serialVersionUID = 1L;

  public JReportingInformationRequestImpl(Message msg) {
    super(msg);
    msg.setRequest(true);
  }

  public JReportingInformationRequestImpl(AppSession session, String destRealm, String destHost) {
    super(session.getSessions().get(0).createRequest(code, session.getSessionAppId(), destRealm, destHost));
  }

}
