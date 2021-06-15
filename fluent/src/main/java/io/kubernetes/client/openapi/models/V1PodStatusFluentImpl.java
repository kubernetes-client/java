package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import java.time.OffsetDateTime;
import java.util.Collection;
import java.lang.Object;

public class V1PodStatusFluentImpl<A extends io.kubernetes.client.openapi.models.V1PodStatusFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1PodStatusFluent<A> {

    private java.util.List<io.kubernetes.client.openapi.models.V1PodConditionBuilder> conditions;
    private java.util.List<io.kubernetes.client.openapi.models.V1ContainerStatusBuilder> containerStatuses;
    private java.util.List<io.kubernetes.client.openapi.models.V1ContainerStatusBuilder> ephemeralContainerStatuses;
    private java.lang.String hostIP;
    private java.util.List<io.kubernetes.client.openapi.models.V1ContainerStatusBuilder> initContainerStatuses;
    private java.lang.String message;
    private java.lang.String nominatedNodeName;
    private java.lang.String phase;
    private java.lang.String podIP;
    private java.util.List<io.kubernetes.client.openapi.models.V1PodIPBuilder> podIPs;
    private java.lang.String qosClass;
    private java.lang.String reason;
    private java.time.OffsetDateTime startTime;

    public V1PodStatusFluentImpl() {
    }

    public V1PodStatusFluentImpl(io.kubernetes.client.openapi.models.V1PodStatus instance) {
        this.withConditions(instance.getConditions());
        
        this.withContainerStatuses(instance.getContainerStatuses());
        
        this.withEphemeralContainerStatuses(instance.getEphemeralContainerStatuses());
        
        this.withHostIP(instance.getHostIP());
        
        this.withInitContainerStatuses(instance.getInitContainerStatuses());
        
        this.withMessage(instance.getMessage());
        
        this.withNominatedNodeName(instance.getNominatedNodeName());
        
        this.withPhase(instance.getPhase());
        
        this.withPodIP(instance.getPodIP());
        
        this.withPodIPs(instance.getPodIPs());
        
        this.withQosClass(instance.getQosClass());
        
        this.withReason(instance.getReason());
        
        this.withStartTime(instance.getStartTime());
    }

    public A addToConditions(int index,io.kubernetes.client.openapi.models.V1PodCondition item) {
        if (this.conditions == null) {this.conditions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1PodConditionBuilder>();}
        io.kubernetes.client.openapi.models.V1PodConditionBuilder builder = new io.kubernetes.client.openapi.models.V1PodConditionBuilder(item);_visitables.get("conditions").add(index >= 0 ? index : _visitables.get("conditions").size(), builder);this.conditions.add(index >= 0 ? index : conditions.size(), builder); return (A)this;
    }

    public A setToConditions(int index,io.kubernetes.client.openapi.models.V1PodCondition item) {
        if (this.conditions == null) {this.conditions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1PodConditionBuilder>();}
        io.kubernetes.client.openapi.models.V1PodConditionBuilder builder = new io.kubernetes.client.openapi.models.V1PodConditionBuilder(item);
        if (index < 0 || index >= _visitables.get("conditions").size()) { _visitables.get("conditions").add(builder); } else { _visitables.get("conditions").set(index, builder);}
        if (index < 0 || index >= conditions.size()) { conditions.add(builder); } else { conditions.set(index, builder);}
         return (A)this;
    }

    public A addToConditions(io.kubernetes.client.openapi.models.V1PodCondition... items) {
        if (this.conditions == null) {this.conditions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1PodConditionBuilder>();}
        for (io.kubernetes.client.openapi.models.V1PodCondition item : items) {io.kubernetes.client.openapi.models.V1PodConditionBuilder builder = new io.kubernetes.client.openapi.models.V1PodConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
    }

    public A addAllToConditions(java.util.Collection<io.kubernetes.client.openapi.models.V1PodCondition> items) {
        if (this.conditions == null) {this.conditions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1PodConditionBuilder>();}
        for (io.kubernetes.client.openapi.models.V1PodCondition item : items) {io.kubernetes.client.openapi.models.V1PodConditionBuilder builder = new io.kubernetes.client.openapi.models.V1PodConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
    }

    public A removeFromConditions(io.kubernetes.client.openapi.models.V1PodCondition... items) {
        for (io.kubernetes.client.openapi.models.V1PodCondition item : items) {io.kubernetes.client.openapi.models.V1PodConditionBuilder builder = new io.kubernetes.client.openapi.models.V1PodConditionBuilder(item);_visitables.get("conditions").remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
    }

    public A removeAllFromConditions(java.util.Collection<io.kubernetes.client.openapi.models.V1PodCondition> items) {
        for (io.kubernetes.client.openapi.models.V1PodCondition item : items) {io.kubernetes.client.openapi.models.V1PodConditionBuilder builder = new io.kubernetes.client.openapi.models.V1PodConditionBuilder(item);_visitables.get("conditions").remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
    }

    public A removeMatchingFromConditions(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PodConditionBuilder> predicate) {
        if (conditions == null) return (A) this;
        final Iterator<io.kubernetes.client.openapi.models.V1PodConditionBuilder> each = conditions.iterator();
        final List visitables = _visitables.get("conditions");
        while (each.hasNext()) {
          io.kubernetes.client.openapi.models.V1PodConditionBuilder builder = each.next();
          if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
          }
        }
        return (A)this;
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildConditions instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1PodCondition> getConditions() {
        return build(conditions);
    }

    public java.util.List<io.kubernetes.client.openapi.models.V1PodCondition> buildConditions() {
        return build(conditions);
    }

    public io.kubernetes.client.openapi.models.V1PodCondition buildCondition(int index) {
        return this.conditions.get(index).build();
    }

    public io.kubernetes.client.openapi.models.V1PodCondition buildFirstCondition() {
        return this.conditions.get(0).build();
    }

    public io.kubernetes.client.openapi.models.V1PodCondition buildLastCondition() {
        return this.conditions.get(conditions.size() - 1).build();
    }

    public io.kubernetes.client.openapi.models.V1PodCondition buildMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PodConditionBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.V1PodConditionBuilder item: conditions) { if(predicate.test(item)){ return item.build();} } return null;
    }

    public java.lang.Boolean hasMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PodConditionBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.V1PodConditionBuilder item: conditions) { if(predicate.test(item)){ return true;} } return false;
    }

    public A withConditions(java.util.List<io.kubernetes.client.openapi.models.V1PodCondition> conditions) {
        if (this.conditions != null) { _visitables.get("conditions").removeAll(this.conditions);}
        if (conditions != null) {this.conditions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1PodConditionBuilder>(); for (io.kubernetes.client.openapi.models.V1PodCondition item : conditions){this.addToConditions(item);}} else { this.conditions = null;} return (A) this;
    }

