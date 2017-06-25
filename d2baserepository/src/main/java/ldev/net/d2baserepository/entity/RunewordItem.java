package ldev.net.d2baserepository.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity()
public class RunewordItem {
    @PrimaryKey(autoGenerate = true)
    Long id;
    String runewordName;
    String itemCode;
}
