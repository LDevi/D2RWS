package ldev.net.d2baserepository.entity;

import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.util.Map;

@Entity
public class SocketableEntity {


    String name;

    String letter;

    String transform;

    @PrimaryKey
    String code;
    @Embedded
    Map<Integer, SocketablePropertyParamEntity> weaponMods;
    @Embedded
    Map<Integer, SocketablePropertyParamEntity> helmArmorMods;
    Map<Integer, SocketablePropertyParamEntity> shieldMods;
}
