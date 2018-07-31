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
package org.eclipse.che.plugin.ssh.key.script;

import java.io.IOException;
import org.eclipse.che.api.core.UnauthorizedException;

/**
 * Uploads ssh keys to Repository management.
 *
 * @author Anton Korneta
 */
public interface SshKeyUploader {

  /**
   * Upload public key part to Repository management.
   *
   * @throws IOException if an i/o error occurs
   * @throws UnauthorizedException if user is not authorized to access SSH key storage
   */
  void uploadKey(String publicKey, String oauthToken) throws IOException, UnauthorizedException;

  /**
   * Check if specified url matched to use current upload provider.
   *
   * @param url input url to check
   * @return true if current uploader can be applied to upload key to host specified in url, passed
   *     as parameter
   */
  boolean match(String url);
}
