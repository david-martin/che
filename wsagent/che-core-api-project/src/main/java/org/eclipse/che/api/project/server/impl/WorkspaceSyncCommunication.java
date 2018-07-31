/*
 * Copyright (c) 2012-2018 Red Hat, Inc.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which is available at http://www.eclipse.org/legal/epl-2.0.html
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Red Hat, Inc. - initial API and implementation
 */
package org.eclipse.che.api.project.server.impl;

import com.google.inject.Singleton;
import javax.inject.Inject;
import org.eclipse.che.api.core.jsonrpc.commons.ClientSubscriptionHandler;
import org.eclipse.che.api.core.jsonrpc.commons.RequestTransmitter;

/** Sends event about workspace updating using JSON RPC to the all subscribed clients. */
@Singleton
public class WorkspaceSyncCommunication {

  private static final String WORKSPACE_SYNCHRONIZE_METHOD_NAME = "workspace/synchronize";

  private RequestTransmitter transmitter;
  private ClientSubscriptionHandler clientSubscriptionHandler;

  @Inject
  public WorkspaceSyncCommunication(
      RequestTransmitter transmitter, ClientSubscriptionHandler clientSubscriptionHandler) {
    this.transmitter = transmitter;
    this.clientSubscriptionHandler = clientSubscriptionHandler;
  }

  /** Sends workspace updating event */
  void synchronizeWorkspace() {
    clientSubscriptionHandler
        .getEndpointIds()
        .forEach(
            it ->
                transmitter
                    .newRequest()
                    .endpointId(it)
                    .methodName(WORKSPACE_SYNCHRONIZE_METHOD_NAME)
                    .noParams()
                    .sendAndSkipResult());
  }
}
