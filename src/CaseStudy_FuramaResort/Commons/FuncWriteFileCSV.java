package CaseStudy_FuramaResort.Commons;

import CaseStudy_FuramaResort.Model.House;
import CaseStudy_FuramaResort.Model.Room;
import CaseStudy_FuramaResort.Model.Villa;
import com.opencsv.CSVWriter;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import javax.swing.table.TableRowSorter;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FuncWriteFileCSV {
    private static final char DEFAULT_SEPARATOR = ',';
    private static final char DEFAULT_QUOTE = '"';
    private static final String pathVilla = "src/CaseStudy_FuramaResort/Data/Villa.csv";
    private static final String pathHouse = "src/CaseStudy_FuramaResort/Data/House.csv";
    private static final String pathRoom = "src/CaseStudy_FuramaResort/Data/Room.csv";
    private static String[] headerRecordVilla = {"id", "serviceName", "areaUsed", "rentCost", "maxNumberOfPerson", "rentType", "roomStandard", "otherConvenient", "numberOfFloor", "areaOfPool"};
    private static String[] headerRecordHouse = {"id", "serviceName", "areaUsed", "rentCost", "maxNumberOfPerson", "rentType", "roomStandard", "otherConvenient", "numberOfFloor"};
    private static String[] headerRecordRoom = {"id", "serviceName", "areaUsed", "rentCost", "maxNumberOfPerson", "rentType", "freeServiceIncluded"};
    // so dong bo qua khi bat dau doc(bo qua dong header)
    private static final int NUM_OF_LINE_SKIP = 1;

    /**
     * ghi file villa duoc add vao
     *
     * @param arrayList
     */
    public static void writeVillaFileCsv(ArrayList<Villa> arrayList) {
        try (Writer writer = new FileWriter(pathVilla);
             CSVWriter csvWriter = new CSVWriter(writer,
                     CSVWriter.DEFAULT_SEPARATOR,
                     CSVWriter.NO_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_LINE_END)) {

            csvWriter.writeNext(headerRecordVilla);
            for (Villa villa : arrayList) {
                csvWriter.writeNext(new String[]{
                        villa.getId(),
                        villa.getServiceName(),
                        String.valueOf(villa.getAreaUsed()),
                        String.valueOf(villa.getRentCost()),
                        String.valueOf(villa.getMaxNumberOfPerson()),
                        villa.getRentType(),
                        villa.getRoomStandard(),
                        villa.getOtherConvenient(),
                        String.valueOf(villa.getNumberOfFloor()),
                        String.valueOf(villa.getAreaOfPool())});

            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * ghi du lieu House sang file CSV
     *
     * @param arrayList
     */
    public static void writeHouseFileCsv(ArrayList<House> arrayList) {
        try (Writer writer = new FileWriter(pathHouse);
             CSVWriter csvWriter = new CSVWriter(writer,
                     CSVWriter.DEFAULT_SEPARATOR,
                     CSVWriter.NO_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_LINE_END)) {

            csvWriter.writeNext(headerRecordHouse);
            for (House house : arrayList) {
                csvWriter.writeNext(new String[]{
                        house.getId(),
                        house.getServiceName(),
                        String.valueOf(house.getAreaUsed()),
                        String.valueOf(house.getRentCost()),
                        String.valueOf(house.getMaxNumberOfPerson()),
                        house.getRentType(),
                        house.getRoomStandard(),
                        house.getOtherConvenient(),
                        String.valueOf(house.getNumberOfFloor())});
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * ghi du lieu Room thanh file Csv
     *
     * @param arrayList
     */
    public static void writeRoomFileCsv(ArrayList<Room> arrayList) {
        try (Writer writer = new FileWriter(pathRoom);
             CSVWriter csvWriter = new CSVWriter(writer,
                     CSVWriter.DEFAULT_SEPARATOR,
                     CSVWriter.NO_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_LINE_END)) {

            csvWriter.writeNext(headerRecordRoom);
            for (Room room : arrayList) {
                csvWriter.writeNext(new String[]{
                        room.getId(),
                        room.getServiceName(),
                        String.valueOf(room.getAreaUsed()),
                        String.valueOf(room.getRentCost()),
                        String.valueOf(room.getMaxNumberOfPerson()),
                        room.getRentType(),
                        room.getFreeServiceIncluded()});
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static ArrayList<Villa> parseVillaCSVtoBean() {
        Path path = Paths.get(pathVilla);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(pathVilla);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<Villa> strategy = new ColumnPositionMappingStrategy<Villa>();
        strategy.setType(Villa.class);
        strategy.setColumnMapping(headerRecordVilla);
        CsvToBean<Villa> csvToBean = null;
        try {

            csvToBean = new CsvToBeanBuilder<Villa>(new FileReader(pathVilla))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        } catch (FileNotFoundException exc) {
            System.out.println(exc.getMessage());
        }
        return (ArrayList<Villa>) csvToBean.parse();
    }

    public static ArrayList<House> parseHouseCSVtoBean() {
        Path path = Paths.get(pathHouse);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(pathHouse);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<House> strategy = new ColumnPositionMappingStrategy<House>();
        strategy.setType(House.class);
        strategy.setColumnMapping(headerRecordHouse);
        CsvToBean<House> csvToBean = null;
        try {

            csvToBean = new CsvToBeanBuilder<House>(new FileReader(pathHouse))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        } catch (FileNotFoundException exc) {
            System.out.println(exc.getMessage());
        }
        return (ArrayList<House>) csvToBean.parse();
    }

    public static ArrayList<Room> parseRoomCSVtoBean() {
        Path path = Paths.get(pathRoom);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(pathRoom);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<Room> strategy = new ColumnPositionMappingStrategy<Room>();
        strategy.setType(Room.class);
        strategy.setColumnMapping(headerRecordRoom);
        CsvToBean<Room> csvToBean = null;
        try {

            csvToBean = new CsvToBeanBuilder<Room>(new FileReader(pathHouse))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        } catch (FileNotFoundException exc) {
            System.out.println(exc.getMessage());
        }
        return (ArrayList<Room>) csvToBean.parse();
    }

}




