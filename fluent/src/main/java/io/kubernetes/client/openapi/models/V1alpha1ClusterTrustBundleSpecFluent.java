package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1alpha1ClusterTrustBundleSpecFluent<A extends V1alpha1ClusterTrustBundleSpecFluent<A>> extends Fluent<A>{
  public String getSignerName();
  public A withSignerName(String signerName);
  public Boolean hasSignerName();
  public String getTrustBundle();
  public A withTrustBundle(String trustBundle);
  public Boolean hasTrustBundle();
  
}