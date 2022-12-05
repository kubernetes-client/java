package io.kubernetes.client.openapi.models;

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
public interface V1APIServiceSpecFluent<A extends V1APIServiceSpecFluent<A>> extends Fluent<A>{
  public A withCaBundle(byte... caBundle);
  public byte[] getCaBundle();
  public A addToCaBundle(Integer index,Byte item);
  public A setToCaBundle(Integer index,Byte item);
  public A addToCaBundle(java.lang.Byte... items);
  public A addAllToCaBundle(Collection<Byte> items);
  public A removeFromCaBundle(java.lang.Byte... items);
  public A removeAllFromCaBundle(Collection<Byte> items);
  public Boolean hasCaBundle();
  public String getGroup();
  public A withGroup(String group);
  public Boolean hasGroup();
  public Integer getGroupPriorityMinimum();
  public A withGroupPriorityMinimum(Integer groupPriorityMinimum);
  public Boolean hasGroupPriorityMinimum();
  public Boolean getInsecureSkipTLSVerify();
  public A withInsecureSkipTLSVerify(Boolean insecureSkipTLSVerify);
  public Boolean hasInsecureSkipTLSVerify();
  
  /**
   * This method has been deprecated, please use method buildService instead.
   * @return The buildable object.
   */
  @Deprecated
  public ApiregistrationV1ServiceReference getService();
  public ApiregistrationV1ServiceReference buildService();
  public A withService(ApiregistrationV1ServiceReference service);
  public Boolean hasService();
  public V1APIServiceSpecFluent.ServiceNested<A> withNewService();
  public V1APIServiceSpecFluent.ServiceNested<A> withNewServiceLike(ApiregistrationV1ServiceReference item);
  public V1APIServiceSpecFluent.ServiceNested<A> editService();
  public V1APIServiceSpecFluent.ServiceNested<A> editOrNewService();
  public V1APIServiceSpecFluent.ServiceNested<A> editOrNewServiceLike(ApiregistrationV1ServiceReference item);
  public String getVersion();
  public A withVersion(String version);
  public Boolean hasVersion();
  public Integer getVersionPriority();
  public A withVersionPriority(Integer versionPriority);
  public Boolean hasVersionPriority();
  public A withInsecureSkipTLSVerify();
  public interface ServiceNested<N> extends Nested<N>,ApiregistrationV1ServiceReferenceFluent<V1APIServiceSpecFluent.ServiceNested<N>>{
    public N and();
    public N endService();
    
  }
  
}