package ldev.net.d2baseloader.bean;

import com.opencsv.bean.CsvBindByName;

import java.io.Serializable;

public class RunewordsDefinition implements Serializable, FromCSVDefinition {

    @CsvBindByName
    String name;
    @CsvBindByName
    Boolean complete;
    @CsvBindByName
    Boolean server;

    @CsvBindByName
    String itype1;
    @CsvBindByName
    String itype2;
    @CsvBindByName
    String itype3;
    @CsvBindByName
    String itype4;
    @CsvBindByName
    String itype5;
    @CsvBindByName
    String itype6;

    @CsvBindByName(column = "Rune1")
    String rune1;
    @CsvBindByName(column = "Rune1")
    String rune2;
    @CsvBindByName(column = "Rune1")
    String rune3;
    @CsvBindByName(column = "Rune1")
    String rune4;
    @CsvBindByName(column = "Rune1")
    String rune5;
    @CsvBindByName(column = "Rune1")
    String rune6;

    @CsvBindByName(column = "T1Code1")
    String t1Code1;
    @CsvBindByName(column = "T1Param1")
    String t1Param1;
    @CsvBindByName(column = "T1Min1")
    Integer t1Min1;
    @CsvBindByName(column = "T1Max1")
    Integer t1Max1;

    @CsvBindByName(column = "T1Code2")
    String t1Code2;
    @CsvBindByName(column = "T1Param2")
    String t1Param2;
    @CsvBindByName(column = "T1Min2")
    Integer t1Min2;
    @CsvBindByName(column = "T1Max2")
    Integer t1Max2;

    @CsvBindByName(column = "T1Code3")
    String t1Code3;
    @CsvBindByName(column = "T1Param3")
    String t1Param3;
    @CsvBindByName(column = "T1Min3")
    Integer t1Min3;
    @CsvBindByName(column = "T1Max3")
    Integer t1Max3;

    @CsvBindByName(column = "T1Code4")
    String t1Code4;
    @CsvBindByName(column = "T1Param4")
    String t1Param4;
    @CsvBindByName(column = "T1Min4")
    Integer t1Min4;
    @CsvBindByName(column = "T1Max4")
    Integer t1Max4;

    @CsvBindByName(column = "T1Code5")
    String t1Code5;
    @CsvBindByName(column = "T1Param5")
    String t1Param5;
    @CsvBindByName(column = "T1Min5")
    Integer t1Min5;
    @CsvBindByName(column = "T1Max5")
    Integer t1Max5;

    @CsvBindByName(column = "T1Code6")
    String t1Code6;
    @CsvBindByName(column = "T1Param6")
    String t1Param6;
    @CsvBindByName(column = "T1Min6")
    Integer t1Min6;
    @CsvBindByName(column = "T1Max6")
    Integer t1Max6;

    @CsvBindByName(column = "T1Code7")
    String t1Code7;
    @CsvBindByName(column = "T1Param7")
    String t1Param7;
    @CsvBindByName(column = "T1Min7")
    Integer t1Min7;
    @CsvBindByName(column = "T1Max7")
    Integer t1Max7;
}
