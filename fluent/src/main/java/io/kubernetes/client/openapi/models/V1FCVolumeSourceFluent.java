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
public interface V1FCVolumeSourceFluent<A extends V1FCVolumeSourceFluent<A>> extends Fluent<A>{
  public String getFsType();
  public A withFsType(String fsType);
  public Boolean hasFsType();
  public Integer getLun();
  public A withLun(Integer lun);
  public Boolean hasLun();
  public Boolean getReadOnly();
  public A withReadOnly(Boolean readOnly);
  public Boolean hasReadOnly();
  public A addToTargetWWNs(Integer index,String item);
  public A setToTargetWWNs(Integer index,String item);
  public A addToTargetWWNs(java.lang.String... items);
  public A addAllToTargetWWNs(Collection<String> items);
  public A removeFromTargetWWNs(java.lang.String... items);
  public A removeAllFromTargetWWNs(Collection<String> items);
  public List<String> getTargetWWNs();
  public String getTargetWWN(Integer index);
  public String getFirstTargetWWN();
  public String getLastTargetWWN();
  public String getMatchingTargetWWN(Predicate<String> predicate);
  public Boolean hasMatchingTargetWWN(Predicate<String> predicate);
  public A withTargetWWNs(List<String> targetWWNs);
  public A withTargetWWNs(java.lang.String... targetWWNs);
  public Boolean hasTargetWWNs();
  public A addToWwids(Integer index,String item);
  public A setToWwids(Integer index,String item);
  public A addToWwids(java.lang.String... items);
  public A addAllToWwids(Collection<String> items);
  public A removeFromWwids(java.lang.String... items);
  public A removeAllFromWwids(Collection<String> items);
  public List<String> getWwids();
  public String getWwid(Integer index);
  public String getFirstWwid();
  public String getLastWwid();
  public String getMatchingWwid(Predicate<String> predicate);
  public Boolean hasMatchingWwid(Predicate<String> predicate);
  public A withWwids(List<String> wwids);
  public A withWwids(java.lang.String... wwids);
  public Boolean hasWwids();
  public A withReadOnly();
  
}