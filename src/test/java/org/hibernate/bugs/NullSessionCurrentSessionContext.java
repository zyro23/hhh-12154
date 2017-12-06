package org.hibernate.bugs;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.context.spi.AbstractCurrentSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;

public class NullSessionCurrentSessionContext extends AbstractCurrentSessionContext {

	public NullSessionCurrentSessionContext(SessionFactoryImplementor factory) {
		super(factory);
	}

	@Override
	public Session currentSession() throws HibernateException {
		return null;
	}

}
