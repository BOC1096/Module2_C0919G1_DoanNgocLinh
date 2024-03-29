package CaseStudy_FuramaResort.Commons;

import CaseStudy_FuramaResort.Model.*;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

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
    private static String[] headerRecordBooking = {"customerName", "birthday", "idCard", "numberPhone", "email", "address", "customerType", "gender", "idService", "serviceName", "areaUsed", "rentCost", "maxNumberOfPerson", "rentType"};
    private static String[] headerRecordCustomer = {"customerName", "birthday", "idCard", "numberPhone", "email", "address", "customerType", "gender", "id"};
    private static String[] headerRecordVilla = {"idService", "serviceName", "areaUsed", "rentCost", "maxNumberOfPerson", "rentType", "roomStandard", "otherConvenient", "numberOfFloor", "areaOfPool"};
    private static String[] headerRecordHouse = {"idService", "serviceName", "areaUsed", "rentCost", "maxNumberOfPerson", "rentType", "roomStandard", "otherConvenient", "numberOfFloor"};
    private static String[] headerRecordRoom = {"idService", "serviceName", "areaUsed", "rentCost", "maxNumberOfPerson", "rentType", "freeServiceIncluded"};
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
                        villa.getIdService(),
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
                        house.getIdService(),
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
                        room.getIdService(),
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

    //doc file villa.csv roi them vao list
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

    //doc file house.csv roi them vao list
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

    //doc file room.csv roi them vao list
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
            csvToBean = new CsvToBeanBuilder<Room>(new FileReader(pathRoom))
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

    //ghi data customer vao file customer.csv
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
    //doc file customer.csv roi them vao list
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
// ghi thong tin customer booking
    public static void writeBookingService(ArrayList<Customer> customerArrayList) {
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
                        customer.getServices().getIdService(),
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

    public static ArrayList<Customer> ReaderBookingCSV() {
        ArrayList<Customer> listCustomer = new ArrayList<Customer>();
        try (Reader reader = new FileReader(pathBooking);
             CSVReader csvReader = new CSVReader(reader);
        ) {
            String[] line;
            csvReader.skip(1);
            while ((line = csvReader.readNext()) != null) {
                Customer customer = new Customer();
                Villa villa = new Villa();
                try {
                    if (!DataInput.checkName(line[0])){
                        throw new IncorrectNameException("Name Incorrect");
                    }    customer.setCustomerName(line[0]);
                }catch (IncorrectNameException ex){
                    System.out.println(ex);
                }

                customer.setBirthday(line[1]);
                customer.setIdCard(Integer.parseInt(line[2]));
                customer.setNumberPhone(Integer.parseInt(line[3]));
                customer.setEmail(line[4]);
                customer.setAddress(line[5]);
                customer.setCustomerType(line[6]);
                customer.setGender(line[7]);
                villa.setIdService(line[8]);
                villa.setServiceName(line[9]);
                villa.setAreaUsed(Float.parseFloat(line[10]));
                villa.setRentCost(Float.parseFloat(line[11]));
                villa.setMaxNumberOfPerson(Integer.parseInt(line[12]));
                villa.setRentType(line[13]);
                customer.setServices(villa);
                listCustomer.add(customer);
            }
        } catch (
                IOException e) {
            System.out.println(e.getMessage());
        }
        return listCustomer;
    }
// them ten customer vao treeSet
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

