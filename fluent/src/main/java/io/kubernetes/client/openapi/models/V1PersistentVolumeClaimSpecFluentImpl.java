package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.List;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Collection;
import java.lang.Object;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1PersistentVolumeClaimSpecFluentImpl<A extends V1PersistentVolumeClaimSpecFluent<A>> extends BaseFluent<A> implements V1PersistentVolumeClaimSpecFluent<A>{
  public V1PersistentVolumeClaimSpecFluentImpl() {
  }
  public V1PersistentVolumeClaimSpecFluentImpl(V1PersistentVolumeClaimSpec instance) {
    this.withAccessModes(instance.getAccessModes());

    this.withDataSource(instance.getDataSource());

    this.withDataSourceRef(instance.getDataSourceRef());

    this.withResources(instance.getResources());

    this.withSelector(instance.getSelector());

    this.withStorageClassName(instance.getStorageClassName());

    this.withVolumeMode(instance.getVolumeMode());

    this.withVolumeName(instance.getVolumeName());

  }
  private List<String> accessModes;
  private V1TypedLocalObjectReferenceBuilder dataSource;
  private V1TypedLocalObjectReferenceBuilder dataSourceRef;
  private V1ResourceRequirementsBuilder resources;
  private V1LabelSelectorBuilder selector;
  private String storageClassName;
  private String volumeMode;
  private String volumeName;
  public A addToAccessModes(Integer index,String item) {
    if (this.accessModes == null) {this.accessModes = new ArrayList<String>();}
    this.accessModes.add(index, item);
    return (A)this;
  }
  public A setToAccessModes(Integer index,String item) {
    if (this.accessModes == null) {this.accessModes = new ArrayList<String>();}
    this.accessModes.set(index, item); return (A)this;
  }
  public A addToAccessModes(java.lang.String... items) {
    if (this.accessModes == null) {this.accessModes = new ArrayList<String>();}
    for (String item : items) {this.accessModes.add(item);} return (A)this;
  }
  public A addAllToAccessModes(Collection<String> items) {
    if (this.accessModes == null) {this.accessModes = new ArrayList<String>();}
    for (String item : items) {this.accessModes.add(item);} return (A)this;
  }
  public A removeFromAccessModes(java.lang.String... items) {
    for (String item : items) {if (this.accessModes!= null){ this.accessModes.remove(item);}} return (A)this;
  }
  public A removeAllFromAccessModes(Collection<String> items) {
    for (String item : items) {if (this.accessModes!= null){ this.accessModes.remove(item);}} return (A)this;
  }
  public List<String> getAccessModes() {
    return this.accessModes;
  }
  public String getAccessMode(Integer index) {
    return this.accessModes.get(index);
  }
  public String getFirstAccessMode() {
    return this.accessModes.get(0);
  }
  public String getLastAccessMode() {
    return this.accessModes.get(accessModes.size() - 1);
  }
  public String getMatchingAccessMode(Predicate<String> predicate) {
    for (String item: accessModes) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingAccessMode(Predicate<String> predicate) {
    for (String item: accessModes) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withAccessModes(List<String> accessModes) {
    if (accessModes != null) {this.accessModes = new ArrayList(); for (String item : accessModes){this.addToAccessModes(item);}} else { this.accessModes = null;} return (A) this;
  }
  public A withAccessModes(java.lang.String... accessModes) {
    if (this.accessModes != null) {this.accessModes.clear();}
    if (accessModes != null) {for (String item :accessModes){ this.addToAccessModes(item);}} return (A) this;
  }
  public Boolean hasAccessModes() {
    return accessModes != null && !accessModes.isEmpty();
  }
  
  /**
   * This method has been deprecated, please use method buildDataSource instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1TypedLocalObjectReference getDataSource() {
    return this.dataSource!=null ?this.dataSource.build():null;
  }
  public V1TypedLocalObjectReference buildDataSource() {
    return this.dataSource!=null ?this.dataSource.build():null;
  }
  public A withDataSource(V1TypedLocalObjectReference dataSource) {
    _visitables.get("dataSource").remove(this.dataSource);
    if (dataSource!=null){ this.dataSource= new V1TypedLocalObjectReferenceBuilder(dataSource); _visitables.get("dataSource").add(this.dataSource);} else { this.dataSource = null; _visitables.get("dataSource").remove(this.dataSource); } return (A) this;
  }
  public Boolean hasDataSource() {
    return this.dataSource != null;
  }
  public V1PersistentVolumeClaimSpecFluent.DataSourceNested<A> withNewDataSource() {
    return new V1PersistentVolumeClaimSpecFluentImpl.DataSourceNestedImpl();
  }
  public V1PersistentVolumeClaimSpecFluent.DataSourceNested<A> withNewDataSourceLike(V1TypedLocalObjectReference item) {
    return new V1PersistentVolumeClaimSpecFluentImpl.DataSourceNestedImpl(item);
  }
  public V1PersistentVolumeClaimSpecFluent.DataSourceNested<A> editDataSource() {
    return withNewDataSourceLike(getDataSource());
  }
  public V1PersistentVolumeClaimSpecFluent.DataSourceNested<A> editOrNewDataSource() {
    return withNewDataSourceLike(getDataSource() != null ? getDataSource(): new V1TypedLocalObjectReferenceBuilder().build());
  }
  public V1PersistentVolumeClaimSpecFluent.DataSourceNested<A> editOrNewDataSourceLike(V1TypedLocalObjectReference item) {
    return withNewDataSourceLike(getDataSource() != null ? getDataSource(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildDataSourceRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1TypedLocalObjectReference getDataSourceRef() {
    return this.dataSourceRef!=null ?this.dataSourceRef.build():null;
  }
  public V1TypedLocalObjectReference buildDataSourceRef() {
    return this.dataSourceRef!=null ?this.dataSourceRef.build():null;
  }
  public A withDataSourceRef(V1TypedLocalObjectReference dataSourceRef) {
    _visitables.get("dataSourceRef").remove(this.dataSourceRef);
    if (dataSourceRef!=null){ this.dataSourceRef= new V1TypedLocalObjectReferenceBuilder(dataSourceRef); _visitables.get("dataSourceRef").add(this.dataSourceRef);} else { this.dataSourceRef = null; _visitables.get("dataSourceRef").remove(this.dataSourceRef); } return (A) this;
  }
  public Boolean hasDataSourceRef() {
    return this.dataSourceRef != null;
  }
  public V1PersistentVolumeClaimSpecFluent.DataSourceRefNested<A> withNewDataSourceRef() {
    return new V1PersistentVolumeClaimSpecFluentImpl.DataSourceRefNestedImpl();
  }
  public V1PersistentVolumeClaimSpecFluent.DataSourceRefNested<A> withNewDataSourceRefLike(V1TypedLocalObjectReference item) {
    return new V1PersistentVolumeClaimSpecFluentImpl.DataSourceRefNestedImpl(item);
  }
  public V1PersistentVolumeClaimSpecFluent.DataSourceRefNested<A> editDataSourceRef() {
    return withNewDataSourceRefLike(getDataSourceRef());
  }
  public V1PersistentVolumeClaimSpecFluent.DataSourceRefNested<A> editOrNewDataSourceRef() {
    return withNewDataSourceRefLike(getDataSourceRef() != null ? getDataSourceRef(): new V1TypedLocalObjectReferenceBuilder().build());
  }
  public V1PersistentVolumeClaimSpecFluent.DataSourceRefNested<A> editOrNewDataSourceRefLike(V1TypedLocalObjectReference item) {
    return withNewDataSourceRefLike(getDataSourceRef() != null ? getDataSourceRef(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildResources instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ResourceRequirements getResources() {
    return this.resources!=null ?this.resources.build():null;
  }
  public V1ResourceRequirements buildResources() {
    return this.resources!=null ?this.resources.build():null;
  }
  public A withResources(V1ResourceRequirements resources) {
    _visitables.get("resources").remove(this.resources);
    if (resources!=null){ this.resources= new V1ResourceRequirementsBuilder(resources); _visitables.get("resources").add(this.resources);} else { this.resources = null; _visitables.get("resources").remove(this.resources); } return (A) this;
  }
  public Boolean hasResources() {
    return this.resources != null;
  }
  public V1PersistentVolumeClaimSpecFluent.ResourcesNested<A> withNewResources() {
    return new V1PersistentVolumeClaimSpecFluentImpl.ResourcesNestedImpl();
  }
  public V1PersistentVolumeClaimSpecFluent.ResourcesNested<A> withNewResourcesLike(V1ResourceRequirements item) {
    return new V1PersistentVolumeClaimSpecFluentImpl.ResourcesNestedImpl(item);
  }
  public V1PersistentVolumeClaimSpecFluent.ResourcesNested<A> editResources() {
    return withNewResourcesLike(getResources());
  }
  public V1PersistentVolumeClaimSpecFluent.ResourcesNested<A> editOrNewResources() {
    return withNewResourcesLike(getResources() != null ? getResources(): new V1ResourceRequirementsBuilder().build());
  }
  public V1PersistentVolumeClaimSpecFluent.ResourcesNested<A> editOrNewResourcesLike(V1ResourceRequirements item) {
    return withNewResourcesLike(getResources() != null ? getResources(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildSelector instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1LabelSelector getSelector() {
    return this.selector!=null ?this.selector.build():null;
  }
  public V1LabelSelector buildSelector() {
    return this.selector!=null ?this.selector.build():null;
  }
  public A withSelector(V1LabelSelector selector) {
    _visitables.get("selector").remove(this.selector);
    if (selector!=null){ this.selector= new V1LabelSelectorBuilder(selector); _visitables.get("selector").add(this.selector);} else { this.selector = null; _visitables.get("selector").remove(this.selector); } return (A) this;
  }
  public Boolean hasSelector() {
    return this.selector != null;
  }
  public V1PersistentVolumeClaimSpecFluent.SelectorNested<A> withNewSelector() {
    return new V1PersistentVolumeClaimSpecFluentImpl.SelectorNestedImpl();
  }
  public V1PersistentVolumeClaimSpecFluent.SelectorNested<A> withNewSelectorLike(V1LabelSelector item) {
    return new V1PersistentVolumeClaimSpecFluentImpl.SelectorNestedImpl(item);
  }
  public V1PersistentVolumeClaimSpecFluent.SelectorNested<A> editSelector() {
    return withNewSelectorLike(getSelector());
  }
  public V1PersistentVolumeClaimSpecFluent.SelectorNested<A> editOrNewSelector() {
    return withNewSelectorLike(getSelector() != null ? getSelector(): new V1LabelSelectorBuilder().build());
  }
  public V1PersistentVolumeClaimSpecFluent.SelectorNested<A> editOrNewSelectorLike(V1LabelSelector item) {
    return withNewSelectorLike(getSelector() != null ? getSelector(): item);
  }
  public String getStorageClassName() {
    return this.storageClassName;
  }
  public A withStorageClassName(String storageClassName) {
    this.storageClassName=storageClassName; return (A) this;
  }
  public Boolean hasStorageClassName() {
    return this.storageClassName != null;
  }
  public String getVolumeMode() {
    return this.volumeMode;
  }
  public A withVolumeMode(String volumeMode) {
    this.volumeMode=volumeMode; return (A) this;
  }
  public Boolean hasVolumeMode() {
    return this.volumeMode != null;
  }
  public String getVolumeName() {
    return this.volumeName;
  }
  public A withVolumeName(String volumeName) {
    this.volumeName=volumeName; return (A) this;
  }
  public Boolean hasVolumeName() {
    return this.volumeName != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1PersistentVolumeClaimSpecFluentImpl that = (V1PersistentVolumeClaimSpecFluentImpl) o;
    if (accessModes != null ? !accessModes.equals(that.accessModes) :that.accessModes != null) return false;
    if (dataSource != null ? !dataSource.equals(that.dataSource) :that.dataSource != null) return false;
    if (dataSourceRef != null ? !dataSourceRef.equals(that.dataSourceRef) :that.dataSourceRef != null) return false;
    if (resources != null ? !resources.equals(that.resources) :that.resources != null) return false;
    if (selector != null ? !selector.equals(that.selector) :that.selector != null) return false;
    if (storageClassName != null ? !storageClassName.equals(that.storageClassName) :that.storageClassName != null) return false;
    if (volumeMode != null ? !volumeMode.equals(that.volumeMode) :that.volumeMode != null) return false;
    if (volumeName != null ? !volumeName.equals(that.volumeName) :that.volumeName != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(accessModes,  dataSource,  dataSourceRef,  resources,  selector,  storageClassName,  volumeMode,  volumeName,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (accessModes != null && !accessModes.isEmpty()) { sb.append("accessModes:"); sb.append(accessModes + ","); }
    if (dataSource != null) { sb.append("dataSource:"); sb.append(dataSource + ","); }
    if (dataSourceRef != null) { sb.append("dataSourceRef:"); sb.append(dataSourceRef + ","); }
    if (resources != null) { sb.append("resources:"); sb.append(resources + ","); }
    if (selector != null) { sb.append("selector:"); sb.append(selector + ","); }
    if (storageClassName != null) { sb.append("storageClassName:"); sb.append(storageClassName + ","); }
    if (volumeMode != null) { sb.append("volumeMode:"); sb.append(volumeMode + ","); }
    if (volumeName != null) { sb.append("volumeName:"); sb.append(volumeName); }
    sb.append("}");
    return sb.toString();
  }
  class DataSourceNestedImpl<N> extends V1TypedLocalObjectReferenceFluentImpl<V1PersistentVolumeClaimSpecFluent.DataSourceNested<N>> implements V1PersistentVolumeClaimSpecFluent.DataSourceNested<N>,Nested<N>{
    DataSourceNestedImpl(V1TypedLocalObjectReference item) {
      this.builder = new V1TypedLocalObjectReferenceBuilder(this, item);
    }
    DataSourceNestedImpl() {
      this.builder = new V1TypedLocalObjectReferenceBuilder(this);
    }
    V1TypedLocalObjectReferenceBuilder builder;
    public N and() {
      return (N) V1PersistentVolumeClaimSpecFluentImpl.this.withDataSource(builder.build());
    }
    public N endDataSource() {
      return and();
    }
    
  }
  class DataSourceRefNestedImpl<N> extends V1TypedLocalObjectReferenceFluentImpl<V1PersistentVolumeClaimSpecFluent.DataSourceRefNested<N>> implements V1PersistentVolumeClaimSpecFluent.DataSourceRefNested<N>,Nested<N>{
    DataSourceRefNestedImpl(V1TypedLocalObjectReference item) {
      this.builder = new V1TypedLocalObjectReferenceBuilder(this, item);
    }
    DataSourceRefNestedImpl() {
      this.builder = new V1TypedLocalObjectReferenceBuilder(this);
    }
    V1TypedLocalObjectReferenceBuilder builder;
    public N and() {
      return (N) V1PersistentVolumeClaimSpecFluentImpl.this.withDataSourceRef(builder.build());
    }
    public N endDataSourceRef() {
      return and();
    }
    
  }
  class ResourcesNestedImpl<N> extends V1ResourceRequirementsFluentImpl<V1PersistentVolumeClaimSpecFluent.ResourcesNested<N>> implements V1PersistentVolumeClaimSpecFluent.ResourcesNested<N>,Nested<N>{
    ResourcesNestedImpl(V1ResourceRequirements item) {
      this.builder = new V1ResourceRequirementsBuilder(this, item);
    }
    ResourcesNestedImpl() {
      this.builder = new V1ResourceRequirementsBuilder(this);
    }
    V1ResourceRequirementsBuilder builder;
    public N and() {
      return (N) V1PersistentVolumeClaimSpecFluentImpl.this.withResources(builder.build());
    }
    public N endResources() {
      return and();
    }
    
  }
  class SelectorNestedImpl<N> extends V1LabelSelectorFluentImpl<V1PersistentVolumeClaimSpecFluent.SelectorNested<N>> implements V1PersistentVolumeClaimSpecFluent.SelectorNested<N>,Nested<N>{
    SelectorNestedImpl(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }
    SelectorNestedImpl() {
      this.builder = new V1LabelSelectorBuilder(this);
    }
    V1LabelSelectorBuilder builder;
    public N and() {
      return (N) V1PersistentVolumeClaimSpecFluentImpl.this.withSelector(builder.build());
    }
    public N endSelector() {
      return and();
    }
    
  }
  
}