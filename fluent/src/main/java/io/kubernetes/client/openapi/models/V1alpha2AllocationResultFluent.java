package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1alpha2AllocationResultFluent<A extends V1alpha2AllocationResultFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildAvailableOnNodes instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1NodeSelector getAvailableOnNodes();
  public V1NodeSelector buildAvailableOnNodes();
  public A withAvailableOnNodes(V1NodeSelector availableOnNodes);
  public Boolean hasAvailableOnNodes();
  public V1alpha2AllocationResultFluent.AvailableOnNodesNested<A> withNewAvailableOnNodes();
  public V1alpha2AllocationResultFluent.AvailableOnNodesNested<A> withNewAvailableOnNodesLike(V1NodeSelector item);
  public V1alpha2AllocationResultFluent.AvailableOnNodesNested<A> editAvailableOnNodes();
  public V1alpha2AllocationResultFluent.AvailableOnNodesNested<A> editOrNewAvailableOnNodes();
  public V1alpha2AllocationResultFluent.AvailableOnNodesNested<A> editOrNewAvailableOnNodesLike(V1NodeSelector item);
  public A addToResourceHandles(int index,V1alpha2ResourceHandle item);
  public A setToResourceHandles(int index,V1alpha2ResourceHandle item);
  public A addToResourceHandles(io.kubernetes.client.openapi.models.V1alpha2ResourceHandle... items);
  public A addAllToResourceHandles(Collection<V1alpha2ResourceHandle> items);
  public A removeFromResourceHandles(io.kubernetes.client.openapi.models.V1alpha2ResourceHandle... items);
  public A removeAllFromResourceHandles(Collection<V1alpha2ResourceHandle> items);
  public A removeMatchingFromResourceHandles(Predicate<V1alpha2ResourceHandleBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildResourceHandles instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1alpha2ResourceHandle> getResourceHandles();
  public List<V1alpha2ResourceHandle> buildResourceHandles();
  public V1alpha2ResourceHandle buildResourceHandle(int index);
  public V1alpha2ResourceHandle buildFirstResourceHandle();
  public V1alpha2ResourceHandle buildLastResourceHandle();
  public V1alpha2ResourceHandle buildMatchingResourceHandle(Predicate<V1alpha2ResourceHandleBuilder> predicate);
  public Boolean hasMatchingResourceHandle(Predicate<V1alpha2ResourceHandleBuilder> predicate);
  public A withResourceHandles(List<V1alpha2ResourceHandle> resourceHandles);
  public A withResourceHandles(io.kubernetes.client.openapi.models.V1alpha2ResourceHandle... resourceHandles);
  public Boolean hasResourceHandles();
  public V1alpha2AllocationResultFluent.ResourceHandlesNested<A> addNewResourceHandle();
  public V1alpha2AllocationResultFluent.ResourceHandlesNested<A> addNewResourceHandleLike(V1alpha2ResourceHandle item);
  public V1alpha2AllocationResultFluent.ResourceHandlesNested<A> setNewResourceHandleLike(int index,V1alpha2ResourceHandle item);
  public V1alpha2AllocationResultFluent.ResourceHandlesNested<A> editResourceHandle(int index);
  public V1alpha2AllocationResultFluent.ResourceHandlesNested<A> editFirstResourceHandle();
  public V1alpha2AllocationResultFluent.ResourceHandlesNested<A> editLastResourceHandle();
  public V1alpha2AllocationResultFluent.ResourceHandlesNested<A> editMatchingResourceHandle(Predicate<V1alpha2ResourceHandleBuilder> predicate);
  public Boolean getShareable();
  public A withShareable(Boolean shareable);
  public Boolean hasShareable();
  public A withShareable();
  public interface AvailableOnNodesNested<N> extends Nested<N>,V1NodeSelectorFluent<V1alpha2AllocationResultFluent.AvailableOnNodesNested<N>>{
    public N and();
    public N endAvailableOnNodes();
    
  }
  public interface ResourceHandlesNested<N> extends Nested<N>,V1alpha2ResourceHandleFluent<V1alpha2AllocationResultFluent.ResourceHandlesNested<N>>{
    public N and();
    public N endResourceHandle();
    
  }
  
}