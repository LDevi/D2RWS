package ldev.net.d2baseloader;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.HeaderColumnNameMappingStrategy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CsvToBeanLoader<T> {
    private File csvInputFile;

    public CsvToBeanLoader(File csvInputFile) {
        this.csvInputFile = csvInputFile;
    }

    public List<T> map() {
        CSVReader csvReader = null;
        List<T> beanList = new ArrayList<>();
        try {
            csvReader = new CSVReader(new FileReader(csvInputFile));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return beanList;
        }
        CsvToBean<T> csvToBean = new CsvToBean<>();
        csvToBean.setMappingStrategy(new HeaderColumnNameMappingStrategy<T>());
        csvToBean.setCsvReader(csvReader);
        beanList = csvToBean.parse();
        return beanList;
    }

}