    public A withConditions(io.kubernetes.client.openapi.models.V1PodCondition... conditions) {
        if (this.conditions != null) {this.conditions.clear();}
        if (conditions != null) {for (io.kubernetes.client.openapi.models.V1PodCondition item :conditions){ this.addToConditions(item);}} return (A) this;
    }

    public java.lang.Boolean hasConditions() {
        return conditions != null && !conditions.isEmpty();
    }

    public io.kubernetes.client.openapi.models.V1PodStatusFluent.ConditionsNested<A> addNewCondition() {
        return new io.kubernetes.client.openapi.models.V1PodStatusFluentImpl.ConditionsNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1PodStatusFluent.ConditionsNested<A> addNewConditionLike(io.kubernetes.client.openapi.models.V1PodCondition item) {
        return new io.kubernetes.client.openapi.models.V1PodStatusFluentImpl.ConditionsNestedImpl(-1, item);
    }

    public io.kubernetes.client.openapi.models.V1PodStatusFluent.ConditionsNested<A> setNewConditionLike(int index,io.kubernetes.client.openapi.models.V1PodCondition item) {
        return new io.kubernetes.client.openapi.models.V1PodStatusFluentImpl.ConditionsNestedImpl(index, item);
    }

    public io.kubernetes.client.openapi.models.V1PodStatusFluent.ConditionsNested<A> editCondition(int index) {
        if (conditions.size() <= index) throw new RuntimeException("Can't edit conditions. Index exceeds size.");
        return setNewConditionLike(index, buildCondition(index));
    }

    public io.kubernetes.client.openapi.models.V1PodStatusFluent.ConditionsNested<A> editFirstCondition() {
        if (conditions.size() == 0) throw new RuntimeException("Can't edit first conditions. The list is empty.");
        return setNewConditionLike(0, buildCondition(0));
    }

    public io.kubernetes.client.openapi.models.V1PodStatusFluent.ConditionsNested<A> editLastCondition() {
        int index = conditions.size() - 1;
        if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
        return setNewConditionLike(index, buildCondition(index));
    }

    public io.kubernetes.client.openapi.models.V1PodStatusFluent.ConditionsNested<A> editMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PodConditionBuilder> predicate) {
        int index = -1;
        for (int i=0;i<conditions.size();i++) { 
        if (predicate.test(conditions.get(i))) {index = i; break;}
        } 
        if (index < 0) throw new RuntimeException("Can't edit matching conditions. No match found.");
        return setNewConditionLike(index, buildCondition(index));
    }

    public A addToContainerStatuses(int index,io.kubernetes.client.openapi.models.V1ContainerStatus item) {
        if (this.containerStatuses == null) {this.containerStatuses = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ContainerStatusBuilder>();}
        io.kubernetes.client.openapi.models.V1ContainerStatusBuilder builder = new io.kubernetes.client.openapi.models.V1ContainerStatusBuilder(item);_visitables.get("containerStatuses").add(index >= 0 ? index : _visitables.get("containerStatuses").size(), builder);this.containerStatuses.add(index >= 0 ? index : containerStatuses.size(), builder); return (A)this;
    }

    public A setToContainerStatuses(int index,io.kubernetes.client.openapi.models.V1ContainerStatus item) {
        if (this.containerStatuses == null) {this.containerStatuses = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ContainerStatusBuilder>();}
        io.kubernetes.client.openapi.models.V1ContainerStatusBuilder builder = new io.kubernetes.client.openapi.models.V1ContainerStatusBuilder(item);
        if (index < 0 || index >= _visitables.get("containerStatuses").size()) { _visitables.get("containerStatuses").add(builder); } else { _visitables.get("containerStatuses").set(index, builder);}
        if (index < 0 || index >= containerStatuses.size()) { containerStatuses.add(builder); } else { containerStatuses.set(index, builder);}
         return (A)this;
    }

    public A addToContainerStatuses(io.kubernetes.client.openapi.models.V1ContainerStatus... items) {
        if (this.containerStatuses == null) {this.containerStatuses = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ContainerStatusBuilder>();}
        for (io.kubernetes.client.openapi.models.V1ContainerStatus item : items) {io.kubernetes.client.openapi.models.V1ContainerStatusBuilder builder = new io.kubernetes.client.openapi.models.V1ContainerStatusBuilder(item);_visitables.get("containerStatuses").add(builder);this.containerStatuses.add(builder);} return (A)this;
    }

    public A addAllToContainerStatuses(java.util.Collection<io.kubernetes.client.openapi.models.V1ContainerStatus> items) {
        if (this.containerStatuses == null) {this.containerStatuses = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ContainerStatusBuilder>();}
        for (io.kubernetes.client.openapi.models.V1ContainerStatus item : items) {io.kubernetes.client.openapi.models.V1ContainerStatusBuilder builder = new io.kubernetes.client.openapi.models.V1ContainerStatusBuilder(item);_visitables.get("containerStatuses").add(builder);this.containerStatuses.add(builder);} return (A)this;
    }

    public A removeFromContainerStatuses(io.kubernetes.client.openapi.models.V1ContainerStatus... items) {
        for (io.kubernetes.client.openapi.models.V1ContainerStatus item : items) {io.kubernetes.client.openapi.models.V1ContainerStatusBuilder builder = new io.kubernetes.client.openapi.models.V1ContainerStatusBuilder(item);_visitables.get("containerStatuses").remove(builder);if (this.containerStatuses != null) {this.containerStatuses.remove(builder);}} return (A)this;
    }

    public A removeAllFromContainerStatuses(java.util.Collection<io.kubernetes.client.openapi.models.V1ContainerStatus> items) {
        for (io.kubernetes.client.openapi.models.V1ContainerStatus item : items) {io.kubernetes.client.openapi.models.V1ContainerStatusBuilder builder = new io.kubernetes.client.openapi.models.V1ContainerStatusBuilder(item);_visitables.get("containerStatuses").remove(builder);if (this.containerStatuses != null) {this.containerStatuses.remove(builder);}} return (A)this;
    }

    public A removeMatchingFromContainerStatuses(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ContainerStatusBuilder> predicate) {
        if (containerStatuses == null) return (A) this;
        final Iterator<io.kubernetes.client.openapi.models.V1ContainerStatusBuilder> each = containerStatuses.iterator();
        final List visitables = _visitables.get("containerStatuses");
        while (each.hasNext()) {
          io.kubernetes.client.openapi.models.V1ContainerStatusBuilder builder = each.next();
          if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
          }
        }
        return (A)this;
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildContainerStatuses instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1ContainerStatus> getContainerStatuses() {
        return build(containerStatuses);
    }

    public java.util.List<io.kubernetes.client.openapi.models.V1ContainerStatus> buildContainerStatuses() {
        return build(containerStatuses);
    }

    public io.kubernetes.client.openapi.models.V1ContainerStatus buildContainerStatus(int index) {
        return this.containerStatuses.get(index).build();
    }

