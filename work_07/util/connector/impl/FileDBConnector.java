package work_07.util.connector.impl;

import work_07.util.connector.Connector;

import java.io.File;

public class FileDBConnector extends Connector {
    public FileDBConnector(String dbPath) {
        this.db_path = dbPath;
    }

    public FileDBConnector() {
        this("db.csv");
    }

    @Override
    public void connect() {
        try {
            File dbFile = new File(db_path);

            if (dbFile.createNewFile()) System.out.println("База создана!");
            else System.out.println("База уже существует!");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
