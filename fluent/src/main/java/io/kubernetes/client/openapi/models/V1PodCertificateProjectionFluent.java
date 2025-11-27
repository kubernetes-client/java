package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1PodCertificateProjectionFluent<A extends io.kubernetes.client.openapi.models.V1PodCertificateProjectionFluent<A>> extends BaseFluent<A>{

  private String certificateChainPath;
  private String credentialBundlePath;
  private String keyPath;
  private String keyType;
  private Integer maxExpirationSeconds;
  private String signerName;

  public V1PodCertificateProjectionFluent() {
  }
  
  public V1PodCertificateProjectionFluent(V1PodCertificateProjection instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1PodCertificateProjection instance) {
    instance = instance != null ? instance : new V1PodCertificateProjection();
    if (instance != null) {
        this.withCertificateChainPath(instance.getCertificateChainPath());
        this.withCredentialBundlePath(instance.getCredentialBundlePath());
        this.withKeyPath(instance.getKeyPath());
        this.withKeyType(instance.getKeyType());
        this.withMaxExpirationSeconds(instance.getMaxExpirationSeconds());
        this.withSignerName(instance.getSignerName());
    }
  }
  
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    if (!(super.equals(o))) {
      return false;
    }
    V1PodCertificateProjectionFluent that = (V1PodCertificateProjectionFluent) o;
    if (!(Objects.equals(certificateChainPath, that.certificateChainPath))) {
      return false;
    }
    if (!(Objects.equals(credentialBundlePath, that.credentialBundlePath))) {
      return false;
    }
    if (!(Objects.equals(keyPath, that.keyPath))) {
      return false;
    }
    if (!(Objects.equals(keyType, that.keyType))) {
      return false;
    }
    if (!(Objects.equals(maxExpirationSeconds, that.maxExpirationSeconds))) {
      return false;
    }
    if (!(Objects.equals(signerName, that.signerName))) {
      return false;
    }
    return true;
  }
  
  public String getCertificateChainPath() {
    return this.certificateChainPath;
  }
  
  public String getCredentialBundlePath() {
    return this.credentialBundlePath;
  }
  
  public String getKeyPath() {
    return this.keyPath;
  }
  
  public String getKeyType() {
    return this.keyType;
  }
  
  public Integer getMaxExpirationSeconds() {
    return this.maxExpirationSeconds;
  }
  
  public String getSignerName() {
    return this.signerName;
  }
  
  public boolean hasCertificateChainPath() {
    return this.certificateChainPath != null;
  }
  
  public boolean hasCredentialBundlePath() {
    return this.credentialBundlePath != null;
  }
  
  public boolean hasKeyPath() {
    return this.keyPath != null;
  }
  
  public boolean hasKeyType() {
    return this.keyType != null;
  }
  
  public boolean hasMaxExpirationSeconds() {
    return this.maxExpirationSeconds != null;
  }
  
  public boolean hasSignerName() {
    return this.signerName != null;
  }
  
  public int hashCode() {
    return Objects.hash(certificateChainPath, credentialBundlePath, keyPath, keyType, maxExpirationSeconds, signerName);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(certificateChainPath == null)) {
        sb.append("certificateChainPath:");
        sb.append(certificateChainPath);
        sb.append(",");
    }
    if (!(credentialBundlePath == null)) {
        sb.append("credentialBundlePath:");
        sb.append(credentialBundlePath);
        sb.append(",");
    }
    if (!(keyPath == null)) {
        sb.append("keyPath:");
        sb.append(keyPath);
        sb.append(",");
    }
    if (!(keyType == null)) {
        sb.append("keyType:");
        sb.append(keyType);
        sb.append(",");
    }
    if (!(maxExpirationSeconds == null)) {
        sb.append("maxExpirationSeconds:");
        sb.append(maxExpirationSeconds);
        sb.append(",");
    }
    if (!(signerName == null)) {
        sb.append("signerName:");
        sb.append(signerName);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withCertificateChainPath(String certificateChainPath) {
    this.certificateChainPath = certificateChainPath;
    return (A) this;
  }
  
  public A withCredentialBundlePath(String credentialBundlePath) {
    this.credentialBundlePath = credentialBundlePath;
    return (A) this;
  }
  
  public A withKeyPath(String keyPath) {
    this.keyPath = keyPath;
    return (A) this;
  }
  
  public A withKeyType(String keyType) {
    this.keyType = keyType;
    return (A) this;
  }
  
  public A withMaxExpirationSeconds(Integer maxExpirationSeconds) {
    this.maxExpirationSeconds = maxExpirationSeconds;
    return (A) this;
  }
  
  public A withSignerName(String signerName) {
    this.signerName = signerName;
    return (A) this;
  }
  
}