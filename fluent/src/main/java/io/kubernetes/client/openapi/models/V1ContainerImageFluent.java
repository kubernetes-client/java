package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import io.kubernetes.client.fluent.Fluent;
import java.lang.Long;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.lang.String;
import java.lang.Boolean;
import java.util.function.Predicate;

 /**
  * Generated
  */
public interface V1ContainerImageFluent<A extends V1ContainerImageFluent<A>> extends Fluent<A>{
  public A addToNames(Integer index,String item);
  public A setToNames(Integer index,String item);
  public A addToNames(java.lang.String... items);
  public A addAllToNames(Collection<String> items);
  public A removeFromNames(java.lang.String... items);
  public A removeAllFromNames(Collection<String> items);
  public List<String> getNames();
  public String getName(Integer index);
  public String getFirstName();
  public String getLastName();
  public String getMatchingName(Predicate<String> predicate);
  public Boolean hasMatchingName(Predicate<String> predicate);
  public A withNames(List<String> names);
  public A withNames(java.lang.String... names);
  public Boolean hasNames();
  public Long getSizeBytes();
  public A withSizeBytes(Long sizeBytes);
  public Boolean hasSizeBytes();
  
}