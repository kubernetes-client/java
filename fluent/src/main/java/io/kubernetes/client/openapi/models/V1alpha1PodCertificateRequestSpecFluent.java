package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Integer;
import java.lang.Byte;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Objects;
import java.util.Collection;
import java.lang.Object;
import java.util.List;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1alpha1PodCertificateRequestSpecFluent<A extends io.kubernetes.client.openapi.models.V1alpha1PodCertificateRequestSpecFluent<A>> extends BaseFluent<A>{
  public V1alpha1PodCertificateRequestSpecFluent() {
  }
  
  public V1alpha1PodCertificateRequestSpecFluent(V1alpha1PodCertificateRequestSpec instance) {
    this.copyInstance(instance);
  }
  private Integer maxExpirationSeconds;
  private String nodeName;
  private String nodeUID;
  private List<Byte> pkixPublicKey;
  private String podName;
  private String podUID;
  private List<Byte> proofOfPossession;
  private String serviceAccountName;
  private String serviceAccountUID;
  private String signerName;
  
  protected void copyInstance(V1alpha1PodCertificateRequestSpec instance) {
    instance = instance != null ? instance : new V1alpha1PodCertificateRequestSpec();
    if (instance != null) {
        this.withMaxExpirationSeconds(instance.getMaxExpirationSeconds());
        this.withNodeName(instance.getNodeName());
        this.withNodeUID(instance.getNodeUID());
        this.withPkixPublicKey(instance.getPkixPublicKey());
        this.withPodName(instance.getPodName());
        this.withPodUID(instance.getPodUID());
        this.withProofOfPossession(instance.getProofOfPossession());
        this.withServiceAccountName(instance.getServiceAccountName());
        this.withServiceAccountUID(instance.getServiceAccountUID());
        this.withSignerName(instance.getSignerName());
    }
  }
  
  public Integer getMaxExpirationSeconds() {
    return this.maxExpirationSeconds;
  }
  
  public A withMaxExpirationSeconds(Integer maxExpirationSeconds) {
    this.maxExpirationSeconds = maxExpirationSeconds;
    return (A) this;
  }
  
  public boolean hasMaxExpirationSeconds() {
    return this.maxExpirationSeconds != null;
  }
  
  public String getNodeName() {
    return this.nodeName;
  }
  
  public A withNodeName(String nodeName) {
    this.nodeName = nodeName;
    return (A) this;
  }
  
  public boolean hasNodeName() {
    return this.nodeName != null;
  }
  
  public String getNodeUID() {
    return this.nodeUID;
  }
  
  public A withNodeUID(String nodeUID) {
    this.nodeUID = nodeUID;
    return (A) this;
  }
  
  public boolean hasNodeUID() {
    return this.nodeUID != null;
  }
  
  public A withPkixPublicKey(byte... pkixPublicKey) {
    if (this.pkixPublicKey != null) {
        this.pkixPublicKey.clear();
        _visitables.remove("pkixPublicKey");
    }
    if (pkixPublicKey != null) {
      for (byte item : pkixPublicKey) {
        this.addToPkixPublicKey(item);
      }
    }
    return (A) this;
  }
  
  public byte[] getPkixPublicKey() {
    int size = pkixPublicKey != null ? pkixPublicKey.size() : 0;
    byte[] result = new byte[size];
    if (size == 0) {
      return result;
    }
    int index = 0;
    for (byte item : pkixPublicKey) {
      result[index++] = item;
    }
    return result;
  }
  
  public A addToPkixPublicKey(int index,Byte item) {
    if (this.pkixPublicKey == null) {
      this.pkixPublicKey = new ArrayList();
    }
    this.pkixPublicKey.add(index, item);
    return (A) this;
  }
  
  public A setToPkixPublicKey(int index,Byte item) {
    if (this.pkixPublicKey == null) {
      this.pkixPublicKey = new ArrayList();
    }
    this.pkixPublicKey.set(index, item);
    return (A) this;
  }
  
  public A addToPkixPublicKey(Byte... items) {
    if (this.pkixPublicKey == null) {
      this.pkixPublicKey = new ArrayList();
    }
    for (Byte item : items) {
      this.pkixPublicKey.add(item);
    }
    return (A) this;
  }
  
  public A addAllToPkixPublicKey(Collection<Byte> items) {
    if (this.pkixPublicKey == null) {
      this.pkixPublicKey = new ArrayList();
    }
    for (Byte item : items) {
      this.pkixPublicKey.add(item);
    }
    return (A) this;
  }
  
  public A removeFromPkixPublicKey(Byte... items) {
    if (this.pkixPublicKey == null) {
      return (A) this;
    }
    for (Byte item : items) {
      this.pkixPublicKey.remove(item);
    }
    return (A) this;
  }
  
  public A removeAllFromPkixPublicKey(Collection<Byte> items) {
    if (this.pkixPublicKey == null) {
      return (A) this;
    }
    for (Byte item : items) {
      this.pkixPublicKey.remove(item);
    }
    return (A) this;
  }
  
  public boolean hasPkixPublicKey() {
    return this.pkixPublicKey != null && !(this.pkixPublicKey.isEmpty());
  }
  
  public String getPodName() {
    return this.podName;
  }
  
  public A withPodName(String podName) {
    this.podName = podName;
    return (A) this;
  }
  
  public boolean hasPodName() {
    return this.podName != null;
  }
  
  public String getPodUID() {
    return this.podUID;
  }
  
  public A withPodUID(String podUID) {
    this.podUID = podUID;
    return (A) this;
  }
  
  public boolean hasPodUID() {
    return this.podUID != null;
  }
  
  public A withProofOfPossession(byte... proofOfPossession) {
    if (this.proofOfPossession != null) {
        this.proofOfPossession.clear();
        _visitables.remove("proofOfPossession");
    }
    if (proofOfPossession != null) {
      for (byte item : proofOfPossession) {
        this.addToProofOfPossession(item);
      }
    }
    return (A) this;
  }
  
  public byte[] getProofOfPossession() {
    int size = proofOfPossession != null ? proofOfPossession.size() : 0;
    byte[] result = new byte[size];
    if (size == 0) {
      return result;
    }
    int index = 0;
    for (byte item : proofOfPossession) {
      result[index++] = item;
    }
    return result;
  }
  
  public A addToProofOfPossession(int index,Byte item) {
    if (this.proofOfPossession == null) {
      this.proofOfPossession = new ArrayList();
    }
    this.proofOfPossession.add(index, item);
    return (A) this;
  }
  
  public A setToProofOfPossession(int index,Byte item) {
    if (this.proofOfPossession == null) {
      this.proofOfPossession = new ArrayList();
    }
    this.proofOfPossession.set(index, item);
    return (A) this;
  }
  
  public A addToProofOfPossession(Byte... items) {
    if (this.proofOfPossession == null) {
      this.proofOfPossession = new ArrayList();
    }
    for (Byte item : items) {
      this.proofOfPossession.add(item);
    }
    return (A) this;
  }
  
  public A addAllToProofOfPossession(Collection<Byte> items) {
    if (this.proofOfPossession == null) {
      this.proofOfPossession = new ArrayList();
    }
    for (Byte item : items) {
      this.proofOfPossession.add(item);
    }
    return (A) this;
  }
  
  public A removeFromProofOfPossession(Byte... items) {
    if (this.proofOfPossession == null) {
      return (A) this;
    }
    for (Byte item : items) {
      this.proofOfPossession.remove(item);
    }
    return (A) this;
  }
  
  public A removeAllFromProofOfPossession(Collection<Byte> items) {
    if (this.proofOfPossession == null) {
      return (A) this;
    }
    for (Byte item : items) {
      this.proofOfPossession.remove(item);
    }
    return (A) this;
  }
  
  public boolean hasProofOfPossession() {
    return this.proofOfPossession != null && !(this.proofOfPossession.isEmpty());
  }
  
  public String getServiceAccountName() {
    return this.serviceAccountName;
  }
  
  public A withServiceAccountName(String serviceAccountName) {
    this.serviceAccountName = serviceAccountName;
    return (A) this;
  }
  
  public boolean hasServiceAccountName() {
    return this.serviceAccountName != null;
  }
  
  public String getServiceAccountUID() {
    return this.serviceAccountUID;
  }
  
  public A withServiceAccountUID(String serviceAccountUID) {
    this.serviceAccountUID = serviceAccountUID;
    return (A) this;
  }
  
  public boolean hasServiceAccountUID() {
    return this.serviceAccountUID != null;
  }
  
  public String getSignerName() {
    return this.signerName;
  }
  
  public A withSignerName(String signerName) {
    this.signerName = signerName;
    return (A) this;
  }
  
  public boolean hasSignerName() {
    return this.signerName != null;
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
    V1alpha1PodCertificateRequestSpecFluent that = (V1alpha1PodCertificateRequestSpecFluent) o;
    if (!(Objects.equals(maxExpirationSeconds, that.maxExpirationSeconds))) {
      return false;
    }
    if (!(Objects.equals(nodeName, that.nodeName))) {
      return false;
    }
    if (!(Objects.equals(nodeUID, that.nodeUID))) {
      return false;
    }
    if (!(Objects.equals(pkixPublicKey, that.pkixPublicKey))) {
      return false;
    }
    if (!(Objects.equals(podName, that.podName))) {
      return false;
    }
    if (!(Objects.equals(podUID, that.podUID))) {
      return false;
    }
    if (!(Objects.equals(proofOfPossession, that.proofOfPossession))) {
      return false;
    }
    if (!(Objects.equals(serviceAccountName, that.serviceAccountName))) {
      return false;
    }
    if (!(Objects.equals(serviceAccountUID, that.serviceAccountUID))) {
      return false;
    }
    if (!(Objects.equals(signerName, that.signerName))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(maxExpirationSeconds, nodeName, nodeUID, pkixPublicKey, podName, podUID, proofOfPossession, serviceAccountName, serviceAccountUID, signerName);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(maxExpirationSeconds == null)) {
        sb.append("maxExpirationSeconds:");
        sb.append(maxExpirationSeconds);
        sb.append(",");
    }
    if (!(nodeName == null)) {
        sb.append("nodeName:");
        sb.append(nodeName);
        sb.append(",");
    }
    if (!(nodeUID == null)) {
        sb.append("nodeUID:");
        sb.append(nodeUID);
        sb.append(",");
    }
    if (!(pkixPublicKey == null) && !(pkixPublicKey.isEmpty())) {
        sb.append("pkixPublicKey:");
        sb.append(pkixPublicKey);
        sb.append(",");
    }
    if (!(podName == null)) {
        sb.append("podName:");
        sb.append(podName);
        sb.append(",");
    }
    if (!(podUID == null)) {
        sb.append("podUID:");
        sb.append(podUID);
        sb.append(",");
    }
    if (!(proofOfPossession == null) && !(proofOfPossession.isEmpty())) {
        sb.append("proofOfPossession:");
        sb.append(proofOfPossession);
        sb.append(",");
    }
    if (!(serviceAccountName == null)) {
        sb.append("serviceAccountName:");
        sb.append(serviceAccountName);
        sb.append(",");
    }
    if (!(serviceAccountUID == null)) {
        sb.append("serviceAccountUID:");
        sb.append(serviceAccountUID);
        sb.append(",");
    }
    if (!(signerName == null)) {
        sb.append("signerName:");
        sb.append(signerName);
    }
    sb.append("}");
    return sb.toString();
  }
  

}