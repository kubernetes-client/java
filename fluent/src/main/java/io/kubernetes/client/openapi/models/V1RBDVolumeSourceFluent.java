package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1RBDVolumeSourceFluent<A extends V1RBDVolumeSourceFluent<A>> extends Fluent<A>{
  public String getFsType();
  public A withFsType(String fsType);
  public Boolean hasFsType();
  public String getImage();
  public A withImage(String image);
  public Boolean hasImage();
  public String getKeyring();
  public A withKeyring(String keyring);
  public Boolean hasKeyring();
  public A addToMonitors(Integer index,String item);
  public A setToMonitors(Integer index,String item);
  public A addToMonitors(java.lang.String... items);
  public A addAllToMonitors(Collection<String> items);
  public A removeFromMonitors(java.lang.String... items);
  public A removeAllFromMonitors(Collection<String> items);
  public List<String> getMonitors();
  public String getMonitor(Integer index);
  public String getFirstMonitor();
  public String getLastMonitor();
  public String getMatchingMonitor(Predicate<String> predicate);
  public Boolean hasMatchingMonitor(Predicate<String> predicate);
  public A withMonitors(List<String> monitors);
  public A withMonitors(java.lang.String... monitors);
  public Boolean hasMonitors();
  public String getPool();
  public A withPool(String pool);
  public Boolean hasPool();
  public Boolean getReadOnly();
  public A withReadOnly(Boolean readOnly);
  public Boolean hasReadOnly();
  
  /**
   * This method has been deprecated, please use method buildSecretRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1LocalObjectReference getSecretRef();
  public V1LocalObjectReference buildSecretRef();
  public A withSecretRef(V1LocalObjectReference secretRef);
  public Boolean hasSecretRef();
  public V1RBDVolumeSourceFluent.SecretRefNested<A> withNewSecretRef();
  public V1RBDVolumeSourceFluent.SecretRefNested<A> withNewSecretRefLike(V1LocalObjectReference item);
  public V1RBDVolumeSourceFluent.SecretRefNested<A> editSecretRef();
  public V1RBDVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRef();
  public V1RBDVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRefLike(V1LocalObjectReference item);
  public String getUser();
  public A withUser(String user);
  public Boolean hasUser();
  public A withReadOnly();
  public interface SecretRefNested<N> extends Nested<N>,V1LocalObjectReferenceFluent<V1RBDVolumeSourceFluent.SecretRefNested<N>>{
    public N and();
    public N endSecretRef();
    
  }
  
}