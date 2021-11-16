package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
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
public interface V1ComponentStatusFluent<A extends io.kubernetes.client.openapi.models.V1ComponentStatusFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.String getApiVersion();
  public A withApiVersion(java.lang.String apiVersion);
  public java.lang.Boolean hasApiVersion();
  
  /**
   * Method is deprecated. use withApiVersion instead.
   */
  @java.lang.Deprecated
  public A withNewApiVersion(java.lang.String arg0);
  public A addToConditions(java.lang.Integer index,io.kubernetes.client.openapi.models.V1ComponentCondition item);
  public A setToConditions(java.lang.Integer index,io.kubernetes.client.openapi.models.V1ComponentCondition item);
  public A addToConditions(io.kubernetes.client.openapi.models.V1ComponentCondition... items);
  public A addAllToConditions(java.util.Collection<io.kubernetes.client.openapi.models.V1ComponentCondition> items);
  public A removeFromConditions(io.kubernetes.client.openapi.models.V1ComponentCondition... items);
  public A removeAllFromConditions(java.util.Collection<io.kubernetes.client.openapi.models.V1ComponentCondition> items);
  public A removeMatchingFromConditions(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ComponentConditionBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildConditions instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1ComponentCondition> getConditions();
  public java.util.List<io.kubernetes.client.openapi.models.V1ComponentCondition> buildConditions();
  public io.kubernetes.client.openapi.models.V1ComponentCondition buildCondition(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1ComponentCondition buildFirstCondition();
  public io.kubernetes.client.openapi.models.V1ComponentCondition buildLastCondition();
  public io.kubernetes.client.openapi.models.V1ComponentCondition buildMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ComponentConditionBuilder> predicate);
  public java.lang.Boolean hasMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ComponentConditionBuilder> predicate);
  public A withConditions(java.util.List<io.kubernetes.client.openapi.models.V1ComponentCondition> conditions);
  public A withConditions(io.kubernetes.client.openapi.models.V1ComponentCondition... conditions);
  public java.lang.Boolean hasConditions();
  public io.kubernetes.client.openapi.models.V1ComponentStatusFluent.ConditionsNested<A> addNewCondition();
  public io.kubernetes.client.openapi.models.V1ComponentStatusFluent.ConditionsNested<A> addNewConditionLike(io.kubernetes.client.openapi.models.V1ComponentCondition item);
  public io.kubernetes.client.openapi.models.V1ComponentStatusFluent.ConditionsNested<A> setNewConditionLike(java.lang.Integer index,io.kubernetes.client.openapi.models.V1ComponentCondition item);
  public io.kubernetes.client.openapi.models.V1ComponentStatusFluent.ConditionsNested<A> editCondition(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1ComponentStatusFluent.ConditionsNested<A> editFirstCondition();
  public io.kubernetes.client.openapi.models.V1ComponentStatusFluent.ConditionsNested<A> editLastCondition();
  public io.kubernetes.client.openapi.models.V1ComponentStatusFluent.ConditionsNested<A> editMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ComponentConditionBuilder> predicate);
  public java.lang.String getKind();
  public A withKind(java.lang.String kind);
  public java.lang.Boolean hasKind();
  
  /**
   * Method is deprecated. use withKind instead.
   */
  @java.lang.Deprecated
  public A withNewKind(java.lang.String arg0);
  
  /**
   * This method has been deprecated, please use method buildMetadata instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ObjectMeta getMetadata();
  public io.kubernetes.client.openapi.models.V1ObjectMeta buildMetadata();
  public A withMetadata(io.kubernetes.client.openapi.models.V1ObjectMeta metadata);
  public java.lang.Boolean hasMetadata();
  public io.kubernetes.client.openapi.models.V1ComponentStatusFluent.MetadataNested<A> withNewMetadata();
  public io.kubernetes.client.openapi.models.V1ComponentStatusFluent.MetadataNested<A> withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
  public io.kubernetes.client.openapi.models.V1ComponentStatusFluent.MetadataNested<A> editMetadata();
  public io.kubernetes.client.openapi.models.V1ComponentStatusFluent.MetadataNested<A> editOrNewMetadata();
  public io.kubernetes.client.openapi.models.V1ComponentStatusFluent.MetadataNested<A> editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
  public interface ConditionsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1ComponentConditionFluent<io.kubernetes.client.openapi.models.V1ComponentStatusFluent.ConditionsNested<N>>{
    public N and();
    public N endCondition();
    
  }
  public interface MetadataNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1ObjectMetaFluent<io.kubernetes.client.openapi.models.V1ComponentStatusFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  
}