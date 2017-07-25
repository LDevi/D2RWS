package ldev.net.d2baseloader.bean;

import com.opencsv.bean.CsvBindByName;

public class GemsDefinition implements FromCSVDefinition {

    @CsvBindByName
    String name;
    @CsvBindByName
    String letter;
    @CsvBindByName
    String transform;
    @CsvBindByName
    String code;


    @CsvBindByName
    String weaponMod1Code;
    @CsvBindByName
    String weaponMod1Param;
    @CsvBindByName
    String weaponMod1Min;
    @CsvBindByName
    String weaponMod1Max;

    @CsvBindByName
    String weaponMod2Code;
    @CsvBindByName
    String weaponMod2Param;
    @CsvBindByName
    String weaponMod2Min;
    @CsvBindByName
    String weaponMod2Max;

    @CsvBindByName
    String weaponMod3Code;
    @CsvBindByName
    String weaponMod3Param;
    @CsvBindByName
    String weaponMod3Min;
    @CsvBindByName
    String weaponMod3Max;


    @CsvBindByName
    String helmMod1Code;
    @CsvBindByName
    String helmMod1Param;
    @CsvBindByName
    String helmMod1Min;
    @CsvBindByName
    String helmMod1Max;

    @CsvBindByName
    String helmMod2Code;
    @CsvBindByName
    String helmMod2Param;
    @CsvBindByName
    String helmMod2Min;
    @CsvBindByName
    String helmMod2Max;

    @CsvBindByName
    String helmMod3Code;
    @CsvBindByName
    String helmMod3Param;
    @CsvBindByName
    String helmMod3Min;
    @CsvBindByName
    String helmMod3Max;


    @CsvBindByName
    String shieldMod1Code;
    @CsvBindByName
    String shieldMod1Param;
    @CsvBindByName
    String shieldMod1Min;
    @CsvBindByName
    String shieldMod1Max;

    @CsvBindByName
    String shieldMod2Code;
    @CsvBindByName
    String shieldMod2Param;
    @CsvBindByName
    String shieldMod2Min;
    @CsvBindByName
    String shieldMod2Max;

    @CsvBindByName
    String shieldMod3Code;
    @CsvBindByName
    String shieldMod3Param;
    @CsvBindByName
    String shieldMod3Min;
    @CsvBindByName
    String shieldMod3Max;
}
