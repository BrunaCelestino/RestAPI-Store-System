package com.example.Store.domain.helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import java.util.ArrayList;
import java.util.List;
import com.example.Store.domain.model.CSVModel;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.web.multipart.MultipartFile;


public class CSVHelper {
    public static String TYPE = "text/csv";
    static String[] HEADERs = {"id", "code", "barCode", "serie", "name", "description", "category", "price", "taxes",
    "fabrication", "expirationDate", "color", "material", "quantity"};

    public static boolean hasCSVFormat(MultipartFile file) {

        if (!TYPE.equals(file.getContentType())) {
            return false;
        }

        return true;
    }

    public static List<CSVModel> csvToProducts(InputStream is) {
        try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
             CSVParser csvParser = new CSVParser(fileReader,
                     CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim())) {

            List<CSVModel> inventory = new ArrayList<CSVModel>();

            Iterable<CSVRecord> csvRecords = csvParser.getRecords();

            for (CSVRecord csvRecord : csvRecords) {

                CSVModel csvModel = new CSVModel(
                        Long.parseLong(csvRecord.get("id")),
                        csvRecord.get("code"),
                        csvRecord.get("barCode"),
                        csvRecord.get("serie"),
                        csvRecord.get("name"),
                        csvRecord.get("description"),
                        csvRecord.get("category"),
                        Double.parseDouble(csvRecord.get("price")),
                        Double.parseDouble(csvRecord.get("taxes")),
                        csvRecord.get("fabrication"),
                        csvRecord.get("expirationDate"),
                        csvRecord.get("color"),
                        csvRecord.get("material"),
                        Integer.parseInt(csvRecord.get("quantity"))
                );

                inventory.add(csvModel);
            }

            return inventory;
        } catch (IOException e) {
            throw new RuntimeException("fail to parse CSV file: " + e.getMessage());
        }
    }

}
