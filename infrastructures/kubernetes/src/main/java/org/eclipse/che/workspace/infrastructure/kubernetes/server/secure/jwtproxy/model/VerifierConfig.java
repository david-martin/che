/*
 * Copyright (c) 2012-2018 Red Hat, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Red Hat, Inc. - initial API and implementation
 */
package org.eclipse.che.workspace.infrastructure.kubernetes.server.secure.jwtproxy.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Set;

@JsonInclude(Include.NON_NULL)
/**
 * Verifier configuration
 *
 * @author Mykhailo Kuznietsov
 */
public class VerifierConfig {
  private String upstream;

  private String audience;
  @JsonProperty("max_skew")
  private String maxSkew;
  @JsonProperty("max_ttl")
  private String maxTtl;
  @JsonProperty("nonce_storage")
  private RegistrableComponentConfig nonceStorage;
  @JsonProperty("key_server")
  private RegistrableComponentConfig keyServer;
  @JsonProperty("claims_verifier")
  private RegistrableComponentConfig claimsVerifier;

  private Set<String> excludes;

  public String getAudience() {
    return audience;
  }

  public void setAudience(String audience) {
    this.audience = audience;
  }

  public VerifierConfig withAudience(String audience) {
    this.audience = audience;
    return this;
  }

  public String getMaxSkew() {
    return maxSkew;
  }

  public void setMaxSkew(String maxSkew) {
    this.maxSkew = maxSkew;
  }

  public VerifierConfig withMaxSkew(String maxSkew) {
    this.maxSkew = maxSkew;
    return this;
  }

  public String getMaxTtl() {
    return maxTtl;
  }

  public void setMaxTtl(String maxTtl) {
    this.maxTtl = maxTtl;
  }

  public VerifierConfig withMaxTtl(String maxTtl) {
    this.maxTtl = maxTtl;
    return this;
  }

  public String getUpstream() {
    return upstream;
  }

  public void setUpstream(String upstream) {
    this.upstream = upstream;
  }

  public VerifierConfig withUpstream(String upstream) {
    this.upstream = upstream;
    return this;
  }

  public RegistrableComponentConfig getNonceStorage() {
    return nonceStorage;
  }

  public void setNonceStorage(RegistrableComponentConfig nonceStorage) {
    this.nonceStorage = nonceStorage;
  }

  public VerifierConfig withNonceStorage(RegistrableComponentConfig nonceStorage) {
    this.nonceStorage = nonceStorage;
    return this;
  }

  public RegistrableComponentConfig getKeyServer() {
    return keyServer;
  }

  public void setKeyServer(
      RegistrableComponentConfig keyServer) {
    this.keyServer = keyServer;
  }

  public VerifierConfig withKeyServer(RegistrableComponentConfig keyServer) {
    this.keyServer = keyServer;
    return this;
  }

  public RegistrableComponentConfig getClaimsVerifier() {
    return claimsVerifier;
  }

  public void setClaimsVerifier(
      RegistrableComponentConfig claimsVerifier) {
    this.claimsVerifier = claimsVerifier;
  }

  public VerifierConfig withClaimsVerifier(RegistrableComponentConfig claimsVerifier) {
    this.claimsVerifier = claimsVerifier;
    return this;
  }

  public Set<String> getExcludes() {
    return excludes;
  }

  public void setExcludes(Set<String> excludes) {
    this.excludes = excludes;
  }

  public VerifierConfig withExcludes(Set<String> excludes) {
    this.excludes = excludes;
    return this;
  }
}
