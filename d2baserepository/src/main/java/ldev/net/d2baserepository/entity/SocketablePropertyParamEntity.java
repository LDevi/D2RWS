package ldev.net.d2baserepository.entity;

import android.arch.persistence.room.Entity;

import ldev.net.d2baserepository.entity.bean.PropertyParam;
import ldev.net.d2baserepository.entity.bean.PropertyParamType;

@Entity(primaryKeys = {"code", "parentRuneword", "position"})
class SocketablePropertyParamEntity {
    String code;
    SocketableEntity parentSocketable;
    Integer position;
    PropertyParamType propertyParamType;
    PropertyParam propertyParam;
}
