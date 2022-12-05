package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;
import java.util.LinkedHashMap;

 /**
  * Generated
  */
public interface V1ReplicationControllerSpecFluent<A extends V1ReplicationControllerSpecFluent<A>> extends Fluent<A>{
  public Integer getMinReadySeconds();
  public A withMinReadySeconds(Integer minReadySeconds);
  public Boolean hasMinReadySeconds();
  public Integer getReplicas();
  public A withReplicas(Integer replicas);
  public Boolean hasReplicas();
  public A addToSelector(String key,String value);
  public A addToSelector(Map<String,String> map);
  public A removeFromSelector(String key);
  public A removeFromSelector(Map<String,String> map);
  public Map<String,String> getSelector();
  public <K,V>A withSelector(Map<String,String> selector);
  public Boolean hasSelector();
  
  /**
   * This method has been deprecated, please use method buildTemplate instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1PodTemplateSpec getTemplate();
  public V1PodTemplateSpec buildTemplate();
  public A withTemplate(V1PodTemplateSpec template);
  public Boolean hasTemplate();
  public V1ReplicationControllerSpecFluent.TemplateNested<A> withNewTemplate();
  public V1ReplicationControllerSpecFluent.TemplateNested<A> withNewTemplateLike(V1PodTemplateSpec item);
  public V1ReplicationControllerSpecFluent.TemplateNested<A> editTemplate();
  public V1ReplicationControllerSpecFluent.TemplateNested<A> editOrNewTemplate();
  public V1ReplicationControllerSpecFluent.TemplateNested<A> editOrNewTemplateLike(V1PodTemplateSpec item);
  public interface TemplateNested<N> extends Nested<N>,V1PodTemplateSpecFluent<V1ReplicationControllerSpecFluent.TemplateNested<N>>{
    public N and();
    public N endTemplate();
    
  }
  
}