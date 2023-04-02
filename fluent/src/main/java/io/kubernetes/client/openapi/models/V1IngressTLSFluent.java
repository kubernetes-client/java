package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import io.kubernetes.client.fluent.Fluent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.lang.String;
import java.lang.Boolean;
import java.util.function.Predicate;

 /**
  * Generated
  */
public interface V1IngressTLSFluent<A extends V1IngressTLSFluent<A>> extends Fluent<A>{
  public A addToHosts(Integer index,String item);
  public A setToHosts(Integer index,String item);
  public A addToHosts(java.lang.String... items);
  public A addAllToHosts(Collection<String> items);
  public A removeFromHosts(java.lang.String... items);
  public A removeAllFromHosts(Collection<String> items);
  public List<String> getHosts();
  public String getHost(Integer index);
  public String getFirstHost();
  public String getLastHost();
  public String getMatchingHost(Predicate<String> predicate);
  public Boolean hasMatchingHost(Predicate<String> predicate);
  public A withHosts(List<String> hosts);
  public A withHosts(java.lang.String... hosts);
  public Boolean hasHosts();
  public String getSecretName();
  public A withSecretName(String secretName);
  public Boolean hasSecretName();
  
}