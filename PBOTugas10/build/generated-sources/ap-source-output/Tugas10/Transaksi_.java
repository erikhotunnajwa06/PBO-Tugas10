package Tugas10;

import Tugas10.Sembako;
import java.sql.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-11-06T00:10:46", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Transaksi.class)
public class Transaksi_ { 

    public static volatile SingularAttribute<Transaksi, Integer> jumlah;
    public static volatile SingularAttribute<Transaksi, String> idTransaksi;
    public static volatile SingularAttribute<Transaksi, Sembako> kodeBarang;
    public static volatile SingularAttribute<Transaksi, Date> tanggal;

}