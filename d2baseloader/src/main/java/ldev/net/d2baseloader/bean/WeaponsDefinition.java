package ldev.net.d2baseloader.bean;

import com.opencsv.bean.CsvBindByName;

public class WeaponsDefinition {

    @CsvBindByName
    String name;
    @CsvBindByName
    String type;
    @CsvBindByName
    String type2;
    @CsvBindByName
    String code;
    @CsvBindByName
    String alternateGfx;
    @CsvBindByName
    String namestr;
    @CsvBindByName
    String version;
    @CsvBindByName
    String compactsave;
    @CsvBindByName
    String rarity;
    @CsvBindByName
    String spawnable;
    @CsvBindByName
    String mindam;
    @CsvBindByName
    String maxdam;
    @CsvBindByName(column = "1or2handed")
    String _1or2handed;
    @CsvBindByName(column = "2handed")
    String _2handed;
    @CsvBindByName(column = "2handmindam")
    String _2handmindam;
    @CsvBindByName(column = "2handmaxdam")
    String _2handmaxdam;
    @CsvBindByName
    String minmisdam;
    @CsvBindByName
    String maxmisdam;
    @CsvBindByName
    String rangeadder;
    @CsvBindByName
    String speed;
    @CsvBindByName
    String StrBonus;
    @CsvBindByName
    String DexBonus;
    @CsvBindByName
    String reqstr;
    @CsvBindByName
    String reqdex;
    @CsvBindByName
    String durability;
    @CsvBindByName
    String nodurability;
    @CsvBindByName
    String level;
    @CsvBindByName
    String levelreq;
    @CsvBindByName
    String cost;
    @CsvBindByName(column = "gamble cost")
    String gamble_cost;
    @CsvBindByName(column = "magic lvl")
    String magic_lvl;
    @CsvBindByName(column = "auto prefix")
    String auto_prefix;
    @CsvBindByName(column = "OpenBetaGfx")
    String openBetaGfx;
    @CsvBindByName
    String normcode;
    @CsvBindByName
    String ubercode;
    @CsvBindByName
    String ultracode;
    @CsvBindByName
    String wclass;
    @CsvBindByName(column = "2handedwclass")
    String _2handedwclass;
    @CsvBindByName
    String component;
    @CsvBindByName(column = "hit class")
    String hit_class;
    @CsvBindByName
    String invwidth;
    @CsvBindByName
    String invheight;
    @CsvBindByName
    String stackable;
    @CsvBindByName
    String minstack;
    @CsvBindByName
    String maxstack;
    @CsvBindByName
    String spawnstack;
    @CsvBindByName
    String flippyfile;
    @CsvBindByName
    String invfile;
    @CsvBindByName
    String uniqueinvfile;
    @CsvBindByName
    String setinvfile;
    @CsvBindByName
    String hasinv;
    @CsvBindByName
    String gemsockets;
    @CsvBindByName
    String gemapplytype;
    @CsvBindByName
    String special;
    @CsvBindByName
    String useable;
    @CsvBindByName
    String dropsound;
    @CsvBindByName
    String dropsfxframe;
    @CsvBindByName
    String usesound;
    @CsvBindByName
    String unique;
    @CsvBindByName
    String transparent;
    @CsvBindByName
    String transtbl;
    @CsvBindByName
    String quivered;
    @CsvBindByName
    String lightradius;
    @CsvBindByName
    String belt;
    @CsvBindByName
    String quest;
    @CsvBindByName
    String questdiffcheck;
    @CsvBindByName
    String missiletype;
    @CsvBindByName
    String durwarning;
    @CsvBindByName
    String qntwarning;
    @CsvBindByName
    String gemoffset;
    @CsvBindByName
    String bitfield1;

    @CsvBindByName(column = "Source Art")
    String source_Art;
    @CsvBindByName(column = "Game Art")
    String game_Art;
    @CsvBindByName(column = "Transform")
    String transform;
    @CsvBindByName(column = "InvTrans")
    String invTrans;
    @CsvBindByName(column = "SkipName")
    String skipName;
    @CsvBindByName(column = "NightmareUpgrade")
    String nightmareUpgrade;
    @CsvBindByName(column = "HellUpgrade")
    String hellUpgrade;
    @CsvBindByName(column = "Nameable")
    String nameable;
    @CsvBindByName(column = "PermStoreItem")
    String permStoreItem;

}
