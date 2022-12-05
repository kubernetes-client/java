package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1StorageClassFluentImpl<A extends V1StorageClassFluent<A>> extends BaseFluent<A> implements V1StorageClassFluent<A>{
  public V1StorageClassFluentImpl() {
  }
  public V1StorageClassFluentImpl(V1StorageClass instance) {
    this.withAllowVolumeExpansion(instance.getAllowVolumeExpansion());

    this.withAllowedTopologies(instance.getAllowedTopologies());

    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withMountOptions(instance.getMountOptions());

    this.withParameters(instance.getParameters());

    this.withProvisioner(instance.getProvisioner());

    this.withReclaimPolicy(instance.getReclaimPolicy());

    this.withVolumeBindingMode(instance.getVolumeBindingMode());

  }
  private Boolean allowVolumeExpansion;
  private ArrayList<V1TopologySelectorTermBuilder> allowedTopologies;
  private String apiVersion;
  private String kind;
  private V1ObjectMetaBuilder metadata;
  private List<String> mountOptions;
  private Map<String,String> parameters;
  private String provisioner;
  private String reclaimPolicy;
  private String volumeBindingMode;
  public Boolean getAllowVolumeExpansion() {
    return this.allowVolumeExpansion;
  }
  public A withAllowVolumeExpansion(Boolean allowVolumeExpansion) {
    this.allowVolumeExpansion=allowVolumeExpansion; return (A) this;
  }
  public Boolean hasAllowVolumeExpansion() {
    return this.allowVolumeExpansion != null;
  }
  public A addToAllowedTopologies(Integer index,V1TopologySelectorTerm item) {
    if (this.allowedTopologies == null) {this.allowedTopologies = new ArrayList<V1TopologySelectorTermBuilder>();}
    V1TopologySelectorTermBuilder builder = new V1TopologySelectorTermBuilder(item);_visitables.get("allowedTopologies").add(index >= 0 ? index : _visitables.get("allowedTopologies").size(), builder);this.allowedTopologies.add(index >= 0 ? index : allowedTopologies.size(), builder); return (A)this;
  }
  public A setToAllowedTopologies(Integer index,V1TopologySelectorTerm item) {
    if (this.allowedTopologies == null) {this.allowedTopologies = new ArrayList<V1TopologySelectorTermBuilder>();}
    V1TopologySelectorTermBuilder builder = new V1TopologySelectorTermBuilder(item);
    if (index < 0 || index >= _visitables.get("allowedTopologies").size()) { _visitables.get("allowedTopologies").add(builder); } else { _visitables.get("allowedTopologies").set(index, builder);}
    if (index < 0 || index >= allowedTopologies.size()) { allowedTopologies.add(builder); } else { allowedTopologies.set(index, builder);}
     return (A)this;
  }
  public A addToAllowedTopologies(io.kubernetes.client.openapi.models.V1TopologySelectorTerm... items) {
    if (this.allowedTopologies == null) {this.allowedTopologies = new ArrayList<V1TopologySelectorTermBuilder>();}
    for (V1TopologySelectorTerm item : items) {V1TopologySelectorTermBuilder builder = new V1TopologySelectorTermBuilder(item);_visitables.get("allowedTopologies").add(builder);this.allowedTopologies.add(builder);} return (A)this;
  }
  public A addAllToAllowedTopologies(Collection<V1TopologySelectorTerm> items) {
    if (this.allowedTopologies == null) {this.allowedTopologies = new ArrayList<V1TopologySelectorTermBuilder>();}
    for (V1TopologySelectorTerm item : items) {V1TopologySelectorTermBuilder builder = new V1TopologySelectorTermBuilder(item);_visitables.get("allowedTopologies").add(builder);this.allowedTopologies.add(builder);} return (A)this;
  }
  public A removeFromAllowedTopologies(io.kubernetes.client.openapi.models.V1TopologySelectorTerm... items) {
    for (V1TopologySelectorTerm item : items) {V1TopologySelectorTermBuilder builder = new V1TopologySelectorTermBuilder(item);_visitables.get("allowedTopologies").remove(builder);if (this.allowedTopologies != null) {this.allowedTopologies.remove(builder);}} return (A)this;
  }
  public A removeAllFromAllowedTopologies(Collection<V1TopologySelectorTerm> items) {
    for (V1TopologySelectorTerm item : items) {V1TopologySelectorTermBuilder builder = new V1TopologySelectorTermBuilder(item);_visitables.get("allowedTopologies").remove(builder);if (this.allowedTopologies != null) {this.allowedTopologies.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromAllowedTopologies(Predicate<V1TopologySelectorTermBuilder> predicate) {
    if (allowedTopologies == null) return (A) this;
    final Iterator<V1TopologySelectorTermBuilder> each = allowedTopologies.iterator();
    final List visitables = _visitables.get("allowedTopologies");
    while (each.hasNext()) {
      V1TopologySelectorTermBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildAllowedTopologies instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1TopologySelectorTerm> getAllowedTopologies() {
    return allowedTopologies != null ? build(allowedTopologies) : null;
  }
  public List<V1TopologySelectorTerm> buildAllowedTopologies() {
    return allowedTopologies != null ? build(allowedTopologies) : null;
  }
  public V1TopologySelectorTerm buildAllowedTopology(Integer index) {
    return this.allowedTopologies.get(index).build();
  }
  public V1TopologySelectorTerm buildFirstAllowedTopology() {
    return this.allowedTopologies.get(0).build();
  }
  public V1TopologySelectorTerm buildLastAllowedTopology() {
    return this.allowedTopologies.get(allowedTopologies.size() - 1).build();
  }
  public V1TopologySelectorTerm buildMatchingAllowedTopology(Predicate<V1TopologySelectorTermBuilder> predicate) {
    for (V1TopologySelectorTermBuilder item: allowedTopologies) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingAllowedTopology(Predicate<V1TopologySelectorTermBuilder> predicate) {
    for (V1TopologySelectorTermBuilder item: allowedTopologies) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withAllowedTopologies(List<V1TopologySelectorTerm> allowedTopologies) {
    if (this.allowedTopologies != null) { _visitables.get("allowedTopologies").removeAll(this.allowedTopologies);}
    if (allowedTopologies != null) {this.allowedTopologies = new ArrayList(); for (V1TopologySelectorTerm item : allowedTopologies){this.addToAllowedTopologies(item);}} else { this.allowedTopologies = null;} return (A) this;
  }
  public A withAllowedTopologies(io.kubernetes.client.openapi.models.V1TopologySelectorTerm... allowedTopologies) {
    if (this.allowedTopologies != null) {this.allowedTopologies.clear();}
    if (allowedTopologies != null) {for (V1TopologySelectorTerm item :allowedTopologies){ this.addToAllowedTopologies(item);}} return (A) this;
  }
  public Boolean hasAllowedTopologies() {
    return allowedTopologies != null && !allowedTopologies.isEmpty();
  }
  public V1StorageClassFluent.AllowedTopologiesNested<A> addNewAllowedTopology() {
    return new V1StorageClassFluentImpl.AllowedTopologiesNestedImpl();
  }
  public V1StorageClassFluent.AllowedTopologiesNested<A> addNewAllowedTopologyLike(V1TopologySelectorTerm item) {
    return new V1StorageClassFluentImpl.AllowedTopologiesNestedImpl(-1, item);
  }
  public V1StorageClassFluent.AllowedTopologiesNested<A> setNewAllowedTopologyLike(Integer index,V1TopologySelectorTerm item) {
    return new V1StorageClassFluentImpl.AllowedTopologiesNestedImpl(index, item);
  }
  public V1StorageClassFluent.AllowedTopologiesNested<A> editAllowedTopology(Integer index) {
    if (allowedTopologies.size() <= index) throw new RuntimeException("Can't edit allowedTopologies. Index exceeds size.");
    return setNewAllowedTopologyLike(index, buildAllowedTopology(index));
  }
  public V1StorageClassFluent.AllowedTopologiesNested<A> editFirstAllowedTopology() {
    if (allowedTopologies.size() == 0) throw new RuntimeException("Can't edit first allowedTopologies. The list is empty.");
    return setNewAllowedTopologyLike(0, buildAllowedTopology(0));
  }
  public V1StorageClassFluent.AllowedTopologiesNested<A> editLastAllowedTopology() {
    int index = allowedTopologies.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last allowedTopologies. The list is empty.");
    return setNewAllowedTopologyLike(index, buildAllowedTopology(index));
  }
  public V1StorageClassFluent.AllowedTopologiesNested<A> editMatchingAllowedTopology(Predicate<V1TopologySelectorTermBuilder> predicate) {
    int index = -1;
    for (int i=0;i<allowedTopologies.size();i++) { 
    if (predicate.test(allowedTopologies.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching allowedTopologies. No match found.");
    return setNewAllowedTopologyLike(index, buildAllowedTopology(index));
  }
  public String getApiVersion() {
    return this.apiVersion;
  }
  public A withApiVersion(String apiVersion) {
    this.apiVersion=apiVersion; return (A) this;
  }
  public Boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  public String getKind() {
    return this.kind;
  }
  public A withKind(String kind) {
    this.kind=kind; return (A) this;
  }
  public Boolean hasKind() {
    return this.kind != null;
  }
  
  /**
   * This method has been deprecated, please use method buildMetadata instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectMeta getMetadata() {
    return this.metadata!=null ?this.metadata.build():null;
  }
  public V1ObjectMeta buildMetadata() {
    return this.metadata!=null ?this.metadata.build():null;
  }
  public A withMetadata(V1ObjectMeta metadata) {
    _visitables.get("metadata").remove(this.metadata);
    if (metadata!=null){ this.metadata= new V1ObjectMetaBuilder(metadata); _visitables.get("metadata").add(this.metadata);} else { this.metadata = null; _visitables.get("metadata").remove(this.metadata); } return (A) this;
  }
  public Boolean hasMetadata() {
    return this.metadata != null;
  }
  public V1StorageClassFluent.MetadataNested<A> withNewMetadata() {
    return new V1StorageClassFluentImpl.MetadataNestedImpl();
  }
  public V1StorageClassFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item) {
    return new V1StorageClassFluentImpl.MetadataNestedImpl(item);
  }
  public V1StorageClassFluent.MetadataNested<A> editMetadata() {
    return withNewMetadataLike(getMetadata());
  }
  public V1StorageClassFluent.MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): new V1ObjectMetaBuilder().build());
  }
  public V1StorageClassFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
  }
  public A addToMountOptions(Integer index,String item) {
    if (this.mountOptions == null) {this.mountOptions = new ArrayList<String>();}
    this.mountOptions.add(index, item);
    return (A)this;
  }
  public A setToMountOptions(Integer index,String item) {
    if (this.mountOptions == null) {this.mountOptions = new ArrayList<String>();}
    this.mountOptions.set(index, item); return (A)this;
  }
  public A addToMountOptions(java.lang.String... items) {
    if (this.mountOptions == null) {this.mountOptions = new ArrayList<String>();}
    for (String item : items) {this.mountOptions.add(item);} return (A)this;
  }
  public A addAllToMountOptions(Collection<String> items) {
    if (this.mountOptions == null) {this.mountOptions = new ArrayList<String>();}
    for (String item : items) {this.mountOptions.add(item);} return (A)this;
  }
  public A removeFromMountOptions(java.lang.String... items) {
    for (String item : items) {if (this.mountOptions!= null){ this.mountOptions.remove(item);}} return (A)this;
  }
  public A removeAllFromMountOptions(Collection<String> items) {
    for (String item : items) {if (this.mountOptions!= null){ this.mountOptions.remove(item);}} return (A)this;
  }
  public List<String> getMountOptions() {
    return this.mountOptions;
  }
  public String getMountOption(Integer index) {
    return this.mountOptions.get(index);
  }
  public String getFirstMountOption() {
    return this.mountOptions.get(0);
  }
  public String getLastMountOption() {
    return this.mountOptions.get(mountOptions.size() - 1);
  }
  public String getMatchingMountOption(Predicate<String> predicate) {
    for (String item: mountOptions) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingMountOption(Predicate<String> predicate) {
    for (String item: mountOptions) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withMountOptions(List<String> mountOptions) {
    if (mountOptions != null) {this.mountOptions = new ArrayList(); for (String item : mountOptions){this.addToMountOptions(item);}} else { this.mountOptions = null;} return (A) this;
  }
  public A withMountOptions(java.lang.String... mountOptions) {
    if (this.mountOptions != null) {this.mountOptions.clear();}
    if (mountOptions != null) {for (String item :mountOptions){ this.addToMountOptions(item);}} return (A) this;
  }
  public Boolean hasMountOptions() {
    return mountOptions != null && !mountOptions.isEmpty();
  }
  public A addToParameters(String key,String value) {
    if(this.parameters == null && key != null && value != null) { this.parameters = new LinkedHashMap(); }
    if(key != null && value != null) {this.parameters.put(key, value);} return (A)this;
  }
  public A addToParameters(Map<String,String> map) {
    if(this.parameters == null && map != null) { this.parameters = new LinkedHashMap(); }
    if(map != null) { this.parameters.putAll(map);} return (A)this;
  }
  public A removeFromParameters(String key) {
    if(this.parameters == null) { return (A) this; }
    if(key != null && this.parameters != null) {this.parameters.remove(key);} return (A)this;
  }
  public A removeFromParameters(Map<String,String> map) {
    if(this.parameters == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.parameters != null){this.parameters.remove(key);}}} return (A)this;
  }
  public Map<String,String> getParameters() {
    return this.parameters;
  }
  public <K,V>A withParameters(Map<String,String> parameters) {
    if (parameters == null) { this.parameters =  null;} else {this.parameters = new LinkedHashMap(parameters);} return (A) this;
  }
  public Boolean hasParameters() {
    return this.parameters != null;
  }
  public String getProvisioner() {
    return this.provisioner;
  }
  public A withProvisioner(String provisioner) {
    this.provisioner=provisioner; return (A) this;
  }
  public Boolean hasProvisioner() {
    return this.provisioner != null;
  }
  public String getReclaimPolicy() {
    return this.reclaimPolicy;
  }
  public A withReclaimPolicy(String reclaimPolicy) {
    this.reclaimPolicy=reclaimPolicy; return (A) this;
  }
  public Boolean hasReclaimPolicy() {
    return this.reclaimPolicy != null;
  }
  public String getVolumeBindingMode() {
    return this.volumeBindingMode;
  }
  public A withVolumeBindingMode(String volumeBindingMode) {
    this.volumeBindingMode=volumeBindingMode; return (A) this;
  }
  public Boolean hasVolumeBindingMode() {
    return this.volumeBindingMode != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1StorageClassFluentImpl that = (V1StorageClassFluentImpl) o;
    if (allowVolumeExpansion != null ? !allowVolumeExpansion.equals(that.allowVolumeExpansion) :that.allowVolumeExpansion != null) return false;
    if (allowedTopologies != null ? !allowedTopologies.equals(that.allowedTopologies) :that.allowedTopologies != null) return false;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
    if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
    if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
    if (mountOptions != null ? !mountOptions.equals(that.mountOptions) :that.mountOptions != null) return false;
    if (parameters != null ? !parameters.equals(that.parameters) :that.parameters != null) return false;
    if (provisioner != null ? !provisioner.equals(that.provisioner) :that.provisioner != null) return false;
    if (reclaimPolicy != null ? !reclaimPolicy.equals(that.reclaimPolicy) :that.reclaimPolicy != null) return false;
    if (volumeBindingMode != null ? !volumeBindingMode.equals(that.volumeBindingMode) :that.volumeBindingMode != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(allowVolumeExpansion,  allowedTopologies,  apiVersion,  kind,  metadata,  mountOptions,  parameters,  provisioner,  reclaimPolicy,  volumeBindingMode,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (allowVolumeExpansion != null) { sb.append("allowVolumeExpansion:"); sb.append(allowVolumeExpansion + ","); }
    if (allowedTopologies != null && !allowedTopologies.isEmpty()) { sb.append("allowedTopologies:"); sb.append(allowedTopologies + ","); }
    if (apiVersion != null) { sb.append("apiVersion:"); sb.append(apiVersion + ","); }
    if (kind != null) { sb.append("kind:"); sb.append(kind + ","); }
    if (metadata != null) { sb.append("metadata:"); sb.append(metadata + ","); }
    if (mountOptions != null && !mountOptions.isEmpty()) { sb.append("mountOptions:"); sb.append(mountOptions + ","); }
    if (parameters != null && !parameters.isEmpty()) { sb.append("parameters:"); sb.append(parameters + ","); }
    if (provisioner != null) { sb.append("provisioner:"); sb.append(provisioner + ","); }
    if (reclaimPolicy != null) { sb.append("reclaimPolicy:"); sb.append(reclaimPolicy + ","); }
    if (volumeBindingMode != null) { sb.append("volumeBindingMode:"); sb.append(volumeBindingMode); }
    sb.append("}");
    return sb.toString();
  }
  public A withAllowVolumeExpansion() {
    return withAllowVolumeExpansion(true);
  }
  class AllowedTopologiesNestedImpl<N> extends V1TopologySelectorTermFluentImpl<V1StorageClassFluent.AllowedTopologiesNested<N>> implements V1StorageClassFluent.AllowedTopologiesNested<N>,Nested<N>{
    AllowedTopologiesNestedImpl(Integer index,V1TopologySelectorTerm item) {
      this.index = index;
      this.builder = new V1TopologySelectorTermBuilder(this, item);
    }
    AllowedTopologiesNestedImpl() {
      this.index = -1;
      this.builder = new V1TopologySelectorTermBuilder(this);
    }
    V1TopologySelectorTermBuilder builder;
    Integer index;
    public N and() {
      return (N) V1StorageClassFluentImpl.this.setToAllowedTopologies(index,builder.build());
    }
    public N endAllowedTopology() {
      return and();
    }
    
  }
  class MetadataNestedImpl<N> extends V1ObjectMetaFluentImpl<V1StorageClassFluent.MetadataNested<N>> implements V1StorageClassFluent.MetadataNested<N>,Nested<N>{
    MetadataNestedImpl(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
    MetadataNestedImpl() {
      this.builder = new V1ObjectMetaBuilder(this);
    }
    V1ObjectMetaBuilder builder;
    public N and() {
      return (N) V1StorageClassFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata() {
      return and();
    }
    
  }
  
}