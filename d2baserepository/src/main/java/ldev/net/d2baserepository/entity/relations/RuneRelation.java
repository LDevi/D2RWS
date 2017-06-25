package ldev.net.d2baserepository.entity.relations;


import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Relation;

import java.util.List;

import ldev.net.d2baserepository.entity.RunewordRune;
import ldev.net.d2baserepository.entity.SocketableEntity;

public class RuneRelation {
    @Embedded
    SocketableEntity socketableEntity;

    @Relation(parentColumn = "code", entityColumn = "runeCode", entity = RunewordRune.class, projection = "runewordName")
    List<String> runewordIdList;

}
