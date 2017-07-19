package ldev.net.d2rws.persistence.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by ldevineau on 24/06/2017.
 */
@Entity
public class RunewordDef {

    @PrimaryKey
    String name;

    boolean complete;
    boolean server;
    ItemType itype1;
    ItemType itype2;
    ItemType itype3;
    ItemType itype4;
    ItemType itype5;
    ItemType itype6;
    Rune Rune1;
    Rune Rune2;
    Rune Rune3;
    Rune Rune4;
    Rune Rune5;
    Rune Rune6;

    Propertie T1Code1;
    PropertieParam        T1Param1;
    int T1Min1;
    int        T1Max1;

    T1Code2


            T1Param2
    T1Min2
            T1Max2

    T1Code3
            T1Param3
    T1Min3
            T1Max3

    T1Code4
            T1Param4
    T1Min4
            T1Max4
    T1Code5
            T1Param5
    T1Min5
            T1Max5
    T1Code6
            T1Param6
    T1Min6
            T1Max6
    T1Code7
            T1Param7
    T1Min7
            T1Max7

}
