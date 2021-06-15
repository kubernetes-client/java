package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

public interface V1alpha1RuntimeClassSpecFluent<A extends io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildOverhead instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1alpha1Overhead getOverhead();
    public io.kubernetes.client.openapi.models.V1alpha1Overhead buildOverhead();
    public A withOverhead(io.kubernetes.client.openapi.models.V1alpha1Overhead overhead);
    public java.lang.Boolean hasOverhead();
    public io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecFluent.OverheadNested<A> withNewOverhead();
    public io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecFluent.OverheadNested<A> withNewOverheadLike(io.kubernetes.client.openapi.models.V1alpha1Overhead item);
    public io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecFluent.OverheadNested<A> editOverhead();
    public io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecFluent.OverheadNested<A> editOrNewOverhead();
    public io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecFluent.OverheadNested<A> editOrNewOverheadLike(io.kubernetes.client.openapi.models.V1alpha1Overhead item);
    public java.lang.String getRuntimeHandler();
    public A withRuntimeHandler(java.lang.String runtimeHandler);
    public java.lang.Boolean hasRuntimeHandler();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withRuntimeHandler instead.
     */
        public A withNewRuntimeHandler(java.lang.String original);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildScheduling instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1alpha1Scheduling getScheduling();
    public io.kubernetes.client.openapi.models.V1alpha1Scheduling buildScheduling();
    public A withScheduling(io.kubernetes.client.openapi.models.V1alpha1Scheduling scheduling);
    public java.lang.Boolean hasScheduling();
    public io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecFluent.SchedulingNested<A> withNewScheduling();
    public io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecFluent.SchedulingNested<A> withNewSchedulingLike(io.kubernetes.client.openapi.models.V1alpha1Scheduling item);
    public io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecFluent.SchedulingNested<A> editScheduling();
    public io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecFluent.SchedulingNested<A> editOrNewScheduling();
    public io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecFluent.SchedulingNested<A> editOrNewSchedulingLike(io.kubernetes.client.openapi.models.V1alpha1Scheduling item);
    public interface OverheadNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1alpha1OverheadFluent<io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecFluent.OverheadNested<N>> {

            public N and();
            public N endOverhead();    }


    public interface SchedulingNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1alpha1SchedulingFluent<io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecFluent.SchedulingNested<N>> {

            public N and();
            public N endScheduling();    }


}
