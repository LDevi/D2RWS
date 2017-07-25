package ldev.net.d2baseloader.bean;


import com.opencsv.bean.CsvBindByName;

public class ItemTypesDefinition implements FromCSVDefinition {

    @CsvBindByName(column = "ItemType")
    String itemType;
    @CsvBindByName(column = "Code")
    String code;
    @CsvBindByName(column = "Equiv1")
    String equiv1;
    @CsvBindByName(column = "Equiv2")
    String equiv2;
    @CsvBindByName(column = "Repair")
    String repair;
    @CsvBindByName(column = "Body")
    String body;
    @CsvBindByName(column = "BodyLoc1")
    String bodyLoc1;
    @CsvBindByName(column = "BodyLoc2")
    String bodyLoc2;
    @CsvBindByName(column = "Shoots")
    String shoots;
    @CsvBindByName(column = "Quiver")
    String quiver;
    @CsvBindByName(column = "Throwable")
    String throwable;
    @CsvBindByName(column = "Reload")
    String reload;
    @CsvBindByName(column = "ReEquip")
    String reEquip;
    @CsvBindByName(column = "AutoStack")
    String autoStack;
    @CsvBindByName(column = "Magic")
    String magic;
    @CsvBindByName(column = "Rare")
    String rare;
    @CsvBindByName(column = "Normal")
    String normal;
    @CsvBindByName(column = "Charm")
    String charm;
    @CsvBindByName(column = "Gem")
    String gem;
    @CsvBindByName(column = "Beltable")
    String beltable;
    @CsvBindByName(column = "MaxSock1")
    String maxSock1;
    @CsvBindByName(column = "MaxSock25")
    String maxSock25;
    @CsvBindByName(column = "MaxSock40")
    String maxSock40;
    @CsvBindByName(column = "TreasureClass")
    String treasureClass;
    @CsvBindByName(column = "Rarity")
    String rarity;
    @CsvBindByName(column = "StaffMods")
    String staffMods;
    @CsvBindByName(column = "CostFormula")
    String costFormula;
    @CsvBindByName(column = "Class")
    String itemClass;
    @CsvBindByName(column = "VarInvGfx")
    String varInvGfx;
    @CsvBindByName(column = "InvGfx1")
    String invGfx1;
    @CsvBindByName(column = "InvGfx2")
    String invGfx2;
    @CsvBindByName(column = "InvGfx3")
    String invGfx3;
    @CsvBindByName(column = "InvGfx4")
    String invGfx4;
    @CsvBindByName(column = "InvGfx5")
    String invGfx5;
    @CsvBindByName(column = "InvGfx6")
    String invGfx6;
    @CsvBindByName(column = "StorePage")
    String storePage;

}
