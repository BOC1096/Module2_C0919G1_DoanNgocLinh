package CaseStudy_FuramaResort.Commons;

import CaseStudy_FuramaResort.Model.*;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.sun.org.apache.regexp.internal.RE;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import javax.swing.table.TableRowSorter;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class FuncWriteFileCSV {
    private static final char DEFAULT_SEPARATOR = ',';
    private static final char DEFAULT_QUOTE = '"';
    private static final String pathCustomer = "src/CaseStudy_FuramaResort/Data/Customer.csv";
    public static final String pathVilla = "src/CaseStudy_FuramaResort/Data/Villa.csv";
    public static final String pathHouse = "src/CaseStudy_FuramaResort/Data/House.csv";
    public static final String pathRoom = "src/CaseStudy_FuramaResort/Data/Room.csv";
    private static final String pathBooking = "src/CaseStudy_FuramaResort/Data/Booking.csv";
    private static String[] headerRecordBooking = {"customerName", "birthday", "idCard", "numberPhone", "email", "address", "customerType", "gender", "id", "serviceName", "areaUsed", "rentCost", "maxNumberOfPerson", "rentType"};
    private static String[] headerRecordCustomer = {"customerName", "birthday", "idCard", "numberPhone", "email", "address", "customerType", "gender", "id"};
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

    public static void writeCustomerToCSV(ArrayList<Customer> customerArrayList) {
        try (Writer writer = new FileWriter(pathCustomer);
             CSVWriter csvWriter = new CSVWriter(writer,
                     CSVWriter.DEFAULT_SEPARATOR,
                     CSVWriter.NO_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_LINE_END)) {
            csvWriter.writeNext(headerRecordCustomer);
            for (Customer customer : customerArrayList) {
                csvWriter.writeNext(new String[]{
                        customer.getCustomerName(),
                        customer.getBirthday(),
                        String.valueOf(customer.getIdCard()),
                        String.valueOf(customer.getNumberPhone()),
                        customer.getEmail(),
                        customer.getAddress(),
                        customer.getCustomerType(),
                        customer.getGender(),
                        customer.getId()
                });
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static ArrayList<Customer> parseCustomerCSVtoBean() {
        Path path = Paths.get(pathCustomer);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(pathCustomer);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<Customer> strategy = new ColumnPositionMappingStrategy<Customer>();
        strategy.setType(Customer.class);
        strategy.setColumnMapping(headerRecordCustomer);
        CsvToBean<Customer> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<Customer>(new FileReader(pathCustomer))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return (ArrayList<Customer>) csvToBean.parse();
    }

    public static void writeBookingVillaToCSV(ArrayList<Customer> customerArrayList) {
        try (Writer writer = new FileWriter(pathBooking);
             CSVWriter csvWriter = new CSVWriter(writer,
                     CSVWriter.DEFAULT_SEPARATOR,
                     CSVWriter.NO_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_LINE_END)) {
            csvWriter.writeNext(headerRecordBooking);
            for (Customer customer : customerArrayList) {
                csvWriter.writeNext(new String[]{
                        customer.getCustomerName(),
                        customer.getBirthday(),
                        String.valueOf(customer.getIdCard()),
                        String.valueOf(customer.getNumberPhone()),
                        customer.getEmail(),
                        customer.getAddress(),
                        customer.getCustomerType(),
                        customer.getGender(),
                        customer.getServices().getId(),
                        customer.getServices().getServiceName(),
                        String.valueOf(customer.getServices().getAreaUsed()),
                        String.valueOf(customer.getServices().getRentCost()),
                        String.valueOf(customer.getServices().getMaxNumberOfPerson()),
                        customer.getServices().getRentType(),
                });
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static ArrayList<Customer> parseBookingCSVtoBean() {
        Path path = Paths.get(pathBooking);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(pathBooking);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<Customer> strategy = new ColumnPositionMappingStrategy<Customer>();
        strategy.setType(Customer.class);
        strategy.setColumnMapping(headerRecordBooking);
        CsvToBean<Customer> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<Customer>(new FileReader(pathBooking))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return (ArrayList<Customer>) csvToBean.parse();
    }


    public static Set<String> getTreeSetService(String path) {
        Set<String> set = new TreeSet<>();
        try (Reader reader = new FileReader(path);
             CSVReader csvReader = new CSVReader(reader);
        ) {
            String[] line;
            csvReader.skip(1);
            while ((line = csvReader.readNext()) != null) {
                set.add(line[1]);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return set;
    }

}


