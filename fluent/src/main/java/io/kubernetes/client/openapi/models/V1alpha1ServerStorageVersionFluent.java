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
public interface V1alpha1ServerStorageVersionFluent<A extends V1alpha1ServerStorageVersionFluent<A>> extends Fluent<A>{
  public String getApiServerID();
  public A withApiServerID(String apiServerID);
  public Boolean hasApiServerID();
  public A addToDecodableVersions(Integer index,String item);
  public A setToDecodableVersions(Integer index,String item);
  public A addToDecodableVersions(java.lang.String... items);
  public A addAllToDecodableVersions(Collection<String> items);
  public A removeFromDecodableVersions(java.lang.String... items);
  public A removeAllFromDecodableVersions(Collection<String> items);
  public List<String> getDecodableVersions();
  public String getDecodableVersion(Integer index);
  public String getFirstDecodableVersion();
  public String getLastDecodableVersion();
  public String getMatchingDecodableVersion(Predicate<String> predicate);
  public Boolean hasMatchingDecodableVersion(Predicate<String> predicate);
  public A withDecodableVersions(List<String> decodableVersions);
  public A withDecodableVersions(java.lang.String... decodableVersions);
  public Boolean hasDecodableVersions();
  public String getEncodingVersion();
  public A withEncodingVersion(String encodingVersion);
  public Boolean hasEncodingVersion();
  
}