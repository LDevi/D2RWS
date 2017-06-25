package ldev.net.d2baserepository.entity;

import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Entity;

import ldev.net.d2baserepository.entity.bean.PropertyParam;

@Entity(primaryKeys = {"code", "position", "parentRuneword"})
public class RunewordPropertyParamEntity {
    String code;
    Integer position;
    String parentRuneword;
    @Embedded
    PropertyParam propertyParam;
}
