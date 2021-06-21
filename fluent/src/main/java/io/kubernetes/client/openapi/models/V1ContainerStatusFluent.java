package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Integer;
import java.lang.Deprecated;
import java.lang.Boolean;

public interface V1ContainerStatusFluent<A extends io.kubernetes.client.openapi.models.V1ContainerStatusFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getContainerID();
    public A withContainerID(java.lang.String containerID);
    public java.lang.Boolean hasContainerID();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withContainerID instead.
     */
        public A withNewContainerID(java.lang.String original);
    public java.lang.String getImage();
    public A withImage(java.lang.String image);
    public java.lang.Boolean hasImage();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withImage instead.
     */
        public A withNewImage(java.lang.String original);
    public java.lang.String getImageID();
    public A withImageID(java.lang.String imageID);
    public java.lang.Boolean hasImageID();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withImageID instead.
     */
        public A withNewImageID(java.lang.String original);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildLastState instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1ContainerState getLastState();
    public io.kubernetes.client.openapi.models.V1ContainerState buildLastState();
    public A withLastState(io.kubernetes.client.openapi.models.V1ContainerState lastState);
    public java.lang.Boolean hasLastState();
    public io.kubernetes.client.openapi.models.V1ContainerStatusFluent.LastStateNested<A> withNewLastState();
    public io.kubernetes.client.openapi.models.V1ContainerStatusFluent.LastStateNested<A> withNewLastStateLike(io.kubernetes.client.openapi.models.V1ContainerState item);
    public io.kubernetes.client.openapi.models.V1ContainerStatusFluent.LastStateNested<A> editLastState();
    public io.kubernetes.client.openapi.models.V1ContainerStatusFluent.LastStateNested<A> editOrNewLastState();
    public io.kubernetes.client.openapi.models.V1ContainerStatusFluent.LastStateNested<A> editOrNewLastStateLike(io.kubernetes.client.openapi.models.V1ContainerState item);
    public java.lang.String getName();
    public A withName(java.lang.String name);
    public java.lang.Boolean hasName();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withName instead.
     */
        public A withNewName(java.lang.String original);
    public java.lang.Boolean getReady();
    public A withReady(java.lang.Boolean ready);
    public java.lang.Boolean hasReady();
    public java.lang.Integer getRestartCount();
    public A withRestartCount(java.lang.Integer restartCount);
    public java.lang.Boolean hasRestartCount();
    public java.lang.Boolean getStarted();
    public A withStarted(java.lang.Boolean started);
    public java.lang.Boolean hasStarted();
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildState instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1ContainerState getState();
    public io.kubernetes.client.openapi.models.V1ContainerState buildState();
    public A withState(io.kubernetes.client.openapi.models.V1ContainerState state);
    public java.lang.Boolean hasState();
    public io.kubernetes.client.openapi.models.V1ContainerStatusFluent.StateNested<A> withNewState();
    public io.kubernetes.client.openapi.models.V1ContainerStatusFluent.StateNested<A> withNewStateLike(io.kubernetes.client.openapi.models.V1ContainerState item);
    public io.kubernetes.client.openapi.models.V1ContainerStatusFluent.StateNested<A> editState();
    public io.kubernetes.client.openapi.models.V1ContainerStatusFluent.StateNested<A> editOrNewState();
    public io.kubernetes.client.openapi.models.V1ContainerStatusFluent.StateNested<A> editOrNewStateLike(io.kubernetes.client.openapi.models.V1ContainerState item);
    public interface LastStateNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1ContainerStateFluent<io.kubernetes.client.openapi.models.V1ContainerStatusFluent.LastStateNested<N>> {

            public N and();
            public N endLastState();    }


    public interface StateNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1ContainerStateFluent<io.kubernetes.client.openapi.models.V1ContainerStatusFluent.StateNested<N>> {

            public N and();
            public N endState();    }


}
