package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Byte;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1beta1PodCertificateRequestSpecFluent<A extends io.kubernetes.client.openapi.models.V1beta1PodCertificateRequestSpecFluent<A>> extends BaseFluent<A>{

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
  private Map<String,String> unverifiedUserAnnotations;

  public V1beta1PodCertificateRequestSpecFluent() {
  }
  
  public V1beta1PodCertificateRequestSpecFluent(V1beta1PodCertificateRequestSpec instance) {
    this.copyInstance(instance);
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
  
  public A addAllToProofOfPossession(Collection<Byte> items) {
    if (this.proofOfPossession == null) {
      this.proofOfPossession = new ArrayList();
    }
    for (Byte item : items) {
      this.proofOfPossession.add(item);
    }
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
  
  public A addToPkixPublicKey(int index,Byte item) {
    if (this.pkixPublicKey == null) {
      this.pkixPublicKey = new ArrayList();
    }
    this.pkixPublicKey.add(index, item);
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
  
  public A addToProofOfPossession(int index,Byte item) {
    if (this.proofOfPossession == null) {
      this.proofOfPossession = new ArrayList();
    }
    this.proofOfPossession.add(index, item);
    return (A) this;
  }
  
  public A addToUnverifiedUserAnnotations(Map<String,String> map) {
    if (this.unverifiedUserAnnotations == null && map != null) {
      this.unverifiedUserAnnotations = new LinkedHashMap();
    }
    if (map != null) {
      this.unverifiedUserAnnotations.putAll(map);
    }
    return (A) this;
  }
  
  public A addToUnverifiedUserAnnotations(String key,String value) {
    if (this.unverifiedUserAnnotations == null && key != null && value != null) {
      this.unverifiedUserAnnotations = new LinkedHashMap();
    }
    if (key != null && value != null) {
      this.unverifiedUserAnnotations.put(key, value);
    }
    return (A) this;
  }
  
  protected void copyInstance(V1beta1PodCertificateRequestSpec instance) {
    instance = instance != null ? instance : new V1beta1PodCertificateRequestSpec();
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
        this.withUnverifiedUserAnnotations(instance.getUnverifiedUserAnnotations());
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
    V1beta1PodCertificateRequestSpecFluent that = (V1beta1PodCertificateRequestSpecFluent) o;
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
    if (!(Objects.equals(unverifiedUserAnnotations, that.unverifiedUserAnnotations))) {
      return false;
    }
    return true;
  }
  
  public Integer getMaxExpirationSeconds() {
    return this.maxExpirationSeconds;
  }
  
  public String getNodeName() {
    return this.nodeName;
  }
  
  public String getNodeUID() {
    return this.nodeUID;
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
  
  public String getPodName() {
    return this.podName;
  }
  
  public String getPodUID() {
    return this.podUID;
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
  
  public String getServiceAccountName() {
    return this.serviceAccountName;
  }
  
  public String getServiceAccountUID() {
    return this.serviceAccountUID;
  }
  
  public String getSignerName() {
    return this.signerName;
  }
  
  public Map<String,String> getUnverifiedUserAnnotations() {
    return this.unverifiedUserAnnotations;
  }
  
  public boolean hasMaxExpirationSeconds() {
    return this.maxExpirationSeconds != null;
  }
  
  public boolean hasNodeName() {
    return this.nodeName != null;
  }
  
  public boolean hasNodeUID() {
    return this.nodeUID != null;
  }
  
  public boolean hasPkixPublicKey() {
    return this.pkixPublicKey != null && !(this.pkixPublicKey.isEmpty());
  }
  
  public boolean hasPodName() {
    return this.podName != null;
  }
  
  public boolean hasPodUID() {
    return this.podUID != null;
  }
  
  public boolean hasProofOfPossession() {
    return this.proofOfPossession != null && !(this.proofOfPossession.isEmpty());
  }
  
  public boolean hasServiceAccountName() {
    return this.serviceAccountName != null;
  }
  
  public boolean hasServiceAccountUID() {
    return this.serviceAccountUID != null;
  }
  
  public boolean hasSignerName() {
    return this.signerName != null;
  }
  
  public boolean hasUnverifiedUserAnnotations() {
    return this.unverifiedUserAnnotations != null;
  }
  
  public int hashCode() {
    return Objects.hash(maxExpirationSeconds, nodeName, nodeUID, pkixPublicKey, podName, podUID, proofOfPossession, serviceAccountName, serviceAccountUID, signerName, unverifiedUserAnnotations);
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
  
  public A removeAllFromProofOfPossession(Collection<Byte> items) {
    if (this.proofOfPossession == null) {
      return (A) this;
    }
    for (Byte item : items) {
      this.proofOfPossession.remove(item);
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
  
  public A removeFromProofOfPossession(Byte... items) {
    if (this.proofOfPossession == null) {
      return (A) this;
    }
    for (Byte item : items) {
      this.proofOfPossession.remove(item);
    }
    return (A) this;
  }
  
  public A removeFromUnverifiedUserAnnotations(String key) {
    if (this.unverifiedUserAnnotations == null) {
      return (A) this;
    }
    if (key != null && this.unverifiedUserAnnotations != null) {
      this.unverifiedUserAnnotations.remove(key);
    }
    return (A) this;
  }
  
  public A removeFromUnverifiedUserAnnotations(Map<String,String> map) {
    if (this.unverifiedUserAnnotations == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this.unverifiedUserAnnotations != null) {
          this.unverifiedUserAnnotations.remove(key);
        }
      }
    }
    return (A) this;
  }
  
  public A setToPkixPublicKey(int index,Byte item) {
    if (this.pkixPublicKey == null) {
      this.pkixPublicKey = new ArrayList();
    }
    this.pkixPublicKey.set(index, item);
    return (A) this;
  }
  
  public A setToProofOfPossession(int index,Byte item) {
    if (this.proofOfPossession == null) {
      this.proofOfPossession = new ArrayList();
    }
    this.proofOfPossession.set(index, item);
    return (A) this;
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
        sb.append(",");
    }
    if (!(unverifiedUserAnnotations == null) && !(unverifiedUserAnnotations.isEmpty())) {
        sb.append("unverifiedUserAnnotations:");
        sb.append(unverifiedUserAnnotations);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withMaxExpirationSeconds(Integer maxExpirationSeconds) {
    this.maxExpirationSeconds = maxExpirationSeconds;
    return (A) this;
  }
  
  public A withNodeName(String nodeName) {
    this.nodeName = nodeName;
    return (A) this;
  }
  
  public A withNodeUID(String nodeUID) {
    this.nodeUID = nodeUID;
    return (A) this;
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
  
  public A withPodName(String podName) {
    this.podName = podName;
    return (A) this;
  }
  
  public A withPodUID(String podUID) {
    this.podUID = podUID;
    return (A) this;
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
  
  public A withServiceAccountName(String serviceAccountName) {
    this.serviceAccountName = serviceAccountName;
    return (A) this;
  }
  
  public A withServiceAccountUID(String serviceAccountUID) {
    this.serviceAccountUID = serviceAccountUID;
    return (A) this;
  }
  
  public A withSignerName(String signerName) {
    this.signerName = signerName;
    return (A) this;
  }
  
  public <K,V>A withUnverifiedUserAnnotations(Map<String,String> unverifiedUserAnnotations) {
    if (unverifiedUserAnnotations == null) {
      this.unverifiedUserAnnotations = null;
    } else {
      this.unverifiedUserAnnotations = new LinkedHashMap(unverifiedUserAnnotations);
    }
    return (A) this;
  }
  
}