package ldev.net.d2baserepository.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by ldevineau on 25/06/2017.
 */

@Entity
public class ItemTypeEntity {
    @PrimaryKey
    String code;
    String equiv1;
    String equiv2;
}
