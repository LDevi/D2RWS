package ldev.net.d2baseloader;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import ldev.net.d2baseloader.bean.FromCSVDefinition;

public class MainLoader {


    public List<List<FromCSVDefinition>> loadDefinitons() {
        List<List<FromCSVDefinition>> lists = new ArrayList<>();
        for (CSVLoadableDefinition csvLoadableDefinition : CSVLoadableDefinition.values()) {
            CsvToBeanLoader<?> gemDefinitionCsvToBeanLoader = new CsvToBeanLoader<>(csvLoadableDefinition.beanDefinitionClass, new File(csvLoadableDefinition.fileName));
            lists.add(gemDefinitionCsvToBeanLoader.map());
        }
        return lists;
    }

}
