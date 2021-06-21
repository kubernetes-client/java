package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class EventsV1EventListBuilder extends io.kubernetes.client.openapi.models.EventsV1EventListFluentImpl<io.kubernetes.client.openapi.models.EventsV1EventListBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.EventsV1EventList,io.kubernetes.client.openapi.models.EventsV1EventListBuilder> {

    io.kubernetes.client.openapi.models.EventsV1EventListFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public EventsV1EventListBuilder() {
        this(true);
    }

    public EventsV1EventListBuilder(java.lang.Boolean validationEnabled) {
        this(new EventsV1EventList(), validationEnabled);
    }

    public EventsV1EventListBuilder(io.kubernetes.client.openapi.models.EventsV1EventListFluent<?> fluent) {
        this(fluent, true);
    }

    public EventsV1EventListBuilder(io.kubernetes.client.openapi.models.EventsV1EventListFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new EventsV1EventList(), validationEnabled);
    }

    public EventsV1EventListBuilder(io.kubernetes.client.openapi.models.EventsV1EventListFluent<?> fluent,io.kubernetes.client.openapi.models.EventsV1EventList instance) {
        this(fluent, instance, true);
    }

    public EventsV1EventListBuilder(io.kubernetes.client.openapi.models.EventsV1EventListFluent<?> fluent,io.kubernetes.client.openapi.models.EventsV1EventList instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withApiVersion(instance.getApiVersion());
        
        fluent.withItems(instance.getItems());
        
        fluent.withKind(instance.getKind());
        
        fluent.withMetadata(instance.getMetadata());
        
        this.validationEnabled = validationEnabled; 
    }

    public EventsV1EventListBuilder(io.kubernetes.client.openapi.models.EventsV1EventList instance) {
        this(instance,true);
    }

    public EventsV1EventListBuilder(io.kubernetes.client.openapi.models.EventsV1EventList instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withApiVersion(instance.getApiVersion());
        
        this.withItems(instance.getItems());
        
        this.withKind(instance.getKind());
        
        this.withMetadata(instance.getMetadata());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.EventsV1EventList build() {
        EventsV1EventList buildable = new EventsV1EventList();
        buildable.setApiVersion(fluent.getApiVersion());
        buildable.setItems(fluent.getItems());
        buildable.setKind(fluent.getKind());
        buildable.setMetadata(fluent.getMetadata());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        EventsV1EventListBuilder that = (EventsV1EventListBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
