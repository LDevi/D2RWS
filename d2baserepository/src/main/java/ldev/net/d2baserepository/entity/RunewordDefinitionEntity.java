package ldev.net.d2baserepository.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class RunewordDefinitionEntity {
    @PrimaryKey
    String name;
    Boolean complete;
    Boolean server;
}
