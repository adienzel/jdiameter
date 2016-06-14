/*
 * TeleStax, Open Source Cloud Communications
 * Copyright 2011-2016, Telestax Inc and individual contributors
 * by the @authors tag.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.jdiameter.common.impl.app.slg;

import java.io.Serializable;

import org.jdiameter.api.Request;
import org.jdiameter.common.api.app.AppSessionDataLocalImpl;
import org.jdiameter.common.api.app.slg.ISLgSessionData;
import org.jdiameter.common.api.app.slg.SLgSessionState;

/**
 * @author fernando.mendioroz@telestax.com (Fernando Mendioroz)
 *
 */

public class SLgLocalSessionDataImpl extends AppSessionDataLocalImpl implements ISLgSessionData {

    protected SLgSessionState state = SLgSessionState.IDLE;
    protected Request buffer;
    protected Serializable tsTimerId;

    public void setSLgSessionState(SLgSessionState state) {
        this.state = state;
    }

    public SLgSessionState getSLgSessionState() {
        return this.state;
    }

    public Serializable getTsTimerId() {
        return this.tsTimerId;
    }

    public void setTsTimerId(Serializable tid) {
        this.tsTimerId = tid;
    }

    public void setBuffer(Request buffer) {
        this.buffer = buffer;
    }

    public Request getBuffer() {
        return this.buffer;
    }
}