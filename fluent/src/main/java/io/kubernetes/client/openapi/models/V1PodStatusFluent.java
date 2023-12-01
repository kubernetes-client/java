package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.List;
import java.time.OffsetDateTime;
import java.util.Collection;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1PodStatusFluent<A extends V1PodStatusFluent<A>> extends BaseFluent<A>{
  public V1PodStatusFluent() {
  }
  
  public V1PodStatusFluent(V1PodStatus instance) {
    this.copyInstance(instance);
  }
  private ArrayList<V1PodConditionBuilder> conditions;
  private ArrayList<V1ContainerStatusBuilder> containerStatuses;
  private ArrayList<V1ContainerStatusBuilder> ephemeralContainerStatuses;
  private String hostIP;
  private ArrayList<V1HostIPBuilder> hostIPs;
  private ArrayList<V1ContainerStatusBuilder> initContainerStatuses;
  private String message;
  private String nominatedNodeName;
  private String phase;
  private String podIP;
  private ArrayList<V1PodIPBuilder> podIPs;
  private String qosClass;
  private String reason;
  private String resize;
  private ArrayList<V1PodResourceClaimStatusBuilder> resourceClaimStatuses;
  private OffsetDateTime startTime;
  
  protected void copyInstance(V1PodStatus instance) {
    instance = (instance != null ? instance : new V1PodStatus());
    if (instance != null) {
          this.withConditions(instance.getConditions());
          this.withContainerStatuses(instance.getContainerStatuses());
          this.withEphemeralContainerStatuses(instance.getEphemeralContainerStatuses());
          this.withHostIP(instance.getHostIP());
          this.withHostIPs(instance.getHostIPs());
          this.withInitContainerStatuses(instance.getInitContainerStatuses());
          this.withMessage(instance.getMessage());
          this.withNominatedNodeName(instance.getNominatedNodeName());
          this.withPhase(instance.getPhase());
          this.withPodIP(instance.getPodIP());
          this.withPodIPs(instance.getPodIPs());
          this.withQosClass(instance.getQosClass());
          this.withReason(instance.getReason());
          this.withResize(instance.getResize());
          this.withResourceClaimStatuses(instance.getResourceClaimStatuses());
          this.withStartTime(instance.getStartTime());
        }
  }
  
  public A addToConditions(int index,V1PodCondition item) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1PodConditionBuilder>();}
    V1PodConditionBuilder builder = new V1PodConditionBuilder(item);
    if (index < 0 || index >= conditions.size()) { _visitables.get("conditions").add(builder); conditions.add(builder); } else { _visitables.get("conditions").add(index, builder); conditions.add(index, builder);}
    return (A)this;
  }
  
  public A setToConditions(int index,V1PodCondition item) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1PodConditionBuilder>();}
    V1PodConditionBuilder builder = new V1PodConditionBuilder(item);
    if (index < 0 || index >= conditions.size()) { _visitables.get("conditions").add(builder); conditions.add(builder); } else { _visitables.get("conditions").set(index, builder); conditions.set(index, builder);}
    return (A)this;
  }
  
  public A addToConditions(io.kubernetes.client.openapi.models.V1PodCondition... items) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1PodConditionBuilder>();}
    for (V1PodCondition item : items) {V1PodConditionBuilder builder = new V1PodConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  
  public A addAllToConditions(Collection<V1PodCondition> items) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1PodConditionBuilder>();}
    for (V1PodCondition item : items) {V1PodConditionBuilder builder = new V1PodConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  
  public A removeFromConditions(io.kubernetes.client.openapi.models.V1PodCondition... items) {
    if (this.conditions == null) return (A)this;
    for (V1PodCondition item : items) {V1PodConditionBuilder builder = new V1PodConditionBuilder(item);_visitables.get("conditions").remove(builder); this.conditions.remove(builder);} return (A)this;
  }
  
  public A removeAllFromConditions(Collection<V1PodCondition> items) {
    if (this.conditions == null) return (A)this;
    for (V1PodCondition item : items) {V1PodConditionBuilder builder = new V1PodConditionBuilder(item);_visitables.get("conditions").remove(builder); this.conditions.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromConditions(Predicate<V1PodConditionBuilder> predicate) {
    if (conditions == null) return (A) this;
    final Iterator<V1PodConditionBuilder> each = conditions.iterator();
    final List visitables = _visitables.get("conditions");
    while (each.hasNext()) {
      V1PodConditionBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1PodCondition> buildConditions() {
    return this.conditions != null ? build(conditions) : null;
  }
  
  public V1PodCondition buildCondition(int index) {
    return this.conditions.get(index).build();
  }
  
  public V1PodCondition buildFirstCondition() {
    return this.conditions.get(0).build();
  }
  
  public V1PodCondition buildLastCondition() {
    return this.conditions.get(conditions.size() - 1).build();
  }
  
  public V1PodCondition buildMatchingCondition(Predicate<V1PodConditionBuilder> predicate) {
      for (V1PodConditionBuilder item : conditions) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingCondition(Predicate<V1PodConditionBuilder> predicate) {
      for (V1PodConditionBuilder item : conditions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withConditions(List<V1PodCondition> conditions) {
    if (this.conditions != null) {
      this._visitables.get("conditions").clear();
    }
    if (conditions != null) {
        this.conditions = new ArrayList();
        for (V1PodCondition item : conditions) {
          this.addToConditions(item);
        }
    } else {
      this.conditions = null;
    }
    return (A) this;
  }
  
  public A withConditions(io.kubernetes.client.openapi.models.V1PodCondition... conditions) {
    if (this.conditions != null) {
        this.conditions.clear();
        _visitables.remove("conditions");
    }
    if (conditions != null) {
      for (V1PodCondition item : conditions) {
        this.addToConditions(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasConditions() {
    return this.conditions != null && !this.conditions.isEmpty();
  }
  
  public ConditionsNested<A> addNewCondition() {
    return new ConditionsNested(-1, null);
  }
  
  public ConditionsNested<A> addNewConditionLike(V1PodCondition item) {
    return new ConditionsNested(-1, item);
  }
  
  public ConditionsNested<A> setNewConditionLike(int index,V1PodCondition item) {
    return new ConditionsNested(index, item);
  }
  
  public ConditionsNested<A> editCondition(int index) {
    if (conditions.size() <= index) throw new RuntimeException("Can't edit conditions. Index exceeds size.");
    return setNewConditionLike(index, buildCondition(index));
  }
  
  public ConditionsNested<A> editFirstCondition() {
    if (conditions.size() == 0) throw new RuntimeException("Can't edit first conditions. The list is empty.");
    return setNewConditionLike(0, buildCondition(0));
  }
  
  public ConditionsNested<A> editLastCondition() {
    int index = conditions.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
    return setNewConditionLike(index, buildCondition(index));
  }
  
  public ConditionsNested<A> editMatchingCondition(Predicate<V1PodConditionBuilder> predicate) {
    int index = -1;
    for (int i=0;i<conditions.size();i++) { 
    if (predicate.test(conditions.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching conditions. No match found.");
    return setNewConditionLike(index, buildCondition(index));
  }
  
  public A addToContainerStatuses(int index,V1ContainerStatus item) {
    if (this.containerStatuses == null) {this.containerStatuses = new ArrayList<V1ContainerStatusBuilder>();}
    V1ContainerStatusBuilder builder = new V1ContainerStatusBuilder(item);
    if (index < 0 || index >= containerStatuses.size()) { _visitables.get("containerStatuses").add(builder); containerStatuses.add(builder); } else { _visitables.get("containerStatuses").add(index, builder); containerStatuses.add(index, builder);}
    return (A)this;
  }
  
  public A setToContainerStatuses(int index,V1ContainerStatus item) {
    if (this.containerStatuses == null) {this.containerStatuses = new ArrayList<V1ContainerStatusBuilder>();}
    V1ContainerStatusBuilder builder = new V1ContainerStatusBuilder(item);
    if (index < 0 || index >= containerStatuses.size()) { _visitables.get("containerStatuses").add(builder); containerStatuses.add(builder); } else { _visitables.get("containerStatuses").set(index, builder); containerStatuses.set(index, builder);}
    return (A)this;
  }
  
  public A addToContainerStatuses(io.kubernetes.client.openapi.models.V1ContainerStatus... items) {
    if (this.containerStatuses == null) {this.containerStatuses = new ArrayList<V1ContainerStatusBuilder>();}
    for (V1ContainerStatus item : items) {V1ContainerStatusBuilder builder = new V1ContainerStatusBuilder(item);_visitables.get("containerStatuses").add(builder);this.containerStatuses.add(builder);} return (A)this;
  }
  
  public A addAllToContainerStatuses(Collection<V1ContainerStatus> items) {
    if (this.containerStatuses == null) {this.containerStatuses = new ArrayList<V1ContainerStatusBuilder>();}
    for (V1ContainerStatus item : items) {V1ContainerStatusBuilder builder = new V1ContainerStatusBuilder(item);_visitables.get("containerStatuses").add(builder);this.containerStatuses.add(builder);} return (A)this;
  }
  
  public A removeFromContainerStatuses(io.kubernetes.client.openapi.models.V1ContainerStatus... items) {
    if (this.containerStatuses == null) return (A)this;
    for (V1ContainerStatus item : items) {V1ContainerStatusBuilder builder = new V1ContainerStatusBuilder(item);_visitables.get("containerStatuses").remove(builder); this.containerStatuses.remove(builder);} return (A)this;
  }
  
  public A removeAllFromContainerStatuses(Collection<V1ContainerStatus> items) {
    if (this.containerStatuses == null) return (A)this;
    for (V1ContainerStatus item : items) {V1ContainerStatusBuilder builder = new V1ContainerStatusBuilder(item);_visitables.get("containerStatuses").remove(builder); this.containerStatuses.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromContainerStatuses(Predicate<V1ContainerStatusBuilder> predicate) {
    if (containerStatuses == null) return (A) this;
    final Iterator<V1ContainerStatusBuilder> each = containerStatuses.iterator();
    final List visitables = _visitables.get("containerStatuses");
    while (each.hasNext()) {
      V1ContainerStatusBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1ContainerStatus> buildContainerStatuses() {
    return this.containerStatuses != null ? build(containerStatuses) : null;
  }
  
  public V1ContainerStatus buildContainerStatus(int index) {
    return this.containerStatuses.get(index).build();
  }
  
  public V1ContainerStatus buildFirstContainerStatus() {
    return this.containerStatuses.get(0).build();
  }
  
  public V1ContainerStatus buildLastContainerStatus() {
    return this.containerStatuses.get(containerStatuses.size() - 1).build();
  }
  
  public V1ContainerStatus buildMatchingContainerStatus(Predicate<V1ContainerStatusBuilder> predicate) {
      for (V1ContainerStatusBuilder item : containerStatuses) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingContainerStatus(Predicate<V1ContainerStatusBuilder> predicate) {
      for (V1ContainerStatusBuilder item : containerStatuses) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withContainerStatuses(List<V1ContainerStatus> containerStatuses) {
    if (this.containerStatuses != null) {
      this._visitables.get("containerStatuses").clear();
    }
    if (containerStatuses != null) {
        this.containerStatuses = new ArrayList();
        for (V1ContainerStatus item : containerStatuses) {
          this.addToContainerStatuses(item);
        }
    } else {
      this.containerStatuses = null;
    }
    return (A) this;
  }
  
  public A withContainerStatuses(io.kubernetes.client.openapi.models.V1ContainerStatus... containerStatuses) {
    if (this.containerStatuses != null) {
        this.containerStatuses.clear();
        _visitables.remove("containerStatuses");
    }
    if (containerStatuses != null) {
      for (V1ContainerStatus item : containerStatuses) {
        this.addToContainerStatuses(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasContainerStatuses() {
    return this.containerStatuses != null && !this.containerStatuses.isEmpty();
  }
  
  public ContainerStatusesNested<A> addNewContainerStatus() {
    return new ContainerStatusesNested(-1, null);
  }
  
  public ContainerStatusesNested<A> addNewContainerStatusLike(V1ContainerStatus item) {
    return new ContainerStatusesNested(-1, item);
  }
  
  public ContainerStatusesNested<A> setNewContainerStatusLike(int index,V1ContainerStatus item) {
    return new ContainerStatusesNested(index, item);
  }
  
  public ContainerStatusesNested<A> editContainerStatus(int index) {
    if (containerStatuses.size() <= index) throw new RuntimeException("Can't edit containerStatuses. Index exceeds size.");
    return setNewContainerStatusLike(index, buildContainerStatus(index));
  }
  
  public ContainerStatusesNested<A> editFirstContainerStatus() {
    if (containerStatuses.size() == 0) throw new RuntimeException("Can't edit first containerStatuses. The list is empty.");
    return setNewContainerStatusLike(0, buildContainerStatus(0));
  }
  
  public ContainerStatusesNested<A> editLastContainerStatus() {
    int index = containerStatuses.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last containerStatuses. The list is empty.");
    return setNewContainerStatusLike(index, buildContainerStatus(index));
  }
  
  public ContainerStatusesNested<A> editMatchingContainerStatus(Predicate<V1ContainerStatusBuilder> predicate) {
    int index = -1;
    for (int i=0;i<containerStatuses.size();i++) { 
    if (predicate.test(containerStatuses.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching containerStatuses. No match found.");
    return setNewContainerStatusLike(index, buildContainerStatus(index));
  }
  
  public A addToEphemeralContainerStatuses(int index,V1ContainerStatus item) {
    if (this.ephemeralContainerStatuses == null) {this.ephemeralContainerStatuses = new ArrayList<V1ContainerStatusBuilder>();}
    V1ContainerStatusBuilder builder = new V1ContainerStatusBuilder(item);
    if (index < 0 || index >= ephemeralContainerStatuses.size()) { _visitables.get("ephemeralContainerStatuses").add(builder); ephemeralContainerStatuses.add(builder); } else { _visitables.get("ephemeralContainerStatuses").add(index, builder); ephemeralContainerStatuses.add(index, builder);}
    return (A)this;
  }
  
  public A setToEphemeralContainerStatuses(int index,V1ContainerStatus item) {
    if (this.ephemeralContainerStatuses == null) {this.ephemeralContainerStatuses = new ArrayList<V1ContainerStatusBuilder>();}
    V1ContainerStatusBuilder builder = new V1ContainerStatusBuilder(item);
    if (index < 0 || index >= ephemeralContainerStatuses.size()) { _visitables.get("ephemeralContainerStatuses").add(builder); ephemeralContainerStatuses.add(builder); } else { _visitables.get("ephemeralContainerStatuses").set(index, builder); ephemeralContainerStatuses.set(index, builder);}
    return (A)this;
  }
  
  public A addToEphemeralContainerStatuses(io.kubernetes.client.openapi.models.V1ContainerStatus... items) {
    if (this.ephemeralContainerStatuses == null) {this.ephemeralContainerStatuses = new ArrayList<V1ContainerStatusBuilder>();}
    for (V1ContainerStatus item : items) {V1ContainerStatusBuilder builder = new V1ContainerStatusBuilder(item);_visitables.get("ephemeralContainerStatuses").add(builder);this.ephemeralContainerStatuses.add(builder);} return (A)this;
  }
  
  public A addAllToEphemeralContainerStatuses(Collection<V1ContainerStatus> items) {
    if (this.ephemeralContainerStatuses == null) {this.ephemeralContainerStatuses = new ArrayList<V1ContainerStatusBuilder>();}
    for (V1ContainerStatus item : items) {V1ContainerStatusBuilder builder = new V1ContainerStatusBuilder(item);_visitables.get("ephemeralContainerStatuses").add(builder);this.ephemeralContainerStatuses.add(builder);} return (A)this;
  }
  
  public A removeFromEphemeralContainerStatuses(io.kubernetes.client.openapi.models.V1ContainerStatus... items) {
    if (this.ephemeralContainerStatuses == null) return (A)this;
    for (V1ContainerStatus item : items) {V1ContainerStatusBuilder builder = new V1ContainerStatusBuilder(item);_visitables.get("ephemeralContainerStatuses").remove(builder); this.ephemeralContainerStatuses.remove(builder);} return (A)this;
  }
  
  public A removeAllFromEphemeralContainerStatuses(Collection<V1ContainerStatus> items) {
    if (this.ephemeralContainerStatuses == null) return (A)this;
    for (V1ContainerStatus item : items) {V1ContainerStatusBuilder builder = new V1ContainerStatusBuilder(item);_visitables.get("ephemeralContainerStatuses").remove(builder); this.ephemeralContainerStatuses.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromEphemeralContainerStatuses(Predicate<V1ContainerStatusBuilder> predicate) {
    if (ephemeralContainerStatuses == null) return (A) this;
    final Iterator<V1ContainerStatusBuilder> each = ephemeralContainerStatuses.iterator();
    final List visitables = _visitables.get("ephemeralContainerStatuses");
    while (each.hasNext()) {
      V1ContainerStatusBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1ContainerStatus> buildEphemeralContainerStatuses() {
    return this.ephemeralContainerStatuses != null ? build(ephemeralContainerStatuses) : null;
  }
  
  public V1ContainerStatus buildEphemeralContainerStatus(int index) {
    return this.ephemeralContainerStatuses.get(index).build();
  }
  
  public V1ContainerStatus buildFirstEphemeralContainerStatus() {
    return this.ephemeralContainerStatuses.get(0).build();
  }
  
  public V1ContainerStatus buildLastEphemeralContainerStatus() {
    return this.ephemeralContainerStatuses.get(ephemeralContainerStatuses.size() - 1).build();
  }
  
  public V1ContainerStatus buildMatchingEphemeralContainerStatus(Predicate<V1ContainerStatusBuilder> predicate) {
      for (V1ContainerStatusBuilder item : ephemeralContainerStatuses) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingEphemeralContainerStatus(Predicate<V1ContainerStatusBuilder> predicate) {
      for (V1ContainerStatusBuilder item : ephemeralContainerStatuses) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withEphemeralContainerStatuses(List<V1ContainerStatus> ephemeralContainerStatuses) {
    if (this.ephemeralContainerStatuses != null) {
      this._visitables.get("ephemeralContainerStatuses").clear();
    }
    if (ephemeralContainerStatuses != null) {
        this.ephemeralContainerStatuses = new ArrayList();
        for (V1ContainerStatus item : ephemeralContainerStatuses) {
          this.addToEphemeralContainerStatuses(item);
        }
    } else {
      this.ephemeralContainerStatuses = null;
    }
    return (A) this;
  }
  
  public A withEphemeralContainerStatuses(io.kubernetes.client.openapi.models.V1ContainerStatus... ephemeralContainerStatuses) {
    if (this.ephemeralContainerStatuses != null) {
        this.ephemeralContainerStatuses.clear();
        _visitables.remove("ephemeralContainerStatuses");
    }
    if (ephemeralContainerStatuses != null) {
      for (V1ContainerStatus item : ephemeralContainerStatuses) {
        this.addToEphemeralContainerStatuses(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasEphemeralContainerStatuses() {
    return this.ephemeralContainerStatuses != null && !this.ephemeralContainerStatuses.isEmpty();
  }
  
  public EphemeralContainerStatusesNested<A> addNewEphemeralContainerStatus() {
    return new EphemeralContainerStatusesNested(-1, null);
  }
  
  public EphemeralContainerStatusesNested<A> addNewEphemeralContainerStatusLike(V1ContainerStatus item) {
    return new EphemeralContainerStatusesNested(-1, item);
  }
  
  public EphemeralContainerStatusesNested<A> setNewEphemeralContainerStatusLike(int index,V1ContainerStatus item) {
    return new EphemeralContainerStatusesNested(index, item);
  }
  
  public EphemeralContainerStatusesNested<A> editEphemeralContainerStatus(int index) {
    if (ephemeralContainerStatuses.size() <= index) throw new RuntimeException("Can't edit ephemeralContainerStatuses. Index exceeds size.");
    return setNewEphemeralContainerStatusLike(index, buildEphemeralContainerStatus(index));
  }
  
  public EphemeralContainerStatusesNested<A> editFirstEphemeralContainerStatus() {
    if (ephemeralContainerStatuses.size() == 0) throw new RuntimeException("Can't edit first ephemeralContainerStatuses. The list is empty.");
    return setNewEphemeralContainerStatusLike(0, buildEphemeralContainerStatus(0));
  }
  
  public EphemeralContainerStatusesNested<A> editLastEphemeralContainerStatus() {
    int index = ephemeralContainerStatuses.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last ephemeralContainerStatuses. The list is empty.");
    return setNewEphemeralContainerStatusLike(index, buildEphemeralContainerStatus(index));
  }
  
  public EphemeralContainerStatusesNested<A> editMatchingEphemeralContainerStatus(Predicate<V1ContainerStatusBuilder> predicate) {
    int index = -1;
    for (int i=0;i<ephemeralContainerStatuses.size();i++) { 
    if (predicate.test(ephemeralContainerStatuses.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching ephemeralContainerStatuses. No match found.");
    return setNewEphemeralContainerStatusLike(index, buildEphemeralContainerStatus(index));
  }
  
  public String getHostIP() {
    return this.hostIP;
  }
  
  public A withHostIP(String hostIP) {
    this.hostIP = hostIP;
    return (A) this;
  }
  
  public boolean hasHostIP() {
    return this.hostIP != null;
  }
  
  public A addToHostIPs(int index,V1HostIP item) {
    if (this.hostIPs == null) {this.hostIPs = new ArrayList<V1HostIPBuilder>();}
    V1HostIPBuilder builder = new V1HostIPBuilder(item);
    if (index < 0 || index >= hostIPs.size()) { _visitables.get("hostIPs").add(builder); hostIPs.add(builder); } else { _visitables.get("hostIPs").add(index, builder); hostIPs.add(index, builder);}
    return (A)this;
  }
  
  public A setToHostIPs(int index,V1HostIP item) {
    if (this.hostIPs == null) {this.hostIPs = new ArrayList<V1HostIPBuilder>();}
    V1HostIPBuilder builder = new V1HostIPBuilder(item);
    if (index < 0 || index >= hostIPs.size()) { _visitables.get("hostIPs").add(builder); hostIPs.add(builder); } else { _visitables.get("hostIPs").set(index, builder); hostIPs.set(index, builder);}
    return (A)this;
  }
  
  public A addToHostIPs(io.kubernetes.client.openapi.models.V1HostIP... items) {
    if (this.hostIPs == null) {this.hostIPs = new ArrayList<V1HostIPBuilder>();}
    for (V1HostIP item : items) {V1HostIPBuilder builder = new V1HostIPBuilder(item);_visitables.get("hostIPs").add(builder);this.hostIPs.add(builder);} return (A)this;
  }
  
  public A addAllToHostIPs(Collection<V1HostIP> items) {
    if (this.hostIPs == null) {this.hostIPs = new ArrayList<V1HostIPBuilder>();}
    for (V1HostIP item : items) {V1HostIPBuilder builder = new V1HostIPBuilder(item);_visitables.get("hostIPs").add(builder);this.hostIPs.add(builder);} return (A)this;
  }
  
  public A removeFromHostIPs(io.kubernetes.client.openapi.models.V1HostIP... items) {
    if (this.hostIPs == null) return (A)this;
    for (V1HostIP item : items) {V1HostIPBuilder builder = new V1HostIPBuilder(item);_visitables.get("hostIPs").remove(builder); this.hostIPs.remove(builder);} return (A)this;
  }
  
  public A removeAllFromHostIPs(Collection<V1HostIP> items) {
    if (this.hostIPs == null) return (A)this;
    for (V1HostIP item : items) {V1HostIPBuilder builder = new V1HostIPBuilder(item);_visitables.get("hostIPs").remove(builder); this.hostIPs.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromHostIPs(Predicate<V1HostIPBuilder> predicate) {
    if (hostIPs == null) return (A) this;
    final Iterator<V1HostIPBuilder> each = hostIPs.iterator();
    final List visitables = _visitables.get("hostIPs");
    while (each.hasNext()) {
      V1HostIPBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1HostIP> buildHostIPs() {
    return this.hostIPs != null ? build(hostIPs) : null;
  }
  
  public V1HostIP buildHostIP(int index) {
    return this.hostIPs.get(index).build();
  }
  
  public V1HostIP buildFirstHostIP() {
    return this.hostIPs.get(0).build();
  }
  
  public V1HostIP buildLastHostIP() {
    return this.hostIPs.get(hostIPs.size() - 1).build();
  }
  
  public V1HostIP buildMatchingHostIP(Predicate<V1HostIPBuilder> predicate) {
      for (V1HostIPBuilder item : hostIPs) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingHostIP(Predicate<V1HostIPBuilder> predicate) {
      for (V1HostIPBuilder item : hostIPs) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withHostIPs(List<V1HostIP> hostIPs) {
    if (this.hostIPs != null) {
      this._visitables.get("hostIPs").clear();
    }
    if (hostIPs != null) {
        this.hostIPs = new ArrayList();
        for (V1HostIP item : hostIPs) {
          this.addToHostIPs(item);
        }
    } else {
      this.hostIPs = null;
    }
    return (A) this;
  }
  
  public A withHostIPs(io.kubernetes.client.openapi.models.V1HostIP... hostIPs) {
    if (this.hostIPs != null) {
        this.hostIPs.clear();
        _visitables.remove("hostIPs");
    }
    if (hostIPs != null) {
      for (V1HostIP item : hostIPs) {
        this.addToHostIPs(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasHostIPs() {
    return this.hostIPs != null && !this.hostIPs.isEmpty();
  }
  
  public HostIPsNested<A> addNewHostIP() {
    return new HostIPsNested(-1, null);
  }
  
  public HostIPsNested<A> addNewHostIPLike(V1HostIP item) {
    return new HostIPsNested(-1, item);
  }
  
  public HostIPsNested<A> setNewHostIPLike(int index,V1HostIP item) {
    return new HostIPsNested(index, item);
  }
  
  public HostIPsNested<A> editHostIP(int index) {
    if (hostIPs.size() <= index) throw new RuntimeException("Can't edit hostIPs. Index exceeds size.");
    return setNewHostIPLike(index, buildHostIP(index));
  }
  
  public HostIPsNested<A> editFirstHostIP() {
    if (hostIPs.size() == 0) throw new RuntimeException("Can't edit first hostIPs. The list is empty.");
    return setNewHostIPLike(0, buildHostIP(0));
  }
  
  public HostIPsNested<A> editLastHostIP() {
    int index = hostIPs.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last hostIPs. The list is empty.");
    return setNewHostIPLike(index, buildHostIP(index));
  }
  
  public HostIPsNested<A> editMatchingHostIP(Predicate<V1HostIPBuilder> predicate) {
    int index = -1;
    for (int i=0;i<hostIPs.size();i++) { 
    if (predicate.test(hostIPs.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching hostIPs. No match found.");
    return setNewHostIPLike(index, buildHostIP(index));
  }
  
  public A addToInitContainerStatuses(int index,V1ContainerStatus item) {
    if (this.initContainerStatuses == null) {this.initContainerStatuses = new ArrayList<V1ContainerStatusBuilder>();}
    V1ContainerStatusBuilder builder = new V1ContainerStatusBuilder(item);
    if (index < 0 || index >= initContainerStatuses.size()) { _visitables.get("initContainerStatuses").add(builder); initContainerStatuses.add(builder); } else { _visitables.get("initContainerStatuses").add(index, builder); initContainerStatuses.add(index, builder);}
    return (A)this;
  }
  
  public A setToInitContainerStatuses(int index,V1ContainerStatus item) {
    if (this.initContainerStatuses == null) {this.initContainerStatuses = new ArrayList<V1ContainerStatusBuilder>();}
    V1ContainerStatusBuilder builder = new V1ContainerStatusBuilder(item);
    if (index < 0 || index >= initContainerStatuses.size()) { _visitables.get("initContainerStatuses").add(builder); initContainerStatuses.add(builder); } else { _visitables.get("initContainerStatuses").set(index, builder); initContainerStatuses.set(index, builder);}
    return (A)this;
  }
  
  public A addToInitContainerStatuses(io.kubernetes.client.openapi.models.V1ContainerStatus... items) {
    if (this.initContainerStatuses == null) {this.initContainerStatuses = new ArrayList<V1ContainerStatusBuilder>();}
    for (V1ContainerStatus item : items) {V1ContainerStatusBuilder builder = new V1ContainerStatusBuilder(item);_visitables.get("initContainerStatuses").add(builder);this.initContainerStatuses.add(builder);} return (A)this;
  }
  
  public A addAllToInitContainerStatuses(Collection<V1ContainerStatus> items) {
    if (this.initContainerStatuses == null) {this.initContainerStatuses = new ArrayList<V1ContainerStatusBuilder>();}
    for (V1ContainerStatus item : items) {V1ContainerStatusBuilder builder = new V1ContainerStatusBuilder(item);_visitables.get("initContainerStatuses").add(builder);this.initContainerStatuses.add(builder);} return (A)this;
  }
  
  public A removeFromInitContainerStatuses(io.kubernetes.client.openapi.models.V1ContainerStatus... items) {
    if (this.initContainerStatuses == null) return (A)this;
    for (V1ContainerStatus item : items) {V1ContainerStatusBuilder builder = new V1ContainerStatusBuilder(item);_visitables.get("initContainerStatuses").remove(builder); this.initContainerStatuses.remove(builder);} return (A)this;
  }
  
  public A removeAllFromInitContainerStatuses(Collection<V1ContainerStatus> items) {
    if (this.initContainerStatuses == null) return (A)this;
    for (V1ContainerStatus item : items) {V1ContainerStatusBuilder builder = new V1ContainerStatusBuilder(item);_visitables.get("initContainerStatuses").remove(builder); this.initContainerStatuses.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromInitContainerStatuses(Predicate<V1ContainerStatusBuilder> predicate) {
    if (initContainerStatuses == null) return (A) this;
    final Iterator<V1ContainerStatusBuilder> each = initContainerStatuses.iterator();
    final List visitables = _visitables.get("initContainerStatuses");
    while (each.hasNext()) {
      V1ContainerStatusBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1ContainerStatus> buildInitContainerStatuses() {
    return this.initContainerStatuses != null ? build(initContainerStatuses) : null;
  }
  
  public V1ContainerStatus buildInitContainerStatus(int index) {
    return this.initContainerStatuses.get(index).build();
  }
  
  public V1ContainerStatus buildFirstInitContainerStatus() {
    return this.initContainerStatuses.get(0).build();
  }
  
  public V1ContainerStatus buildLastInitContainerStatus() {
    return this.initContainerStatuses.get(initContainerStatuses.size() - 1).build();
  }
  
  public V1ContainerStatus buildMatchingInitContainerStatus(Predicate<V1ContainerStatusBuilder> predicate) {
      for (V1ContainerStatusBuilder item : initContainerStatuses) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingInitContainerStatus(Predicate<V1ContainerStatusBuilder> predicate) {
      for (V1ContainerStatusBuilder item : initContainerStatuses) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withInitContainerStatuses(List<V1ContainerStatus> initContainerStatuses) {
    if (this.initContainerStatuses != null) {
      this._visitables.get("initContainerStatuses").clear();
    }
    if (initContainerStatuses != null) {
        this.initContainerStatuses = new ArrayList();
        for (V1ContainerStatus item : initContainerStatuses) {
          this.addToInitContainerStatuses(item);
        }
    } else {
      this.initContainerStatuses = null;
    }
    return (A) this;
  }
  
  public A withInitContainerStatuses(io.kubernetes.client.openapi.models.V1ContainerStatus... initContainerStatuses) {
    if (this.initContainerStatuses != null) {
        this.initContainerStatuses.clear();
        _visitables.remove("initContainerStatuses");
    }
    if (initContainerStatuses != null) {
      for (V1ContainerStatus item : initContainerStatuses) {
        this.addToInitContainerStatuses(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasInitContainerStatuses() {
    return this.initContainerStatuses != null && !this.initContainerStatuses.isEmpty();
  }
  
  public InitContainerStatusesNested<A> addNewInitContainerStatus() {
    return new InitContainerStatusesNested(-1, null);
  }
  
  public InitContainerStatusesNested<A> addNewInitContainerStatusLike(V1ContainerStatus item) {
    return new InitContainerStatusesNested(-1, item);
  }
  
  public InitContainerStatusesNested<A> setNewInitContainerStatusLike(int index,V1ContainerStatus item) {
    return new InitContainerStatusesNested(index, item);
  }
  
  public InitContainerStatusesNested<A> editInitContainerStatus(int index) {
    if (initContainerStatuses.size() <= index) throw new RuntimeException("Can't edit initContainerStatuses. Index exceeds size.");
    return setNewInitContainerStatusLike(index, buildInitContainerStatus(index));
  }
  
  public InitContainerStatusesNested<A> editFirstInitContainerStatus() {
    if (initContainerStatuses.size() == 0) throw new RuntimeException("Can't edit first initContainerStatuses. The list is empty.");
    return setNewInitContainerStatusLike(0, buildInitContainerStatus(0));
  }
  
  public InitContainerStatusesNested<A> editLastInitContainerStatus() {
    int index = initContainerStatuses.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last initContainerStatuses. The list is empty.");
    return setNewInitContainerStatusLike(index, buildInitContainerStatus(index));
  }
  
  public InitContainerStatusesNested<A> editMatchingInitContainerStatus(Predicate<V1ContainerStatusBuilder> predicate) {
    int index = -1;
    for (int i=0;i<initContainerStatuses.size();i++) { 
    if (predicate.test(initContainerStatuses.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching initContainerStatuses. No match found.");
    return setNewInitContainerStatusLike(index, buildInitContainerStatus(index));
  }
  
  public String getMessage() {
    return this.message;
  }
  
  public A withMessage(String message) {
    this.message = message;
    return (A) this;
  }
  
  public boolean hasMessage() {
    return this.message != null;
  }
  
  public String getNominatedNodeName() {
    return this.nominatedNodeName;
  }
  
  public A withNominatedNodeName(String nominatedNodeName) {
    this.nominatedNodeName = nominatedNodeName;
    return (A) this;
  }
  
  public boolean hasNominatedNodeName() {
    return this.nominatedNodeName != null;
  }
  
  public String getPhase() {
    return this.phase;
  }
  
  public A withPhase(String phase) {
    this.phase = phase;
    return (A) this;
  }
  
  public boolean hasPhase() {
    return this.phase != null;
  }
  
  public String getPodIP() {
    return this.podIP;
  }
  
  public A withPodIP(String podIP) {
    this.podIP = podIP;
    return (A) this;
  }
  
  public boolean hasPodIP() {
    return this.podIP != null;
  }
  
  public A addToPodIPs(int index,V1PodIP item) {
    if (this.podIPs == null) {this.podIPs = new ArrayList<V1PodIPBuilder>();}
    V1PodIPBuilder builder = new V1PodIPBuilder(item);
    if (index < 0 || index >= podIPs.size()) { _visitables.get("podIPs").add(builder); podIPs.add(builder); } else { _visitables.get("podIPs").add(index, builder); podIPs.add(index, builder);}
    return (A)this;
  }
  
  public A setToPodIPs(int index,V1PodIP item) {
    if (this.podIPs == null) {this.podIPs = new ArrayList<V1PodIPBuilder>();}
    V1PodIPBuilder builder = new V1PodIPBuilder(item);
    if (index < 0 || index >= podIPs.size()) { _visitables.get("podIPs").add(builder); podIPs.add(builder); } else { _visitables.get("podIPs").set(index, builder); podIPs.set(index, builder);}
    return (A)this;
  }
  
  public A addToPodIPs(io.kubernetes.client.openapi.models.V1PodIP... items) {
    if (this.podIPs == null) {this.podIPs = new ArrayList<V1PodIPBuilder>();}
    for (V1PodIP item : items) {V1PodIPBuilder builder = new V1PodIPBuilder(item);_visitables.get("podIPs").add(builder);this.podIPs.add(builder);} return (A)this;
  }
  
  public A addAllToPodIPs(Collection<V1PodIP> items) {
    if (this.podIPs == null) {this.podIPs = new ArrayList<V1PodIPBuilder>();}
    for (V1PodIP item : items) {V1PodIPBuilder builder = new V1PodIPBuilder(item);_visitables.get("podIPs").add(builder);this.podIPs.add(builder);} return (A)this;
  }
  
  public A removeFromPodIPs(io.kubernetes.client.openapi.models.V1PodIP... items) {
    if (this.podIPs == null) return (A)this;
    for (V1PodIP item : items) {V1PodIPBuilder builder = new V1PodIPBuilder(item);_visitables.get("podIPs").remove(builder); this.podIPs.remove(builder);} return (A)this;
  }
  
  public A removeAllFromPodIPs(Collection<V1PodIP> items) {
    if (this.podIPs == null) return (A)this;
    for (V1PodIP item : items) {V1PodIPBuilder builder = new V1PodIPBuilder(item);_visitables.get("podIPs").remove(builder); this.podIPs.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromPodIPs(Predicate<V1PodIPBuilder> predicate) {
    if (podIPs == null) return (A) this;
    final Iterator<V1PodIPBuilder> each = podIPs.iterator();
    final List visitables = _visitables.get("podIPs");
    while (each.hasNext()) {
      V1PodIPBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1PodIP> buildPodIPs() {
    return this.podIPs != null ? build(podIPs) : null;
  }
  
  public V1PodIP buildPodIP(int index) {
    return this.podIPs.get(index).build();
  }
  
  public V1PodIP buildFirstPodIP() {
    return this.podIPs.get(0).build();
  }
  
  public V1PodIP buildLastPodIP() {
    return this.podIPs.get(podIPs.size() - 1).build();
  }
  
  public V1PodIP buildMatchingPodIP(Predicate<V1PodIPBuilder> predicate) {
      for (V1PodIPBuilder item : podIPs) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingPodIP(Predicate<V1PodIPBuilder> predicate) {
      for (V1PodIPBuilder item : podIPs) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withPodIPs(List<V1PodIP> podIPs) {
    if (this.podIPs != null) {
      this._visitables.get("podIPs").clear();
    }
    if (podIPs != null) {
        this.podIPs = new ArrayList();
        for (V1PodIP item : podIPs) {
          this.addToPodIPs(item);
        }
    } else {
      this.podIPs = null;
    }
    return (A) this;
  }
  
  public A withPodIPs(io.kubernetes.client.openapi.models.V1PodIP... podIPs) {
    if (this.podIPs != null) {
        this.podIPs.clear();
        _visitables.remove("podIPs");
    }
    if (podIPs != null) {
      for (V1PodIP item : podIPs) {
        this.addToPodIPs(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasPodIPs() {
    return this.podIPs != null && !this.podIPs.isEmpty();
  }
  
  public PodIPsNested<A> addNewPodIP() {
    return new PodIPsNested(-1, null);
  }
  
  public PodIPsNested<A> addNewPodIPLike(V1PodIP item) {
    return new PodIPsNested(-1, item);
  }
  
  public PodIPsNested<A> setNewPodIPLike(int index,V1PodIP item) {
    return new PodIPsNested(index, item);
  }
  
  public PodIPsNested<A> editPodIP(int index) {
    if (podIPs.size() <= index) throw new RuntimeException("Can't edit podIPs. Index exceeds size.");
    return setNewPodIPLike(index, buildPodIP(index));
  }
  
  public PodIPsNested<A> editFirstPodIP() {
    if (podIPs.size() == 0) throw new RuntimeException("Can't edit first podIPs. The list is empty.");
    return setNewPodIPLike(0, buildPodIP(0));
  }
  
  public PodIPsNested<A> editLastPodIP() {
    int index = podIPs.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last podIPs. The list is empty.");
    return setNewPodIPLike(index, buildPodIP(index));
  }
  
  public PodIPsNested<A> editMatchingPodIP(Predicate<V1PodIPBuilder> predicate) {
    int index = -1;
    for (int i=0;i<podIPs.size();i++) { 
    if (predicate.test(podIPs.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching podIPs. No match found.");
    return setNewPodIPLike(index, buildPodIP(index));
  }
  
  public String getQosClass() {
    return this.qosClass;
  }
  
  public A withQosClass(String qosClass) {
    this.qosClass = qosClass;
    return (A) this;
  }
  
  public boolean hasQosClass() {
    return this.qosClass != null;
  }
  
  public String getReason() {
    return this.reason;
  }
  
  public A withReason(String reason) {
    this.reason = reason;
    return (A) this;
  }
  
  public boolean hasReason() {
    return this.reason != null;
  }
  
  public String getResize() {
    return this.resize;
  }
  
  public A withResize(String resize) {
    this.resize = resize;
    return (A) this;
  }
  
  public boolean hasResize() {
    return this.resize != null;
  }
  
  public A addToResourceClaimStatuses(int index,V1PodResourceClaimStatus item) {
    if (this.resourceClaimStatuses == null) {this.resourceClaimStatuses = new ArrayList<V1PodResourceClaimStatusBuilder>();}
    V1PodResourceClaimStatusBuilder builder = new V1PodResourceClaimStatusBuilder(item);
    if (index < 0 || index >= resourceClaimStatuses.size()) { _visitables.get("resourceClaimStatuses").add(builder); resourceClaimStatuses.add(builder); } else { _visitables.get("resourceClaimStatuses").add(index, builder); resourceClaimStatuses.add(index, builder);}
    return (A)this;
  }
  
  public A setToResourceClaimStatuses(int index,V1PodResourceClaimStatus item) {
    if (this.resourceClaimStatuses == null) {this.resourceClaimStatuses = new ArrayList<V1PodResourceClaimStatusBuilder>();}
    V1PodResourceClaimStatusBuilder builder = new V1PodResourceClaimStatusBuilder(item);
    if (index < 0 || index >= resourceClaimStatuses.size()) { _visitables.get("resourceClaimStatuses").add(builder); resourceClaimStatuses.add(builder); } else { _visitables.get("resourceClaimStatuses").set(index, builder); resourceClaimStatuses.set(index, builder);}
    return (A)this;
  }
  
  public A addToResourceClaimStatuses(io.kubernetes.client.openapi.models.V1PodResourceClaimStatus... items) {
    if (this.resourceClaimStatuses == null) {this.resourceClaimStatuses = new ArrayList<V1PodResourceClaimStatusBuilder>();}
    for (V1PodResourceClaimStatus item : items) {V1PodResourceClaimStatusBuilder builder = new V1PodResourceClaimStatusBuilder(item);_visitables.get("resourceClaimStatuses").add(builder);this.resourceClaimStatuses.add(builder);} return (A)this;
  }
  
  public A addAllToResourceClaimStatuses(Collection<V1PodResourceClaimStatus> items) {
    if (this.resourceClaimStatuses == null) {this.resourceClaimStatuses = new ArrayList<V1PodResourceClaimStatusBuilder>();}
    for (V1PodResourceClaimStatus item : items) {V1PodResourceClaimStatusBuilder builder = new V1PodResourceClaimStatusBuilder(item);_visitables.get("resourceClaimStatuses").add(builder);this.resourceClaimStatuses.add(builder);} return (A)this;
  }
  
  public A removeFromResourceClaimStatuses(io.kubernetes.client.openapi.models.V1PodResourceClaimStatus... items) {
    if (this.resourceClaimStatuses == null) return (A)this;
    for (V1PodResourceClaimStatus item : items) {V1PodResourceClaimStatusBuilder builder = new V1PodResourceClaimStatusBuilder(item);_visitables.get("resourceClaimStatuses").remove(builder); this.resourceClaimStatuses.remove(builder);} return (A)this;
  }
  
  public A removeAllFromResourceClaimStatuses(Collection<V1PodResourceClaimStatus> items) {
    if (this.resourceClaimStatuses == null) return (A)this;
    for (V1PodResourceClaimStatus item : items) {V1PodResourceClaimStatusBuilder builder = new V1PodResourceClaimStatusBuilder(item);_visitables.get("resourceClaimStatuses").remove(builder); this.resourceClaimStatuses.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromResourceClaimStatuses(Predicate<V1PodResourceClaimStatusBuilder> predicate) {
    if (resourceClaimStatuses == null) return (A) this;
    final Iterator<V1PodResourceClaimStatusBuilder> each = resourceClaimStatuses.iterator();
    final List visitables = _visitables.get("resourceClaimStatuses");
    while (each.hasNext()) {
      V1PodResourceClaimStatusBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1PodResourceClaimStatus> buildResourceClaimStatuses() {
    return this.resourceClaimStatuses != null ? build(resourceClaimStatuses) : null;
  }
  
  public V1PodResourceClaimStatus buildResourceClaimStatus(int index) {
    return this.resourceClaimStatuses.get(index).build();
  }
  
  public V1PodResourceClaimStatus buildFirstResourceClaimStatus() {
    return this.resourceClaimStatuses.get(0).build();
  }
  
  public V1PodResourceClaimStatus buildLastResourceClaimStatus() {
    return this.resourceClaimStatuses.get(resourceClaimStatuses.size() - 1).build();
  }
  
  public V1PodResourceClaimStatus buildMatchingResourceClaimStatus(Predicate<V1PodResourceClaimStatusBuilder> predicate) {
      for (V1PodResourceClaimStatusBuilder item : resourceClaimStatuses) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingResourceClaimStatus(Predicate<V1PodResourceClaimStatusBuilder> predicate) {
      for (V1PodResourceClaimStatusBuilder item : resourceClaimStatuses) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withResourceClaimStatuses(List<V1PodResourceClaimStatus> resourceClaimStatuses) {
    if (this.resourceClaimStatuses != null) {
      this._visitables.get("resourceClaimStatuses").clear();
    }
    if (resourceClaimStatuses != null) {
        this.resourceClaimStatuses = new ArrayList();
        for (V1PodResourceClaimStatus item : resourceClaimStatuses) {
          this.addToResourceClaimStatuses(item);
        }
    } else {
      this.resourceClaimStatuses = null;
    }
    return (A) this;
  }
  
  public A withResourceClaimStatuses(io.kubernetes.client.openapi.models.V1PodResourceClaimStatus... resourceClaimStatuses) {
    if (this.resourceClaimStatuses != null) {
        this.resourceClaimStatuses.clear();
        _visitables.remove("resourceClaimStatuses");
    }
    if (resourceClaimStatuses != null) {
      for (V1PodResourceClaimStatus item : resourceClaimStatuses) {
        this.addToResourceClaimStatuses(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasResourceClaimStatuses() {
    return this.resourceClaimStatuses != null && !this.resourceClaimStatuses.isEmpty();
  }
  
  public ResourceClaimStatusesNested<A> addNewResourceClaimStatus() {
    return new ResourceClaimStatusesNested(-1, null);
  }
  
  public ResourceClaimStatusesNested<A> addNewResourceClaimStatusLike(V1PodResourceClaimStatus item) {
    return new ResourceClaimStatusesNested(-1, item);
  }
  
  public ResourceClaimStatusesNested<A> setNewResourceClaimStatusLike(int index,V1PodResourceClaimStatus item) {
    return new ResourceClaimStatusesNested(index, item);
  }
  
  public ResourceClaimStatusesNested<A> editResourceClaimStatus(int index) {
    if (resourceClaimStatuses.size() <= index) throw new RuntimeException("Can't edit resourceClaimStatuses. Index exceeds size.");
    return setNewResourceClaimStatusLike(index, buildResourceClaimStatus(index));
  }
  
  public ResourceClaimStatusesNested<A> editFirstResourceClaimStatus() {
    if (resourceClaimStatuses.size() == 0) throw new RuntimeException("Can't edit first resourceClaimStatuses. The list is empty.");
    return setNewResourceClaimStatusLike(0, buildResourceClaimStatus(0));
  }
  
  public ResourceClaimStatusesNested<A> editLastResourceClaimStatus() {
    int index = resourceClaimStatuses.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last resourceClaimStatuses. The list is empty.");
    return setNewResourceClaimStatusLike(index, buildResourceClaimStatus(index));
  }
  
  public ResourceClaimStatusesNested<A> editMatchingResourceClaimStatus(Predicate<V1PodResourceClaimStatusBuilder> predicate) {
    int index = -1;
    for (int i=0;i<resourceClaimStatuses.size();i++) { 
    if (predicate.test(resourceClaimStatuses.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching resourceClaimStatuses. No match found.");
    return setNewResourceClaimStatusLike(index, buildResourceClaimStatus(index));
  }
  
  public OffsetDateTime getStartTime() {
    return this.startTime;
  }
  
  public A withStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return (A) this;
  }
  
  public boolean hasStartTime() {
    return this.startTime != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1PodStatusFluent that = (V1PodStatusFluent) o;
    if (!java.util.Objects.equals(conditions, that.conditions)) return false;
    if (!java.util.Objects.equals(containerStatuses, that.containerStatuses)) return false;
    if (!java.util.Objects.equals(ephemeralContainerStatuses, that.ephemeralContainerStatuses)) return false;
    if (!java.util.Objects.equals(hostIP, that.hostIP)) return false;
    if (!java.util.Objects.equals(hostIPs, that.hostIPs)) return false;
    if (!java.util.Objects.equals(initContainerStatuses, that.initContainerStatuses)) return false;
    if (!java.util.Objects.equals(message, that.message)) return false;
    if (!java.util.Objects.equals(nominatedNodeName, that.nominatedNodeName)) return false;
    if (!java.util.Objects.equals(phase, that.phase)) return false;
    if (!java.util.Objects.equals(podIP, that.podIP)) return false;
    if (!java.util.Objects.equals(podIPs, that.podIPs)) return false;
    if (!java.util.Objects.equals(qosClass, that.qosClass)) return false;
    if (!java.util.Objects.equals(reason, that.reason)) return false;
    if (!java.util.Objects.equals(resize, that.resize)) return false;
    if (!java.util.Objects.equals(resourceClaimStatuses, that.resourceClaimStatuses)) return false;
    if (!java.util.Objects.equals(startTime, that.startTime)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(conditions,  containerStatuses,  ephemeralContainerStatuses,  hostIP,  hostIPs,  initContainerStatuses,  message,  nominatedNodeName,  phase,  podIP,  podIPs,  qosClass,  reason,  resize,  resourceClaimStatuses,  startTime,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (conditions != null && !conditions.isEmpty()) { sb.append("conditions:"); sb.append(conditions + ","); }
    if (containerStatuses != null && !containerStatuses.isEmpty()) { sb.append("containerStatuses:"); sb.append(containerStatuses + ","); }
    if (ephemeralContainerStatuses != null && !ephemeralContainerStatuses.isEmpty()) { sb.append("ephemeralContainerStatuses:"); sb.append(ephemeralContainerStatuses + ","); }
    if (hostIP != null) { sb.append("hostIP:"); sb.append(hostIP + ","); }
    if (hostIPs != null && !hostIPs.isEmpty()) { sb.append("hostIPs:"); sb.append(hostIPs + ","); }
    if (initContainerStatuses != null && !initContainerStatuses.isEmpty()) { sb.append("initContainerStatuses:"); sb.append(initContainerStatuses + ","); }
    if (message != null) { sb.append("message:"); sb.append(message + ","); }
    if (nominatedNodeName != null) { sb.append("nominatedNodeName:"); sb.append(nominatedNodeName + ","); }
    if (phase != null) { sb.append("phase:"); sb.append(phase + ","); }
    if (podIP != null) { sb.append("podIP:"); sb.append(podIP + ","); }
    if (podIPs != null && !podIPs.isEmpty()) { sb.append("podIPs:"); sb.append(podIPs + ","); }
    if (qosClass != null) { sb.append("qosClass:"); sb.append(qosClass + ","); }
    if (reason != null) { sb.append("reason:"); sb.append(reason + ","); }
    if (resize != null) { sb.append("resize:"); sb.append(resize + ","); }
    if (resourceClaimStatuses != null && !resourceClaimStatuses.isEmpty()) { sb.append("resourceClaimStatuses:"); sb.append(resourceClaimStatuses + ","); }
    if (startTime != null) { sb.append("startTime:"); sb.append(startTime); }
    sb.append("}");
    return sb.toString();
  }
  public class ConditionsNested<N> extends V1PodConditionFluent<ConditionsNested<N>> implements Nested<N>{
    ConditionsNested(int index,V1PodCondition item) {
      this.index = index;
      this.builder = new V1PodConditionBuilder(this, item);
    }
    V1PodConditionBuilder builder;
    int index;
    
    public N and() {
      return (N) V1PodStatusFluent.this.setToConditions(index,builder.build());
    }
    
    public N endCondition() {
      return and();
    }
    
  
  }
  public class ContainerStatusesNested<N> extends V1ContainerStatusFluent<ContainerStatusesNested<N>> implements Nested<N>{
    ContainerStatusesNested(int index,V1ContainerStatus item) {
      this.index = index;
      this.builder = new V1ContainerStatusBuilder(this, item);
    }
    V1ContainerStatusBuilder builder;
    int index;
    
    public N and() {
      return (N) V1PodStatusFluent.this.setToContainerStatuses(index,builder.build());
    }
    
    public N endContainerStatus() {
      return and();
    }
    
  
  }
  public class EphemeralContainerStatusesNested<N> extends V1ContainerStatusFluent<EphemeralContainerStatusesNested<N>> implements Nested<N>{
    EphemeralContainerStatusesNested(int index,V1ContainerStatus item) {
      this.index = index;
      this.builder = new V1ContainerStatusBuilder(this, item);
    }
    V1ContainerStatusBuilder builder;
    int index;
    
    public N and() {
      return (N) V1PodStatusFluent.this.setToEphemeralContainerStatuses(index,builder.build());
    }
    
    public N endEphemeralContainerStatus() {
      return and();
    }
    
  
  }
  public class HostIPsNested<N> extends V1HostIPFluent<HostIPsNested<N>> implements Nested<N>{
    HostIPsNested(int index,V1HostIP item) {
      this.index = index;
      this.builder = new V1HostIPBuilder(this, item);
    }
    V1HostIPBuilder builder;
    int index;
    
    public N and() {
      return (N) V1PodStatusFluent.this.setToHostIPs(index,builder.build());
    }
    
    public N endHostIP() {
      return and();
    }
    
  
  }
  public class InitContainerStatusesNested<N> extends V1ContainerStatusFluent<InitContainerStatusesNested<N>> implements Nested<N>{
    InitContainerStatusesNested(int index,V1ContainerStatus item) {
      this.index = index;
      this.builder = new V1ContainerStatusBuilder(this, item);
    }
    V1ContainerStatusBuilder builder;
    int index;
    
    public N and() {
      return (N) V1PodStatusFluent.this.setToInitContainerStatuses(index,builder.build());
    }
    
    public N endInitContainerStatus() {
      return and();
    }
    
  
  }
  public class PodIPsNested<N> extends V1PodIPFluent<PodIPsNested<N>> implements Nested<N>{
    PodIPsNested(int index,V1PodIP item) {
      this.index = index;
      this.builder = new V1PodIPBuilder(this, item);
    }
    V1PodIPBuilder builder;
    int index;
    
    public N and() {
      return (N) V1PodStatusFluent.this.setToPodIPs(index,builder.build());
    }
    
    public N endPodIP() {
      return and();
    }
    
  
  }
  public class ResourceClaimStatusesNested<N> extends V1PodResourceClaimStatusFluent<ResourceClaimStatusesNested<N>> implements Nested<N>{
    ResourceClaimStatusesNested(int index,V1PodResourceClaimStatus item) {
      this.index = index;
      this.builder = new V1PodResourceClaimStatusBuilder(this, item);
    }
    V1PodResourceClaimStatusBuilder builder;
    int index;
    
    public N and() {
      return (N) V1PodStatusFluent.this.setToResourceClaimStatuses(index,builder.build());
    }
    
    public N endResourceClaimStatus() {
      return and();
    }
    
  
  }

}