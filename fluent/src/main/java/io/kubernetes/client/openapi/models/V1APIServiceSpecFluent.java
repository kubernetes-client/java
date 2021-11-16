package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Integer;
import java.lang.Deprecated;
import java.lang.Byte;
import java.util.Collection;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1APIServiceSpecFluent<A extends io.kubernetes.client.openapi.models.V1APIServiceSpecFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public A withCaBundle(byte... caBundle);
  public byte[] getCaBundle();
  public A addToCaBundle(java.lang.Integer index,java.lang.Byte item);
  public A setToCaBundle(java.lang.Integer index,java.lang.Byte item);
  public A addToCaBundle(java.lang.Byte... items);
  public A addAllToCaBundle(java.util.Collection<java.lang.Byte> items);
  public A removeFromCaBundle(java.lang.Byte... items);
  public A removeAllFromCaBundle(java.util.Collection<java.lang.Byte> items);
  public java.lang.Boolean hasCaBundle();
  public java.lang.String getGroup();
  public A withGroup(java.lang.String group);
  public java.lang.Boolean hasGroup();
  
  /**
   * Method is deprecated. use withGroup instead.
   */
  @java.lang.Deprecated
  public A withNewGroup(java.lang.String arg0);
  public java.lang.Integer getGroupPriorityMinimum();
  public A withGroupPriorityMinimum(java.lang.Integer groupPriorityMinimum);
  public java.lang.Boolean hasGroupPriorityMinimum();
  public java.lang.Boolean getInsecureSkipTLSVerify();
  public A withInsecureSkipTLSVerify(java.lang.Boolean insecureSkipTLSVerify);
  public java.lang.Boolean hasInsecureSkipTLSVerify();
  
  /**
   * This method has been deprecated, please use method buildService instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.ApiregistrationV1ServiceReference getService();
  public io.kubernetes.client.openapi.models.ApiregistrationV1ServiceReference buildService();
  public A withService(io.kubernetes.client.openapi.models.ApiregistrationV1ServiceReference service);
  public java.lang.Boolean hasService();
  public io.kubernetes.client.openapi.models.V1APIServiceSpecFluent.ServiceNested<A> withNewService();
  public io.kubernetes.client.openapi.models.V1APIServiceSpecFluent.ServiceNested<A> withNewServiceLike(io.kubernetes.client.openapi.models.ApiregistrationV1ServiceReference item);
  public io.kubernetes.client.openapi.models.V1APIServiceSpecFluent.ServiceNested<A> editService();
  public io.kubernetes.client.openapi.models.V1APIServiceSpecFluent.ServiceNested<A> editOrNewService();
  public io.kubernetes.client.openapi.models.V1APIServiceSpecFluent.ServiceNested<A> editOrNewServiceLike(io.kubernetes.client.openapi.models.ApiregistrationV1ServiceReference item);
  public java.lang.String getVersion();
  public A withVersion(java.lang.String version);
  public java.lang.Boolean hasVersion();
  
  /**
   * Method is deprecated. use withVersion instead.
   */
  @java.lang.Deprecated
  public A withNewVersion(java.lang.String arg0);
  public java.lang.Integer getVersionPriority();
  public A withVersionPriority(java.lang.Integer versionPriority);
  public java.lang.Boolean hasVersionPriority();
  public interface ServiceNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.ApiregistrationV1ServiceReferenceFluent<io.kubernetes.client.openapi.models.V1APIServiceSpecFluent.ServiceNested<N>>{
    public N and();
    public N endService();
    
  }
  
}