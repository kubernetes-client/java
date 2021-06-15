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

public interface V1ProjectedVolumeSourceFluent<A extends io.kubernetes.client.openapi.models.V1ProjectedVolumeSourceFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.Integer getDefaultMode();
    public A withDefaultMode(java.lang.Integer defaultMode);
    public java.lang.Boolean hasDefaultMode();
    public A addToSources(int index,io.kubernetes.client.openapi.models.V1VolumeProjection item);
    public A setToSources(int index,io.kubernetes.client.openapi.models.V1VolumeProjection item);
    public A addToSources(io.kubernetes.client.openapi.models.V1VolumeProjection... items);
    public A addAllToSources(java.util.Collection<io.kubernetes.client.openapi.models.V1VolumeProjection> items);
    public A removeFromSources(io.kubernetes.client.openapi.models.V1VolumeProjection... items);
    public A removeAllFromSources(java.util.Collection<io.kubernetes.client.openapi.models.V1VolumeProjection> items);
    public A removeMatchingFromSources(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1VolumeProjectionBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildSources instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1VolumeProjection> getSources();
    public java.util.List<io.kubernetes.client.openapi.models.V1VolumeProjection> buildSources();
    public io.kubernetes.client.openapi.models.V1VolumeProjection buildSource(int index);
    public io.kubernetes.client.openapi.models.V1VolumeProjection buildFirstSource();
    public io.kubernetes.client.openapi.models.V1VolumeProjection buildLastSource();
    public io.kubernetes.client.openapi.models.V1VolumeProjection buildMatchingSource(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1VolumeProjectionBuilder> predicate);
    public java.lang.Boolean hasMatchingSource(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1VolumeProjectionBuilder> predicate);
    public A withSources(java.util.List<io.kubernetes.client.openapi.models.V1VolumeProjection> sources);
    public A withSources(io.kubernetes.client.openapi.models.V1VolumeProjection... sources);
    public java.lang.Boolean hasSources();
    public io.kubernetes.client.openapi.models.V1ProjectedVolumeSourceFluent.SourcesNested<A> addNewSource();
    public io.kubernetes.client.openapi.models.V1ProjectedVolumeSourceFluent.SourcesNested<A> addNewSourceLike(io.kubernetes.client.openapi.models.V1VolumeProjection item);
    public io.kubernetes.client.openapi.models.V1ProjectedVolumeSourceFluent.SourcesNested<A> setNewSourceLike(int index,io.kubernetes.client.openapi.models.V1VolumeProjection item);
    public io.kubernetes.client.openapi.models.V1ProjectedVolumeSourceFluent.SourcesNested<A> editSource(int index);
    public io.kubernetes.client.openapi.models.V1ProjectedVolumeSourceFluent.SourcesNested<A> editFirstSource();
    public io.kubernetes.client.openapi.models.V1ProjectedVolumeSourceFluent.SourcesNested<A> editLastSource();
    public io.kubernetes.client.openapi.models.V1ProjectedVolumeSourceFluent.SourcesNested<A> editMatchingSource(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1VolumeProjectionBuilder> predicate);
    public interface SourcesNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1VolumeProjectionFluent<io.kubernetes.client.openapi.models.V1ProjectedVolumeSourceFluent.SourcesNested<N>> {

            public N and();
            public N endSource();    }


}
