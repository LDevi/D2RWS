package ldev.net.d2baseloader;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.HeaderColumnNameMappingStrategy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import ldev.net.d2baseloader.bean.FromCSVDefinition;

public class CsvToBeanLoader<T extends FromCSVDefinition> {
    private static final Logger LOGGER = Logger.getLogger(CsvToBeanLoader.class.getName());

    private File csvInputFile;

    public CsvToBeanLoader(Class<T> type, File csvInputFile) {
        this.csvInputFile = csvInputFile;
    }

    public List<FromCSVDefinition> map() {
        CSVReader csvReader = null;
        List<FromCSVDefinition> beanList = new ArrayList<>();
        try (FileReader reader = new FileReader(csvInputFile);) {
            csvReader = new CSVReader(reader);
        } catch (FileNotFoundException e) {
            LOGGER.log(Level.WARNING, "Could not read given file :" + csvInputFile.getName(), e);
            return beanList;
        } catch (IOException e) {
            LOGGER.log(Level.WARNING, "Could not open file reader", e);
        }
        CsvToBean<T> csvToBean = new CsvToBean<>();
        csvToBean.setMappingStrategy(new HeaderColumnNameMappingStrategy<T>());
        csvToBean.setCsvReader(csvReader);
        beanList = csvToBean.parse();
        return beanList;
    }

}
