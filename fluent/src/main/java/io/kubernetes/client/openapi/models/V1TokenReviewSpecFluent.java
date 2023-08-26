package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
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
public interface V1TokenReviewSpecFluent<A extends V1TokenReviewSpecFluent<A>> extends Fluent<A>{
  public A addToAudiences(int index,String item);
  public A setToAudiences(int index,String item);
  public A addToAudiences(java.lang.String... items);
  public A addAllToAudiences(Collection<String> items);
  public A removeFromAudiences(java.lang.String... items);
  public A removeAllFromAudiences(Collection<String> items);
  public List<String> getAudiences();
  public String getAudience(int index);
  public String getFirstAudience();
  public String getLastAudience();
  public String getMatchingAudience(Predicate<String> predicate);
  public Boolean hasMatchingAudience(Predicate<String> predicate);
  public A withAudiences(List<String> audiences);
  public A withAudiences(java.lang.String... audiences);
  public Boolean hasAudiences();
  public String getToken();
  public A withToken(String token);
  public Boolean hasToken();
  
}