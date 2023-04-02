package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1RoleFluent<A extends V1RoleFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(String apiVersion);
  public Boolean hasApiVersion();
  public String getKind();
  public A withKind(String kind);
  public Boolean hasKind();
  
  /**
   * This method has been deprecated, please use method buildMetadata instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectMeta getMetadata();
  public V1ObjectMeta buildMetadata();
  public A withMetadata(V1ObjectMeta metadata);
  public Boolean hasMetadata();
  public V1RoleFluent.MetadataNested<A> withNewMetadata();
  public V1RoleFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);
  public V1RoleFluent.MetadataNested<A> editMetadata();
  public V1RoleFluent.MetadataNested<A> editOrNewMetadata();
  public V1RoleFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);
  public A addToRules(Integer index,V1PolicyRule item);
  public A setToRules(Integer index,V1PolicyRule item);
  public A addToRules(io.kubernetes.client.openapi.models.V1PolicyRule... items);
  public A addAllToRules(Collection<V1PolicyRule> items);
  public A removeFromRules(io.kubernetes.client.openapi.models.V1PolicyRule... items);
  public A removeAllFromRules(Collection<V1PolicyRule> items);
  public A removeMatchingFromRules(Predicate<V1PolicyRuleBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildRules instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1PolicyRule> getRules();
  public List<V1PolicyRule> buildRules();
  public V1PolicyRule buildRule(Integer index);
  public V1PolicyRule buildFirstRule();
  public V1PolicyRule buildLastRule();
  public V1PolicyRule buildMatchingRule(Predicate<V1PolicyRuleBuilder> predicate);
  public Boolean hasMatchingRule(Predicate<V1PolicyRuleBuilder> predicate);
  public A withRules(List<V1PolicyRule> rules);
  public A withRules(io.kubernetes.client.openapi.models.V1PolicyRule... rules);
  public Boolean hasRules();
  public V1RoleFluent.RulesNested<A> addNewRule();
  public V1RoleFluent.RulesNested<A> addNewRuleLike(V1PolicyRule item);
  public V1RoleFluent.RulesNested<A> setNewRuleLike(Integer index,V1PolicyRule item);
  public V1RoleFluent.RulesNested<A> editRule(Integer index);
  public V1RoleFluent.RulesNested<A> editFirstRule();
  public V1RoleFluent.RulesNested<A> editLastRule();
  public V1RoleFluent.RulesNested<A> editMatchingRule(Predicate<V1PolicyRuleBuilder> predicate);
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V1RoleFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface RulesNested<N> extends Nested<N>,V1PolicyRuleFluent<V1RoleFluent.RulesNested<N>>{
    public N and();
    public N endRule();
    
  }
  
}