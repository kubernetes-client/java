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
public interface V1StatusDetailsFluent<A extends io.kubernetes.client.openapi.models.V1StatusDetailsFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public A addToCauses(java.lang.Integer index,io.kubernetes.client.openapi.models.V1StatusCause item);
  public A setToCauses(java.lang.Integer index,io.kubernetes.client.openapi.models.V1StatusCause item);
  public A addToCauses(io.kubernetes.client.openapi.models.V1StatusCause... items);
  public A addAllToCauses(java.util.Collection<io.kubernetes.client.openapi.models.V1StatusCause> items);
  public A removeFromCauses(io.kubernetes.client.openapi.models.V1StatusCause... items);
  public A removeAllFromCauses(java.util.Collection<io.kubernetes.client.openapi.models.V1StatusCause> items);
  public A removeMatchingFromCauses(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1StatusCauseBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildCauses instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1StatusCause> getCauses();
  public java.util.List<io.kubernetes.client.openapi.models.V1StatusCause> buildCauses();
  public io.kubernetes.client.openapi.models.V1StatusCause buildCause(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1StatusCause buildFirstCause();
  public io.kubernetes.client.openapi.models.V1StatusCause buildLastCause();
  public io.kubernetes.client.openapi.models.V1StatusCause buildMatchingCause(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1StatusCauseBuilder> predicate);
  public java.lang.Boolean hasMatchingCause(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1StatusCauseBuilder> predicate);
  public A withCauses(java.util.List<io.kubernetes.client.openapi.models.V1StatusCause> causes);
  public A withCauses(io.kubernetes.client.openapi.models.V1StatusCause... causes);
  public java.lang.Boolean hasCauses();
  public io.kubernetes.client.openapi.models.V1StatusDetailsFluent.CausesNested<A> addNewCause();
  public io.kubernetes.client.openapi.models.V1StatusDetailsFluent.CausesNested<A> addNewCauseLike(io.kubernetes.client.openapi.models.V1StatusCause item);
  public io.kubernetes.client.openapi.models.V1StatusDetailsFluent.CausesNested<A> setNewCauseLike(java.lang.Integer index,io.kubernetes.client.openapi.models.V1StatusCause item);
  public io.kubernetes.client.openapi.models.V1StatusDetailsFluent.CausesNested<A> editCause(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1StatusDetailsFluent.CausesNested<A> editFirstCause();
  public io.kubernetes.client.openapi.models.V1StatusDetailsFluent.CausesNested<A> editLastCause();
  public io.kubernetes.client.openapi.models.V1StatusDetailsFluent.CausesNested<A> editMatchingCause(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1StatusCauseBuilder> predicate);
  public java.lang.String getGroup();
  public A withGroup(java.lang.String group);
  public java.lang.Boolean hasGroup();
  
  /**
   * Method is deprecated. use withGroup instead.
   */
  @java.lang.Deprecated
  public A withNewGroup(java.lang.String arg0);
  public java.lang.String getKind();
  public A withKind(java.lang.String kind);
  public java.lang.Boolean hasKind();
  
  /**
   * Method is deprecated. use withKind instead.
   */
  @java.lang.Deprecated
  public A withNewKind(java.lang.String arg0);
  public java.lang.String getName();
  public A withName(java.lang.String name);
  public java.lang.Boolean hasName();
  
  /**
   * Method is deprecated. use withName instead.
   */
  @java.lang.Deprecated
  public A withNewName(java.lang.String arg0);
  public java.lang.Integer getRetryAfterSeconds();
  public A withRetryAfterSeconds(java.lang.Integer retryAfterSeconds);
  public java.lang.Boolean hasRetryAfterSeconds();
  public java.lang.String getUid();
  public A withUid(java.lang.String uid);
  public java.lang.Boolean hasUid();
  
  /**
   * Method is deprecated. use withUid instead.
   */
  @java.lang.Deprecated
  public A withNewUid(java.lang.String arg0);
  public interface CausesNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1StatusCauseFluent<io.kubernetes.client.openapi.models.V1StatusDetailsFluent.CausesNested<N>>{
    public N and();
    public N endCause();
    
  }
  
}