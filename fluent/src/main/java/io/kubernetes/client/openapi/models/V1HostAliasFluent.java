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
public interface V1HostAliasFluent<A extends V1HostAliasFluent<A>> extends Fluent<A>{
  public A addToHostnames(Integer index,String item);
  public A setToHostnames(Integer index,String item);
  public A addToHostnames(java.lang.String... items);
  public A addAllToHostnames(Collection<String> items);
  public A removeFromHostnames(java.lang.String... items);
  public A removeAllFromHostnames(Collection<String> items);
  public List<String> getHostnames();
  public String getHostname(Integer index);
  public String getFirstHostname();
  public String getLastHostname();
  public String getMatchingHostname(Predicate<String> predicate);
  public Boolean hasMatchingHostname(Predicate<String> predicate);
  public A withHostnames(List<String> hostnames);
  public A withHostnames(java.lang.String... hostnames);
  public Boolean hasHostnames();
  public String getIp();
  public A withIp(String ip);
  public Boolean hasIp();
  
}