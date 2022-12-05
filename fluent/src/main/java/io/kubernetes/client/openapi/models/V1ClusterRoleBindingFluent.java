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
public interface V1ClusterRoleBindingFluent<A extends V1ClusterRoleBindingFluent<A>> extends Fluent<A>{
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
  public V1ClusterRoleBindingFluent.MetadataNested<A> withNewMetadata();
  public V1ClusterRoleBindingFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);
  public V1ClusterRoleBindingFluent.MetadataNested<A> editMetadata();
  public V1ClusterRoleBindingFluent.MetadataNested<A> editOrNewMetadata();
  public V1ClusterRoleBindingFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);
  
  /**
   * This method has been deprecated, please use method buildRoleRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1RoleRef getRoleRef();
  public V1RoleRef buildRoleRef();
  public A withRoleRef(V1RoleRef roleRef);
  public Boolean hasRoleRef();
  public V1ClusterRoleBindingFluent.RoleRefNested<A> withNewRoleRef();
  public V1ClusterRoleBindingFluent.RoleRefNested<A> withNewRoleRefLike(V1RoleRef item);
  public V1ClusterRoleBindingFluent.RoleRefNested<A> editRoleRef();
  public V1ClusterRoleBindingFluent.RoleRefNested<A> editOrNewRoleRef();
  public V1ClusterRoleBindingFluent.RoleRefNested<A> editOrNewRoleRefLike(V1RoleRef item);
  public A addToSubjects(Integer index,V1Subject item);
  public A setToSubjects(Integer index,V1Subject item);
  public A addToSubjects(io.kubernetes.client.openapi.models.V1Subject... items);
  public A addAllToSubjects(Collection<V1Subject> items);
  public A removeFromSubjects(io.kubernetes.client.openapi.models.V1Subject... items);
  public A removeAllFromSubjects(Collection<V1Subject> items);
  public A removeMatchingFromSubjects(Predicate<V1SubjectBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildSubjects instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1Subject> getSubjects();
  public List<V1Subject> buildSubjects();
  public V1Subject buildSubject(Integer index);
  public V1Subject buildFirstSubject();
  public V1Subject buildLastSubject();
  public V1Subject buildMatchingSubject(Predicate<V1SubjectBuilder> predicate);
  public Boolean hasMatchingSubject(Predicate<V1SubjectBuilder> predicate);
  public A withSubjects(List<V1Subject> subjects);
  public A withSubjects(io.kubernetes.client.openapi.models.V1Subject... subjects);
  public Boolean hasSubjects();
  public V1ClusterRoleBindingFluent.SubjectsNested<A> addNewSubject();
  public V1ClusterRoleBindingFluent.SubjectsNested<A> addNewSubjectLike(V1Subject item);
  public V1ClusterRoleBindingFluent.SubjectsNested<A> setNewSubjectLike(Integer index,V1Subject item);
  public V1ClusterRoleBindingFluent.SubjectsNested<A> editSubject(Integer index);
  public V1ClusterRoleBindingFluent.SubjectsNested<A> editFirstSubject();
  public V1ClusterRoleBindingFluent.SubjectsNested<A> editLastSubject();
  public V1ClusterRoleBindingFluent.SubjectsNested<A> editMatchingSubject(Predicate<V1SubjectBuilder> predicate);
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V1ClusterRoleBindingFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface RoleRefNested<N> extends Nested<N>,V1RoleRefFluent<V1ClusterRoleBindingFluent.RoleRefNested<N>>{
    public N and();
    public N endRoleRef();
    
  }
  public interface SubjectsNested<N> extends Nested<N>,V1SubjectFluent<V1ClusterRoleBindingFluent.SubjectsNested<N>>{
    public N and();
    public N endSubject();
    
  }
  
}