    public io.kubernetes.client.openapi.models.V1ContainerStatus buildFirstContainerStatus() {
        return this.containerStatuses.get(0).build();
    }

    public io.kubernetes.client.openapi.models.V1ContainerStatus buildLastContainerStatus() {
        return this.containerStatuses.get(containerStatuses.size() - 1).build();
    }

    public io.kubernetes.client.openapi.models.V1ContainerStatus buildMatchingContainerStatus(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ContainerStatusBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.V1ContainerStatusBuilder item: containerStatuses) { if(predicate.test(item)){ return item.build();} } return null;
    }

    public java.lang.Boolean hasMatchingContainerStatus(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ContainerStatusBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.V1ContainerStatusBuilder item: containerStatuses) { if(predicate.test(item)){ return true;} } return false;
    }

    public A withContainerStatuses(java.util.List<io.kubernetes.client.openapi.models.V1ContainerStatus> containerStatuses) {
        if (this.containerStatuses != null) { _visitables.get("containerStatuses").removeAll(this.containerStatuses);}
        if (containerStatuses != null) {this.containerStatuses = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ContainerStatusBuilder>(); for (io.kubernetes.client.openapi.models.V1ContainerStatus item : containerStatuses){this.addToContainerStatuses(item);}} else { this.containerStatuses = null;} return (A) this;
    }

    public A withContainerStatuses(io.kubernetes.client.openapi.models.V1ContainerStatus... containerStatuses) {
        if (this.containerStatuses != null) {this.containerStatuses.clear();}
        if (containerStatuses != null) {for (io.kubernetes.client.openapi.models.V1ContainerStatus item :containerStatuses){ this.addToContainerStatuses(item);}} return (A) this;
    }

    public java.lang.Boolean hasContainerStatuses() {
        return containerStatuses != null && !containerStatuses.isEmpty();
    }

    public io.kubernetes.client.openapi.models.V1PodStatusFluent.ContainerStatusesNested<A> addNewContainerStatus() {
        return new io.kubernetes.client.openapi.models.V1PodStatusFluentImpl.ContainerStatusesNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1PodStatusFluent.ContainerStatusesNested<A> addNewContainerStatusLike(io.kubernetes.client.openapi.models.V1ContainerStatus item) {
        return new io.kubernetes.client.openapi.models.V1PodStatusFluentImpl.ContainerStatusesNestedImpl(-1, item);
    }

    public io.kubernetes.client.openapi.models.V1PodStatusFluent.ContainerStatusesNested<A> setNewContainerStatusLike(int index,io.kubernetes.client.openapi.models.V1ContainerStatus item) {
        return new io.kubernetes.client.openapi.models.V1PodStatusFluentImpl.ContainerStatusesNestedImpl(index, item);
    }

    public io.kubernetes.client.openapi.models.V1PodStatusFluent.ContainerStatusesNested<A> editContainerStatus(int index) {
        if (containerStatuses.size() <= index) throw new RuntimeException("Can't edit containerStatuses. Index exceeds size.");
        return setNewContainerStatusLike(index, buildContainerStatus(index));
    }

    public io.kubernetes.client.openapi.models.V1PodStatusFluent.ContainerStatusesNested<A> editFirstContainerStatus() {
        if (containerStatuses.size() == 0) throw new RuntimeException("Can't edit first containerStatuses. The list is empty.");
        return setNewContainerStatusLike(0, buildContainerStatus(0));
    }

    public io.kubernetes.client.openapi.models.V1PodStatusFluent.ContainerStatusesNested<A> editLastContainerStatus() {
        int index = containerStatuses.size() - 1;
        if (index < 0) throw new RuntimeException("Can't edit last containerStatuses. The list is empty.");
        return setNewContainerStatusLike(index, buildContainerStatus(index));
    }

    public io.kubernetes.client.openapi.models.V1PodStatusFluent.ContainerStatusesNested<A> editMatchingContainerStatus(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ContainerStatusBuilder> predicate) {
        int index = -1;
        for (int i=0;i<containerStatuses.size();i++) { 
        if (predicate.test(containerStatuses.get(i))) {index = i; break;}
        } 
        if (index < 0) throw new RuntimeException("Can't edit matching containerStatuses. No match found.");
        return setNewContainerStatusLike(index, buildContainerStatus(index));
    }

    public A addToEphemeralContainerStatuses(int index,io.kubernetes.client.openapi.models.V1ContainerStatus item) {
        if (this.ephemeralContainerStatuses == null) {this.ephemeralContainerStatuses = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ContainerStatusBuilder>();}
        io.kubernetes.client.openapi.models.V1ContainerStatusBuilder builder = new io.kubernetes.client.openapi.models.V1ContainerStatusBuilder(item);_visitables.get("ephemeralContainerStatuses").add(index >= 0 ? index : _visitables.get("ephemeralContainerStatuses").size(), builder);this.ephemeralContainerStatuses.add(index >= 0 ? index : ephemeralContainerStatuses.size(), builder); return (A)this;
    }

    public A setToEphemeralContainerStatuses(int index,io.kubernetes.client.openapi.models.V1ContainerStatus item) {
        if (this.ephemeralContainerStatuses == null) {this.ephemeralContainerStatuses = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ContainerStatusBuilder>();}
        io.kubernetes.client.openapi.models.V1ContainerStatusBuilder builder = new io.kubernetes.client.openapi.models.V1ContainerStatusBuilder(item);
        if (index < 0 || index >= _visitables.get("ephemeralContainerStatuses").size()) { _visitables.get("ephemeralContainerStatuses").add(builder); } else { _visitables.get("ephemeralContainerStatuses").set(index, builder);}
        if (index < 0 || index >= ephemeralContainerStatuses.size()) { ephemeralContainerStatuses.add(builder); } else { ephemeralContainerStatuses.set(index, builder);}
         return (A)this;
    }

    public A addToEphemeralContainerStatuses(io.kubernetes.client.openapi.models.V1ContainerStatus... items) {
        if (this.ephemeralContainerStatuses == null) {this.ephemeralContainerStatuses = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ContainerStatusBuilder>();}
        for (io.kubernetes.client.openapi.models.V1ContainerStatus item : items) {io.kubernetes.client.openapi.models.V1ContainerStatusBuilder builder = new io.kubernetes.client.openapi.models.V1ContainerStatusBuilder(item);_visitables.get("ephemeralContainerStatuses").add(builder);this.ephemeralContainerStatuses.add(builder);} return (A)this;
    }

    public A addAllToEphemeralContainerStatuses(java.util.Collection<io.kubernetes.client.openapi.models.V1ContainerStatus> items) {
        if (this.ephemeralContainerStatuses == null) {this.ephemeralContainerStatuses = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ContainerStatusBuilder>();}
        for (io.kubernetes.client.openapi.models.V1ContainerStatus item : items) {io.kubernetes.client.openapi.models.V1ContainerStatusBuilder builder = new io.kubernetes.client.openapi.models.V1ContainerStatusBuilder(item);_visitables.get("ephemeralContainerStatuses").add(builder);this.ephemeralContainerStatuses.add(builder);} return (A)this;
    }

    public A removeFromEphemeralContainerStatuses(io.kubernetes.client.openapi.models.V1ContainerStatus... items) {
        for (io.kubernetes.client.openapi.models.V1ContainerStatus item : items) {io.kubernetes.client.openapi.models.V1ContainerStatusBuilder builder = new io.kubernetes.client.openapi.models.V1ContainerStatusBuilder(item);_visitables.get("ephemeralContainerStatuses").remove(builder);if (this.ephemeralContainerStatuses != null) {this.ephemeralContainerStatuses.remove(builder);}} return (A)this;
    }

    public A removeAllFromEphemeralContainerStatuses(java.util.Collection<io.kubernetes.client.openapi.models.V1ContainerStatus> items) {
        for (io.kubernetes.client.openapi.models.V1ContainerStatus item : items) {io.kubernetes.client.openapi.models.V1ContainerStatusBuilder builder = new io.kubernetes.client.openapi.models.V1ContainerStatusBuilder(item);_visitables.get("ephemeralContainerStatuses").remove(builder);if (this.ephemeralContainerStatuses != null) {this.ephemeralContainerStatuses.remove(builder);}} return (A)this;
    }

    public A removeMatchingFromEphemeralContainerStatuses(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ContainerStatusBuilder> predicate) {
        if (ephemeralContainerStatuses == null) return (A) this;
        final Iterator<io.kubernetes.client.openapi.models.V1ContainerStatusBuilder> each = ephemeralContainerStatuses.iterator();
        final List visitables = _visitables.get("ephemeralContainerStatuses");
        while (each.hasNext()) {
          io.kubernetes.client.openapi.models.V1ContainerStatusBuilder builder = each.next();
          if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
          }
        }
        return (A)this;
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildEphemeralContainerStatuses instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1ContainerStatus> getEphemeralContainerStatuses() {
        return build(ephemeralContainerStatuses);
    }

    public java.util.List<io.kubernetes.client.openapi.models.V1ContainerStatus> buildEphemeralContainerStatuses() {
        return build(ephemeralContainerStatuses);
    }

    public io.kubernetes.client.openapi.models.V1ContainerStatus buildEphemeralContainerStatus(int index) {
        return this.ephemeralContainerStatuses.get(index).build();
    }

    public io.kubernetes.client.openapi.models.V1ContainerStatus buildFirstEphemeralContainerStatus() {
        return this.ephemeralContainerStatuses.get(0).build();
    }

    public io.kubernetes.client.openapi.models.V1ContainerStatus buildLastEphemeralContainerStatus() {
        return this.ephemeralContainerStatuses.get(ephemeralContainerStatuses.size() - 1).build();
    }

    public io.kubernetes.client.openapi.models.V1ContainerStatus buildMatchingEphemeralContainerStatus(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ContainerStatusBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.V1ContainerStatusBuilder item: ephemeralContainerStatuses) { if(predicate.test(item)){ return item.build();} } return null;
    }

    public java.lang.Boolean hasMatchingEphemeralContainerStatus(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ContainerStatusBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.V1ContainerStatusBuilder item: ephemeralContainerStatuses) { if(predicate.test(item)){ return true;} } return false;
    }

    public A withEphemeralContainerStatuses(java.util.List<io.kubernetes.client.openapi.models.V1ContainerStatus> ephemeralContainerStatuses) {
        if (this.ephemeralContainerStatuses != null) { _visitables.get("ephemeralContainerStatuses").removeAll(this.ephemeralContainerStatuses);}
        if (ephemeralContainerStatuses != null) {this.ephemeralContainerStatuses = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ContainerStatusBuilder>(); for (io.kubernetes.client.openapi.models.V1ContainerStatus item : ephemeralContainerStatuses){this.addToEphemeralContainerStatuses(item);}} else { this.ephemeralContainerStatuses = null;} return (A) this;
    }

    public A withEphemeralContainerStatuses(io.kubernetes.client.openapi.models.V1ContainerStatus... ephemeralContainerStatuses) {
        if (this.ephemeralContainerStatuses != null) {this.ephemeralContainerStatuses.clear();}
        if (ephemeralContainerStatuses != null) {for (io.kubernetes.client.openapi.models.V1ContainerStatus item :ephemeralContainerStatuses){ this.addToEphemeralContainerStatuses(item);}} return (A) this;
    }

    public java.lang.Boolean hasEphemeralContainerStatuses() {
        return ephemeralContainerStatuses != null && !ephemeralContainerStatuses.isEmpty();
    }

    public io.kubernetes.client.openapi.models.V1PodStatusFluent.EphemeralContainerStatusesNested<A> addNewEphemeralContainerStatus() {
        return new io.kubernetes.client.openapi.models.V1PodStatusFluentImpl.EphemeralContainerStatusesNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1PodStatusFluent.EphemeralContainerStatusesNested<A> addNewEphemeralContainerStatusLike(io.kubernetes.client.openapi.models.V1ContainerStatus item) {
        return new io.kubernetes.client.openapi.models.V1PodStatusFluentImpl.EphemeralContainerStatusesNestedImpl(-1, item);
    }

    public io.kubernetes.client.openapi.models.V1PodStatusFluent.EphemeralContainerStatusesNested<A> setNewEphemeralContainerStatusLike(int index,io.kubernetes.client.openapi.models.V1ContainerStatus item) {
        return new io.kubernetes.client.openapi.models.V1PodStatusFluentImpl.EphemeralContainerStatusesNestedImpl(index, item);
    }

    public io.kubernetes.client.openapi.models.V1PodStatusFluent.EphemeralContainerStatusesNested<A> editEphemeralContainerStatus(int index) {
        if (ephemeralContainerStatuses.size() <= index) throw new RuntimeException("Can't edit ephemeralContainerStatuses. Index exceeds size.");
        return setNewEphemeralContainerStatusLike(index, buildEphemeralContainerStatus(index));
    }

    public io.kubernetes.client.openapi.models.V1PodStatusFluent.EphemeralContainerStatusesNested<A> editFirstEphemeralContainerStatus() {
        if (ephemeralContainerStatuses.size() == 0) throw new RuntimeException("Can't edit first ephemeralContainerStatuses. The list is empty.");
        return setNewEphemeralContainerStatusLike(0, buildEphemeralContainerStatus(0));
    }

    public io.kubernetes.client.openapi.models.V1PodStatusFluent.EphemeralContainerStatusesNested<A> editLastEphemeralContainerStatus() {
        int index = ephemeralContainerStatuses.size() - 1;
        if (index < 0) throw new RuntimeException("Can't edit last ephemeralContainerStatuses. The list is empty.");
        return setNewEphemeralContainerStatusLike(index, buildEphemeralContainerStatus(index));
    }

    public io.kubernetes.client.openapi.models.V1PodStatusFluent.EphemeralContainerStatusesNested<A> editMatchingEphemeralContainerStatus(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ContainerStatusBuilder> predicate) {
        int index = -1;
        for (int i=0;i<ephemeralContainerStatuses.size();i++) { 
        if (predicate.test(ephemeralContainerStatuses.get(i))) {index = i; break;}
        } 
        if (index < 0) throw new RuntimeException("Can't edit matching ephemeralContainerStatuses. No match found.");
        return setNewEphemeralContainerStatusLike(index, buildEphemeralContainerStatus(index));
    }

    public java.lang.String getHostIP() {
        return this.hostIP;
    }

    public A withHostIP(java.lang.String hostIP) {
        this.hostIP=hostIP; return (A) this;
    }

    public java.lang.Boolean hasHostIP() {
        return this.hostIP != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withHostIP instead.
     */
        public A withNewHostIP(java.lang.String original) {
        return (A)withHostIP(new String(original));
    }

    public A addToInitContainerStatuses(int index,io.kubernetes.client.openapi.models.V1ContainerStatus item) {
        if (this.initContainerStatuses == null) {this.initContainerStatuses = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ContainerStatusBuilder>();}
        io.kubernetes.client.openapi.models.V1ContainerStatusBuilder builder = new io.kubernetes.client.openapi.models.V1ContainerStatusBuilder(item);_visitables.get("initContainerStatuses").add(index >= 0 ? index : _visitables.get("initContainerStatuses").size(), builder);this.initContainerStatuses.add(index >= 0 ? index : initContainerStatuses.size(), builder); return (A)this;
    }

    public A setToInitContainerStatuses(int index,io.kubernetes.client.openapi.models.V1ContainerStatus item) {
        if (this.initContainerStatuses == null) {this.initContainerStatuses = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ContainerStatusBuilder>();}
        io.kubernetes.client.openapi.models.V1ContainerStatusBuilder builder = new io.kubernetes.client.openapi.models.V1ContainerStatusBuilder(item);
        if (index < 0 || index >= _visitables.get("initContainerStatuses").size()) { _visitables.get("initContainerStatuses").add(builder); } else { _visitables.get("initContainerStatuses").set(index, builder);}
        if (index < 0 || index >= initContainerStatuses.size()) { initContainerStatuses.add(builder); } else { initContainerStatuses.set(index, builder);}
         return (A)this;
    }

    public A addToInitContainerStatuses(io.kubernetes.client.openapi.models.V1ContainerStatus... items) {
        if (this.initContainerStatuses == null) {this.initContainerStatuses = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ContainerStatusBuilder>();}
        for (io.kubernetes.client.openapi.models.V1ContainerStatus item : items) {io.kubernetes.client.openapi.models.V1ContainerStatusBuilder builder = new io.kubernetes.client.openapi.models.V1ContainerStatusBuilder(item);_visitables.get("initContainerStatuses").add(builder);this.initContainerStatuses.add(builder);} return (A)this;
    }

    public A addAllToInitContainerStatuses(java.util.Collection<io.kubernetes.client.openapi.models.V1ContainerStatus> items) {
        if (this.initContainerStatuses == null) {this.initContainerStatuses = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ContainerStatusBuilder>();}
        for (io.kubernetes.client.openapi.models.V1ContainerStatus item : items) {io.kubernetes.client.openapi.models.V1ContainerStatusBuilder builder = new io.kubernetes.client.openapi.models.V1ContainerStatusBuilder(item);_visitables.get("initContainerStatuses").add(builder);this.initContainerStatuses.add(builder);} return (A)this;
    }

    public A removeFromInitContainerStatuses(io.kubernetes.client.openapi.models.V1ContainerStatus... items) {
        for (io.kubernetes.client.openapi.models.V1ContainerStatus item : items) {io.kubernetes.client.openapi.models.V1ContainerStatusBuilder builder = new io.kubernetes.client.openapi.models.V1ContainerStatusBuilder(item);_visitables.get("initContainerStatuses").remove(builder);if (this.initContainerStatuses != null) {this.initContainerStatuses.remove(builder);}} return (A)this;
    }

    public A removeAllFromInitContainerStatuses(java.util.Collection<io.kubernetes.client.openapi.models.V1ContainerStatus> items) {
        for (io.kubernetes.client.openapi.models.V1ContainerStatus item : items) {io.kubernetes.client.openapi.models.V1ContainerStatusBuilder builder = new io.kubernetes.client.openapi.models.V1ContainerStatusBuilder(item);_visitables.get("initContainerStatuses").remove(builder);if (this.initContainerStatuses != null) {this.initContainerStatuses.remove(builder);}} return (A)this;
    }

    public A removeMatchingFromInitContainerStatuses(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ContainerStatusBuilder> predicate) {
        if (initContainerStatuses == null) return (A) this;
        final Iterator<io.kubernetes.client.openapi.models.V1ContainerStatusBuilder> each = initContainerStatuses.iterator();
        final List visitables = _visitables.get("initContainerStatuses");
        while (each.hasNext()) {
          io.kubernetes.client.openapi.models.V1ContainerStatusBuilder builder = each.next();
          if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
          }
        }
        return (A)this;
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildInitContainerStatuses instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1ContainerStatus> getInitContainerStatuses() {
        return build(initContainerStatuses);
    }

    public java.util.List<io.kubernetes.client.openapi.models.V1ContainerStatus> buildInitContainerStatuses() {
        return build(initContainerStatuses);
    }

    public io.kubernetes.client.openapi.models.V1ContainerStatus buildInitContainerStatus(int index) {
        return this.initContainerStatuses.get(index).build();
    }

    public io.kubernetes.client.openapi.models.V1ContainerStatus buildFirstInitContainerStatus() {
        return this.initContainerStatuses.get(0).build();
    }

    public io.kubernetes.client.openapi.models.V1ContainerStatus buildLastInitContainerStatus() {
        return this.initContainerStatuses.get(initContainerStatuses.size() - 1).build();
    }

    public io.kubernetes.client.openapi.models.V1ContainerStatus buildMatchingInitContainerStatus(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ContainerStatusBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.V1ContainerStatusBuilder item: initContainerStatuses) { if(predicate.test(item)){ return item.build();} } return null;
    }

    public java.lang.Boolean hasMatchingInitContainerStatus(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ContainerStatusBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.V1ContainerStatusBuilder item: initContainerStatuses) { if(predicate.test(item)){ return true;} } return false;
    }

    public A withInitContainerStatuses(java.util.List<io.kubernetes.client.openapi.models.V1ContainerStatus> initContainerStatuses) {
        if (this.initContainerStatuses != null) { _visitables.get("initContainerStatuses").removeAll(this.initContainerStatuses);}
        if (initContainerStatuses != null) {this.initContainerStatuses = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ContainerStatusBuilder>(); for (io.kubernetes.client.openapi.models.V1ContainerStatus item : initContainerStatuses){this.addToInitContainerStatuses(item);}} else { this.initContainerStatuses = null;} return (A) this;
    }

    public A withInitContainerStatuses(io.kubernetes.client.openapi.models.V1ContainerStatus... initContainerStatuses) {
        if (this.initContainerStatuses != null) {this.initContainerStatuses.clear();}
        if (initContainerStatuses != null) {for (io.kubernetes.client.openapi.models.V1ContainerStatus item :initContainerStatuses){ this.addToInitContainerStatuses(item);}} return (A) this;
    }

    public java.lang.Boolean hasInitContainerStatuses() {
        return initContainerStatuses != null && !initContainerStatuses.isEmpty();
    }

    public io.kubernetes.client.openapi.models.V1PodStatusFluent.InitContainerStatusesNested<A> addNewInitContainerStatus() {
        return new io.kubernetes.client.openapi.models.V1PodStatusFluentImpl.InitContainerStatusesNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1PodStatusFluent.InitContainerStatusesNested<A> addNewInitContainerStatusLike(io.kubernetes.client.openapi.models.V1ContainerStatus item) {
        return new io.kubernetes.client.openapi.models.V1PodStatusFluentImpl.InitContainerStatusesNestedImpl(-1, item);
    }

    public io.kubernetes.client.openapi.models.V1PodStatusFluent.InitContainerStatusesNested<A> setNewInitContainerStatusLike(int index,io.kubernetes.client.openapi.models.V1ContainerStatus item) {
        return new io.kubernetes.client.openapi.models.V1PodStatusFluentImpl.InitContainerStatusesNestedImpl(index, item);
    }

    public io.kubernetes.client.openapi.models.V1PodStatusFluent.InitContainerStatusesNested<A> editInitContainerStatus(int index) {
        if (initContainerStatuses.size() <= index) throw new RuntimeException("Can't edit initContainerStatuses. Index exceeds size.");
        return setNewInitContainerStatusLike(index, buildInitContainerStatus(index));
    }

    public io.kubernetes.client.openapi.models.V1PodStatusFluent.InitContainerStatusesNested<A> editFirstInitContainerStatus() {
        if (initContainerStatuses.size() == 0) throw new RuntimeException("Can't edit first initContainerStatuses. The list is empty.");
        return setNewInitContainerStatusLike(0, buildInitContainerStatus(0));
    }

    public io.kubernetes.client.openapi.models.V1PodStatusFluent.InitContainerStatusesNested<A> editLastInitContainerStatus() {
        int index = initContainerStatuses.size() - 1;
        if (index < 0) throw new RuntimeException("Can't edit last initContainerStatuses. The list is empty.");
        return setNewInitContainerStatusLike(index, buildInitContainerStatus(index));
    }

    public io.kubernetes.client.openapi.models.V1PodStatusFluent.InitContainerStatusesNested<A> editMatchingInitContainerStatus(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ContainerStatusBuilder> predicate) {
        int index = -1;
        for (int i=0;i<initContainerStatuses.size();i++) { 
        if (predicate.test(initContainerStatuses.get(i))) {index = i; break;}
        } 
        if (index < 0) throw new RuntimeException("Can't edit matching initContainerStatuses. No match found.");
        return setNewInitContainerStatusLike(index, buildInitContainerStatus(index));
    }

    public java.lang.String getMessage() {
        return this.message;
    }

    public A withMessage(java.lang.String message) {
        this.message=message; return (A) this;
    }

    public java.lang.Boolean hasMessage() {
        return this.message != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withMessage instead.
     */
        public A withNewMessage(java.lang.String original) {
        return (A)withMessage(new String(original));
    }

    public java.lang.String getNominatedNodeName() {
        return this.nominatedNodeName;
    }

    public A withNominatedNodeName(java.lang.String nominatedNodeName) {
        this.nominatedNodeName=nominatedNodeName; return (A) this;
    }

    public java.lang.Boolean hasNominatedNodeName() {
        return this.nominatedNodeName != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withNominatedNodeName instead.
     */
        public A withNewNominatedNodeName(java.lang.String original) {
        return (A)withNominatedNodeName(new String(original));
    }

    public java.lang.String getPhase() {
        return this.phase;
    }

    public A withPhase(java.lang.String phase) {
        this.phase=phase; return (A) this;
    }

    public java.lang.Boolean hasPhase() {
        return this.phase != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withPhase instead.
     */
        public A withNewPhase(java.lang.String original) {
        return (A)withPhase(new String(original));
    }

    public java.lang.String getPodIP() {
        return this.podIP;
    }

    public A withPodIP(java.lang.String podIP) {
        this.podIP=podIP; return (A) this;
    }

    public java.lang.Boolean hasPodIP() {
        return this.podIP != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withPodIP instead.
     */
        public A withNewPodIP(java.lang.String original) {
        return (A)withPodIP(new String(original));
    }

    public A addToPodIPs(int index,io.kubernetes.client.openapi.models.V1PodIP item) {
        if (this.podIPs == null) {this.podIPs = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1PodIPBuilder>();}
        io.kubernetes.client.openapi.models.V1PodIPBuilder builder = new io.kubernetes.client.openapi.models.V1PodIPBuilder(item);_visitables.get("podIPs").add(index >= 0 ? index : _visitables.get("podIPs").size(), builder);this.podIPs.add(index >= 0 ? index : podIPs.size(), builder); return (A)this;
    }

    public A setToPodIPs(int index,io.kubernetes.client.openapi.models.V1PodIP item) {
        if (this.podIPs == null) {this.podIPs = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1PodIPBuilder>();}
        io.kubernetes.client.openapi.models.V1PodIPBuilder builder = new io.kubernetes.client.openapi.models.V1PodIPBuilder(item);
        if (index < 0 || index >= _visitables.get("podIPs").size()) { _visitables.get("podIPs").add(builder); } else { _visitables.get("podIPs").set(index, builder);}
        if (index < 0 || index >= podIPs.size()) { podIPs.add(builder); } else { podIPs.set(index, builder);}
         return (A)this;
    }

    public A addToPodIPs(io.kubernetes.client.openapi.models.V1PodIP... items) {
        if (this.podIPs == null) {this.podIPs = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1PodIPBuilder>();}
        for (io.kubernetes.client.openapi.models.V1PodIP item : items) {io.kubernetes.client.openapi.models.V1PodIPBuilder builder = new io.kubernetes.client.openapi.models.V1PodIPBuilder(item);_visitables.get("podIPs").add(builder);this.podIPs.add(builder);} return (A)this;
    }

    public A addAllToPodIPs(java.util.Collection<io.kubernetes.client.openapi.models.V1PodIP> items) {
        if (this.podIPs == null) {this.podIPs = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1PodIPBuilder>();}
        for (io.kubernetes.client.openapi.models.V1PodIP item : items) {io.kubernetes.client.openapi.models.V1PodIPBuilder builder = new io.kubernetes.client.openapi.models.V1PodIPBuilder(item);_visitables.get("podIPs").add(builder);this.podIPs.add(builder);} return (A)this;
    }

    public A removeFromPodIPs(io.kubernetes.client.openapi.models.V1PodIP... items) {
        for (io.kubernetes.client.openapi.models.V1PodIP item : items) {io.kubernetes.client.openapi.models.V1PodIPBuilder builder = new io.kubernetes.client.openapi.models.V1PodIPBuilder(item);_visitables.get("podIPs").remove(builder);if (this.podIPs != null) {this.podIPs.remove(builder);}} return (A)this;
    }

    public A removeAllFromPodIPs(java.util.Collection<io.kubernetes.client.openapi.models.V1PodIP> items) {
        for (io.kubernetes.client.openapi.models.V1PodIP item : items) {io.kubernetes.client.openapi.models.V1PodIPBuilder builder = new io.kubernetes.client.openapi.models.V1PodIPBuilder(item);_visitables.get("podIPs").remove(builder);if (this.podIPs != null) {this.podIPs.remove(builder);}} return (A)this;
    }

    public A removeMatchingFromPodIPs(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PodIPBuilder> predicate) {
        if (podIPs == null) return (A) this;
        final Iterator<io.kubernetes.client.openapi.models.V1PodIPBuilder> each = podIPs.iterator();
        final List visitables = _visitables.get("podIPs");
        while (each.hasNext()) {
          io.kubernetes.client.openapi.models.V1PodIPBuilder builder = each.next();
          if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
          }
        }
        return (A)this;
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildPodIPs instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1PodIP> getPodIPs() {
        return build(podIPs);
    }

    public java.util.List<io.kubernetes.client.openapi.models.V1PodIP> buildPodIPs() {
        return build(podIPs);
    }

    public io.kubernetes.client.openapi.models.V1PodIP buildPodIP(int index) {
        return this.podIPs.get(index).build();
    }

    public io.kubernetes.client.openapi.models.V1PodIP buildFirstPodIP() {
        return this.podIPs.get(0).build();
    }

    public io.kubernetes.client.openapi.models.V1PodIP buildLastPodIP() {
        return this.podIPs.get(podIPs.size() - 1).build();
    }

    public io.kubernetes.client.openapi.models.V1PodIP buildMatchingPodIP(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PodIPBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.V1PodIPBuilder item: podIPs) { if(predicate.test(item)){ return item.build();} } return null;
    }

    public java.lang.Boolean hasMatchingPodIP(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PodIPBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.V1PodIPBuilder item: podIPs) { if(predicate.test(item)){ return true;} } return false;
    }

    public A withPodIPs(java.util.List<io.kubernetes.client.openapi.models.V1PodIP> podIPs) {
        if (this.podIPs != null) { _visitables.get("podIPs").removeAll(this.podIPs);}
        if (podIPs != null) {this.podIPs = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1PodIPBuilder>(); for (io.kubernetes.client.openapi.models.V1PodIP item : podIPs){this.addToPodIPs(item);}} else { this.podIPs = null;} return (A) this;
    }

    public A withPodIPs(io.kubernetes.client.openapi.models.V1PodIP... podIPs) {
        if (this.podIPs != null) {this.podIPs.clear();}
        if (podIPs != null) {for (io.kubernetes.client.openapi.models.V1PodIP item :podIPs){ this.addToPodIPs(item);}} return (A) this;
    }

    public java.lang.Boolean hasPodIPs() {
        return podIPs != null && !podIPs.isEmpty();
    }

    public io.kubernetes.client.openapi.models.V1PodStatusFluent.PodIPsNested<A> addNewPodIP() {
        return new io.kubernetes.client.openapi.models.V1PodStatusFluentImpl.PodIPsNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1PodStatusFluent.PodIPsNested<A> addNewPodIPLike(io.kubernetes.client.openapi.models.V1PodIP item) {
        return new io.kubernetes.client.openapi.models.V1PodStatusFluentImpl.PodIPsNestedImpl(-1, item);
    }

    public io.kubernetes.client.openapi.models.V1PodStatusFluent.PodIPsNested<A> setNewPodIPLike(int index,io.kubernetes.client.openapi.models.V1PodIP item) {
        return new io.kubernetes.client.openapi.models.V1PodStatusFluentImpl.PodIPsNestedImpl(index, item);
    }

    public io.kubernetes.client.openapi.models.V1PodStatusFluent.PodIPsNested<A> editPodIP(int index) {
        if (podIPs.size() <= index) throw new RuntimeException("Can't edit podIPs. Index exceeds size.");
        return setNewPodIPLike(index, buildPodIP(index));
    }

    public io.kubernetes.client.openapi.models.V1PodStatusFluent.PodIPsNested<A> editFirstPodIP() {
        if (podIPs.size() == 0) throw new RuntimeException("Can't edit first podIPs. The list is empty.");
        return setNewPodIPLike(0, buildPodIP(0));
    }

    public io.kubernetes.client.openapi.models.V1PodStatusFluent.PodIPsNested<A> editLastPodIP() {
        int index = podIPs.size() - 1;
        if (index < 0) throw new RuntimeException("Can't edit last podIPs. The list is empty.");
        return setNewPodIPLike(index, buildPodIP(index));
    }

    public io.kubernetes.client.openapi.models.V1PodStatusFluent.PodIPsNested<A> editMatchingPodIP(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PodIPBuilder> predicate) {
        int index = -1;
        for (int i=0;i<podIPs.size();i++) { 
        if (predicate.test(podIPs.get(i))) {index = i; break;}
        } 
        if (index < 0) throw new RuntimeException("Can't edit matching podIPs. No match found.");
        return setNewPodIPLike(index, buildPodIP(index));
    }

    public java.lang.String getQosClass() {
        return this.qosClass;
    }

    public A withQosClass(java.lang.String qosClass) {
        this.qosClass=qosClass; return (A) this;
    }

    public java.lang.Boolean hasQosClass() {
        return this.qosClass != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withQosClass instead.
     */
        public A withNewQosClass(java.lang.String original) {
        return (A)withQosClass(new String(original));
    }

    public java.lang.String getReason() {
        return this.reason;
    }

    public A withReason(java.lang.String reason) {
        this.reason=reason; return (A) this;
    }

    public java.lang.Boolean hasReason() {
        return this.reason != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withReason instead.
     */
        public A withNewReason(java.lang.String original) {
        return (A)withReason(new String(original));
    }

    public java.time.OffsetDateTime getStartTime() {
        return this.startTime;
    }

    public A withStartTime(java.time.OffsetDateTime startTime) {
        this.startTime=startTime; return (A) this;
    }

    public java.lang.Boolean hasStartTime() {
        return this.startTime != null;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1PodStatusFluentImpl that = (V1PodStatusFluentImpl) o;
        if (conditions != null ? !conditions.equals(that.conditions) :that.conditions != null) return false;
        if (containerStatuses != null ? !containerStatuses.equals(that.containerStatuses) :that.containerStatuses != null) return false;
        if (ephemeralContainerStatuses != null ? !ephemeralContainerStatuses.equals(that.ephemeralContainerStatuses) :that.ephemeralContainerStatuses != null) return false;
        if (hostIP != null ? !hostIP.equals(that.hostIP) :that.hostIP != null) return false;
        if (initContainerStatuses != null ? !initContainerStatuses.equals(that.initContainerStatuses) :that.initContainerStatuses != null) return false;
        if (message != null ? !message.equals(that.message) :that.message != null) return false;
        if (nominatedNodeName != null ? !nominatedNodeName.equals(that.nominatedNodeName) :that.nominatedNodeName != null) return false;
        if (phase != null ? !phase.equals(that.phase) :that.phase != null) return false;
        if (podIP != null ? !podIP.equals(that.podIP) :that.podIP != null) return false;
        if (podIPs != null ? !podIPs.equals(that.podIPs) :that.podIPs != null) return false;
        if (qosClass != null ? !qosClass.equals(that.qosClass) :that.qosClass != null) return false;
        if (reason != null ? !reason.equals(that.reason) :that.reason != null) return false;
        if (startTime != null ? !startTime.equals(that.startTime) :that.startTime != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(conditions,  containerStatuses,  ephemeralContainerStatuses,  hostIP,  initContainerStatuses,  message,  nominatedNodeName,  phase,  podIP,  podIPs,  qosClass,  reason,  startTime,  super.hashCode());
    }

    public class ConditionsNestedImpl<N> extends io.kubernetes.client.openapi.models.V1PodConditionFluentImpl<io.kubernetes.client.openapi.models.V1PodStatusFluent.ConditionsNested<N>> implements io.kubernetes.client.openapi.models.V1PodStatusFluent.ConditionsNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1PodConditionBuilder builder;
        private final int index;

            ConditionsNestedImpl(int index,io.kubernetes.client.openapi.models.V1PodCondition item) {
                this.index = index;
                this.builder = new io.kubernetes.client.openapi.models.V1PodConditionBuilder(this, item);
                        
            }

            ConditionsNestedImpl() {
                this.index = -1;
                this.builder = new io.kubernetes.client.openapi.models.V1PodConditionBuilder(this);
                        
            }

            public N and() {
                return (N) V1PodStatusFluentImpl.this.setToConditions(index,builder.build());
            }

            public N endCondition() {
                return and();
            }
    }


    public class ContainerStatusesNestedImpl<N> extends io.kubernetes.client.openapi.models.V1ContainerStatusFluentImpl<io.kubernetes.client.openapi.models.V1PodStatusFluent.ContainerStatusesNested<N>> implements io.kubernetes.client.openapi.models.V1PodStatusFluent.ContainerStatusesNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1ContainerStatusBuilder builder;
        private final int index;

            ContainerStatusesNestedImpl(int index,io.kubernetes.client.openapi.models.V1ContainerStatus item) {
                this.index = index;
                this.builder = new io.kubernetes.client.openapi.models.V1ContainerStatusBuilder(this, item);
                        
            }

            ContainerStatusesNestedImpl() {
                this.index = -1;
                this.builder = new io.kubernetes.client.openapi.models.V1ContainerStatusBuilder(this);
                        
            }

            public N and() {
                return (N) V1PodStatusFluentImpl.this.setToContainerStatuses(index,builder.build());
            }

            public N endContainerStatus() {
                return and();
            }
    }


    public class EphemeralContainerStatusesNestedImpl<N> extends io.kubernetes.client.openapi.models.V1ContainerStatusFluentImpl<io.kubernetes.client.openapi.models.V1PodStatusFluent.EphemeralContainerStatusesNested<N>> implements io.kubernetes.client.openapi.models.V1PodStatusFluent.EphemeralContainerStatusesNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1ContainerStatusBuilder builder;
        private final int index;

            EphemeralContainerStatusesNestedImpl(int index,io.kubernetes.client.openapi.models.V1ContainerStatus item) {
                this.index = index;
                this.builder = new io.kubernetes.client.openapi.models.V1ContainerStatusBuilder(this, item);
                        
            }

            EphemeralContainerStatusesNestedImpl() {
                this.index = -1;
                this.builder = new io.kubernetes.client.openapi.models.V1ContainerStatusBuilder(this);
                        
            }

            public N and() {
                return (N) V1PodStatusFluentImpl.this.setToEphemeralContainerStatuses(index,builder.build());
            }

            public N endEphemeralContainerStatus() {
                return and();
            }
    }


    public class InitContainerStatusesNestedImpl<N> extends io.kubernetes.client.openapi.models.V1ContainerStatusFluentImpl<io.kubernetes.client.openapi.models.V1PodStatusFluent.InitContainerStatusesNested<N>> implements io.kubernetes.client.openapi.models.V1PodStatusFluent.InitContainerStatusesNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1ContainerStatusBuilder builder;
        private final int index;

            InitContainerStatusesNestedImpl(int index,io.kubernetes.client.openapi.models.V1ContainerStatus item) {
                this.index = index;
                this.builder = new io.kubernetes.client.openapi.models.V1ContainerStatusBuilder(this, item);
                        
            }

            InitContainerStatusesNestedImpl() {
                this.index = -1;
                this.builder = new io.kubernetes.client.openapi.models.V1ContainerStatusBuilder(this);
                        
            }

            public N and() {
                return (N) V1PodStatusFluentImpl.this.setToInitContainerStatuses(index,builder.build());
            }

            public N endInitContainerStatus() {
                return and();
            }
    }


    public class PodIPsNestedImpl<N> extends io.kubernetes.client.openapi.models.V1PodIPFluentImpl<io.kubernetes.client.openapi.models.V1PodStatusFluent.PodIPsNested<N>> implements io.kubernetes.client.openapi.models.V1PodStatusFluent.PodIPsNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1PodIPBuilder builder;
        private final int index;

            PodIPsNestedImpl(int index,io.kubernetes.client.openapi.models.V1PodIP item) {
                this.index = index;
                this.builder = new io.kubernetes.client.openapi.models.V1PodIPBuilder(this, item);
                        
            }

            PodIPsNestedImpl() {
                this.index = -1;
                this.builder = new io.kubernetes.client.openapi.models.V1PodIPBuilder(this);
                        
            }

            public N and() {
                return (N) V1PodStatusFluentImpl.this.setToPodIPs(index,builder.build());
            }

            public N endPodIP() {
                return and();
            }
    }


}
