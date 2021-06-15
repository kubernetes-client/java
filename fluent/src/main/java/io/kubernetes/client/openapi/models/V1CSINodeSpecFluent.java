package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

public interface V1CSINodeSpecFluent<A extends io.kubernetes.client.openapi.models.V1CSINodeSpecFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public A addToDrivers(int index,io.kubernetes.client.openapi.models.V1CSINodeDriver item);
    public A setToDrivers(int index,io.kubernetes.client.openapi.models.V1CSINodeDriver item);
    public A addToDrivers(io.kubernetes.client.openapi.models.V1CSINodeDriver... items);
    public A addAllToDrivers(java.util.Collection<io.kubernetes.client.openapi.models.V1CSINodeDriver> items);
    public A removeFromDrivers(io.kubernetes.client.openapi.models.V1CSINodeDriver... items);
    public A removeAllFromDrivers(java.util.Collection<io.kubernetes.client.openapi.models.V1CSINodeDriver> items);
    public A removeMatchingFromDrivers(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1CSINodeDriverBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildDrivers instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1CSINodeDriver> getDrivers();
    public java.util.List<io.kubernetes.client.openapi.models.V1CSINodeDriver> buildDrivers();
    public io.kubernetes.client.openapi.models.V1CSINodeDriver buildDriver(int index);
    public io.kubernetes.client.openapi.models.V1CSINodeDriver buildFirstDriver();
    public io.kubernetes.client.openapi.models.V1CSINodeDriver buildLastDriver();
    public io.kubernetes.client.openapi.models.V1CSINodeDriver buildMatchingDriver(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1CSINodeDriverBuilder> predicate);
    public java.lang.Boolean hasMatchingDriver(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1CSINodeDriverBuilder> predicate);
    public A withDrivers(java.util.List<io.kubernetes.client.openapi.models.V1CSINodeDriver> drivers);
    public A withDrivers(io.kubernetes.client.openapi.models.V1CSINodeDriver... drivers);
    public java.lang.Boolean hasDrivers();
    public io.kubernetes.client.openapi.models.V1CSINodeSpecFluent.DriversNested<A> addNewDriver();
    public io.kubernetes.client.openapi.models.V1CSINodeSpecFluent.DriversNested<A> addNewDriverLike(io.kubernetes.client.openapi.models.V1CSINodeDriver item);
    public io.kubernetes.client.openapi.models.V1CSINodeSpecFluent.DriversNested<A> setNewDriverLike(int index,io.kubernetes.client.openapi.models.V1CSINodeDriver item);
    public io.kubernetes.client.openapi.models.V1CSINodeSpecFluent.DriversNested<A> editDriver(int index);
    public io.kubernetes.client.openapi.models.V1CSINodeSpecFluent.DriversNested<A> editFirstDriver();
    public io.kubernetes.client.openapi.models.V1CSINodeSpecFluent.DriversNested<A> editLastDriver();
    public io.kubernetes.client.openapi.models.V1CSINodeSpecFluent.DriversNested<A> editMatchingDriver(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1CSINodeDriverBuilder> predicate);
    public interface DriversNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1CSINodeDriverFluent<io.kubernetes.client.openapi.models.V1CSINodeSpecFluent.DriversNested<N>> {

            public N and();
            public N endDriver();    }


}
