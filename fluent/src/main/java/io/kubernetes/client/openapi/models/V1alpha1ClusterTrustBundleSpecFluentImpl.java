package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1alpha1ClusterTrustBundleSpecFluentImpl<A extends V1alpha1ClusterTrustBundleSpecFluent<A>> extends BaseFluent<A> implements V1alpha1ClusterTrustBundleSpecFluent<A>{
  public V1alpha1ClusterTrustBundleSpecFluentImpl() {
  }
  public V1alpha1ClusterTrustBundleSpecFluentImpl(V1alpha1ClusterTrustBundleSpec instance) {
    if (instance != null) {
      this.withSignerName(instance.getSignerName());
      this.withTrustBundle(instance.getTrustBundle());
    }
  }
  private String signerName;
  private String trustBundle;
  public String getSignerName() {
    return this.signerName;
  }
  public A withSignerName(String signerName) {
    this.signerName=signerName; return (A) this;
  }
  public Boolean hasSignerName() {
    return this.signerName != null;
  }
  public String getTrustBundle() {
    return this.trustBundle;
  }
  public A withTrustBundle(String trustBundle) {
    this.trustBundle=trustBundle; return (A) this;
  }
  public Boolean hasTrustBundle() {
    return this.trustBundle != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha1ClusterTrustBundleSpecFluentImpl that = (V1alpha1ClusterTrustBundleSpecFluentImpl) o;
    if (!java.util.Objects.equals(signerName, that.signerName)) return false;

    if (!java.util.Objects.equals(trustBundle, that.trustBundle)) return false;

    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(signerName,  trustBundle,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (signerName != null) { sb.append("signerName:"); sb.append(signerName + ","); }
    if (trustBundle != null) { sb.append("trustBundle:"); sb.append(trustBundle); }
    sb.append("}");
    return sb.toString();
  }
  
}