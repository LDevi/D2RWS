package ldev.net.d2baseloader;

import ldev.net.d2baseloader.bean.FromCSVDefinition;
import ldev.net.d2baseloader.bean.GemsDefinition;
import ldev.net.d2baseloader.bean.ItemTypesDefinition;
import ldev.net.d2baseloader.bean.RunewordsDefinition;
import ldev.net.d2baseloader.bean.WeaponsDefinition;

public enum CSVLoadableDefinition {
    GEMS(GemsDefinition.class, ""),
    ITEM_TYPES(ItemTypesDefinition.class, ""),
    RUNEWORDS(RunewordsDefinition.class, ""),
    WEAPONS(WeaponsDefinition.class, "");

    Class<? extends FromCSVDefinition> beanDefinitionClass;
    String fileName;

    CSVLoadableDefinition(Class<? extends FromCSVDefinition> beanDefinitionClass, String fileName) {
        this.beanDefinitionClass = beanDefinitionClass;
        this.fileName = fileName;
    }
}
