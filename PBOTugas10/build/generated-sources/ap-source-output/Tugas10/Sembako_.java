package Tugas10;

import Tugas10.Transaksi;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-11-06T00:10:46", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Sembako.class)
public class Sembako_ { 

    public static volatile SingularAttribute<Sembako, String> quantity;
    public static volatile CollectionAttribute<Sembako, Transaksi> transaksiCollection;
    public static volatile SingularAttribute<Sembako, String> kodeBarang;
    public static volatile SingularAttribute<Sembako, String> namaBarang;
    public static volatile SingularAttribute<Sembako, String> hargaBarang;

}