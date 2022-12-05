package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1SelfSubjectRulesReviewSpecFluent<A extends V1SelfSubjectRulesReviewSpecFluent<A>> extends Fluent<A>{
  public String getNamespace();
  public A withNamespace(String namespace);
  public Boolean hasNamespace();
  
}