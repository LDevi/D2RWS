package ldev.net.d2baserepository.entity.relations;


import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Relation;

import java.util.List;

import ldev.net.d2baserepository.entity.RunewordDefinitionEntity;
import ldev.net.d2baserepository.entity.RunewordItem;
import ldev.net.d2baserepository.entity.RunewordPropertyParamEntity;
import ldev.net.d2baserepository.entity.RunewordRune;

public class RunewordRelation {
    @Embedded
    RunewordDefinitionEntity runewordDefinitionEntity;

    @Relation(parentColumn = "name", entityColumn = "parentRuneword", entity = RunewordPropertyParamEntity.class)
    List<RunewordPropertyParamEntity> runewordProperties;
    @Relation(parentColumn = "name", entityColumn = "runewordName")
    List<RunewordRune> runeCompo;
    @Relation(parentColumn = "name", entityColumn = "runewordName")
    List<RunewordItem> itemTypes;
}
